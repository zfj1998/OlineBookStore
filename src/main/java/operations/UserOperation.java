package operations;

import basis.Account;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;
import java.util.UUID;

public class UserOperation {

    public static Account login(SqlSessionFactory sqlSessionFactory, String id, String password)
    {
        try {
            // 获取Session连接
            SqlSession session = sqlSessionFactory.openSession();
            // 获取Mapper
            AccountDAO accountDAO = session.getMapper(AccountDAO.class);
            Account account = accountDAO.login(id,password);
            session.commit();
            // 显示插入之后User信息
            if (account==null)
                return account;
            return account;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Account register(SqlSessionFactory sqlSessionFactory, String password, String name, String phone)
    {
        try {
            // 获取Session连接
            SqlSession session = sqlSessionFactory.openSession();
            // 获取Mapper
            AccountDAO accountDAO = session.getMapper(AccountDAO.class);
            String temp = UUID.randomUUID().toString().replace("-", "").replaceAll("[a-zA-Z]","").substring(0,10);
            accountDAO.register(temp ,name,password,phone);
            session.commit();
            Account account = accountDAO.login(temp,password);
            session.commit();
            return account ;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }



}
