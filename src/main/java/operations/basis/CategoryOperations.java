package operations.basis;

import basis.*;
import org.apache.ibatis.annotations.Param;

public interface CategoryOperations {
    Category getCategoryById(@Param("categoryId") String categoryId);
}
