package operations.basis;

import basis.*;
import org.apache.ibatis.annotations.Param;

public interface ServiceOperations {

    /**
     * 从数据库通过唯一Id获取对象（此时未初始化对象）
     * @param serviceId
     * @return
     */
    Service getServiceById(@Param("serviceId") String serviceId);


}
