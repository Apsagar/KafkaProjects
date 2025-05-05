package com.example.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class RealTimeOrderManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(RealTimeOrderManagementApplication.class, args);
	}

}
