package operations.implementation;

import basis.*;
import operations.interfaces.BaseOperations;

import java.util.List;
import java.util.UUID;

/**
 * @see operations.interfaces.BaseOperations
 * TODO：完成数据库操作，要返回一个List
 */
public class BaseOperationsImpl implements BaseOperations{

    @Override
    public String getRandomUUID() {
        String temp = UUID.randomUUID().toString().replace("-", "").replaceAll("[a-zA-Z]","").substring(0,10);
        return temp;
    }

    @Override
    public List<Address> getAddressListByUserId(String userId) {
        return null;
    }

    @Override
    public List<Order> getOrderListByUserId(String userId) {
        return null;
    }

    @Override
    public List<Service> getServiceListByUserId(String userId) {
        return null;
    }

    @Override
    public List<Recharge> getRechargeListByUserId(String userId) {
        return null;
    }

    @Override
    public Wallet getWalletByUserId(String userId) {
        return null;
    }

    @Override
    public ShopCart getShopCartByUserId(String userId) {
        return null;
    }

    @Override
    public Order getOrderByBillId(String billId) {
        return null;
    }

    @Override
    public Refund getRefundByBillId(String billId) {
        return null;
    }

    @Override
    public Recharge getRechargeByBillId(String billId) {
        return null;
    }

    @Override
    public List<BookItem> getBookItemListByBookId(String bookId) {
        return null;
    }

    @Override
    public List<Book> getBookListByCategoryId(String categoryId) {
        return null;
    }

    @Override
    public Account getAccountByName(String userName) {
        return null;
    }
}
