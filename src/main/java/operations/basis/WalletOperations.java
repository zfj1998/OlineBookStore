package operations.basis;

import basis.*;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

public interface WalletOperations {

    /**
     * 从数据库通过唯一Id获取对象（此时未初始化对象）
     * @param walletId
     * @return
     */
    Wallet getWalletById(@Param("walletId") String walletId);

    /**
     * 在数据库新增钱包（随账户一同创建）
     * @param walletId
     * @param userId
     * @param password
     * @param balance
     * @return
     */
    int insertWallet(@Param("walletId") String walletId,
                     @Param("userId") String userId,
                     @Param("password") String password,
                     @Param("balance") BigDecimal balance);

    /**
     * 在数据库修改余额
     * @param walletId
     * @param balance
     * @return
     */
    int modifyBalance(@Param("walletId") String walletId,
                 @Param("balance") BigDecimal balance);

    /**
     * 在数据库修改支付密码
     * @param walletId
     * @param password
     * @return
     */
    int modifyPassword(@Param("walletId") String walletId,
                       @Param("password") String password);

    /**
     * 通过用户ID获取钱包
     * @param userId
     * @return 钱包
     */
    Wallet getWalletByUserId(@Param("userId") String userId);
}
