package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

	String msg = "";
	
	@RequestMapping("/")
	public String getMessage(){
		msg = "This is example for running multiple Eureka Servers and registering the client with all the Eureka Servers";
		return msg;
	}
}

