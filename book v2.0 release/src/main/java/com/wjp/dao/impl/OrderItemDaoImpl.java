package com.wjp.dao.impl;

import com.wjp.dao.OrderItemDao;
import com.wjp.pojo.OrderItem;

public class OrderItemDaoImpl extends BaseDao implements OrderItemDao {
    @Override
    public int saveOrderItem(OrderItem orderItem) {
        String sql = "insert into t_order_item(`name`,`count`,`price`,`total_price`,`order_id`) values(?,?,?,?,?)";
        return update(sql,orderItem.getName(),orderItem.getCount(),orderItem.getPrice(),orderItem.getTotalPrice(),orderItem.getOrderId());
    }

    @Override
    public int deleteOrderItemById(Integer itemId) {
        String sql = "delete from t_order_item where id = ?";
        return update(sql, itemId);
    }

}
