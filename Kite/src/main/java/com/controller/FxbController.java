package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FxbController {

	@RequestMapping(value="/user/fxbXxCxQx",method=RequestMethod.GET)
	public String fxbXxCxQxGet() {
		
		return "fxb/fxbXxCxQx";
	}
	
	@RequestMapping(value="/user/xxbsBsQxjj",method=RequestMethod.GET)
	public String xxbsBsQxjjGet() {
		
		return "fxb/xxbsBsQxjj";
	}
	
	@RequestMapping(value="/user/xxbsCxFxby",method=RequestMethod.GET)
	public String xxbsCxFxbyGet() {
		
		return "fxb/xxbsCxFxby";
	}
	
	@RequestMapping(value="/user/xxbsShFxby",method=RequestMethod.GET)
	public String xxbsShFxbyGet() {
		
		return "fxb/xxbsShFxby";
	}
	
	@RequestMapping(value="/user/xxbsXqFxby",method=RequestMethod.GET)
	public String xxbsXqFxbyGet() {
		
		return "fxb/xxbsXqFxby";
	}
	
	@RequestMapping(value="/user/xxbsXqQxjj",method=RequestMethod.GET)
	public String xxbsXqQxjjGet() {
		
		return "fxb/xxbsXqQxjj";
	}
	
}
