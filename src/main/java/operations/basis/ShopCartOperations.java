package operations.basis;

import basis.*;
import org.apache.ibatis.annotations.Param;

public interface ShopCartOperations {

    /**
     * 从数据库通过唯一Id获取对象（此时未初始化对象）
     * @param shopCartId
     * @return
     */
    ShopCart getShopCartById(@Param("shopCartId") String shopCartId);

    /**
     * 在数据库新增购物车（随帐号一同创建）
     * @param shopCartId
     * @param userId
     * @return
     */
    int insertShopCart(@Param("shopCartId") String shopCartId,
                       @Param("userId") String userId);

    /**
     * 在数据库为购物车添加项目
     * @param shopCartId
     * @param itemId
     * @return
     */
    int addItem(@Param("shopCartId") String shopCartId,
                @Param("itemId") String itemId);

    /**
     * 在数据库为购物车删除项目
     * @param shopCartId
     * @param itemId
     * @return
     */
    int removeItem(@Param("shopCartId") String shopCartId,
                   @Param("itemId") String itemId);

    /**
     * 在数据库清空购物车
     * @param shopCartId
     * @return
     */
    int clearShopCart(@Param("shopCartId") String shopCartId);

    /**
     * 从用户Id获取购物车
     * @param userId
     * @return
     */
    ShopCart getShopCartByUserId(@Param("userId") String userId);
}
