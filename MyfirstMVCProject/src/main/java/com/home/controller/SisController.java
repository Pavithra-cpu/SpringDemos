package com.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/sis")
public class SisController {
@ResponseBody
	@RequestMapping("/makeup")
	public String getMakeUpKit()
	{
		return "just take my make up kit";
	}

@ResponseBody
@RequestMapping("/book")
public String getBook()
{
	System.out.println("this is get bok method");
	return "Spring MVC book";
}
}
