package com.OnlineBookStore.basis;

import java.math.BigDecimal;
import java.util.List;

/**
 * 购物车
 */


public class ShopCart {

    //购物车编号
    private String cartId;

    //用户编号
    private String userId;

    //总价
    private BigDecimal totalPrice;

    //商品数
    private int totalItem;


    //购物车内所有商品
    private List<BookItem> bookItemList;
}
