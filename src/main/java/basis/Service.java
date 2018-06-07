package basis;

/**
 * 售后类
 */


public class Service {

    //售后编号，PK
    private String serviceId;

    //用户编号，FK
    private String userId;

    //换货编号，FK
    private String exchangeId;

    //退款编号，FK
    private String refundId;

    //换货
    private Exchange exchange;

    public Refund getRefund() {
        return refund;
    }

    public void setRefund(Refund refund) {
        this.refund = refund;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getExchangeId() {
        return exchangeId;
    }

    public void setExchangeId(String exchangeId) {
        this.exchangeId = exchangeId;
    }

    public String getRefundId() {
        return refundId;
    }

    public void setRefundId(String refundId) {
        this.refundId = refundId;
    }

    public Exchange getExchange() {
        return exchange;
    }

    public void setExchange(Exchange exchange) {
        this.exchange = exchange;
    }

    //退款
    private Refund refund;

    //构造方法
    public Service(){}
    public Service(String serviceId){
        this.serviceId=serviceId;
        //TODO:从数据库获取信息
    }
}
