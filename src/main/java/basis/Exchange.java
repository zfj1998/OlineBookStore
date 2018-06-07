package basis;

import enums.ExchangeStatus;

import java.util.Date;

/**
 * 换货信息类
 */

public class Exchange {

    //换货编号，PK
    private String exchangeId;

    //订单编号，FK
    private String orderId;

    //物品编号，FK
    private String itemId;

    //新物品编号，FK
    private String newItemId;

    //申请换货时间
    private Date applyDate;

    //换货状态
    private ExchangeStatus status;


    //旧物品
    private BookItem oldItem;
    //新物品
    private BookItem newItem;

    public void setStatus(ExchangeStatus status) {
        this.status = status;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemId() {
        return itemId;
    }

    public BookItem getNewItem() {
        return newItem;
    }

    public BookItem getOldItem() {
        return oldItem;
    }

    public Date getApplyDate() {
        return applyDate;
    }

    public ExchangeStatus getStatus() {
        return status;
    }

    public String getExchangeId() {
        return exchangeId;
    }

    public String getNewItemId() {
        return newItemId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setApplyDate(Date applyDate) {
        this.applyDate = applyDate;
    }

    public void setExchangeId(String exchangeId) {
        this.exchangeId = exchangeId;
    }

    public void setNewItem(BookItem newItem) {
        this.newItem = newItem;
    }

    public void setNewItemId(String newItemId) {
        this.newItemId = newItemId;
    }

    public void setOldItem(BookItem oldItem) {
        this.oldItem = oldItem;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    //构造方法
    public Exchange(){}
    public Exchange(String exchangeId){
        this.exchangeId=exchangeId;
        //TODO:从数据库获取信息
    }
}
