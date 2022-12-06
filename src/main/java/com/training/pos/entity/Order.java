package com.training.pos.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "orders")
@Data
public class Order {
    @javax.persistence.Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @Column(name = "total")
    private Integer Total;

}
