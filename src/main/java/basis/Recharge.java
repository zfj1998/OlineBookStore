package basis;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 充值信息类
 */

public class Recharge {

    //充值编号，PK
    private String rechargeId;

    //用户编号，FK
    private String userId;

    //充值金额
    private BigDecimal price;

    //充值时间
    private Date date;

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Date getDate() {
        return date;
    }

    public String getRechargeId() {
        return rechargeId;
    }

    public String getUserId() {
        return userId;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setRechargeId(String rechargeId) {
        this.rechargeId = rechargeId;
    }

    //构造方法
    public Recharge(){}
    public Recharge(String rechargeId){
        this.rechargeId=rechargeId;
        //TODO:从数据库获取信息
    }
}
