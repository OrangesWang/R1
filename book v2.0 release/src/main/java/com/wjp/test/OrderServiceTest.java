package com.wjp.test;

import com.wjp.pojo.Cart;
import com.wjp.pojo.CartItem;
import com.wjp.pojo.Order;
import com.wjp.service.OrderService;
import com.wjp.service.impl.OrderServiceImpl;
import org.junit.Test;

import java.math.BigDecimal;

public class OrderServiceTest {

    @Test
    public void createOrder() {

        Cart cart = new Cart();

        cart.addItem(new CartItem(1, "java从入门到精通", 1, new BigDecimal(1000),new BigDecimal(1000)));
        cart.addItem(new CartItem(1, "java从入门到精通", 1, new BigDecimal(1000),new BigDecimal(1000)));
        cart.addItem(new CartItem(2, "数据结构与算法", 1, new BigDecimal(100),new BigDecimal(100)));

        OrderService orderService = new OrderServiceImpl();

        System.out.println( "订单号是：" + orderService.createOrder(cart, 1) );

    }

    @Test
    public void getOrders() {
        OrderService orderService = new OrderServiceImpl();
        for (Order i: orderService.getOrders()) {
            System.out.println(i);
        }
    }
}