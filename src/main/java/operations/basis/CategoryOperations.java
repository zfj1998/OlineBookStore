package operations.basis;

import basis.*;
import org.apache.ibatis.annotations.Param;

public interface CategoryOperations {

    /**
     * 从数据库通过唯一Id获取对象（此时未初始化对象）
     * @param categoryId
     * @return
     */
    Category getCategoryById(@Param("categoryId") String categoryId);
}
