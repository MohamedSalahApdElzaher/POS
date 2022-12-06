package com.training.pos.dao;

import com.training.pos.dto.OrderDto;
import com.training.pos.entity.Order;
import com.training.pos.entity.Sales;
import com.training.pos.repository.SalesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalesDao {

    @Autowired
    private SalesRepository salesRepository;

    private OrderDao orderDao;
    public SalesDao(OrderDao orderDao){
        this.orderDao = orderDao;
    }

    public Order creatSalesAndOrder(List<OrderDto> orders){
        Order order = orderDao.addOrder(orders);
        for (OrderDto orderDto : orders) {
            Sales sales = new Sales();
            sales.setOrder_Id(order.getId());
            sales.setProduct_Id(orderDto.getId());
            salesRepository.save(sales);
        }
        return orders.size() == 0 ? null : order;
    }

    public List<Sales> getAllSales(){
        return salesRepository.findAll();
    }

}
