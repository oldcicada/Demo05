package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.po.MzywJssz;
import com.service.FxbService;
import com.utils.PageDto;

@Controller
public class JsFxbyController {
	@Autowired
	private FxbService fxbService;

	@RequestMapping(value="/user/jssz",method=RequestMethod.GET)
	public String jsszGet() {
		return "js_fxby/jssz";
	}
	//基数设置
	@ResponseBody
	@RequestMapping(value="/user/jssz",method=RequestMethod.POST)
		public PageDto<MzywJssz> jsszPost(int pageIndex,int pageSize,String bmmc){
		    PageDto<MzywJssz> dto = fxbService.queryList(pageIndex, pageSize,bmmc);
		    return dto;
	}
	
	
	
	//基数维护
	@RequestMapping(value="/user/jswh",method=RequestMethod.GET)
	public String jswhGet(Model model, String id) {
		MzywJssz mzywJssz = fxbService.queryByJSId(id);
		model.addAttribute("MzywJssz",mzywJssz);
		return "js_fxby/jswh";
	}
	
	@RequestMapping(value="/user/jswh",method=RequestMethod.POST)
	public void jswhGX(String id,String bmmc,String js) {
		fxbService.updateGXJS(id,bmmc,js);
	}
	
}
