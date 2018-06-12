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

    /**
     * 获取一个已经编辑好的UUID
     * @return UUID
     */
    String getRandomUUID();
    /**
     * 通过userId获取一些对象以便Account初始化
     * @param userId
     * @return
     */
    List<Address> getAddressListByUserId(String userId);
    List<Order> getOrderListByUserId(String userId);
    List<Service> getServiceListByUserId(String userId);
    List<Recharge> getRechargeListByUserId(String userId);
    Wallet getWalletByUserId(String userId);
    ShopCart getShopCartByUserId(String userId);

    /**
     * 通过billId获取其他类型的bill对象
     * @param billId
     * @return
     */
    Order getOrderByBillId(String billId);
    Refund getRefundByBillId(String billId);
    Recharge getRechargeByBillId(String billId);

    /**
     * 通过bookId获取其他对象
     * @param bookId
     * @return
     */
    List<BookItem> getBookItemListByBookId(String bookId);

    /**
     * 从categoryId获取该类别下图书列表
     * @param categoryId
     * @return
     */
    List<Book> getBookListByCategoryId(String categoryId);
    /**
     * @param userName 给出一个用来查找的用户名
     * @return 通过用户名找到一个Account并将其返回
     */
    Account getAccountByName(String userName);
}
