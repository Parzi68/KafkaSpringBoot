package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class KafkaController {
	
	private final KafkaProducer kafkaProducer;

	@Autowired
	public KafkaController(KafkaProducer kafkaProducer) {
		this.kafkaProducer = kafkaProducer;
	}
	
	@GetMapping("/send-message")
	public String sendMessage() {
		kafkaProducer.sendMessage("Test-Topic", "Hello");
		return "Message sent";
	}
	
}
