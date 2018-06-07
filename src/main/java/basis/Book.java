package basis;

import enums.ItemStatus;

import java.util.Date;
import java.util.List;


/**
 * 图书类
 */
public class Book {

    //图书编号,PK
    private String bookId;

    //类编号
    private String categoryId;

    //书名
    private String name;

    //描述
    private String description;

    //上架日期
    private Date date;

    //剩余数量
    private int quantity;

    //图书物品列表
    private List<BookItem> bookItemList;

    public Date getDate() {
        return date;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getBookId() {
        return bookId;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }

    //设置在架上图书数量
    public void setQuantity() {
        int quantity=0;
        for (BookItem bookItem:bookItemList
             ) {
            if(bookItem.getStatus()== ItemStatus.Onshelf)quantity++;
        }
        this.quantity=quantity;
    }

    //添加图书
    public void addBookItem(BookItem bookItem) {
        bookItemList.add(bookItem);
    }

    //构造方法
    public Book(){}
    public Book(String bookId){
        this.bookId=bookId;
        //TODO:从数据库获取信息
    }
}
