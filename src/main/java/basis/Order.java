package basis;

import enums.OrderStatus;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 订单类
 */


public class Order {

    //订单编号
    private String orderId;

    //用户编号
    private String userId;

    //下单日期
    private Date orderDate;

    //地址编号
    private String addressId;

    //状态
    private OrderStatus status;

    //总价
    private BigDecimal totalPrice;

    //商品数
    private int totalItem;


    //订单下所有商品列表
    private List<BookItem> bookItemList;
    //地址
    private Address address;

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderId() {
        return orderId;
    }

    public Address getAddress() {
        return address;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public int getTotalItem() {
        return totalItem;
    }

    public List<BookItem> getBookItemList() {
        return bookItemList;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public String getAddressId() {
        return addressId;
    }

    public String getUserId() {
        return userId;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    public void setBookItemList(List<BookItem> bookItemList) {
        this.bookItemList = bookItemList;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void setTotalItem(int totalItem) {
        this.totalItem = totalItem;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    //添加书籍项
    public void addBookItemList(BookItem bookItem){
        this.bookItemList.add(bookItem);
    }

    //构造方法
    public Order(){}
    public Order(String orderId){
        this.orderId=orderId;
        //TODO:从数据库获取信息
    }
}
