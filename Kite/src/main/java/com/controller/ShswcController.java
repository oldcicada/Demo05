package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.po.MzywShswcSzxx;
import com.service.MzywShswcSzxxService;
import com.utils.DictUtil;
import com.utils.PageDto;

@Controller
public class ShswcController {
	@Autowired
	private MzywShswcSzxxService mzywShswcSzxxService;

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
		return dto;
	}

	// 逝者信息详情-社会事务处
	@RequestMapping(value = "/user/xxbsXqSzxxSh", method = RequestMethod.GET)
	public String xxbsXqSzxxShGet(String id, Model model) {
		MzywShswcSzxx mzywShswcSzxx = mzywShswcSzxxService.queryById(id);
		model.addAttribute("szxx", mzywShswcSzxx);
		return "shswc/xxbsXqSzxxSh";
	}

	// 逝者信息查询-殡仪馆用户-GET
	@RequestMapping(value = "/user/xxbsCxSzxxBy", method = RequestMethod.GET)
	public String xxbsCxSzxxByGET() {
		return "shswc/xxbsCxSzxxBy";
	}

	// 逝者信息查询-殡仪馆用户-POST
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
		}
		return dto;
	}

	// 逝者信息详情-殡仪馆用户-GET
	@RequestMapping(value = "/user/xxbsXqSzxxBy", method = RequestMethod.GET)
	public String xxbsXqSzxxByGET(Model model, String id) {
		MzywShswcSzxx mzywShswcSzxx = mzywShswcSzxxService.queryById(id);
		model.addAttribute("szxx", mzywShswcSzxx);
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
	@RequestMapping(value = "/user/xxbsBsSzxxBy", method = RequestMethod.POST)
	@ResponseBody
	public String xxbsBsSzxxByPOST() {
		return "shswc/xxbsBsSzxxBy";
	}

	// 逝者信息暂存-殡仪馆用户-POST
	@RequestMapping(value = "/user/xxbsZcSzxxBy", method = RequestMethod.POST)
	@ResponseBody
	public String xxbsZcSzxxByPOST() {
		return "shswc/xxbsBsSzxxBy";
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
