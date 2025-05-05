package com.example.order.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.order.Service.OrderProducer;
import com.example.order.model.Order;

@RestController
@RequestMapping("/api/orders")
public class OrderController {
    @Autowired
    private OrderProducer producer;

    @PostMapping
    public ResponseEntity<String> placeOrder(@RequestBody Order order) {
        producer.sendOrder(order);
        return ResponseEntity.ok("Order sent to Kafka");
        
    }
    @GetMapping("/{orderId}")
    public ResponseEntity<String> getOrderStatus() {
        return ResponseEntity.ok("Order service is running");
    }
}