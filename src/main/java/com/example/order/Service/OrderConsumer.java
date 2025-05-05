package com.example.order.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.example.order.Repository.OrderRepository;
import com.example.order.model.Order;

@Service
public class OrderConsumer {
    @Autowired
    private OrderRepository repository;

    @KafkaListener(topics = "${kafka.topic.order}", groupId = "order_group")
    public void consume(Order order) {
        Order entity = new Order();
        entity.setOrderId(order.getOrderId());
        entity.setItemName(order.getItemName());
        entity.setQuantity(order.getQuantity());
        repository.save(entity);
        System.out.println("Consumed order: " + order);
    }
}