package operations.interfaces;

import basis.*;
import operations.Operations;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;

public interface UserOperation {

    /**
     * 注册接口
     * @param userOperation 实现了该接口的类
     */
    static void Regist(UserOperation userOperation){
        Operations.UserOperation=userOperation;
    }

    /**
     * 注册并登录
     * @param password 密码
     * @param name 名字
     * @param phone 电话
     * @return 自动登录的账户
     */
    Account register(String password, String name, String phone);

    /**
     * 修改个人信息
     * @param userId 账户id
     * @param request 发送修改个人信息的请求
     * @return 修改后的个人信息或null
     */
    Account modifyInformation(String userId, HttpServletRequest request);

    /**
     * 充值
     * @param userId 账户id
     * @param price 充值金额
     * @return Recharge对象
     */
    Recharge recharge(String userId, BigDecimal price);

    /**
     * 将产品放入购物车
     * @param userId 账户id
     * @param bookId 商品id
     * @return 图书对象
     */
    BookItem putIntoCart(String userId, String bookId);

    /**
     * 添加一个收货地址
     * @param userId 账户id
     * @param request 发送添加地址的请求
     * @return 地址对象
     */
    Address addAddress(String userId,HttpServletRequest request);

    /**
     * 清空购物车（提交订单）
     * @param userId 账户id
     * @param password 支付密码
     * @param addressId 地址编号
     * @return 订单对象
     */
    Order submitOrder(String userId,String password,String addressId);

    /**
     * 支付订单
     * @param userId
     * @param orderId
     * @return 账单对象
     */
    Bill payOrder(String userId,String orderId);

    /**
     * 确认收货
     * @param userId
     * @param orderId
     * @return
     */
    Bill receiptOrder(String userId,String orderId);
}