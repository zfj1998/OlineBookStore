package operations.basis;

import basis.*;
import org.apache.ibatis.annotations.Param;

public interface ServiceOperations {
    Service getServiceById(@Param("serviceId") String serviceId);
}
