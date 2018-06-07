package operations;

import basis.*;
import org.apache.ibatis.annotations.Param;

/**
 * 用户操作接口
 */

public interface AccountDAO {

    Account login(@Param("userId") String IdNum,
              @Param("password") String password);

    int register(@Param("userId") String IdNum,
                 @Param("userName") String name,
                 @Param("password") String password,
                 @Param("phone") String phone);
}
