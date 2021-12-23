package com.wjp.dao;

import com.wjp.pojo.Order;

import java.util.List;

public interface OrderDao {

    public int saveOrder(Order order);
    public int deleteOrderById(String orderId);
    public List<Order> queryOrders();

}
