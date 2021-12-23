package com.wjp.web;

import com.wjp.pojo.Cart;
import com.wjp.pojo.Order;
import com.wjp.pojo.User;
import com.wjp.service.OrderService;
import com.wjp.service.impl.OrderServiceImpl;
import com.wjp.utils.SendJMail;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class OrderServlet extends BaseServlet {

    private OrderService orderService = new OrderServiceImpl();

    /**
     * 生成订单
     *
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    protected void createOrder(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 先获取Cart购物车对象
        Cart cart = (Cart) req.getSession().getAttribute("cart");
        // 获取Userid
        User loginUser = (User) req.getSession().getAttribute("user");
        if (loginUser == null) {
            req.getRequestDispatcher("/pages/user/login.jsp").forward(req,resp);
            return;
        }
        Integer userId = loginUser.getId();
        // 生成订单
        String orderId = orderService.createOrder(cart, userId);
        req.getSession().setAttribute("orderId",orderId);
        String name = ((User) req.getSession().getAttribute("user")).getUsername();
        String mail = ((User) req.getSession().getAttribute("user")).getEmail();
        String message = "亲爱的 " + name + ", 你在土匪书城的订单已成功付款，订单号为：" + orderId;
        SendJMail.sendMail(mail, message);
        resp.sendRedirect(req.getContextPath()+"/pages/cart/checkout.jsp");
    }
    /**
     * 获取订单
     */
    protected void getOrders(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取所有订单
        OrderService orderService = new OrderServiceImpl();
        List<Order> orders = orderService.getOrders();
        //放入req域中
        req.setAttribute("orders", orders);
        //转发到order_manager.jsp
        req.getRequestDispatcher("pages/manager/order_manager.jsp").forward(req, resp);
    }

    /**
     * 获取订单
     */
    protected void getClientOrders(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取所有订单
        OrderService orderService = new OrderServiceImpl();
        List<Order> orders = orderService.getOrders();
        //放入req域中
        req.setAttribute("orders", orders);
        //转发到order_manager.jsp
        req.getRequestDispatcher("pages/order/order.jsp").forward(req, resp);
    }

}
