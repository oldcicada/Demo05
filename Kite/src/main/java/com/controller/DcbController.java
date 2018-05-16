package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.po.MzywDcbCxbdjf;
import com.po.MzywDcbPxbzjf;
import com.service.DcbService;
import com.utils.PageDto;

@Controller
public class DcbController {
	
	@Autowired
	private DcbService dcbService;
	
	@RequestMapping(value="/user/xxbsBsPxbzJg",method=RequestMethod.GET)
	public String xxbsBsPxbzJgGet() {
		
		return "dcb/xxbsBsPxbzJg";
	}
	
	@RequestMapping(value="/user/xxbsBsXcbdJg",method=RequestMethod.GET)
	public String xxbsBsXcbdJgGet() {
		
		return "dcb/xxbsBsXcbdJg";
	}
	
	@RequestMapping(value="/user/xxbsCxPxbzDc",method=RequestMethod.GET)
	public String xxbsCxPxbzDcGet() {
		
		return "dcb/xxbsCxPxbzDc";
	}
	
	@RequestMapping(value="/user/xxbsCxPxbzDc",method=RequestMethod.POST)
	@ResponseBody
	public PageDto<MzywDcbCxbdjf> xxbsCxPxbzDcPost(int pageIndex,int pageSize,String bsdw,String startDate,String endDate) {
		PageDto<MzywDcbCxbdjf> pxbz = dcbService.findPxbzByBsdwTime(pageIndex,pageSize,bsdw,startDate,endDate);
		return pxbz;
	}
	
	@RequestMapping(value="/user/xxbsCxXcbdDc",method=RequestMethod.GET)
	public String xxbsCxXcbdDcGet() {
		
		return "dcb/xxbsCxXcbdDc";
	}
	
	@RequestMapping(value="/user/xxbsCxXcbdDc",method=RequestMethod.POST)
	@ResponseBody
	public PageDto<MzywDcbPxbzjf> xxbsCxXcbdDcPost(int pageIndex,int pageSize,String bsdw,String startDate,String endDate,String bdlx) {
		PageDto<MzywDcbPxbzjf> xcbd = dcbService.findXcbdByBsdwTime(pageIndex,pageSize,bsdw,startDate,endDate,bdlx);
		return xcbd;
	}
	
	@RequestMapping(value="/user/xxbsCxXcbdJg",method=RequestMethod.GET)
	public String xxbsCxXcbdJgGet() {
		
		return "dcb/xxbsCxXcbdJg";
	}
	
	@RequestMapping(value="/user/xxbsCxZhpfDc",method=RequestMethod.GET)
	public String xxbsCxZhpfDcGet() {
		
		return "dcb/xxbsCxZhpfDc";
	}
	
	@RequestMapping(value="/user/xxbsWhZhpfDc",method=RequestMethod.GET)
	public String xxbsWhZhpfDcGet() {
		
		return "dcb/xxbsWhZhpfDc";
	}
	
	@RequestMapping(value="/user/xxbsXqPxbzDc",method=RequestMethod.GET)
	public String xxbsXqPxbzDcGet(String id,Model model) {
		MzywDcbCxbdjf pxbzOne = dcbService.lookOne(id);
		model.addAttribute("pxbzOne", pxbzOne);
		return "dcb/xxbsXqPxbzDc";
	}
	
	@RequestMapping(value="/user/xxbsXqPxbzJg",method=RequestMethod.GET)
	public String xxbsXqPxbzJgGet() {
		
		return "dcb/xxbsXqPxbzJg";
	}
	
	@RequestMapping(value="/user/xxbsXqXcbdDc",method=RequestMethod.GET)
	public String xxbsXqXcbdDcGet() {
		
		return "dcb/xxbsXqXcbdDc";
	}
	
	@RequestMapping(value="/user/xxbsXqXcbdJg",method=RequestMethod.GET)
	public String xxbsXqXcbdJgGet() {
		
		return "dcb/xxbsXqXcbdJg";
	}
	
	@RequestMapping(value="/user/xxbsXqZhpfDc",method=RequestMethod.GET)
	public String xxbsXqZhpfDcGet() {
		
		return "dcb/xxbsXqZhpfDc";
	}

}
