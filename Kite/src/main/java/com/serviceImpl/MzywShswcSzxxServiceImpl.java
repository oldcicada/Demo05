package com.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.MzywShswcSzxxDao;
import com.po.MzywShswcSzxx;
import com.service.MzywShswcSzxxService;

@Service
public class MzywShswcSzxxServiceImpl implements MzywShswcSzxxService {
	
	@Autowired
	private MzywShswcSzxxDao mzywShswcSzxxDao;

	// 获取逝者信息列表
	public List<MzywShswcSzxx> queryList(Map<Object, Object> map) {
		List<MzywShswcSzxx> list = mzywShswcSzxxDao.queryList(map);
		return list;
	}
	//获取逝者信息列表长度
	public int queryListCount(Map<Object,Object> map) {
		int count = mzywShswcSzxxDao.queryListCount(map);
		return count;
	}
}
