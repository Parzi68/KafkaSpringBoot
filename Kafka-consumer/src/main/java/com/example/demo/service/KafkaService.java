package com.example.demo.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {
	@KafkaListener(topics = "Data", groupId = "user-group")
	public void updateData(String data) {
		System.out.println(data);
	}
}
