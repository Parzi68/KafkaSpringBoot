package com.example.demo.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.KafkaService;

@RestController
@RequestMapping("/transfer")
public class KafkaController {

	@Autowired
	private KafkaService kafkaService;
	
	@PutMapping
	public ResponseEntity updateData() throws InterruptedException {
		
		int range = 50;
		while(range > 0) {
			Thread.sleep(1000);
			kafkaService.updateData(Math.random() + "," + Math.random());
			range--;
		}
		
		return new ResponseEntity<>(Map.of("message","Data updated"),HttpStatus.OK);
	}
	
	
}
