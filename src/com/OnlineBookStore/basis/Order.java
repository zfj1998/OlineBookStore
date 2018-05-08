package com.OnlineBookStore.basis;

import com.OnlineBookStore.enums.OrderStatus;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 订单类
 */


public class Order {

    //订单编号
    private String orderId;

    //用户编号
    private String userId;

    //下单日期
    private Date orderDate;

    //地址编号
    private String addressId;

    //状态
    private OrderStatus status;

    //总价
    private BigDecimal totalPrice;

    //商品数
    private int totalItem;


    //订单下所有商品列表
    private List<BookItem> bookItemList;
    //地址
    private Address address;
}
