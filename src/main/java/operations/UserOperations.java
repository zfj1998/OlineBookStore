package operations;

import basis.*;

/**
 * 用户操作接口
 */

public interface UserOperations {

    /**
     * 登录操作
     * @param accountName 用户输入的用户名
     * @param inputPassword 用户输入的密码
     * @return 如果登录成功，返回一个Account，如果失败，返回null
     */
    Account Login(String inputPassword,String accountName);
}
