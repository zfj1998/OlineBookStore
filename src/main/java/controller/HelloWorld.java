package controller;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import test.Test;

@WebServlet("/index2")
public class HelloWorld extends HttpServlet{
    @Override
    public void doGet(HttpServletRequest request,HttpServletResponse response)
            throws IOException, ServletException {
        PrintWriter writer = response.getWriter();
        Test test = new Test();
        String description = test.getDescription();
        request.setAttribute("description",description);
        RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/index/index3.jsp");
        view.forward(request,response);
//        writer.println(description);
//        writer.println("Hello World!");
    }
}
