package com.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.po.MzywFccYljgxx;
import com.service.MzywFccYljgxxService;
import com.utils.PageDto;


@Controller
public class FccController {
	
	@Autowired
	private MzywFccYljgxxService MzywFccYljgxxService;
	//信息报送查询养老机构(区县)get请求
	@RequestMapping(value="/user/xxbsCxYljgQx",method=RequestMethod.GET)
	public String xxbsCxYljgQxGet() {
		
		return "fcc/xxbsCxYljgQx";
	}
	//信息报送查询养老机构(区县)post请求
	@RequestMapping(value="/user/xxbsCxYljgQx",method=RequestMethod.POST)
	@ResponseBody
	public PageDto<MzywFccYljgxx> xxbsCxYljgQxPost(int pageIndex, int pageSize, String mc,String startDate,String endDate,String bszt) {
		PageDto<MzywFccYljgxx> dto = MzywFccYljgxxService.queryMzywFccYljgxx(pageIndex, pageSize, mc, startDate, endDate, bszt);
		return dto;
	}

	@RequestMapping(value="/user/xxbsBsSqylQx",method=RequestMethod.GET)
	public String xxbsBsSqylQxGet() {
		return "fcc/xxbsBsSqylQx";
	}
	
	@RequestMapping(value="/user/xxbsBsYljgQx",method=RequestMethod.GET)
	public String xxbsBsYljgQxGet() {
		
		return "fcc/xxbsBsYljgQx";
	}
	
	@RequestMapping(value="/user/xxbsCxSqylFc",method=RequestMethod.GET)
	public String xxbsCxSqylFcGet() {
		
		return "fcc/xxbsCxSqylFc";
	}
	
	@RequestMapping(value="/user/xxbsCxSqylQx",method=RequestMethod.GET)
	public String xxbsCxSqylQxGet() {
		
		return "fcc/xxbsCxSqylQx";
	}
	
	@RequestMapping(value="/user/xxbsCxYljgFc",method=RequestMethod.GET)
	public String xxbsCxYljgFcGet() {
		
		return "fcc/xxbsCxYljgFc";
	}
	
	@RequestMapping(value="/user/xxbsWhSqylFc",method=RequestMethod.GET)
	public String xxbsWhSqylFcGet() {
		
		return "fcc/xxbsWhSqylFc";
	}
	
	@RequestMapping(value="/user/xxbsWhYljgFc",method=RequestMethod.GET)
	public String xxbsWhYljgFcGet() {
		
		return "fcc/xxbsWhYljgFc";
	}
	
	@RequestMapping(value="/user/xxbsXqSqylFc",method=RequestMethod.GET)
	public String xxbsXqSqylFcGet() {
		
		return "fcc/xxbsXqSqylFc";
	}
	
	@RequestMapping(value="/user/xxbsXqSqylQx",method=RequestMethod.GET)
	public String xxbsXqSqylQxGet() {
		
		return "fcc/xxbsXqSqylQx";
	}
	
	@RequestMapping(value="/user/xxbsXqYljgFc",method=RequestMethod.GET)
	public String xxbsXqYljgFcGet() {
		
		return "fcc/xxbsXqYljgFc";
	}
	
	@RequestMapping(value="/user/xxbsXqYljgQx",method=RequestMethod.GET)
	public String xxbsXqYljgQxGet() {
		
		return "fcc/xxbsXqYljgQx";
	}
}
