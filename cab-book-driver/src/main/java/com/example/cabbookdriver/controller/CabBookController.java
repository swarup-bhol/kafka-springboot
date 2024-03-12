package com.example.cabbookdriver.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cabbookdriver.service.CabBookLocationService;

@RestController
@RequestMapping("/location")
public class CabBookController {
	
	
	@Autowired
	CabBookLocationService locationService;
	
	@GetMapping
	public ResponseEntity updateLocation() throws InterruptedException {
		int range = 100;
		while (range > 0) {
			locationService.updateLocation(Math.random()+" .......  "+Math.random());
			Thread.sleep(1000);
			range --;
		}
		return new ResponseEntity<>(Map.of("Message","Location Updated"),HttpStatus.OK);
	}

}
