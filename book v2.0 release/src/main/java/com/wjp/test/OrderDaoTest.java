package com.wjp.test;

import com.wjp.dao.OrderDao;
import com.wjp.dao.impl.OrderDaoImpl;
import com.wjp.pojo.Book;
import com.wjp.pojo.Order;
import com.wjp.pojo.Page;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class OrderDaoTest {

    @Test
    public void saveOrder() {
        OrderDao orderDao = new OrderDaoImpl();
        System.out.println(orderDao.saveOrder(new Order("1234567891",new Date(),new BigDecimal(100),0, 1)));

    }

    @Test
    public void deleteOrder() {
        OrderDao o = new OrderDaoImpl();
        o.deleteOrderById("16401526903026");
    }

    @Test
    public void queryAll() {
        OrderDao o = new OrderDaoImpl();
        List<Order> a = o.queryOrders();
        System.out.println(a.size());
        for (Order book : o.queryOrders()) {
            System.out.println(book);
        }
    }
}