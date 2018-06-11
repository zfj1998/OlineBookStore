package operations.basis;

import basis.*;
import enums.ItemStatus;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

public interface BookItemOperations {

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
}
