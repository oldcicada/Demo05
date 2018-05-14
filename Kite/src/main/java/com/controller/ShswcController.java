package com.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.po.MzywShswcSzxx;
import com.service.MzywShswcSzxxService;
import com.utils.PageDto;

@Controller
@Component
public class ShswcController {
	@Autowired
	private MzywShswcSzxxService mzywShswcSzxxService;
	@RequestMapping(value="/user/shswXxCxSzBygy",method=RequestMethod.GET)
	public String shswXxCxSzBygyGet() {
		
		return "shswc/shswXxCxSzBygy";
	}
	
	@RequestMapping(value="/user/xxbsBsGhjzBy",method=RequestMethod.GET)
	public String xxbsBsGhjzByGet() {
		
		return "shswc/xxbsBsGhjzBy";
	}
	
	@RequestMapping(value="/user/xxbsBsMzxxGm",method=RequestMethod.GET)
	public String xxbsBsMzxxGmGet() {
		
		return "shswc/xxbsBsMzxxGm";
	}
	
	@RequestMapping(value="/user/xxbsBsSzxxBy",method=RequestMethod.GET)
	public String xxbsBsSzxxByGet() {
		
		return "shswc/xxbsBsSzxxBy";
	}
	
	@RequestMapping(value="/user/xxbsBsYtwyBy",method=RequestMethod.GET)
	public String xxbsBsYtwyByGet() {
		
		return "shswc/xxbsBsYtwyBy";
	}
	
	@RequestMapping(value="/user/xxbsCxGhjzBy",method=RequestMethod.GET)
	public String xxbsCxGhjzByGet() {
		
		return "shswc/xxbsCxGhjzBy";
	}
	//骨灰江葬查询-社会事务处
	@RequestMapping(value="/user/xxbsCxGhjzSh",method=RequestMethod.GET)
	public String xxbsCxGhjzShGet() {
		
		return "shswc/xxbsCxGhjzSh";
	}
	
	@RequestMapping(value="/user/xxbsCxMzxxGm",method=RequestMethod.GET)
	public String xxbsCxMzxxGmGet() {
		
		return "shswc/xxbsCxMzxxGm";
	}
	//墓葬信息查询-社会事务处
	@RequestMapping(value="/user/xxbsCxMzxxSh",method=RequestMethod.GET)
	public String xxbsCxMzxxShGet() {
		
		return "shswc/xxbsCxMzxxSh";
	}
	//逝者信息查询-社会事务处
	@RequestMapping(value="/user/xxbsCxSzxxSh",method=RequestMethod.GET)
	public String xxbsCxSzxxShGet() {
		
		return "shswc/xxbsCxSzxxSh";
	}
	//逝者信息查询-社会事务处-POST
	@RequestMapping(value="/user/xxbsCxSzxxSh",method=RequestMethod.POST)
	@ResponseBody
	public PageDto<MzywShswcSzxx> xxbsCxSzxxShPost(int pageIndex,int pageSize,String szxm,String startDate,String endDate,String szsfzhm,String bygmc) {
		
		if(startDate.length()==0) {
			startDate="2001-01-01";
		}
		if(endDate.length()==0) {
			Date now=new Date();    
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
			endDate=df.format(now);
		}
		Map<Object, Object> map=new HashMap<>();
		map.put("start", (pageIndex - 1) * pageSize);
		map.put("end", pageSize);
		map.put("szxm", "%" + szxm + "%");
		map.put("startDate", startDate);
		map.put("endDate", endDate);
		map.put("bygmc", bygmc);
		map.put("szsfzhm", "%" + szsfzhm + "%");
		List<MzywShswcSzxx> list = mzywShswcSzxxService.queryList(map);
		PageDto<MzywShswcSzxx> dto=new PageDto<>();
		dto.setList(list);
		dto.setPageIndex(pageIndex);
		dto.setPageSize(pageSize);
		int count=mzywShswcSzxxService.queryListCount(map);
		dto.setPageTotal(count,pageSize);
		return dto;
	}
	
	@RequestMapping(value="/user/xxbsCxYtwyBy",method=RequestMethod.GET)
	public String xxbsCxYtwyByGet() {
		
		return "shswc/xxbsCxYtwyBy";
	}
	//遗体外运查询-社会事务处
	@RequestMapping(value="/user/xxbsCxYtwySh",method=RequestMethod.GET)
	public String xxbsCxYtwyShGet() {
		
		return "shswc/xxbsCxYtwySh";
	}
	
	@RequestMapping(value="/user/xxbsXqGhjzBy",method=RequestMethod.GET)
	public String xxbsXqGhjzByGet() {
		
		return "shswc/xxbsXqGhjzBy";
	}
	//骨灰江葬详情-社会事务处
	@RequestMapping(value="/user/xxbsXqGhjzSh",method=RequestMethod.GET)
	public String xxbsXqGhjzShGet() {
		
		return "shswc/xxbsXqGhjzSh";
	}
	
	@RequestMapping(value="/user/xxbsXqMzxxGm",method=RequestMethod.GET)
	public String xxbsXqMzxxGmGet() {
		
		return "shswc/xxbsXqMzxxGm";
	}
	//墓葬信息详情-社会事务处
	@RequestMapping(value="/user/xxbsXqMzxxSh",method=RequestMethod.GET)
	public String xxbsXqMzxxShGet() {
		
		return "shswc/xxbsXqMzxxSh";
	}
	
	@RequestMapping(value="/user/xxbsXqSzxxBy",method=RequestMethod.GET)
	public String xxbsXqSzxxByGet() {
		
		return "shswc/xxbsXqSzxxBy";
	}	
	//逝者信息详情-社会事务处
	@RequestMapping(value="/user/xxbsXqSzxxSh",method=RequestMethod.GET)
	public String xxbsXqSzxxShGet() {
		
		return "shswc/shswXxCxSzBygy";
	}
	
	@RequestMapping(value="/user/xxbsXqYtwyBy",method=RequestMethod.GET)
	public String xxbsXqYtwyByGet() {
		
		return "shswc/xxbsXqYtwyBy";
	}
	//遗体外运详情-社会事务处
	@RequestMapping(value="/user/xxbsXqYtwySh",method=RequestMethod.GET)
	public String xxbsXqYtwyShGet() {
		
		return "shswc/xxbsXqYtwySh";
	}
}