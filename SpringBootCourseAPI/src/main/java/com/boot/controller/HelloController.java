package com.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //@Controller+@ResponseBody annotation bundled inside it 
public class HelloController {
	
	@RequestMapping("/hello")
	public String sayHello()
	{
		return "hello";
	}

}
