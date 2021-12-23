package com.wjp.dao;

import com.wjp.pojo.OrderItem;

public interface OrderItemDao {
    public int saveOrderItem(OrderItem orderItem);
    public int deleteOrderItemById(Integer itemId);

}
