package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.po.MzywZd;
import com.utils.DictUtil;

@Controller
public class CommonController {
	@Autowired
	private DictUtil dictUtil;

	@SuppressWarnings("static-access")
	@RequestMapping("/dictList")
	@ResponseBody//根据类型获取字典对象集合
	public List<MzywZd> queryDictList(String dm) {
		List<MzywZd> list=dictUtil.getDict(dm);
		return list;
	}
}
