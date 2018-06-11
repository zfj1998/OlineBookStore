package operations.basis;

import basis.Account;
import enums.AccountStatus;
import enums.UserType;
import org.apache.ibatis.annotations.Param;

public interface AccountOperations {

    Account getAccountById(@Param("userId") String userId);

    Account login(@Param("userId") String IdNum,
                  @Param("password") String password);

    int register(@Param("userId") String IdNum,
                 @Param("status") AccountStatus status,
                 @Param("permission") UserType type,
                 @Param("userName") String name,
                 @Param("password") String password,
                 @Param("phone") String phone);

    int updateName(@Param("userId") String userId,
                   @Param("userName") String newName);
    int updatePassword(@Param("userId") String userId,
                   @Param("password") String newPassword);
    int updatePhone(@Param("userId") String userId,
                   @Param("tel") String newPhone);
    int updateEmail(@Param("userId") String userId,
                   @Param("email") String newEmail);
}
