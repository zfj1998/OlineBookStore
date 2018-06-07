package controller;

import basis.Account;
import operations.UserOperation;
import org.apache.ibatis.session.SqlSessionFactory;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginAndRegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String status = req.getParameter("status");
        String name = req.getParameter("logname");
        String password = req.getParameter("logpass");
        String phone;
        SqlSessionFactory sqlSessionFactory = (SqlSessionFactory) getServletContext().getAttribute("SqlSessionFactory");
        Account result = null;
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("index.jsp");
        HttpSession session;
        if(status.equals("0"))
        {
            result =  UserOperation.login(sqlSessionFactory,name,password);
        }else if (status.equals("1"))
        {
            phone = req.getParameter("logphone");
            result =  UserOperation.register(sqlSessionFactory,password,name,phone);
        }
        if (result!=null)
        {
            session = req.getSession();
            session.setAttribute("user", result);
            requestDispatcher = req.getRequestDispatcher("index1.jsp");
        }else
        {
            session = req.getSession();
            session.setAttribute("user", name);
            requestDispatcher = req.getRequestDispatcher("register.html");
        }
        requestDispatcher.forward(req,resp);
    }
}
