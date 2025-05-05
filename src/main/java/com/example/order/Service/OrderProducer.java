package com.example.order.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.example.order.model.Order;

@Service
public class OrderProducer {
    @Autowired
    private KafkaTemplate<String, Order> kafkaTemplate;

    @Value("${kafka.topic.order}")
    private String topic;

    public void sendOrder(Order order) {
        kafkaTemplate.send(topic, order.getOrderId(), order);
    }
}