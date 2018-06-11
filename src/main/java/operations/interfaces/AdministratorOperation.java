package operations.interfaces;

import basis.*;
import operations.Operations;

import java.awt.*;
import java.util.List;

/**
 * 管理员操作类
 */
public interface AdministratorOperation {

    /**
     * 注册接口
     * @param administratorOperation 实现了该接口的类
     */
    static void Regist(AdministratorOperation administratorOperation){
        Operations.AdministratorOperation=administratorOperation;
    }

    /**
     * 上架图书
     * @param bookName 图书名
     * @param categoryId 图书类别
     * @param description 详情描述
     * @param bookPicture 图片
     *                    上传图片后自动在目录下生成一个以图书ID命名的图片
     * @return 返回新生成的图书对象
     */
    Book upShelf(String bookName, String categoryId, String description, Image bookPicture);

    /**
     * 进货
     * @param bookId 图书号
     * @return 进货所得到的BookItem对象
     */
    BookItem addGoods(String bookId);
    /**
     * 进一批货
     * @param bookItems 进货的图书对象
     * @return 返回进货的图书数量
     */
    int inputBookItems(List<BookItem> bookItems);

    /**
     * 已发货
     * @param orderId 已发货的订单号
     */
    Order shipOrder(String orderId);

    /**
     * 冻结用户
     * @param userId 要冻结的帐号id
     * @return 被冻结的账户
     */
    Account lockAccount(String userId);

    /**
     * 解冻账户
     * @param userId 要解冻的账户id
     * @return 解冻的账户
     */
    Account unlockAccount(String userId);
}
