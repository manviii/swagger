package com.javainuse.swaggertest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaController {
	
	@RequestMapping(method = RequestMethod.GET, value = "/api/java")
	public String sayHola() {
		return "Hola!!!!!!!!!!!!!";
	}
}
