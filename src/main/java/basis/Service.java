package basis;

import util.Bean;

/**
 * 售后类
 */


public class Service extends Bean{

    //售后编号，PK
    private String serviceId;

    //用户编号，FK
    private String userId;

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

    //构造方法
    public Service(){}

    @Override
    public Service init() {
        this.setType("Service");
        return this;
    }
}
