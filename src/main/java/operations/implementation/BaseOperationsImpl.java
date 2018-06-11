package operations.implementation;

import basis.*;
import operations.interfaces.BaseOperations;

import java.util.List;

public class BaseOperationsImpl implements BaseOperations{
    @Override
    public Account getAccountByUserId(String userId) {
        return null;
    }

    @Override
    public List<Address> getAddressListByUserId(String userId) {
        return null;
    }

    @Override
    public List<Order> getOrderListByUserId(String userId) {
        return null;
    }

    @Override
    public List<Service> getServiceListByUserId(String userId) {
        return null;
    }

    @Override
    public List<Recharge> getRechargeListByUserId(String userId) {
        return null;
    }

    @Override
    public Wallet getWalletByUserId(String userId) {
        return null;
    }

    @Override
    public ShopCart getShopCartByUserId(String userId) {
        return null;
    }

    @Override
    public List<BookItem> getBookItemListByBookId(String bookId) {
        return null;
    }

    @Override
    public Account getAccountByName(String userName) {
        return null;
    }
}
