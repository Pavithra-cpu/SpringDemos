package com.pro.java;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller  
public class homecontroller {
 
	      
	    @RequestMapping(value="/home", method=RequestMethod.GET)  
	    public String home() {  
	        return "home";  
	    }  
	      
	    @RequestMapping(value="/admin", method=RequestMethod.GET)  
	    public String privateHome() {  
	        return "Hello";  
	    }  
	    
	    @RequestMapping(value="/cart", method=RequestMethod.GET)  
	    public String userHome() {  
	        return "welcome";  
	    }  
	}  


