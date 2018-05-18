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
import com.po.User;
import com.service.MzywShswcSzxxService;
import com.utils.DictUtil;
import com.utils.PageDto;

@Controller
public class ShswcController {
	@Autowired
	private MzywShswcSzxxService mzywShswcSzxxService;
private SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
	@RequestMapping(value = "/user/shswXxCxSzBygy", method = RequestMethod.GET)
	public String shswXxCxSzBygyGet() {

		return "shswc/shswXxCxSzBygy";
	}

	@RequestMapping(value = "/user/xxbsBsGhjzBy", method = RequestMethod.GET)
	public String xxbsBsGhjzByGet() {

		return "shswc/xxbsBsGhjzBy";
	}

	@RequestMapping(value = "/user/xxbsBsMzxxGm", method = RequestMethod.GET)
	public String xxbsBsMzxxGmGet() {

		return "shswc/xxbsBsMzxxGm";
	}

	@RequestMapping(value = "/user/xxbsBsYtwyBy", method = RequestMethod.GET)
	public String xxbsBsYtwyByGet() {

		return "shswc/xxbsBsYtwyBy";
	}

	@RequestMapping(value = "/user/xxbsCxGhjzBy", method = RequestMethod.GET)
	public String xxbsCxGhjzByGet() {

		return "shswc/xxbsCxGhjzBy";
	}

	// 骨灰江葬查询-社会事务处
	@RequestMapping(value = "/user/xxbsCxGhjzSh", method = RequestMethod.GET)
	public String xxbsCxGhjzShGet() {

		return "shswc/xxbsCxGhjzSh";
	}

	@RequestMapping(value = "/user/xxbsCxMzxxGm", method = RequestMethod.GET)
	public String xxbsCxMzxxGmGet() {

		return "shswc/xxbsCxMzxxGm";
	}

	// 墓葬信息查询-社会事务处
	@RequestMapping(value = "/user/xxbsCxMzxxSh", method = RequestMethod.GET)
	public String xxbsCxMzxxShGet() {

		return "shswc/xxbsCxMzxxSh";
	}

	// 社会事务处-start

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
			String endDate, String szsfzhm, String bygmc) {
		PageDto<MzywShswcSzxx> dto = mzywShswcSzxxService.queryList(pageIndex, pageSize, szxm, startDate, endDate,
				szsfzhm, bygmc);
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
			String endDate, String szsfzhm, String bygmc) {
		PageDto<MzywShswcSzxx> dto = mzywShswcSzxxService.queryList(pageIndex, pageSize, szxm, startDate, endDate,
				szsfzhm, bygmc);
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
	//设置创建时间和创建用户,设置暂存报送为已报送
	@RequestMapping(value = "/user/xxbsBsSzxxBy", method = RequestMethod.POST)
	public String xxbsBsSzxxByPOST(MzywShswcSzxx mzy,HttpSession session) {
		User user = (User)session.getAttribute("user");
		mzy.setZhxgyh(user.getName());
		mzy.setZhxgsj(sdf.format(new Date()));
		mzy.setZcbs("0");
		return "shswc/xxbsCxSzxxBy";
	}

	// 逝者信息暂存-殡仪馆用户-POST
	//设置最后修改时间和最后修改用户,设置暂存报送为未报送
	@RequestMapping(value = "/user/xxbsZcSzxxBy", method = RequestMethod.POST)
	public String xxbsZcSzxxByPOST(MzywShswcSzxx mzy,HttpSession session) {
		MzywShswcSzxx oldMzy = (MzywShswcSzxx)mzywShswcSzxxService.queryById(mzy.getId());
		mzy.setCjsj(oldMzy.getCjsj());
		mzy.setCjyh(oldMzy.getCjyh());
		mzy.setYxbs(oldMzy.getYxbs());
		mzy.setBygmc(oldMzy.getBygmc());
		
 		User user = (User)session.getAttribute("user");
		mzy.setZhxgyh(user.getName());
		mzy.setZhxgsj(sdf.format(new Date()));
		mzy.setZcbs("1");
		mzywShswcSzxxService.update(mzy);
		return "shswc/xxbsCxSzxxBy";
	}
	
	// 新增逝者信息-殡仪馆用户-GET
	// 新增跳转到查询页面
	@RequestMapping(value = "/user/xxbsAdSzxxBy", method = RequestMethod.GET)
	public String xxbsAdSzxxByGET() {
		return "shswc/xxbsAdSzxxBy";
	}	
	
	// 新增逝者信息-殡仪馆用户-POST
	// 新增跳转到查询页面
	@RequestMapping(value = "/user/xxbsAdSzxxBy", method = RequestMethod.POST)
	public String xxbsAdSzxxByPOST(MzywShswcSzxx mzy) {
		mzywShswcSzxxService.add(mzy);
		return "shswc/xxbsCxSzxxBy";
	}	
	
	// 社会事务处-end

	@RequestMapping(value = "/user/xxbsCxYtwyBy", method = RequestMethod.GET)
	public String xxbsCxYtwyByGet() {
		return "shswc/xxbsCxYtwyBy";
	}

	// 遗体外运查询-社会事务处
	@RequestMapping(value = "/user/xxbsCxYtwySh", method = RequestMethod.GET)
	public String xxbsCxYtwyShGet() {

		return "shswc/xxbsCxYtwySh";
	}

	@RequestMapping(value = "/user/xxbsXqGhjzBy", method = RequestMethod.GET)
	public String xxbsXqGhjzByGet() {

		return "shswc/xxbsXqGhjzBy";
	}

	// 骨灰江葬详情-社会事务处
	@RequestMapping(value = "/user/xxbsXqGhjzSh", method = RequestMethod.GET)
	public String xxbsXqGhjzShGet() {

		return "shswc/xxbsXqGhjzSh";
	}

	@RequestMapping(value = "/user/xxbsXqMzxxGm", method = RequestMethod.GET)
	public String xxbsXqMzxxGmGet() {

		return "shswc/xxbsXqMzxxGm";
	}

	// 墓葬信息详情-社会事务处
	@RequestMapping(value = "/user/xxbsXqMzxxSh", method = RequestMethod.GET)
	public String xxbsXqMzxxShGet() {

		return "shswc/xxbsXqMzxxSh";
	}

	@RequestMapping(value = "/user/xxbsXqYtwyBy", method = RequestMethod.GET)
	public String xxbsXqYtwyByGet() {

		return "shswc/xxbsXqYtwyBy";
	}

	// 遗体外运详情-社会事务处
	@RequestMapping(value = "/user/xxbsXqYtwySh", method = RequestMethod.GET)
	public String xxbsXqYtwyShGet() {

		return "shswc/xxbsXqYtwySh";
	}
}
