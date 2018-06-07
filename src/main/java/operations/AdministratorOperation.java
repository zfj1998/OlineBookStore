package operations;

import basis.*;
import enums.*;

import java.awt.*;
import java.util.List;

/**
 * 管理员操作类
 */
public interface AdministratorOperation {

    /**
     * 上架图书
     * @param bookName 图书名
     * @param categoryId 图书类别
     * @param description 详情描述
     * @param bookPicture 图片
     *                    上传图片后自动在目录下生成一个以图书ID命名的图片
     * @return 返回图书ID
     */
    String upShelf(String bookName, String categoryId, String description, Image bookPicture);

    /**
     * 进货
     * @param bookItems 进货的图书对象
     * @param bookId 进货的图书号
     * @return 返回进货的图书数量
     */
    int inputBookItems(List<BookItem> bookItems,String bookId);

    /**
     * 修改订单状态
     * @param orderId 要修改状态的订单号
     * @param status 要修改成的状态
     */
    void changeOrderStatus(String orderId, OrderStatus status);
}
