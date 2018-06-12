package operations.basis;

import basis.*;
import org.apache.ibatis.annotations.Param;

import java.util.Date;

public interface BookOperations {

    /**
     * 从数据库通过唯一Id获取对象（此时未初始化对象）
     * @param bookId
     * @return
     */
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

    /**
     * 通过关键字查询图书
     * @param keyWord 关键字
     * @return 查询到的图书
     */
    Book getBookByKeyWord(@Param("name") String keyWord);
}
