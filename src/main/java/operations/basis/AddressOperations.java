package operations.basis;

import basis.*;
import org.apache.ibatis.annotations.Param;

public interface AddressOperations {

    Address getAddressById(@Param("addressId") String addressId);

    int insertAddress(@Param("addressId") String addressId,
               @Param("userId") String userId,
               @Param("realName") String realName,
               @Param("tel") String tel,
               @Param("email") String email);
}
