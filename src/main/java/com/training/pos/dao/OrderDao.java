package com.training.pos.dao;

import com.training.pos.dto.OrderDto;
import com.training.pos.entity.Order;
import com.training.pos.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderDao {

    @Autowired
    private OrderRepository orderRepository;

    public Order addOrder(List<OrderDto> orders){
        Integer total = 0;
        for (OrderDto order: orders) {
           total+=order.getPrice();
        }
        Order order = new Order();
        order.setTotal(total);
        return orderRepository.save(order);
    }

    public List<Order> getAllOrders(){
        return orderRepository.findAll();
    }

}
