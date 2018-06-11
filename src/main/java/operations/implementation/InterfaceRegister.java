package operations.implementation;

//注册所有待实现的接口

import operations.*;
import operations.basis.*;
import operations.interfaces.AdministratorOperation;
import operations.interfaces.BaseOperations;
import operations.interfaces.GeneralOperation;
import operations.interfaces.UserOperation;
import org.apache.ibatis.session.SqlSession;

public class InterfaceRegister {

    /**
     * 注册所有用户操作接口
     */
    public static void RegistAll(){
        BaseOperations.Regist(new BaseOperationsImpl());
        GeneralOperation.Regist(new GeneralOperationImpl());
        UserOperation.Regist(new UserOperationImpl());
        AdministratorOperation.Regist(new AdministratorOperationImpl());
    }

    /**
     * 加载所有数据库操作接口
     * @param session 从SQL会话获得映射
     */
    public static void LoadDAOs(SqlSession session){
        Operations.AccountOperations=session.getMapper(AccountOperations.class);
        Operations.AddressOperations=session.getMapper(AddressOperations.class);
        Operations.BillOperations=session.getMapper(BillOperations.class);
        Operations.BookItemOperations=session.getMapper(BookItemOperations.class);
        Operations.BookOperations=session.getMapper(BookOperations.class);
        Operations.CategoryOperations=session.getMapper(CategoryOperations.class);
        Operations.ExchangeOperations=session.getMapper(ExchangeOperations.class);
        Operations.OrderOperations=session.getMapper(OrderOperations.class);
        Operations.RechargeOperations=session.getMapper(RechargeOperations.class);
        Operations.RefundOperations=session.getMapper(RefundOperations.class);
        Operations.ServiceOperations=session.getMapper(ServiceOperations.class);
        Operations.ShopCartOperations=session.getMapper(ShopCartOperations.class);
        Operations.WalletOperations=session.getMapper(WalletOperations.class);
    }
}
