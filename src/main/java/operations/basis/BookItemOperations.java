package operations.basis;

import basis.*;
import enums.ItemStatus;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

public interface BookItemOperations {

    /**
     * 从数据库通过唯一Id获取对象（此时未初始化对象）
     * @param itemId
     * @return
     */
    BookItem getBookItemById(@Param("itemId") String itemId);

    /**
     * 在数据库增加物品项
     * @param itemId
     * @param bookId
     * @param status
     * @param price
     * @param discount
     * @return
     */
    int insertBookItem(@Param("itemId") String itemId,
                       @Param("bookId") String bookId,
                       @Param("status")ItemStatus status,
                       @Param("price")BigDecimal price,
                       @Param("discount")BigDecimal discount);

    /**
     * 在数据库修改折扣信息
     * @param itemId
     * @param discount
     * @return
     */
    int modifyDiscount(@Param("itemId") String itemId,
                       @Param("discount")BigDecimal discount);
}
