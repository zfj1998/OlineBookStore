package com.OnlineBookStore.basis;

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
}
