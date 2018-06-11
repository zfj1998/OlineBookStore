package operations;

import operations.basis.*;

/**
 * 操作库
 *
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
