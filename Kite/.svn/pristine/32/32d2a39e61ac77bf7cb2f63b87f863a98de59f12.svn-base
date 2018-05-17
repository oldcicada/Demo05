package com.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.TongGaoDao;
import com.po.MzywTzgg;
import com.service.TongGaoService;


@Service
@Transactional
public class TongGaoServiceImpl implements TongGaoService {
	
	@Autowired
	private TongGaoDao tongGaoDao;

	// 获取逝者信息列表
	public List<MzywTzgg> queryList(Map<Object, Object> map) {
		List<MzywTzgg> list = tongGaoDao.queryList(map);
		return list;
	}
	//获取逝者信息列表长度
	public int queryListCount(Map<Object,Object> map) {
		int count = tongGaoDao.queryListCount(map);
		return count;
	}
	
}
