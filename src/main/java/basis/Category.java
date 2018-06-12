package basis;

import operations.Operations;
import util.Bean;

import java.util.List;

/**
 * 图书类别类
 */


public class Category extends Bean{

    //类别号
    private String categoryId;

    //类名
    private String name;

    //描述
    private String description;

    public String getCategoryId(){
        return categoryId;
    }

    public void setCategoryId(String categoryId){
        this.categoryId = categoryId;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    //该类别下所有书
    private List<Book> bookList;

    //构造方法
    public Category(){}

    @Override
    public Category init() {
        this.setType("Category");
        this.bookList= Operations.BaseOperations.getBookListByCategoryId(categoryId);
        return this;
    }
}
