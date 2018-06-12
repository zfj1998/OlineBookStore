package operations.implementation;

import basis.Account;
import basis.Book;
import basis.BookItem;
import basis.Order;
import enums.AccountStatus;
import enums.ItemStatus;
import enums.OrderStatus;
import operations.Operations;
import operations.interfaces.AdministratorOperation;

import java.awt.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @see operations.interfaces.AdministratorOperation
 */
public class AdministratorOperationImpl implements AdministratorOperation{

    @Override
    public Book upShelf(String bookName, String categoryId, String description, Image bookPicture) {
        Book book=new Book();
        book.setName(bookName);
        book.setCategoryId(categoryId);
        book.setDescription(description);
        book.setDate(new Date());
        book.setBookId(Operations.BaseOperations.getRandomUUID());
        //保存图片部分
        /* ..................................................................
         */
        Operations.BookOperations.insertBook(book.getBookId(),categoryId,
                bookName,description,book.getDate());
        book=Operations.BookOperations.getBookById(book.getBookId());
        return book.init();
    }

    @Override
    public BookItem addGoods(String bookId, BigDecimal price) {
        Book book=Operations.BookOperations.getBookById(bookId);
        BookItem item=new BookItem();
        item.setBookId(bookId);
        item.setStatus(ItemStatus.Onshelf);
        item.setItemId(Operations.BaseOperations.getRandomUUID());
        item.setPrice(price);
        item.setDiscount(new BigDecimal(1));
        return item.init();
    }

    @Override
    public int inputBookItems(List<BookItem> bookItems) {
        for (BookItem item:bookItems) {
            Operations.BookItemOperations.insertBookItem(item.getItemId(),item.getBookId(),
                    item.getStatus(),item.getPrice(),item.getDiscount());
        }
        return bookItems.size();
    }

    @Override
    public BookItem discountBook(String bookItemId, BigDecimal discount) {
        BookItem item=Operations.BookItemOperations.getBookItemById(bookItemId);
        item.setDiscount(discount);
        Operations.BookItemOperations.modifyDiscount(bookItemId,discount);
        item=Operations.BookItemOperations.getBookItemById(bookItemId);
        return item;
    }

    @Override
    public Order shipOrder(String orderId) {
        Order order=Operations.OrderOperations.getOrderById(orderId);
        order.setStatus(OrderStatus.Shipped);
        Operations.OrderOperations.modifyStatus(orderId,OrderStatus.Shipped);
        order=Operations.OrderOperations.getOrderById(orderId);
        return order.init();
    }

    @Override
    public Account lockAccount(String userId) {
        Account user=Operations.AccountOperations.getAccountById(userId);
        user.setStatus(AccountStatus.Locked);
        Operations.AccountOperations.modifyStatus(userId,AccountStatus.Locked);
        user=Operations.AccountOperations.getAccountById(userId);
        return user.init();
    }

    @Override
    public Account unlockAccount(String userId) {
        return null;
    }
}
