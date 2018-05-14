package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AzcController {

	@RequestMapping(value="/user/xxbsBsBdxxQx",method=RequestMethod.GET)
	public String xxbsBsBdxxQxGet() {
		
		return "azc/xxbsBsBdxxQx";
	}
	
	@RequestMapping(value="/user/xxbsCxBdxxAz",method=RequestMethod.GET)
	public String xxbsCxBdxxAzGet() {
		
		return "azc/xxbsCxBdxxAz";
	}
	
	@RequestMapping(value="/user/xxbsXqBdxxAz",method=RequestMethod.GET)
	public String xxbsXqBdxxAzGet() {
		
		return "azc/xxbsXqBdxxAz";
	}
	
	@RequestMapping(value="/user/xxbsXqBdxxQx",method=RequestMethod.GET)
	public String xxbsXqBdxxQxGet() {
		
		return "azc/xxbsXqBdxxQx";
	}
	
}
