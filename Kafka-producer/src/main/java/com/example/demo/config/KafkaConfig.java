package com.example.demo.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import com.example.demo.constant.AppConstant;

@Configuration
public class KafkaConfig {

	@Bean
	public NewTopic topic() {
		return TopicBuilder
				.name(AppConstant.DATA2)
				.partitions(3)
				.replicas(2)
				.build();
	}
}
