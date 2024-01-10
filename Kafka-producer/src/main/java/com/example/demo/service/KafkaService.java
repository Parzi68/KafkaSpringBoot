package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.example.demo.constant.AppConstant;

@Service
public class KafkaService {
	
	
	@Autowired
	private KafkaTemplate<String, Object> kafkaTemplate;
	
	public boolean updateData(String data) {
		kafkaTemplate.send(AppConstant.DATA2, data);
		return true;
	}

}
