package com.OnlineBookStore.basis;

import java.util.List;

/**
 * 图书类别类
 */


public class Category {

    //类别号
    private String categoryId;

    //类名
    private String name;

    //描述
    private String description;

    //该类别下所有书
    private List<Book> bookList;
}
