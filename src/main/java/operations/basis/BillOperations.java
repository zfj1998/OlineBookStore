package operations.basis;

import basis.*;
import org.apache.ibatis.annotations.Param;

public interface BillOperations {
    Bill getBillById(@Param("billId") String billId);

    int insertBill(@Param("billId") String billId,
                   @Param("walletId") String walletId,
                   @Param("orderId") String orderId,
                   @Param("refundId") String refundId,
                   @Param("rechargeId") String rechargeId);
}
