package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@RestController
public class RestStatusController {

	@GetMapping(value = "/test", produces = MediaType.TEXT_PLAIN)
	@Produces( { MediaType.TEXT_PLAIN} )
	public String getStatus() {
		return "Our service is up and running";
	}
}
