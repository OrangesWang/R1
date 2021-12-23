package com.wjp.dao.impl;

import com.wjp.dao.OrderDao;
import com.wjp.pojo.Order;

import java.util.List;

public class OrderDaoImpl extends BaseDao implements OrderDao {
    @Override
    public int saveOrder(Order order) {
        String sql = "insert into t_order(`orderId`,`createTime`,`price`,`status`,`userId`) values(?,?,?,?,?)";
        return update(sql,order.getOrderId(),order.getCreateTime(),order.getPrice(),order.getStatus(),order.getUserId());
    }

    @Override
    public int deleteOrderById(String orderId) {
        String sql = "delete from t_order where orderId = ?";
        return update(sql, orderId);
    }

    @Override
    public List<Order> queryOrders() {
//        String sql = "select `order_id`, `create_time`, `price`, `status`, `user_id` from t_order";
        String sql = "select * from t_order";
        return queryForList(Order.class, sql);
    }
}
