package operations.basis;

import basis.*;
import org.apache.ibatis.annotations.Param;

public interface BillOperations {

    /**
     * 从数据库通过唯一Id获取对象（此时未初始化对象）
     * @param billId
     * @return
     */
    Bill getBillById(@Param("billId") String billId);

    /**
     * 向数据库插入一个账单
     * @param billId
     * @param walletId
     * @param orderId
     * @param refundId
     * @param rechargeId
     * @return
     */
    int insertBill(@Param("billId") String billId,
                   @Param("walletId") String walletId,
                   @Param("orderId") String orderId,
                   @Param("refundId") String refundId,
                   @Param("rechargeId") String rechargeId);
}
