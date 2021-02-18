package com.example.northwind.dataaccess.concretes;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.northwind.entities.concretes.OrderDetail;


public interface OrderDetailRepository extends JpaRepository<OrderDetail, Integer> {

}
