package basis;

import enums.ItemStatus;
import util.Bean;

import java.math.BigDecimal;

/**
 * 物品类
 */

public class BookItem extends Bean{

    //物品编号
    private String itemId;

    //图书编号
    private String bookId;

    //状态
    private ItemStatus status;

    //价格
    private BigDecimal price;

    //折扣
    private BigDecimal discount;

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public ItemStatus getStatus() {
        return status;
    }

    public String getBookId() {
        return bookId;
    }

    public String getItemId() {
        return itemId;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setStatus(ItemStatus status) {
        this.status = status;
    }

    //构造方法
    public BookItem(){}

    @Override
    public BookItem init() {
        this.setType("BookItem");
        return this;
    }
}
