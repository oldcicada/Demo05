package com.service;

import java.util.List;
import java.util.Map;

import com.po.MzywShswcSzxx;

public interface MzywShswcSzxxService {
	//获取逝者信息列表
	List<MzywShswcSzxx> queryList(Map<Object,Object> map);
	//获取逝者信息列表长度
	int queryListCount(Map<Object,Object> map);
}
