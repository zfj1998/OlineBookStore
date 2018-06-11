package basis;

import util.Bean;

import java.math.BigDecimal;
import java.util.List;

/**
 * 账户钱包类
 */


public class Wallet extends Bean{

    //钱包编号，PK
    private String walletId;

    //用户ID，FK
    private String userId;

    //支付密码
    private String password;

    //余额
    private BigDecimal balance;

    public List<Bill> getBillList() {
        return billList;
    }

    public void setBillList(List<Bill> billList) {
        this.billList = billList;
    }

    public String getWalletId() {
        return walletId;
    }

    public void setWalletId(String walletId) {
        this.walletId = walletId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    //账单列表
    private List<Bill> billList;

    //添加账单
    public void addBill(Bill bill){
        this.billList.add(bill);
    }

    //构造方法
    public Wallet(){}

    @Override
    public Wallet init() {
        this.setType("Wallet");
        return this;
    }
}
