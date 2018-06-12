package operations.implementation;

import basis.Account;
import basis.Book;
import operations.interfaces.GeneralOperation;
import operations.Operations;

import java.util.List;

/**
 * @see operations.interfaces.GeneralOperation
 */
public class GeneralOperationImpl implements GeneralOperation{
    @Override
    public Account login(String userId, String password)
    {
        try {
            Account account = Operations.AccountOperations.getAccountById(userId);
            //密码错误
            if(!account.getPassword().equals(password))return null;
            //密码正确
            return account;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Book> search(String keyword) {
        return null;
    }
}
