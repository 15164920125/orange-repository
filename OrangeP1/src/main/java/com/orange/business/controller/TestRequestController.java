package com.orange.business.controller;

import java.util.UUID;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/hello")
@RestController
public class TestRequestController {

	@RequestMapping("/consul")
	public String testRequest(){
		return "spring cloud consul:10001 "+UUID.randomUUID();
	}
	
}
