package com.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.dao.MzywZdDao;
import com.po.MzywZd;

@Component
public class DictUtil {
	
	//spring @Autowired注入，只能给对象注入属性；
	//不能给static注入值，因为static是全局的，是类的属性。
	@Autowired
	private MzywZdDao mzywZdDao;
	
	//将字典项根据类型分类
	private static Map<String, List<MzywZd>> map = new HashMap<String, List<MzywZd>>();

	/**
	 * 根据类型(dm)和值(lxjp)，查询名称(mc)
	 * @param dm
	 * @param lxjp
	 * @return 
	 */
	public static String getDictMc(String dm, String lxjp) {
		List<MzywZd> list = map.get(dm);
		for (MzywZd dict : list) {
			if (dict.getLxjp().equals(lxjp)) {
				return dict.getMc();
			}
		}
		return "";
	}

	/**
	 * 根据类型(dm)，查询字典信息
	 * @param dm
	 * @return
	 */
	public static List<MzywZd> getDict(String dm) {
		List<MzywZd> list = map.get(dm);
		return list;
	}

	/**
	 * 加载数据字典
	 */
	@Transactional
	public void load() {
		//查询所有字典信息
		List<MzywZd> list = mzywZdDao.queryDicList();
		map.clear();
		for (MzywZd dict : list) {
			String key = dict.getDm();
			//判断集合中是否包含key这个类型
			if (map.containsKey(key)) {
				//包含,将该字典项放入map的value中
				List<MzywZd> keyList = map.get(key);
				keyList.add(dict);
			} else {
				//不包含，map新放入一组键值对key为String，value为list集合
				List<MzywZd> keyList = new ArrayList<>();
				keyList.add(dict);
				map.put(key, keyList);
			}
		}
	}
	
}
