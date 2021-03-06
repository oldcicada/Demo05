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
import com.po.MzywDcbZhpfCx;
import com.po.MzywDcbZhpfwh;
import com.service.DcbService;
import com.utils.PageDto;

@Controller
public class DcbController {
	
	@Autowired
	private DcbService dcbService;
	
	@RequestMapping(value="/user/xxbsBsPxbzJg",method=RequestMethod.GET)
	public String xxbsBsPxbzJgGet(String id,Model model) {
		MzywDcbCxbdjf pxbzbs = dcbService.lookOne(id);
		model.addAttribute("pxbzbs", pxbzbs);
		return "dcb/xxbsBsPxbzJg";
	}
	
	@RequestMapping(value="/user/xxbsBsPxbzJg",method=RequestMethod.POST)
	@ResponseBody
	public String xxbsBsPxbzJgPost(String id,String hjmc,String bzsj,String bjdwmc,String zpjf) {
		int pxbzbs = dcbService.bsPxbz(id,hjmc,bzsj,bjdwmc,zpjf);
		if(pxbzbs > 0){
			return "报送成功！";
		}else{
			return "报送失败！";
		}
		/*return "redirect:user/xxbsCxPxbzDc";*/
	}
	
	@RequestMapping(value="/user/xxbsBsPxbzJgZc",method=RequestMethod.POST)
	@ResponseBody
	public String xxbsBsPxbzJgPostZc(String id,String hjmc,String bzsj,String bjdwmc,String zpjf) {
		int pxbzbsZc = dcbService.zcBsPxbz(id,hjmc,bzsj,bjdwmc,zpjf);
		if(pxbzbsZc > 0){
			return "暂存成功！";
		}else{
			return "暂存失败！";
		}
		/*return "redirect:user/xxbsCxPxbzDc";*/
	}
	
	//删除评先表彰信息
	@RequestMapping(value="/user/deletePxbzDc",method=RequestMethod.POST)
	@ResponseBody
	public String deletePxbzPost(String id) {
		int deletePxbz = dcbService.deletPxbz(id);
		if(deletePxbz > 0){
			return "删除成功！";
		}else{
			return "删除成功！";
		}
	}
	
	@RequestMapping(value="/user/xxbsBsXcbdJg",method=RequestMethod.GET)
	public String xxbsBsXcbdJgGet(String id,Model model) {
		MzywDcbPxbzjf xcbdOneBs = dcbService.lookOneXcbd(id);
		model.addAttribute("xcbdOneBs", xcbdOneBs);
		return "dcb/xxbsBsXcbdJg";
	}
	
	//报送宣传报道信息
	@RequestMapping(value="/user/xxbsBsXcbdJg",method=RequestMethod.POST)
	@ResponseBody
	public String xxbsBsXcbdJgPost(String id,String bzkwmtwzmc,String kysj,String bdlx,String xwbt,String zz,String bz,String zcbs) {
		int xcbdbs = dcbService.bsXcbd(id,bzkwmtwzmc,kysj,bdlx,xwbt,zz,bz,zcbs);
		if(xcbdbs > 0){
			return "报送成功！";
		}else{
			return "报送失败！";
		}
	}
	
	//暂存宣传报道信息
	@RequestMapping(value="/user/xxbsBsXcbdJgZc",method=RequestMethod.POST)
	@ResponseBody
	public String xxbsBsXcbdJgPostZc(String id,String bzkwmtwzmc,String kysj,String bdlx,String xwbt,String zz,String bz,String zcbs) {
		int zcxcbdbs = dcbService.zcBsXcbd(id,bzkwmtwzmc,kysj,bdlx,xwbt,zz,bz,zcbs);
		if(zcxcbdbs > 0){
			return "暂存成功！";
		}else{
			return "暂存失败！";
		}
	}
	
	//删除宣传报道信息
		@RequestMapping(value="/user/deleteXcbdDc",method=RequestMethod.POST)
		@ResponseBody
		public String deleteXcbdPost(String id) {
			int deleteXcbd = dcbService.deletXcbd(id);
			if(deleteXcbd > 0){
				return "删除成功！";
			}else{
				return "删除成功！";
			}
		}
	
	@RequestMapping(value="/user/xxbsCxPxbzDc",method=RequestMethod.GET)
	public String xxbsCxPxbzDcGet() {
		
		return "dcb/xxbsCxPxbzDc";
	}
	
	//分页评先表彰报道
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
	
	//分页查询宣传报道
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
	
	//分页查询综合评分
		@RequestMapping(value="/user/xxbsCxZhpfDc",method=RequestMethod.POST)
		@ResponseBody
		public PageDto<MzywDcbZhpfCx> xxbsCxZhpfDcPost(int pageIndex,int pageSize,String csfl,int year) {
			PageDto<MzywDcbZhpfCx> zhpf = dcbService.findZhpfCx(pageIndex,pageSize,csfl,year);
			return zhpf;
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
	
	//宣传报道详情页面渲染
	@RequestMapping(value="/user/xxbsXqXcbdDc",method=RequestMethod.GET)
	public String xxbsXqXcbdDcGet(String id,Model model) {
		MzywDcbPxbzjf xcbdOne = dcbService.lookOneXcbd(id);
		model.addAttribute("xcbdOne", xcbdOne);
		return "dcb/xxbsXqXcbdDc";
	}
	
	@RequestMapping(value="/user/xxbsXqXcbdJg",method=RequestMethod.GET)
	public String xxbsXqXcbdJgGet() {
		
		return "dcb/xxbsXqXcbdJg";
	}
	
	//综合评分详情
	@RequestMapping(value="/user/xxbsXqZhpfDc",method=RequestMethod.GET)
	public String xxbsXqZhpfDcGet(String id,String bt,Model model) {
		model.addAttribute("id", id);
		model.addAttribute("bt", bt);
		return "dcb/xxbsXqZhpfDc";
	}
	//综合评分详情
		@RequestMapping(value="/user/xxbsXqZhpfDc",method=RequestMethod.POST)
		@ResponseBody
		public List<MzywDcbZhpfwh> xxbsXqZhpfDcPost(String id,Model model) {
			List<MzywDcbZhpfwh> zhpflist = dcbService.lookZhpf(id);
			return zhpflist;
		}

}
