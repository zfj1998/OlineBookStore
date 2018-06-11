package operations.implementation;

import basis.BookItem;
import enums.OrderStatus;
import operations.interfaces.AdministratorOperation;

import java.awt.*;
import java.util.List;

public class AdministratorOperationImpl implements AdministratorOperation{

    @Override
    public String upShelf(String bookName, String categoryId, String description, Image bookPicture) {
        return null;
    }

    @Override
    public int inputBookItems(List<BookItem> bookItems, String bookId) {
        return 0;
    }

    @Override
    public void changeOrderStatus(String orderId, OrderStatus status) {

    }
}
