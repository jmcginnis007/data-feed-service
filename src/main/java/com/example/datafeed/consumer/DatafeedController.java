package com.example.datafeed.consumer;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("/datafeed")
public class DatafeedController {
    
    @RequestMapping(method = RequestMethod.POST)
	ResponseEntity<?> add(@RequestBody String payload) {
    	System.out.println(payload);
    	//SampleKafkaProducer.sendToKafka(payload);
    	return ResponseEntity.ok("message accepted");
    }
}
