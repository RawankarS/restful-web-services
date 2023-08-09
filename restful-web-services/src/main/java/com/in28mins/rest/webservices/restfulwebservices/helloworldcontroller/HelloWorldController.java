package com.in28mins.rest.webservices.restfulwebservices.helloworldcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.in28mins.rest.webservices.restfulwebservices.helloworld.Helloworldbean;

@RestController
public class HelloWorldController {
	
	@GetMapping("/hello-world")
	public String helloworld() {
		return "hello World";
	}
	
	@GetMapping("/hello-world-bean")
	public Helloworldbean helloworldbean() {
		return new Helloworldbean("hello World");
	}
	
	@GetMapping("/hello-world-bean/path-variable/{name}")
	public Helloworldbean helloworldbeanpathVariable(@PathVariable String name) {
		return new Helloworldbean(String.format("Hello World, %s", name));
	}
	

}
