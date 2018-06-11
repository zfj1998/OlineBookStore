package operations.implementation;

import basis.*;
import controller.InitServlet;
import enums.AccountStatus;
import enums.OrderStatus;
import enums.UserType;
import operations.Operations;
import operations.interfaces.UserOperation;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

public class UserOperationImpl implements UserOperation {

    public Account register(String password, String name, String phone)
    {
        try {
            String temp = UUID.randomUUID().toString().replace("-", "").replaceAll("[a-zA-Z]","").substring(0,10);
            Operations.AccountOperations.register(temp , AccountStatus.Normal, UserType.Customer,name,password,phone);
            InitServlet.getSession().commit();
            Account account = Operations.AccountOperations.login(temp,password).init();
            InitServlet.getSession().commit();
            return account ;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Account modifyInformation(String userId, HttpServletRequest request) {
        Account account=Operations.AccountOperations.getAccountById(userId).init();
        Operations.AccountOperations.updateEmail(userId,request.getParameter("email"));
        Operations.AccountOperations.updateName(userId,request.getParameter("userName"));
        Operations.AccountOperations.updatePhone(userId,request.getParameter("phone"));
        if(!Operations.AccountOperations.getAccountById(userId).equals(account)){
            account=Operations.AccountOperations.getAccountById(userId);
            return account;
        }
        return null;
    }

    @Override
    public Recharge recharge(String userId, BigDecimal price) {
        Account account=Operations.AccountOperations.getAccountById(userId).init();
        Recharge recharge=new Recharge();
        recharge.setDate(new Date());
        recharge.setPrice(price);
        String temp = UUID.randomUUID().toString().replace("-", "").replaceAll("[a-zA-Z]","").substring(0,10);
        recharge.setRechargeId(temp);
        temp = UUID.randomUUID().toString().replace("-", "").replaceAll("[a-zA-Z]","").substring(0,10);
        recharge.setBillId(temp);
        recharge.setWalletId(account.getWallet().getWalletId());
        recharge.init();
        Operations.BillOperations.insertBill(recharge.getBillId(),recharge.getWalletId(),
                null,null,recharge.getRechargeId());
        Operations.RechargeOperations.insertRecharge(recharge.getRechargeId(),
                recharge.getPrice(),recharge.getDate());
        account.getWallet().setBalance(account.getWallet().getBalance().add(price));
        Operations.WalletOperations.modifyBalance(account.getWallet().getWalletId(),
                account.getWallet().getBalance());
        return recharge;
    }

    @Override
    public BookItem putIntoCart(String userId, String bookId) {
        Account account=Operations.AccountOperations.getAccountById(userId).init();
        Book book=Operations.BookOperations.getBookById(bookId).init();
        if(book.getQuantity()>0) {
            BookItem item = book.takeBookItem().init();
            account.getShopCart().addBookItem(item);
            Operations.ShopCartOperations.addItem(account.getShopCart().getCartId(), item.getItemId());
            return item;
        }
        //在架上图书不足
        return null;
    }

    @Override
    public Address addAddress(String userId, HttpServletRequest request) {
        Account account=Operations.AccountOperations.getAccountById(userId).init();
        Address address=new Address();
        address.setUserId(userId);
        String temp = UUID.randomUUID().toString().replace("-", "").replaceAll("[a-zA-Z]","").substring(0,10);
        address.setAddressId(temp);
        address.setEmail(request.getParameter("email"));
        address.setRealName(request.getParameter("realName"));
        address.setTel(request.getParameter("tel"));
        address.init();
        account.addAddress(address);
        Operations.AddressOperations.insertAddress(address.getAddressId(),address.getUserId(),
                address.getRealName(),address.getTel(),address.getEmail());
        return address;
    }

    @Override
    public Order submitOrder(String userId, String password,String addressId) {
        Account account=Operations.AccountOperations.getAccountById(userId);
        Order order=new Order();
        order.setAddressId(addressId);
        String temp = UUID.randomUUID().toString().replace("-", "").replaceAll("[a-zA-Z]","").substring(0,10);
        order.setOrderId(temp);
        temp = UUID.randomUUID().toString().replace("-", "").replaceAll("[a-zA-Z]","").substring(0,10);
        order.setBillId(temp);
        order.setOrderDate(new Date());
        order.setTotalItem(account.getShopCart().getTotalItem());
        order.setTotalPrice(account.getShopCart().getTotalPrice());
        order.setStatus(OrderStatus.Unpaid);
        order.setWalletId(account.getWallet().getWalletId());
        if(account.getWallet().getPassword().equals(password)){
            for (BookItem item:account.getShopCart().getBookItemList()) {
                item.init();
                order.getBookItemList().add(item);
                Operations.OrderOperations.addItem(order.getOrderId(),item.getItemId());
            }
            Operations.OrderOperations.insertOrder(order.getOrderId(),userId,order.getOrderDate(),
                    order.getAddressId(),order.getStatus());
            Operations.BillOperations.insertBill(order.getBillId(),order.getWalletId(),
                    order.getOrderId(),null,null);
            return order;
        }
        return null;
    }

    @Override
    public Bill payOrder(String userId, String orderId) {
        Account account=Operations.AccountOperations.getAccountById(userId).init();
        Order order=Operations.OrderOperations.getOrderById(orderId).init();
        //余额多于订单总额
        if(account.getWallet().getBalance().compareTo(order.getTotalPrice())>=0) {
            order.setStatus(OrderStatus.Paid);
            account.getWallet().setBalance(account.getWallet().getBalance().subtract(order.getTotalPrice()));
            Operations.WalletOperations.modifyBalance(account.getWallet().getWalletId(),account.getWallet().getBalance());
            Operations.OrderOperations.modifyStatus(orderId,OrderStatus.Paid);
            return order;
        }
        //余额不足
        return null;
    }

    @Override
    public Bill receiptOrder(String userId, String orderId) {
        Account account=Operations.AccountOperations.getAccountById(userId).init();
        Order order=Operations.OrderOperations.getOrderById(orderId).init();
        //商品确认开始运输
        if(order.getStatus().equals(OrderStatus.Shipped)) {
            order.setStatus(OrderStatus.Receipted);
            Operations.OrderOperations.modifyStatus(orderId,OrderStatus.Receipted);
            return order;
        }
        //商品没有开始运输，无法确认收货
        return null;
    }


}
