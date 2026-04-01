package com.danilo.lima.actions;

import java.util.ArrayList;
import java.util.List;

import com.danilo.lima.enums.StatusEnum;
import com.danilo.lima.models.Order;
import com.opensymphony.xwork2.ActionSupport;

public class OrderAction extends ActionSupport {

    private static List<Order> orders = new ArrayList<>();

    private static Integer count = 1;

    private Order order;

    public String orderList() {
        return "orderList";
    }

    public String orderForm() {
        return "orderForm";
    }

    public String orderCreate() {
        order.setId(count++);
        order.setStatus(StatusEnum.ACTIVE);

        orders.add(order);

        return "orderCreate";
    }

    public List<Order> getOrders() {
        return orders;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}