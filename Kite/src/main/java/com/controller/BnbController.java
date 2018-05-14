package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BnbController {

	@RequestMapping(value="/user/xxbsBsJg",method=RequestMethod.GET)
	private String xxbsBsJgGet() {
		
		return "bnb/xxbsBsJg";
	}
	
	@RequestMapping(value="/user/xxbsCxBn",method=RequestMethod.GET)
	private String xxbsCxBnGet() {
		
		return "bnb/xxbsCxBn";
	}
	
	@RequestMapping(value="/user/xxbsXqBn",method=RequestMethod.GET)
	private String xxbsXqBnGet() {
		
		return "bnb/xxbsXqBn";
	}
	
	@RequestMapping(value="/user/xxbsXqJg",method=RequestMethod.GET)
	private String xxbsXqJgGet() {
		
		return "bnb/xxbsXqJg";
	}
}
