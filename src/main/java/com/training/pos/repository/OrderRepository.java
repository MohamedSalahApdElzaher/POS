package com.training.pos.repository;

import com.training.pos.entity.Order;
import com.training.pos.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}
