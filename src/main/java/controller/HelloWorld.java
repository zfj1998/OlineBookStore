package controller;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

@WebServlet("/index")
public class HelloWorld extends HttpServlet{
    @Override
    public void doGet(HttpServletRequest request,HttpServletResponse response)
            throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        writer.println("Hello World!");
    }
}
