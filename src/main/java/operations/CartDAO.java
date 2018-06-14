package operations;

import basis.ShopCart;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CartDAO {
    List<ShopCart> get(@Param("userID") String userID);

    int add(@Param("userID") String userID,
            @Param("bookID") String bookID,
            @Param("amount") int amount);

    int alterAmounts(@Param("userID") String userID,
            @Param("bookID") String bookID,
            @Param("amount") int amount);

    int delete(@Param("userID") String userID,
                     @Param("bookID") String bookID);
}
