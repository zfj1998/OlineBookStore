package operations.basis;

import basis.*;
import org.apache.ibatis.annotations.Param;

public interface AddressOperations {

    /**
     * 从数据库通过唯一Id获取对象（此时未初始化对象）
     * @param addressId
     * @return
     */
    Address getAddressById(@Param("addressId") String addressId);

    int insertAddress(@Param("addressId") String addressId,
               @Param("userId") String userId,
               @Param("realName") String realName,
               @Param("tel") String tel,
               @Param("email") String email);
}
