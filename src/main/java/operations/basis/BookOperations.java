package operations.basis;

import basis.*;
import org.apache.ibatis.annotations.Param;

import java.util.Date;

public interface BookOperations {

    Book getBookById(@Param("bookId") String bookId);

    /**
     * 在数据库增加新书
     * @param bookId
     * @param categoryId
     * @param name
     * @param description
     * @param date
     * @return
     */
    int insertBook(@Param("bookId") String bookId,
                   @Param("categoryId") String categoryId,
                   @Param("name") String name,
                   @Param("description") String description,
                   @Param("date")Date date);
}
