package basis;

import java.math.BigDecimal;
import java.util.List;

/**
 * 购物车
 */


public class ShopCart {

    //购物车编号
    private String cartId;

    //用户编号
    private String userId;

    //总价
    private BigDecimal totalPrice;

    //商品数
    private int totalItem;


    public List<BookItem> getBookItemList() {
        return bookItemList;
    }

    public void setBookItemList(List<BookItem> bookItemList) {
        this.bookItemList = bookItemList;
    }

    public String getCartId() {
        return cartId;
    }

    public void setCartId(String cartId) {
        this.cartId = cartId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getTotalItem() {
        return totalItem;
    }

    public void setTotalItem(int totalItem) {
        this.totalItem = totalItem;
    }

    //购物车内所有商品
    private List<BookItem> bookItemList;

    //添加购物车项
    public void addBookItem(BookItem bookItem){
        this.bookItemList.add(bookItem);
    }
    //移除购物车项
    public void removeBookItem(int index){
        this.bookItemList.remove(index);
    }

    //构造方法
    public ShopCart(){}
    public ShopCart(String cartId){
        this.cartId=cartId;
        //TODO:从数据库获取信息
    }
}
