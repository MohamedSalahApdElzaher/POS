package com.training.pos.controller;

import com.training.pos.dao.OrderDao;
import com.training.pos.dao.SalesDao;
import com.training.pos.dto.OrderDto;
import com.training.pos.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderDao orderDao;
    private final SalesDao salesDao;
    @Autowired
    public OrderController(SalesDao salesDao){
        this.salesDao = salesDao;
    }

    @PostMapping("/add-order")
    public Order addOrder(@RequestBody List<OrderDto> orders){
        return salesDao.creatSalesAndOrder(orders);
    }

    @GetMapping("/get-all-orders")
    public List<Order> getAllOrders(){
        return orderDao.getAllOrders();
    }

}
