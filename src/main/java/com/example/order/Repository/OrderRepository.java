package com.example.order.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.order.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, String> {
}
