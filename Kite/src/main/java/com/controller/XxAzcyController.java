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

import com.po.MzywAzcXxhzypz;
import com.po.User;
import com.service.MzywAzcXxhzypzService;
import com.utils.PageDto;

@Controller
public class XxAzcyController {

	@Autowired
	private MzywAzcXxhzypzService mzywAzcXxhzypzService;
	
	@RequestMapping(value="/user/xz",method=RequestMethod.GET)
	 public String xzGet() {
		 
		 return "xx_azcy/xz";
	 }
	//学校新增信息
	@RequestMapping(value="/user/xz",method=RequestMethod.POST)
	 public String xzPost(String pzmc,String xx,HttpServletRequest request) {
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		Date now=new Date();    
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		MzywAzcXxhzypz mzywAzcXxhzypz = new MzywAzcXxhzypz();
		mzywAzcXxhzypz.setCjsj(df.format(now));
		mzywAzcXxhzypz.setCjyh(user.getName());
		mzywAzcXxhzypz.setPzmc(pzmc);
		mzywAzcXxhzypz.setPzfj(xx);
		mzywAzcXxhzypz.setStatus("未下发");
		mzywAzcXxhzypz.setYxbs("0");
		mzywAzcXxhzypzService.saveXxxx(mzywAzcXxhzypz);
		
		return "xx_azcy/xxxx";
	 }
	
	//学校信息GET请求
	@RequestMapping(value="/user/xxxx",method=RequestMethod.GET)
	 public String xxxxGet() {
		
		
		 return "xx_azcy/xxxx";
	 }
	
	//学校信息POST请求
	@ResponseBody
	@RequestMapping(value="/user/xxxx",method=RequestMethod.POST)
	 public PageDto<MzywAzcXxhzypz> xxxxPost(String pzmc,Integer pageIndex,Integer pageSize) {

		Map<Object, Object> map = new HashMap<>();
		map.put("start", (pageIndex - 1) * pageSize);
		map.put("end", pageSize);
		map.put("pzmc", "%" + pzmc + "%");
		List<MzywAzcXxhzypz> list = mzywAzcXxhzypzService.queryList(map);
		PageDto<MzywAzcXxhzypz> dto = new PageDto<>();
		dto.setList(list);
		dto.setPageIndex(pageIndex);
		dto.setPageSize(pageSize);
		int count = mzywAzcXxhzypzService.queryListCount(map);
		dto.setCount(count);
		dto.setPageTotal(count, pageSize);
		return dto;
	 }
	
	//学校详情GET请求
	@RequestMapping(value="/user/xq",method=RequestMethod.GET)
	 public String xqGet(Model model,String id) {
		 
		MzywAzcXxhzypz xxxq =mzywAzcXxhzypzService.queryXqById(id);
	    model.addAttribute("xxxq",xxxq);
		return "xx_azcy/xq";
	 }
	
	@RequestMapping(value="/user/xq",method=RequestMethod.POST)
	 public void xqPost(Model model,String id,HttpServletResponse response) {
		
     MzywAzcXxhzypz xxxq =mzywAzcXxhzypzService.queryXqById(id);
     String pzfj = xxxq.getPzfj();
     try {
		response.getWriter().print(pzfj);
	} catch (IOException e) {
		e.printStackTrace();
	}
	}
	//user/whById
	@RequestMapping(value="/user/whById",method=RequestMethod.POST)
	 public void whByIdPost(Model model,String id,HttpServletResponse response) {
		
    MzywAzcXxhzypz xxxq =mzywAzcXxhzypzService.queryXqById(id);
    String pzfj = xxxq.getPzfj();
    try {
		response.getWriter().print(pzfj);
	} catch (IOException e) {
		e.printStackTrace();
	}
	}
	
	@RequestMapping(value="/user/wh",method=RequestMethod.GET)
	 public String xhGet(Model model,String id) {
		
		MzywAzcXxhzypz xxxq =mzywAzcXxhzypzService.queryXqById(id);
	    model.addAttribute("xxxq",xxxq);
		
		 return "xx_azcy/wh";
	 }
	
	//学校信息维护
	@RequestMapping(value="/user/wh",method=RequestMethod.POST)
	 public String whPost(String id,String pzmc,String xx,HttpServletRequest request) {
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		Date now=new Date();    
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		
		String zhxgsj= df.format(now);
		String zhxgyh= user.getName();
		
		mzywAzcXxhzypzService.whXxxxById(id,pzmc,xx,zhxgsj,zhxgyh);
		
		return "xx_azcy/xxxx";
	 }
	
	//学校信息下发
	@RequestMapping(value="/user/xf",method=RequestMethod.GET)
	 public String xfPost(String id) {
		
		mzywAzcXxhzypzService.xfByID(id,"已下发");
		
		 return "xx_azcy/xxxx";
	 }
}
