package operations.basis;

import basis.Account;
import enums.AccountStatus;
import enums.UserType;
import org.apache.ibatis.annotations.Param;

public interface AccountOperations {

    /**
     * 从数据库通过唯一Id获取对象（此时未初始化对象）
     * @param userId
     * @return
     */
    Account getAccountById(@Param("userId") String userId);

    /**
     * 登录
     * @param IdNum
     * @param password
     * @return
     */
    Account login(@Param("userId") String IdNum,
                  @Param("password") String password);

    /**
     * 注册
     * @param IdNum
     * @param status
     * @param type
     * @param name
     * @param password
     * @param phone
     * @return
     */
    int register(@Param("userId") String IdNum,
                 @Param("status") AccountStatus status,
                 @Param("permission") UserType type,
                 @Param("userName") String name,
                 @Param("password") String password,
                 @Param("phone") String phone);

    /**
     * 修改名字
     * @param userId
     * @param newName
     * @return
     */
    int updateName(@Param("userId") String userId,
                   @Param("userName") String newName);

    /**
     * 修改密码
     * @param userId
     * @param newPassword 新密码
     * @return
     */
    int updatePassword(@Param("userId") String userId,
                   @Param("password") String newPassword);

    /**
     * 修改电话号码
     * @param userId
     * @param newPhone
     * @return
     */
    int updatePhone(@Param("userId") String userId,
                   @Param("tel") String newPhone);

    /**
     * 修改email
     * @param userId
     * @param newEmail
     * @return
     */
    int updateEmail(@Param("userId") String userId,
                   @Param("email") String newEmail);

    /**
     * 修改用户状态
     * @param userId
     * @param status
     * @return
     */
    int modifyStatus(@Param("userId") String userId,
                     @Param("status") AccountStatus status);
}
