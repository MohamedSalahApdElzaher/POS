package com.training.pos.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "sales")
@Data
public class Sales {
    @javax.persistence.Id
    @Column(name = "sales_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @Column(name = "product_id")
    private Integer Product_Id;

    @Column(name = "order_id")
    private Integer Order_Id;

    @ManyToOne
    @JoinColumn(name = "product_id", insertable = false, updatable = false)
    @JsonManagedReference
    private Product product;

}
