package com.example.cabbookdriver.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class CabBookLocationService {
	
	@Autowired
	private KafkaTemplate<String, Object> kafakTemplate;
	
	
	public boolean updateLocation(String location) {
		kafakTemplate.send("cab-location",location);
		return true;
	}

}
