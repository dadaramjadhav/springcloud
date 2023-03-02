package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {
	
	@GetMapping("/producer")
	public String producerMethod() {
		System.out.println("message sent to consumer from producer");
		return "message from producer";
	}
}
