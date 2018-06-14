package operations;

import basis.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookDAO {

    double getPrice(@Param("bookID") String bookID);

    String getTitle(@Param("bookID") String bookID);

    String getWriter(@Param("bookID") String bookID);

    List<Book> getBooks();

    Book getBook(@Param("bookID") String bookID);
}
