package basis;

import enums.RefundStatus;

import java.util.Date;

/**
 * 退款信息类
 */

public class Refund {

    //退款编号，PK
    private String refundId;

    //订单编号，FK
    private String orderId;

    //物品编号，FK
    private String itemId;

    //申请退款时间
    private Date applyDate;

    //退款状态
    private RefundStatus status;

    public BookItem getBookItem() {
        return bookItem;
    }

    public void setBookItem(BookItem bookItem) {
        this.bookItem = bookItem;
    }

    public String getRefundId() {
        return refundId;
    }

    public void setRefundId(String refundId) {
        this.refundId = refundId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public Date getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(Date applyDate) {
        this.applyDate = applyDate;
    }

    public RefundStatus getStatus() {
        return status;
    }

    public void setStatus(RefundStatus status) {
        this.status = status;
    }

    //物品
    private BookItem bookItem;

    //构造方法
    public Refund(){}
    public Refund(String refundId){
        this.refundId=refundId;
        //TODO:从数据库获取信息
    }
}
