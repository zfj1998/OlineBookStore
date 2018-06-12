package operations.basis;

import basis.*;
import org.apache.ibatis.annotations.Param;

public interface ExchangeOperations {

    /**
     * 从数据库通过唯一Id获取对象（此时未初始化对象）
     * @param exchangeId
     * @return
     */
    Exchange getExchangeById(@Param("exchangeId") String exchangeId);
}
