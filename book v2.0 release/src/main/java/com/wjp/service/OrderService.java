package com.wjp.service;

import com.wjp.pojo.Cart;
import com.wjp.pojo.Order;

import java.util.List;

public interface OrderService {
    public String createOrder(Cart cart,Integer userId);
    public List<Order> getOrders();
}
