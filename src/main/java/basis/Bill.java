package basis;

/**
 * 钱包明细类
 */

public class Bill {

    //账单号，PK
    private String billId;

    //钱包编号，FK
    private String walletId;

    //订单编号，FK
    private String orderId;

    //退款编号，FK
    private String refundId;

    //充值编号，FK
    private String rechargeId;


    //订单
    private Order order;
    //退款
    private Refund refund;
    //充值
    private Recharge recharge;

    public Order getOrder() {
        return order;
    }

    public Recharge getRecharge() {
        return recharge;
    }

    public Refund getRefund() {
        return refund;
    }

    public String getBillId() {
        return billId;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getRechargeId() {
        return rechargeId;
    }

    public String getRefundId() {
        return refundId;
    }

    public String getWalletId() {
        return walletId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public void setRecharge(Recharge recharge) {
        this.recharge = recharge;
    }

    public void setRechargeId(String rechargeId) {
        this.rechargeId = rechargeId;
    }

    public void setRefund(Refund refund) {
        this.refund = refund;
    }

    public void setRefundId(String refundId) {
        this.refundId = refundId;
    }

    public void setWalletId(String walletId) {
        this.walletId = walletId;
    }

    //构造方法
    public Bill(){}
    public Bill(String billId){
        this.billId=billId;
        //TODO:从数据库获取信息
    }
}
