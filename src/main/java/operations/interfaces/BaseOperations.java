package operations.interfaces;

import basis.*;
import operations.Operations;

import java.util.List;

/**
 * 基本操作接口
 */



public interface BaseOperations {

    /**
     * 注册接口
     * @param baseOperations 实现了该接口的类
     */
    static void Regist(BaseOperations baseOperations){
        Operations.BaseOperations=baseOperations;
    }

    //通过userId获取一些基本对象
    Account getAccountByUserId(String userId);
    List<Address> getAddressListByUserId(String userId);
    List<Order> getOrderListByUserId(String userId);
    List<Service> getServiceListByUserId(String userId);
    List<Recharge> getRechargeListByUserId(String userId);
    Wallet getWalletByUserId(String userId);
    ShopCart getShopCartByUserId(String userId);

    //通过bookId获取书籍项列表
    List<BookItem> getBookItemListByBookId(String bookId);

    /**
     * @param userName 给出一个用来查找的用户名
     * @return 通过用户名找到一个Account并将其返回
     */
    Account getAccountByName(String userName);
}
