package operations;

import operations.basis.*;

/**
 * 操作集合
 *
 */


/**
 * @see operations.basis
 * 数据库数据项基本操作接口包
 * @see operations.interfaces.BaseOperations
 * 数据库其他操作接口
 * @see operations.interfaces.GeneralOperation
 * 通用操作接口（用户未登录）
 * @see operations.interfaces.UserOperation
 * 用户操作接口（普通用户登录）
 * @see operations.interfaces.AdministratorOperation
 * 管理员操作接口（管理员登录）
 * @see controller.InitServlet
 * 最早初始化的Servlet（load-on-startup参数已经设置为1）
 * @see operations.implementation.InterfaceRegister
 * 注册接口
 */
public class Operations{

    //数据库操作接口
    public static AccountOperations AccountOperations;
    public static AddressOperations AddressOperations;
    public static BillOperations BillOperations;
    public static BookItemOperations BookItemOperations;
    public static BookOperations BookOperations;
    public static CategoryOperations CategoryOperations;
    public static ExchangeOperations ExchangeOperations;
    public static OrderOperations OrderOperations;
    public static RechargeOperations RechargeOperations;
    public static RefundOperations RefundOperations;
    public static ServiceOperations ServiceOperations;
    public static ShopCartOperations ShopCartOperations;
    public static WalletOperations WalletOperations;

    //逻辑操作接口
    public static operations.interfaces.BaseOperations BaseOperations;

    //用户操作接口
    public static operations.interfaces.GeneralOperation GeneralOperation;
    public static operations.interfaces.UserOperation UserOperation;
    public static operations.interfaces.AdministratorOperation AdministratorOperation;

}
