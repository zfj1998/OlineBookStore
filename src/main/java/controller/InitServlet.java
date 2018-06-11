package controller;

import operations.implementation.InterfaceRegister;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import java.io.InputStream;

/**
 * 在网页加载（未登录）时初始化的Servlet
 */
public class InitServlet extends HttpServlet{

    private static SqlSession session;
    public static SqlSession getSession() {
        return session;
    }
    public static void setSession(SqlSession session) {
        InitServlet.session = session;
    }

    @Override
    public void init() throws ServletException {
        String resource = "mybatis.xml";
        //使用类加载器加载mybatis的配置文件（它也加载关联的映射文件）
        InputStream is = InitServlet.class.getClassLoader().getResourceAsStream(resource);
        //构建sqlSession的工厂
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
        session = sessionFactory.openSession();
        //加载所有接口
        InterfaceRegister.LoadDAOs(session);
        InterfaceRegister.RegistAll();
    }

}
