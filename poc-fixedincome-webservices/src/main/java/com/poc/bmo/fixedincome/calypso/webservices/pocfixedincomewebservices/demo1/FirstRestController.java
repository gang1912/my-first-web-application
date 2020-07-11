package com.poc.bmo.fixedincome.calypso.webservices.pocfixedincomewebservices.demo1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstRestController {
	
	@GetMapping(path="/hello-world")
	public String helloworld() {
		return "Hello World";
	}

	@GetMapping(path="/hello-world-bean")
	public BeanReturn helloWorldBean() {
		return new BeanReturn("Hello World");
	}
	
	@GetMapping(path="/hello-world-bean/path-variable/{name}")
	public BeanReturn helloWorldBeanPathVariable(@PathVariable String name) {
		return new BeanReturn("Hello World,"+name);
	}
}
