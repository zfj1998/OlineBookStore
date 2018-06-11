package basis;

import util.Bean;

/**
 * 收货地址类
 */


public class Address extends Bean{

    //地址编号，PK
    private String addressId;

    //用户ID，FK
    private String userId;

    //真实姓名
    private String realName;

    //电话号码
    private String tel;

    //电子邮箱
    private String email;

    public String getTel() {
        return tel;
    }

    public String getEmail() {
        return email;
    }

    public String getAddressId() {
        return addressId;
    }

    public String getRealName() {
        return realName;
    }

    public String getUserId() {
        return userId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    //构造方法
    public Address(){}

    @Override
    public Address init() {
        this.setType("Address");
        return this;
    }
}
