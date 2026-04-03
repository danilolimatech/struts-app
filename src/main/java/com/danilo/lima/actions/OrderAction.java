package com.danilo.lima.actions;

import java.util.ArrayList;
import java.util.List;

import com.danilo.lima.enums.StatusEnum;
import com.danilo.lima.models.Order;
import com.opensymphony.xwork2.ActionSupport;

public class OrderAction extends ActionSupport {

    private static List<Order> orders = new ArrayList<>();

    private static Integer count = 1;

    static {
        Order o1 = new Order();
        o1.setId(count++);
        o1.setRecipientName("John Miller");
        o1.setAddress("742 Evergreen Terrace, Springfield, IL 62704, USA");
        o1.setDescription("Office supplies");
        o1.setStatus(StatusEnum.ACTIVE);

        Order o2 = new Order();
        o2.setId(count++);
        o2.setRecipientName("Sophie Dubois");
        o2.setAddress("25 Rue de Rivoli, 75004 Paris, France");
        o2.setDescription("Clothing items");
        o2.setStatus(StatusEnum.ACTIVE);

        Order o3 = new Order();
        o3.setId(count++);
        o3.setRecipientName("Kenji Tanaka");
        o3.setAddress("1-1 Chiyoda, Tokyo 100-8111, Japan");
        o3.setDescription("Electronics");
        o3.setStatus(StatusEnum.ACTIVE);

        Order o4 = new Order();
        o4.setId(count++);
        o4.setRecipientName("Lucas Oliveira");
        o4.setAddress("Av. Paulista, 1578, Bela Vista, São Paulo - SP, 01310-200, Brazil");
        o4.setDescription("Books");
        o4.setStatus(StatusEnum.ACTIVE);

        orders.add(o1);
        orders.add(o2);
        orders.add(o3);
        orders.add(o4);
    }

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