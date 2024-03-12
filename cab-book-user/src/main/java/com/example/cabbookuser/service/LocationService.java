package com.example.cabbookuser.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class LocationService {
	
	@KafkaListener(topics = "cab-location", groupId = "console-consumer")
	public void cabLocation(String location) {
		System.out.println(location);
	}

}
