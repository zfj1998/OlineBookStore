package operations.interfaces;

import basis.*;
import operations.Operations;

import java.util.List;

/**
 * 通用操作（无需登录系统可以进行的操作）
 */
public interface GeneralOperation {

    /**
     * 注册接口
     * @param generalOperation 实现了该接口的类
     */
    static void Regist(GeneralOperation generalOperation){
        Operations.GeneralOperation=generalOperation;
    }

    /**
     * 通用登录
     * @param userId 用户名
     * @param password 密码
     * @return 已登录的账户
     */
    Account login(String userId,String password);

    /**
     * 关键字搜索
     * @param keyword 用户输入的关键字
     * @return 找到的图书清单
     */
    List<Book> search(String keyword);

}
