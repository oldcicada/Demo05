package com.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.po.MzywFccSqylfwss;
import com.po.MzywFccYljgxx;
import com.service.MzywFccSqylfwService;
import com.service.MzywFccYljgxxService;
import com.utils.DictUtil;
import com.utils.PageDto;


@Controller
public class FccController {
	
	@Autowired
	private MzywFccYljgxxService mzywFccYljgxxService;
	
	@Autowired
	private MzywFccSqylfwService mzywFccSqylfwService;
	//查询养老机构(区县)get请求
	@RequestMapping(value="/user/xxbsCxYljgQx",method=RequestMethod.GET)
	public String xxbsCxYljgQxGet() {
		return "fcc/xxbsCxYljgQx";
	}
	//查询养老机构(区县)post请求
	@RequestMapping(value="/user/xxbsCxYljgQx",method=RequestMethod.POST)
	@ResponseBody
	public PageDto<MzywFccYljgxx> xxbsCxYljgQxPost(int pageIndex, int pageSize, String mc,String startDate,String endDate,String bszt) {
		PageDto<MzywFccYljgxx> dto = mzywFccYljgxxService.queryMzywFccYljgxx(pageIndex, pageSize, mc, startDate, endDate, bszt);
		List<MzywFccYljgxx> list =dto.getList();
		for (MzywFccYljgxx mzywFccYljgxx : list) {
			mzywFccYljgxx.setDz(DictUtil.getDictMc("dz", mzywFccYljgxx.getDz()));
			mzywFccYljgxx.setBszt(DictUtil.getDictMc("submit", mzywFccYljgxx.getBszt()));
		}
		return dto;
	}
	
	//报送养老机构(区县)get请求
	@RequestMapping(value="/user/xxbsBsYljgQx",method=RequestMethod.GET)
	public String xxbsBsYljgQxGet(Model model,String id) {
		if(!(id==null)) {
			MzywFccYljgxx yljgxx=mzywFccYljgxxService.queryMzywFccYljgxxbyid(id);
			model.addAttribute("MzywFccYljgxx", yljgxx);
			return "fcc/xxbsBsYljgQx";
		}else {
			return "fcc/xxbsBsYljgQx";
		}
	}
	
	//报送养老机构(区县)post请求
	@RequestMapping(value="/user/xxbsBsYljgQx",method=RequestMethod.POST)
	@ResponseBody
	public String xxbsBsYljgQxPost(MzywFccYljgxx mzywFccYljgxx) {
		mzywFccYljgxxService.bsMzywFccYljgxx(mzywFccYljgxx);
		return "redirect:/user/xxbsCxYljgQx";
	}
	//暂存养老机构(区县)get请求
	@RequestMapping(value="/user/xxbsBsYljgQxZc",method=RequestMethod.GET)
	public String xxbsBsYljgQxZcGet() {
		return "fcc/xxbsBsYljgQx";
	}
	//暂存养老机构(区县)post请求
	@RequestMapping(value="/user/xxbsBsYljgQxZc",method=RequestMethod.POST)
	@ResponseBody
	public String xxbsBsYljgQxZcPost(MzywFccYljgxx mzywFccYljgxx) {
		mzywFccYljgxxService.zcMzywFccYljgxx(mzywFccYljgxx);
		return "redirect:/user/xxbsCxYljgQx";
	}
	//删除养老机构(区县)get求情
	@RequestMapping(value="/user/xxbsBsYljgQxSc",method=RequestMethod.GET)
	public String xxbsBsYljgQxScGet(String id) {
	mzywFccYljgxxService.scMzywFccYljgxx(id);
		return "redirect:/user/xxbsCxYljgQx";
	}
	//报送社区养老设施(区县)get请求
	@RequestMapping(value="/user/xxbsBsSqylQx",method=RequestMethod.GET)
	public String xxbsBsSqylQxGet(Model model,String id) {
		if(!(id==null)) {
			MzywFccSqylfwss mzywFccSqylfwss=mzywFccSqylfwService.queryMzywFccSqylfwssByid(id);
			model.addAttribute("MzywFccSqylfwss", mzywFccSqylfwss);
			return "fcc/xxbsBsSqylQx";
		}else {
			return "fcc/xxbsBsSqylQx";
		}
	}
	//报送社区养老设施(区县)post请求
	@RequestMapping(value="/user/xxbsBsSqylQx",method=RequestMethod.POST)
	@ResponseBody
	public String xxbsBsSqylQxBsPost(MzywFccSqylfwss mzywFccSqylfwss) {
		mzywFccSqylfwService.bsMzywFccSqylfwss(mzywFccSqylfwss);
		return "fcc/xxbsBsSqylQx";
	}
	//暂存社区养老设施(区县)get请求
	@RequestMapping(value="/user/xxbsBsSqylQxZc",method=RequestMethod.GET)
	public String xxbsBsSqylQxZcGet() {
		return "fcc/xxbsBsSqylQx";
	}
	//暂存社区养老设施(区县)post请求
	@RequestMapping(value="/user/xxbsBsSqylQxZc",method=RequestMethod.POST)
	@ResponseBody
	public String xxbsBsSqylQxPost(MzywFccSqylfwss mzywFccSqylfwss) {
		mzywFccSqylfwService.zcMzywFccSqylfwss(mzywFccSqylfwss);
		return "fcc/xxbsBsSqylQx";
	}
	//删除养老设施(区县)get请求
	@RequestMapping(value="/user/xxbsBsSqylQxSc",method=RequestMethod.GET)
	public String xxbsBsSqylQxScGet(String id) {
		mzywFccSqylfwService.scMzywFccSqylfwssByid(id);
		return "fcc/xxbsCxSqylQx";
	}
	
	//查询社区养老设施(福慈)get
	@RequestMapping(value="/user/xxbsCxSqylFc",method=RequestMethod.GET)
	public String xxbsCxSqylFcGet() {
		return "fcc/xxbsCxSqylFc";
	}
	//查询社区养老设施(福慈)get
	@RequestMapping(value="/user/xxbsCxSqylFc",method=RequestMethod.POST)
	@ResponseBody
	public PageDto<MzywFccSqylfwss> xxbsCxSqylFcPost(int pageIndex, int pageSize, String mc,String startDate,String endDate,String sbdw) {
		PageDto<MzywFccSqylfwss> dto = mzywFccSqylfwService.queryMzywFccSqylfwssFc(pageIndex, pageSize, mc, startDate, endDate, sbdw);
		List<MzywFccSqylfwss> list =dto.getList();
		for (MzywFccSqylfwss MzywFccSqylfwss : list) {
			MzywFccSqylfwss.setDz(DictUtil.getDictMc("dz", MzywFccSqylfwss.getDz()));
			MzywFccSqylfwss.setSbdw(DictUtil.getDictMc("sbdw", MzywFccSqylfwss.getSbdw()));
		}
		return dto;
	}
	
	//查询养老服务设施(区县)get请求
	@RequestMapping(value="/user/xxbsCxSqylQx",method=RequestMethod.GET)
	public String xxbsCxSqylQxGet() {
		return "fcc/xxbsCxSqylQx";
	}
	//查询养老服务设施(区县)post请求
	@RequestMapping(value="/user/xxbsCxSqylQx",method=RequestMethod.POST)
	@ResponseBody
	public PageDto<MzywFccSqylfwss> xxbsCxSqylQxPost(int pageIndex, int pageSize, String mc,String startDate,String endDate,String bszt) {
		PageDto<MzywFccSqylfwss> dto = mzywFccSqylfwService.queryMzywFccSqylfwss(pageIndex, pageSize, mc, startDate, endDate, bszt);
		List<MzywFccSqylfwss> list =dto.getList();
		for (MzywFccSqylfwss MzywFccSqylfwss : list) {
			MzywFccSqylfwss.setDz(DictUtil.getDictMc("dz", MzywFccSqylfwss.getDz()));
			MzywFccSqylfwss.setBszt(DictUtil.getDictMc("submit", MzywFccSqylfwss.getBszt()));
		}
		return dto;
	}
	//查询养老机构(福慈)get请求
	@RequestMapping(value="/user/xxbsCxYljgFc",method=RequestMethod.GET)
	public String xxbsCxYljgFcGet() {
		
		return "fcc/xxbsCxYljgFc";
	}
	//查询养老机构(福慈)post请求
	@ResponseBody
	@RequestMapping(value="/user/xxbsCxYljgFc",method=RequestMethod.POST)
	public PageDto<MzywFccYljgxx> xxbsCxYljgFcPost(int pageIndex, int pageSize, String mc,String startDate,String endDate,String sbdw) {
		PageDto<MzywFccYljgxx> dto = mzywFccYljgxxService.queryMzywFccYljgxxdw(pageIndex, pageSize, mc, startDate, endDate, sbdw);
		List<MzywFccYljgxx> list =dto.getList();
		for (MzywFccYljgxx mzywFccYljgxx : list) {
			mzywFccYljgxx.setDz(DictUtil.getDictMc("dz", mzywFccYljgxx.getDz()));
			mzywFccYljgxx.setSbdw(DictUtil.getDictMc("sbdw", mzywFccYljgxx.getSbdw()));
		}
		return dto;
	}
	
	//维护养老设施(福慈)get请求
	@RequestMapping(value="/user/xxbsWhSqylFc",method=RequestMethod.GET)
	public String xxbsWhSqylFcGet() {
		return "fcc/xxbsWhSqylFc";
	}
	//维护养老设施(福慈)post请求
	@RequestMapping(value="/user/xxbsWhSqylFc",method=RequestMethod.POST)
	public String xxbsWhSqylFcPost(MzywFccSqylfwss mzywFccSqylfwss) {
		mzywFccSqylfwService.saveMzywFccSqylfwss(mzywFccSqylfwss);
		return "fcc/xxbsWhSqylFc";
	}
	//维护养老机构(福慈)get请求
	@RequestMapping(value="/user/xxbsWhYljgFc",method=RequestMethod.GET)
	public String xxbsWhYljgFcGet() {
		return "fcc/xxbsWhYljgFc";
	}
	//维护养老机构(福慈)post请求
	@RequestMapping(value="/user/xxbsWhYljgFc",method=RequestMethod.POST)
	@ResponseBody
	public void xxbsWhYljgFcPost(MzywFccYljgxx mzywFccYljgxx) {
		mzywFccYljgxxService.saveMzywFccYljgxx(mzywFccYljgxx);
	}
	
	
	@RequestMapping(value="/user/xxbsXqSqylFc",method=RequestMethod.GET)
	public String xxbsXqSqylFcGet(Model model,String id) {
		MzywFccSqylfwss mzywFccSqylfwss = mzywFccSqylfwService.queryMzywFccSqylfwssByid(id);
		mzywFccSqylfwss.setDz(DictUtil.getDictMc("dz", mzywFccSqylfwss.getDz()));
		model.addAttribute("MzywFccSqylfwss", mzywFccSqylfwss);
		return "fcc/xxbsXqSqylFc";
	}
	
	@RequestMapping(value="/user/xxbsXqSqylQx",method=RequestMethod.GET)
	public String xxbsXqSqylQxGet(Model model,String id ) {
		MzywFccSqylfwss mzywFccSqylfwss = mzywFccSqylfwService.queryMzywFccSqylfwssByid(id);
		mzywFccSqylfwss.setDz(DictUtil.getDictMc("dz", mzywFccSqylfwss.getDz()));
		model.addAttribute("MzywFccSqylfwss", mzywFccSqylfwss);
		return "fcc/xxbsXqSqylQx";
	}
	
	@RequestMapping(value="/user/xxbsXqYljgFc",method=RequestMethod.GET)
	public String xxbsXqYljgFcGet(Model model,String id) {
		MzywFccYljgxx mzywFccYljgxx = mzywFccYljgxxService.queryMzywFccYljgxxbyid(id);
		mzywFccYljgxx.setDz(DictUtil.getDictMc("dz", mzywFccYljgxx.getDz()));
		model.addAttribute("MzywFccYljgxx", mzywFccYljgxx);
		return "fcc/xxbsXqYljgFc";
	}
	//养老机构详情get请求
	@RequestMapping(value="/user/xxbsXqYljgQx",method=RequestMethod.GET)
	public String xxbsXqYljgQxGet(Model model,String id) {
		MzywFccYljgxx mzywFccYljgxx = mzywFccYljgxxService.queryMzywFccYljgxxbyid(id);
		mzywFccYljgxx.setDz(DictUtil.getDictMc("dz", mzywFccYljgxx.getDz()));
		model.addAttribute("MzywFccYljgxx", mzywFccYljgxx);
		return "fcc/xxbsXqYljgQx";
	}
}
