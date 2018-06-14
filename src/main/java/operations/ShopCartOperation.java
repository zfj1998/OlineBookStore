package operations;

import basis.Account;
import basis.ShopCart;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class ShopCartOperation {

    public static List<ShopCart> get(SqlSessionFactory sqlSessionFactory, String userID)
    {
        try {
            // 获取Session连接
            SqlSession session = sqlSessionFactory.openSession();
            // 获取Mapper
            CartDAO cartDAO = session.getMapper(CartDAO.class);
            List<ShopCart> shopCarts = cartDAO.get(userID);
            session.commit();
            if (shopCarts==null)
                return null;
            BookDAO bookDAO = session.getMapper(BookDAO.class);
            for (ShopCart shopcart:shopCarts) {
                double price =
                        bookDAO.getPrice(shopcart.getBookID());
                shopcart.setPricePerCommodity(price);
                String title = bookDAO.getTitle(shopcart.getBookID());
                shopcart.setBookName(title);
                String writer = bookDAO.getWriter(shopcart.getBookID());
                shopcart.setBookWriter(writer);
            }
            session.commit();
            // 显示插入之后User信息
            return shopCarts;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static int add(SqlSessionFactory sqlSessionFactory, String userID, String bookID, int amount)
    {
        try {
            // 获取Session连接
            SqlSession session = sqlSessionFactory.openSession();
            // 获取Mapper
            CartDAO cartDAO = session.getMapper(CartDAO.class);
            int carts = cartDAO.add(userID,bookID,amount);
            session.commit();
            // 显示插入之后User信息
            return carts;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

    public static int alterAmounts(SqlSessionFactory sqlSessionFactory, String userID, int amount, String bookID)
    {
        try {
            // 获取Session连接
            SqlSession session = sqlSessionFactory.openSession();
            // 获取Mapper
            CartDAO cartDAO = session.getMapper(CartDAO.class);
            int carts = cartDAO.alterAmounts(userID,bookID,amount);
            session.commit();
            // 显示插入之后User信息
            return carts;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

    public static int delete(SqlSessionFactory sqlSessionFactory, String userID, String bookID)
    {
        try {
            // 获取Session连接
            SqlSession session = sqlSessionFactory.openSession();
            // 获取Mapper
            CartDAO cartDAO = session.getMapper(CartDAO.class);
            int carts = cartDAO.delete(userID,bookID);
            session.commit();
            // 显示插入之后User信息
            return carts;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

    public static void addLoginUserInfo(SqlSessionFactory sqlSessionFactory,List<ShopCart>shopCarts, String userID)
    {
        for(int i = 0; i<shopCarts.size(); i++)
        {
            shopCarts.get(i).setUserID(userID);
            int status = add(sqlSessionFactory,userID,shopCarts.get(i).getBookID(),
                    shopCarts.get(i).getTotalItem());
            if(status<0)
            {
                alterAmounts(sqlSessionFactory,userID,
                        shopCarts.get(i).getTotalItem(),shopCarts.get(i).getBookID());
            }
        }
    }

}
