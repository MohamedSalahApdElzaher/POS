package com.training.pos.controller;

import com.training.pos.dao.SalesDao;
import com.training.pos.entity.Sales;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sales")
public class SalesController {

    @Autowired
    private SalesDao salesDao;

    @GetMapping("/all-sales")
    public List<Sales> getAllSales(){
        return salesDao.getAllSales();
    }

}
