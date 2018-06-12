package operations.basis;

import basis.*;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.Date;

public interface RechargeOperations {

    /**
     * 从数据库通过唯一Id获取对象（此时未初始化对象）
     * @param rechargeId
     * @return
     */
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
