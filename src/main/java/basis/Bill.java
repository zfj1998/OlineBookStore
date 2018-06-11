package basis;

import util.Bean;

/**
 * 钱包明细类
 */

public class Bill extends Bean{

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

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public void setRechargeId(String rechargeId) {
        this.rechargeId = rechargeId;
    }

    public void setRefundId(String refundId) {
        this.refundId = refundId;
    }

    public void setWalletId(String walletId) {
        this.walletId = walletId;
    }

    //构造方法
    public Bill(){}

    @Override
    public Bill init() {
        this.setType("Bill");
        return this;
    }
}
