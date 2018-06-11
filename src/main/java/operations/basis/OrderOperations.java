package operations.basis;

import basis.*;
import enums.OrderStatus;
import org.apache.ibatis.annotations.Param;

import java.util.Date;

public interface OrderOperations {

    Order getOrderById(@Param("orderId") String orderId);

    /**
     * 在数据库增加新订单
     * @param orderId
     * @param userId
     * @param date
     * @param addressId
     * @param status
     * @return
     */
    int insertOrder(@Param("orderId") String orderId,
                    @Param("userId") String userId,
                    @Param("orderDate")Date date,
                    @Param("addressId") String addressId,
                    @Param("status")OrderStatus status);

    /**
     * 在数据库为订单添加项目
     * @param orderId
     * @param itemId
     * @return
     */
    int addItem(@Param("orderId") String orderId,
                @Param("itemId") String itemId);

    /**
     * 在数据库修改订单状态
     * @param orderId
     * @param status
     * @return
     */
    int modifyStatus(@Param("orderId") String orderId,
                     @Param("status") OrderStatus status);
}
