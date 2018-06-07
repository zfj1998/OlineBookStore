package operations;

import basis.*;

import java.util.List;

/**
 * 操作类
 * 写明各个接口的实现
 */


public class Operations implements BaseOperations{

    public static BaseOperations baseOperations;
    public static AccountDAO userOperations;

    //TODO:下面的方法需要实现数据库操作
    @Override
    public Account getAccountByUserId(String userId) {
        return null;
    }

    @Override
    public List<Address> getAddressListByUserId(String userId) {
        return null;
    }

    @Override
    public List<Order> getOrderListByUserId(String userId) {
        return null;
    }

    @Override
    public List<Service> getServiceListByUserId(String userId) {
        return null;
    }

    @Override
    public List<Recharge> getRechargeListByUserId(String userId) {
        return null;
    }

    @Override
    public Wallet getWalletByUserId(String userId) {
        return null;
    }

    @Override
    public ShopCart getShopCartByUserId(String userId) {
        return null;
    }

    @Override
    public List<BookItem> getBookItemListByBookId(String bookId) {
        return null;
    }

    @Override
    public Account getAccountByName(String userName) {
        return null;
    }
}
