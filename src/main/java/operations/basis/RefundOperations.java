package operations.basis;

import basis.*;
import org.apache.ibatis.annotations.Param;

public interface RefundOperations {
    Refund getRefundById(@Param("refundId") String refundId);
}
