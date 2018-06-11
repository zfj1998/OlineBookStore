package operations.basis;

import basis.*;
import org.apache.ibatis.annotations.Param;

public interface ExchangeOperations {
    Exchange getExchangeById(@Param("exchangeId") String exchangeId);
}
