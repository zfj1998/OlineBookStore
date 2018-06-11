package operations.basis;

import basis.*;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.Date;

public interface RechargeOperations {

    Recharge getRechargeById(@Param("rechargeId") String rechargeId);

    /**
     * 在数据库增加充值项
     * @param rechargeId
     * @param price
     * @param date
     * @return
     */
    int insertRecharge(@Param("rechargeId") String rechargeId,
                       @Param("price")BigDecimal price,
                       @Param("date")Date date);
}
