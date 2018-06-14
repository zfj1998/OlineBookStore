package operations;

import basis.Book;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class BookOperations {

    public static double getPrice(SqlSessionFactory sqlSessionFactory, String bookID)
    {
        try {
            // 获取Session连接
            SqlSession session = sqlSessionFactory.openSession();
            // 获取Mapper
            BookDAO bookDAO = session.getMapper(BookDAO.class);
            double price = bookDAO.getPrice(bookID);
            session.commit();
            // 显示插入之后User信息
            if (price<0)
                return 0;
            return price;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

    public static String getTitle(SqlSessionFactory sqlSessionFactory, String bookID)
    {
        try {
            // 获取Session连接
            SqlSession session = sqlSessionFactory.openSession();
            // 获取Mapper
            BookDAO bookDAO = session.getMapper(BookDAO.class);
            String title = bookDAO.getTitle(bookID);
            session.commit();
            // 显示插入之后User信息
            return title;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "null";
    }
    public static String getWriter(SqlSessionFactory sqlSessionFactory, String bookID)
    {
        try {
            // 获取Session连接
            SqlSession session = sqlSessionFactory.openSession();
            // 获取Mapper
            BookDAO bookDAO = session.getMapper(BookDAO.class);
            String writer = bookDAO.getWriter(bookID);
            session.commit();
            // 显示插入之后User信息
            return writer;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "null";
    }

    public static List<Book> getBooks(SqlSessionFactory sqlSessionFactory)
    {
        try {
            // 获取Session连接
            SqlSession session = sqlSessionFactory.openSession();
            // 获取Mapper
            BookDAO bookDAO = session.getMapper(BookDAO.class);
            List<Book> books = bookDAO.getBooks();
            session.commit();
            // 显示插入之后User信息
            return books;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Book getBook(SqlSessionFactory sqlSessionFactory, String bookID)
    {
        try {
            // 获取Session连接
            SqlSession session = sqlSessionFactory.openSession();
            // 获取Mapper
            BookDAO bookDAO = session.getMapper(BookDAO.class);
            Book book = bookDAO.getBook(bookID);
            session.commit();
            // 显示插入之后User信息
            return book;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
