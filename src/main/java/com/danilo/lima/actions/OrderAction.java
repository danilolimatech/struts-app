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
        o1.setRecipientName("Integer Consulting");
        o1.setAddress("R. Julieta Ferrão 10 8ºDTO, 1600-131 Lisboa, Portugal");
        o1.setDescription("Documentos importantes");
        o1.setStatus(StatusEnum.ACTIVE);

        Order o2 = new Order();
        o2.setId(count++);
        o2.setRecipientName("CTT - Correios de Portugal");
        o2.setAddress("Avenida D. João II, n.º 13, 13.º andar, 1999-001 Lisboa");
        o2.setDescription("Eletrônicos pequenos");
        o2.setStatus(StatusEnum.ACTIVE);

        Order o3 = new Order();
        o3.setId(count++);
        o3.setRecipientName("AIMA - Lisboa");
        o3.setAddress("Avenida António Augusto de Aguiar, 20, 1069-119 Lisboa");
        o3.setDescription("Acessórios");
        o3.setStatus(StatusEnum.ACTIVE);

        Order o4 = new Order();
        o4.setId(count++);
        o4.setRecipientName("Danilo Lima");
        o4.setAddress("Rua Químico José João de Miranda Freire, Alto do Mateus, 60, 58090-224, João Pessoa - PB");
        o4.setDescription("Livros e materiais de estudo");
        o4.setStatus(StatusEnum.ACTIVE);

        Order o5 = new Order();
        o5.setId(count++);
        o5.setRecipientName("Cátia Jorge Integer");
        o5.setAddress("Rua teste, Lisboa, Portugal");
        o5.setDescription("Computador");
        o5.setStatus(StatusEnum.ACTIVE);

        orders.add(o1);
        orders.add(o2);
        orders.add(o3);
        orders.add(o4);
        orders.add(o5);
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