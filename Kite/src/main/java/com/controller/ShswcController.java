package com.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.po.MzywShswcSzxx;
import com.po.MzywShswcYtwy;
import com.po.User;
import com.service.MzywShswcSzxxService;
import com.utils.DictUtil;
import com.utils.PageDto;

@Controller
public class ShswcController {
	@Autowired
	private MzywShswcSzxxService mzywShswcSzxxService;
	private SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
	// 社会事务处-start
	/* 逝者信息-start */
	// 逝者信息查询-社会事务处-GET
	@RequestMapping(value = "/user/xxbsCxSzxxSh", method = RequestMethod.GET)
	public String xxbsCxSzxxShGet() {
		return "shswc/xxbsCxSzxxSh";
	}
	// 逝者信息查询-社会事务处-POST
	//查询字典，设置殡仪馆名称,救助对象，渲染列表
	@RequestMapping(value = "/user/xxbsCxSzxxSh", method = RequestMethod.POST)
	@ResponseBody
	public PageDto<MzywShswcSzxx> xxbsCxSzxxShPost(int pageIndex, int pageSize, String szxm, String startDate,
			String endDate, String szsfzhm, String bygmc,String zcbs) {
		PageDto<MzywShswcSzxx> dto = mzywShswcSzxxService.queryList(pageIndex, pageSize, szxm, startDate, endDate,
				szsfzhm, bygmc,zcbs);
		List<MzywShswcSzxx> list = dto.getList();
		for (MzywShswcSzxx mzy : list) {
			String mc = DictUtil.getDictMc("funeral", mzy.getBygmc());
			mzy.setBygmc(mc);
		}
		for (MzywShswcSzxx mzy : list) {
			String mc = DictUtil.getDictMc("succour", mzy.getZdjzdx());
			mzy.setZdjzdx(mc);
		}
		return dto;
	}
	// 逝者信息详情-社会事务处-GET
	//查询字典设置死亡原因，殡仪馆名称，重点救助对象，是否选择江葬，显示对象信息
	@RequestMapping(value = "/user/xxbsXqSzxxSh", method = RequestMethod.GET)
	public String xxbsXqSzxxShGet(String id, Model model) {
		MzywShswcSzxx mzy = mzywShswcSzxxService.queryById(id);
		mzy.setSzswyy(DictUtil.getDictMc("cause", mzy.getSzswyy()));
		mzy.setZdjzdx(DictUtil.getDictMc("succour", mzy.getZdjzdx()));
		mzy.setSfxzjz(DictUtil.getDictMc("choose", mzy.getSfxzjz()));
		model.addAttribute("szxx", mzy);
		return "shswc/xxbsXqSzxxSh";
	}
	// 逝者信息查询-殡仪馆用户-GET
	@RequestMapping(value = "/user/xxbsCxSzxxBy", method = RequestMethod.GET)
	public String xxbsCxSzxxByGET() {
		return "shswc/xxbsCxSzxxBy";
	}
	// 逝者信息查询-殡仪馆用户-POST
	//查询字典，设置报送状态，重点救助对象，渲染列表
	@RequestMapping(value = "/user/xxbsCxSzxxBy", method = RequestMethod.POST)
	@ResponseBody
	public PageDto<MzywShswcSzxx> xxbsCxSzxxByPOST(int pageIndex, int pageSize, String szxm, String startDate,
			String endDate, String szsfzhm, String bygmc,String zcbs) {
		PageDto<MzywShswcSzxx> dto = mzywShswcSzxxService.queryList(pageIndex, pageSize, szxm, startDate, endDate,
				szsfzhm, bygmc,zcbs);
		List<MzywShswcSzxx> list = dto.getList();
		for (MzywShswcSzxx mzy : list) {
			String mc = DictUtil.getDictMc("submit", mzy.getZcbs());
			mzy.setZcbs(mc);
			String mc2 = DictUtil.getDictMc("succour", mzy.getZdjzdx());
			mzy.setZdjzdx(mc2);
		}
		return dto;
	}
	// 逝者信息详情-殡仪馆用户-GET
	//查询字典设置死亡原因，殡仪馆名称，重点救助对象，是否选择江葬，显示对象信息
	@RequestMapping(value = "/user/xxbsXqSzxxBy", method = RequestMethod.GET)
	public String xxbsXqSzxxByGET(Model model, String id) {
		MzywShswcSzxx mzy = mzywShswcSzxxService.queryById(id);
		mzy.setSzswyy(DictUtil.getDictMc("cause", mzy.getSzswyy()));
		mzy.setZdjzdx(DictUtil.getDictMc("succour", mzy.getZdjzdx()));
		mzy.setSfxzjz(DictUtil.getDictMc("choose", mzy.getSfxzjz()));
		model.addAttribute("szxx", mzy);
		return "shswc/xxbsXqSzxxBy";
	}
	// 逝者信息删除-殡仪馆用户-GET
	@RequestMapping(value = "/user/xxbsScSzxxBy", method = RequestMethod.GET)
	public String xxbsScSzxxByGET(String id) {
		mzywShswcSzxxService.deleteById(id);
		return "shswc/xxbsCxSzxxBy";
	}
	// 逝者信息报送-殡仪馆用户-GET
	@RequestMapping(value = "/user/xxbsBsSzxxBy", method = RequestMethod.GET)
	public String xxbsBsSzxxByGET(String id,Model model) {
		MzywShswcSzxx mzywShswcSzxx = mzywShswcSzxxService.queryById(id);
		model.addAttribute("szxx", mzywShswcSzxx);
		return "shswc/xxbsBsSzxxBy";
	}
	// 逝者信息报送-殡仪馆用户-POST
	//设置最后修改时间和最后修改用户,设置暂存报送为已报送
	@RequestMapping(value = "/user/xxbsBsSzxxBy", method = RequestMethod.POST)
	public String xxbsBsSzxxByPOST(MzywShswcSzxx mzy,HttpSession session) {
		User user = (User)session.getAttribute("user");
		mzy.setZhxgyh(user.getName());
		mzy.setZhxgsj(sdf.format(new Date()));
		mzy.setZcbs("0");
		mzywShswcSzxxService.update(mzy);
		return "shswc/xxbsCxSzxxBy";
	}
	// 逝者信息暂存-殡仪馆用户-POST
	//设置最后修改时间和最后修改用户,设置暂存报送为未报送
	@RequestMapping(value = "/user/xxbsZcSzxxBy", method = RequestMethod.POST)
	public String xxbsZcSzxxByPOST(MzywShswcSzxx mzy,HttpSession session) {
 		User user = (User)session.getAttribute("user");
		mzy.setZhxgyh(user.getName());
		mzy.setZhxgsj(sdf.format(new Date()));
		mzy.setZcbs("1");
		mzywShswcSzxxService.update(mzy);
		return "shswc/xxbsCxSzxxBy";
	}
	// 新增逝者信息-殡仪馆用户-GET
	@RequestMapping(value = "/user/xxbsAdSzxxBy", method = RequestMethod.GET)
	public String xxbsAdSzxxByGET() {
		return "shswc/xxbsAdSzxxBy";
	}	
	// 新增逝者信息报送-殡仪馆用户-POST
	// 新增跳转到查询页面
	@RequestMapping(value = "/user/xxbsAdSzxxBy", method = RequestMethod.POST)
	public String xxbsAdSzxxByPOST(MzywShswcSzxx mzy,HttpSession session) {
		String date = sdf.format(new Date());
		User user = (User)session.getAttribute("user");
		mzy.setCjsj(date);
		mzy.setCjyh(user.getName());
		mzy.setZhxgsj(date);
		mzy.setZhxgyh(user.getName());
		mzy.setYxbs("0");
		mzy.setZcbs("0");
		mzywShswcSzxxService.add(mzy);
		return "shswc/xxbsCxSzxxBy";
	}
	// 新增暂存逝者信息-殡仪馆用户-POST
	// 新增跳转到查询页面
	@RequestMapping(value = "/user/xxbsAdZcSzxxBy", method = RequestMethod.POST)
	public String xxbsAdZcSzxxByPOST(MzywShswcSzxx mzy,HttpSession session) {
		String date = sdf.format(new Date());
		User user = (User)session.getAttribute("user");
		mzy.setCjsj(date);
		mzy.setCjyh(user.getName());
		mzy.setZhxgsj(date);
		mzy.setZhxgyh(user.getName());
		mzy.setYxbs("0");
		mzy.setZcbs("1");
		mzywShswcSzxxService.add(mzy);
		mzywShswcSzxxService.add(mzy);
		return "shswc/xxbsCxSzxxBy";
	}	
	/* 逝者信息-end */
	
	/* 骨灰江葬-start */
	// 骨灰江葬查询-社会事务处 - GET
	@RequestMapping(value = "/user/xxbsCxGhjzSh", method = RequestMethod.GET)
	public String xxbsCxGhjzShGet() {
		return "shswc/xxbsCxGhjzSh";
	}
	
	// 骨灰江葬详情-社会事务处 - GET
	@RequestMapping(value = "/user/xxbsXqGhjzSh", method = RequestMethod.GET)
	public String xxbsXqGhjzShGet(Model model,String id) {
		MzywShswcSzxx mzy= mzywShswcSzxxService.queryById(id);
		model.addAttribute("szxx",mzy);
		return "shswc/xxbsXqGhjzSh";
	}
	
	// 骨灰江葬查询-殡仪馆 - GET
	@RequestMapping(value = "/user/xxbsCxGhjzBy", method = RequestMethod.GET)
	public String xxbsCxGhjzByGet() {
		return "shswc/xxbsCxGhjzBy";
	}
	
	// 骨灰江葬详情-殡仪馆 - GET
	@RequestMapping(value = "/user/xxbsXqGhjzBy", method = RequestMethod.GET)
	public String xxbsXqGhjzByGet(Model model,String id) {
		MzywShswcSzxx mzy= mzywShswcSzxxService.queryById(id);
		model.addAttribute("szxx",mzy);
		return "shswc/xxbsXqGhjzBy";
	}
	
	// 骨灰江葬报送-殡仪馆 - GET
	@RequestMapping(value = "/user/xxbsBsGhjzBy", method = RequestMethod.GET)
	public String xxbsBsGhjzByGet(Model model,String id) {
		MzywShswcSzxx mzy= mzywShswcSzxxService.queryById(id);
		model.addAttribute("szxx",mzy);
		return "shswc/xxbsBsGhjzBy";
	}
	
	// 骨灰江葬报送-殡仪馆 - POST
	@RequestMapping(value = "/user/xxbsBsGhjzBy", method = RequestMethod.POST)
	public String xxbsBsGhjzByPOST(String id,String szsfzhm,String szxm,String szhjd,
			String jbrsfzhm,String jbrxm,String jbrlxdh) {
			String zcbs="0";
			mzywShswcSzxxService.updateGhjzById(id,zcbs,szsfzhm,szxm,szhjd,
					jbrsfzhm,jbrxm,jbrlxdh);
		return "shswc/xxbsCxGhjzBy";
	}
	
	// 骨灰江葬删除-殡仪馆 - GET
	@RequestMapping(value = "/user/xxbsScGhjzBy", method = RequestMethod.GET)
	public String xxbsScGhjzByPOST(String id) {
		mzywShswcSzxxService.deleteById(id);
		return "shswc/xxbsCxGhjzBy";
	}
	
	// 骨灰江葬暂存-殡仪馆 - POST
	@RequestMapping(value = "/user/xxbsZcGhjzBy", method = RequestMethod.POST)
	public String xxbsZcGhjzByPOST(String id,
			String szsfzhm,String szxm,String szhjd,
			String jbrsfzhm,String jbrxm,String jbrlxdh) {
			String zcbs="1";
			mzywShswcSzxxService.updateGhjzById(id,zcbs,szsfzhm,szxm,szhjd,
					jbrsfzhm,jbrxm,jbrlxdh);
		return "shswc/xxbsCxGhjzBy";
	}
	/* 骨灰江葬-end */
	
	/* 遗体外运-start */
	// 遗体外运查询-社会事务处 - GET
	@RequestMapping(value = "/user/xxbsCxYtwySh", method = RequestMethod.GET)
	public String xxbsCxYtwyShGet() {
		return "shswc/xxbsCxYtwySh";
	}
	// 遗体外运详情-社会事务处 - GET
	@RequestMapping(value = "/user/xxbsXqYtwySh", method = RequestMethod.GET)
	public PageDto<MzywShswcYtwy> xxbsXqYtwyShGet(int pageIndex, int pageSize, String szxm, String startDate,
			String endDate, String szsfzhm, String bygmc,String zcbs) {
		PageDto<MzywShswcYtwy> dto = mzywShswcSzxxService.queryYtwyList(pageIndex, pageSize, szxm, startDate, endDate,
				szsfzhm, bygmc,zcbs);
		List<MzywShswcYtwy> list = dto.getList();
		for (MzywShswcYtwy mzy : list) {
			String mc = DictUtil.getDictMc("funeral", mzy.getBygmc());
			mzy.setBygmc(mc);
		}
		for (MzywShswcYtwy mzy : list) {
			String mc = DictUtil.getDictMc("succour", mzy.getGx());
			mzy.setGx(mc);
		}
		return dto;
	}
	// 遗体外运查询-殡仪馆 - GET
	@RequestMapping(value = "/user/xxbsCxYtwyBy", method = RequestMethod.GET)
	public String xxbsCxYtwyByGet() {
		return "shswc/xxbsCxYtwyBy";
	}
	@RequestMapping(value = "/user/xxbsCxYtwyBy", method = RequestMethod.POST)
	public String xxbsCxYtwyByPOST() {
		return "shswc/xxbsCxYtwyBy";
	}
	// 遗体外运详情-殡仪馆 - GET
	@RequestMapping(value = "/user/xxbsXqYtwyBy", method = RequestMethod.GET)
	public String xxbsXqYtwyByGet(Model model,String id) {
		MzywShswcYtwy ytwy = mzywShswcSzxxService.queryYtwyById(id);
		model.addAttribute("ytwy",ytwy);
		return "shswc/xxbsXqYtwyBy";
	}
	// 遗体外运报送-殡仪馆 - GET
	@RequestMapping(value = "/user/xxbsBsYtwyBy", method = RequestMethod.GET)
	public String xxbsBsYtwyByGet(Model model,String id) {
		MzywShswcYtwy ytwy = mzywShswcSzxxService.queryYtwyById(id);
		model.addAttribute("ytwy",ytwy);
		return "shswc/xxbsBsYtwyBy";
	}
	// 遗体外运报送-殡仪馆 - POST
	@RequestMapping(value = "/user/xxbsBsYtwyBy", method = RequestMethod.POST)
	public String xxbsBsYtwyByPOST(MzywShswcYtwy ytwy,HttpSession session) {
		User user = (User)session.getAttribute("user");
		ytwy.setZhxgyh(user.getName());
		ytwy.setZhxgsj(sdf.format(new Date()));
		ytwy.setZcbs("0");
		mzywShswcSzxxService.updateYtwy(ytwy);
		return "shswc/xxbsCxYtwyBy";
	}
	// 遗体外运删除-殡仪馆 - POST
	@RequestMapping(value = "/user/xxbsScYtwyBy", method = RequestMethod.POST)
	public String xxbsScYtwyByPOST(String id) {
		mzywShswcSzxxService.deleteYtwyById(id);
		return "shswc/xxbsCxYtwyBy";
	}
	// 遗体外运暂存-殡仪馆 - POST
	@RequestMapping(value = "/user/xxbsZcYtwyBy", method = RequestMethod.POST)
	public String xxbsZcYtwyByPOST(MzywShswcYtwy ytwy,HttpSession session) {
		User user = (User)session.getAttribute("user");
		ytwy.setZhxgyh(user.getName());
		ytwy.setZhxgsj(sdf.format(new Date()));
		ytwy.setZcbs("1");
		mzywShswcSzxxService.updateYtwy(ytwy);
		return "shswc/xxbsCxYtwyBy";
	}
	// 新增遗体外运报送-殡仪馆用户-POST
	// 新增跳转到查询页面
	@RequestMapping(value = "/user/xxbsAdYtwyBy", method = RequestMethod.POST)
	public String xxbsAdYtwyByPOST(MzywShswcYtwy ytwy,HttpSession session) {
		String date = sdf.format(new Date());
		User user = (User)session.getAttribute("user");
		ytwy.setCjsj(date);
		ytwy.setCjyh(user.getName());
		ytwy.setZhxgsj(date);
		ytwy.setZhxgyh(user.getName());
		ytwy.setYxbs("0");
		ytwy.setZcbs("0");
		mzywShswcSzxxService.addYtwy(ytwy);
		return "shswc/xxbsCxYtwyBy";
	}	
	/* 遗体外运-end */
	
	/* 墓葬信息-start */
	// 墓葬信息查询-社会事务处 - GET
	@RequestMapping(value = "/user/xxbsCxMzxxSh", method = RequestMethod.GET)
	public String xxbsCxMzxxShGet() {
		return "shswc/xxbsCxMzxxSh";
	}
	// 墓葬信息详情-社会事务处 - GET
	@RequestMapping(value = "/user/xxbsXqMzxxSh", method = RequestMethod.GET)
	public String xxbsXqMzxxShGet(Model model,String id) {
		MzywShswcSzxx mzy= mzywShswcSzxxService.queryById(id);
		model.addAttribute("szxx",mzy);
		return "shswc/xxbsXqMzxxSh";
	}
	// 墓葬信息查询-公墓 - GET
	@RequestMapping(value = "/user/xxbsCxMzxxGm", method = RequestMethod.GET)
	public String xxbsCxMzxxGmGet() {
		return "shswc/xxbsCxMzxxGm";
	}
	// 墓葬信息详情-公墓 - GET
	@RequestMapping(value = "/user/xxbsXqMzxxGm", method = RequestMethod.GET)
	public String xxbsXqMzxxGmGet(Model model,String id) {
		MzywShswcSzxx mzy= mzywShswcSzxxService.queryById(id);
		model.addAttribute("szxx",mzy);
		return "shswc/xxbsXqMzxxGm";
	}
	// 墓葬信息报送-公墓 - GET
	@RequestMapping(value = "/user/xxbsBsMzxxGm", method = RequestMethod.GET)
	public String xxbsBsMzxxGmGet(Model model,String id) {
		MzywShswcSzxx mzy= mzywShswcSzxxService.queryById(id);
		model.addAttribute("szxx",mzy);
		return "shswc/xxbsBsMzxxGm";
	}
	// 墓葬信息报送-公墓 - POST
	@RequestMapping(value = "/user/xxbsBsMzxxGm", method = RequestMethod.POST)
	public String xxbsBsMzxxGmGet(String id) {
		return "shswc/xxbsCxMzxxGm";
	}
	// 墓葬信息删除-公墓 - GET
	@RequestMapping(value = "/user/xxbsScMzxxGm", method = RequestMethod.GET)
	public String xxbsScMzxxGmGet(String id) {
		mzywShswcSzxxService.deleteById(id);
		return "shswc/xxbsCxMzxxGm";
	}
	// 墓葬信息暂存-公墓 - POST
	@RequestMapping(value = "/user/xxbsZcMzxxGm", method = RequestMethod.POST)
	public String xxbsZcMzxxGmGet(String id) {
		mzywShswcSzxxService.deleteById(id);
		return "shswc/xxbsCxMzxxGm";
	}
	/* 墓葬信息-end */
	// 社会事务处-end

	
}
