package com.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.po.MzywAzcBdxx;
import com.po.User;
import com.service.MzywAzcBdxxService;
import com.service.MzywAzcXxhzypzService;
import com.utils.PageDto;

@Controller
public class AzcController {

	@Autowired
	private MzywAzcBdxxService mzywAzcBdxxService;
	@Autowired
	private MzywAzcXxhzypzService mzywAzcXxhzypzService;
	//安置处信息报送
	@RequestMapping(value="/user/azcXxCxBdQx",method=RequestMethod.GET)
	public String azcXxCxBdQxGet(Model model) {
		List<String> xxmcs =mzywAzcXxhzypzService.queryPzmc();
		model.addAttribute("xxmcs",xxmcs);
		
		return "azc/azcXxCxBdQx";
	}
	
	@ResponseBody
	@RequestMapping(value="/user/azcXxCxBdQx",method=RequestMethod.POST)
	public PageDto<MzywAzcBdxx> azcXxCxBdQxPost(Integer pageIndex,Integer pageSize,
		String xm,String sbsfzhm,String sfcjmfpx,String zcbs,String startDate,String endDate) {
		
		if (startDate.length() == 0) {
			startDate = "2001-01-01";
		}
		if (endDate.length() == 0) {
			endDate = "2022-01-01";
		}
		Map<Object, Object> map = new HashMap<>();
		map.put("start", (pageIndex - 1) * pageSize);
		map.put("end", pageSize);
		map.put("startDate", startDate);
		map.put("endDate", endDate);
		map.put("xm","%"+xm+"%");
		map.put("sbsfzhm","%"+sbsfzhm+"%");
		map.put("sfcjmfpx","%"+sfcjmfpx+"%");
		map.put("zcbs","%"+zcbs+"%");
		List<MzywAzcBdxx> list = mzywAzcBdxxService.queryListQx(map);
		PageDto<MzywAzcBdxx> dto = new PageDto<>();
		dto.setList(list);
		dto.setPageIndex(pageIndex);
		dto.setPageSize(pageSize);
		int count = mzywAzcBdxxService.queryListCountQx(map);
		dto.setCount(count);
		dto.setPageTotal(count, pageSize);
		return dto;

	}
	
	
	//报道信息报送
	@RequestMapping(value="/user/xxbsBsBdxxQx",method=RequestMethod.GET)
	public String xxbsBsBdxxQxGet(Model model,String id) {
		List<String> xxmcs =mzywAzcXxhzypzService.queryPzmc();
		model.addAttribute("xxmcs",xxmcs);
		model.addAttribute("id",id);
		MzywAzcBdxx Azxq =mzywAzcBdxxService.queryXqById(id);
		model.addAttribute("Azxq",Azxq);
		
		return "azc/xxbsBsBdxxQx";
	}
	
	//报道信息暂存
		@RequestMapping(value="/user/xxbsBsBdxxQx",method=RequestMethod.POST)
		public String xxbsBsBdxxQxPost(Model model,HttpServletRequest request ,MzywAzcBdxx mzywAzcBdxx) {
			
			HttpSession session = request.getSession();
			User user = (User) session.getAttribute("user");
			Date now=new Date();    
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
			
			String cjsj= df.format(now);
			String cjyh= user.getDepartment();
			mzywAzcBdxx.setCjsj(cjsj);
			mzywAzcBdxx.setCjyh(cjyh);
			mzywAzcBdxx.setSbdw("民政部");
			mzywAzcBdxx.setYxbs("0");
			mzywAzcBdxx.setZcbs("未报送");
			
			mzywAzcBdxxService.saveInfo(mzywAzcBdxx);
			
			return "azc/azcXxCxBdQx";
		}
	//根据学校名称获取对应专业
	
	@RequestMapping(value="/user/queryZyByxx",method=RequestMethod.POST)
	public void queryZyByxxPost(Model model,String xxmc,HttpServletResponse response) {
		
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		String zymc =mzywAzcXxhzypzService.queryZy(xxmc);
		try {
			response.getWriter().println(JSON.toJSON(zymc));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	//信息报送
	@RequestMapping(value="/user/xxbsBsBdxxQxSubmit",method=RequestMethod.POST)
	public void xxbsBsBdxxQxSubmit(Model model,String id) {
		mzywAzcBdxxService.submitById(id);
		
	}
	
	@RequestMapping(value="/user/xxbsCxBdxxAz",method=RequestMethod.GET)
	public String xxbsCxBdxxAzGet(Model model) {
		
		List<String> sbdws =mzywAzcBdxxService.querySbdw();
		model.addAttribute("sbdws",sbdws);
		List<String> xxmcs =mzywAzcBdxxService.queryXxmc();
		model.addAttribute("xxmcs",xxmcs);
		
		return "azc/xxbsCxBdxxAz";
	}
	//删除安置信息
	@RequestMapping(value="/user/xxbsXqBdxxAzDel",method=RequestMethod.GET)
	public String xxbsXqBdxxAzDelGet(Model model,String id) {
		MzywAzcBdxx bdxx = new MzywAzcBdxx();
		bdxx.setId(id);
		mzywAzcBdxxService.delInfoById(bdxx);
		return "azc/xxbsCxBdxxAz";
	}

	@ResponseBody
	@RequestMapping(value="/user/xxbsCxBdxxAz",method=RequestMethod.POST)
	public PageDto<MzywAzcBdxx> xxbsCxBdxxAzPost(Integer pageIndex,Integer pageSize,
		String xm,String sbsfzhm,String xxmc,String sbdw,String startDate,String endDate) {
		
		if (startDate.length() == 0) {
			startDate = "2001-01-01";
		}
		if (endDate.length() == 0) {
			endDate = "2022-01-01";
		}
		Map<Object, Object> map = new HashMap<>();
		map.put("start", (pageIndex - 1) * pageSize);
		map.put("end", pageSize);
		map.put("startDate", startDate);
		map.put("endDate", endDate);
		map.put("xm","%"+xm+"%");
		map.put("sbsfzhm","%"+sbsfzhm+"%");
		map.put("xxmc","%"+xxmc+"%");
		map.put("sbdw","%"+sbdw+"%");
		List<MzywAzcBdxx> list = mzywAzcBdxxService.queryListAz(map);
		PageDto<MzywAzcBdxx> dto = new PageDto<>();
		dto.setList(list);
		dto.setPageIndex(pageIndex);
		dto.setPageSize(pageSize);
		int count = mzywAzcBdxxService.queryListCountAz(map);
		dto.setCount(count);
		dto.setPageTotal(count, pageSize);
		return dto;

	}
	
	
	@RequestMapping(value="/user/xxbsXqBdxxAz",method=RequestMethod.GET)
	public String xxbsXqBdxxAzGet(Model model,String id) {
		
		MzywAzcBdxx Azxq =mzywAzcBdxxService.queryXqById(id);
		model.addAttribute("Azxq",Azxq);
		
		return "azc/xxbsXqBdxxAz";
	}
	
	@RequestMapping(value="/user/xxbsXqBdxxQx",method=RequestMethod.GET)
	public String xxbsXqBdxxQxGet(Model model,String id) {
		
		MzywAzcBdxx Azxq =mzywAzcBdxxService.queryXqById(id);
		model.addAttribute("Azxq",Azxq);
		return "azc/xxbsXqBdxxQx";
	}
	
}
