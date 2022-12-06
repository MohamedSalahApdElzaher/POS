package com.training.pos.repository;

import com.training.pos.entity.Product;
import com.training.pos.entity.Sales;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalesRepository extends JpaRepository<Sales, Integer> {
}
