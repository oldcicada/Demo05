package com.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.MzywBnbDao;
import com.po.MzywBnb;
import com.service.MzywBnbService;

@Service
@Transactional
public class MzywBnbServiceImpl implements MzywBnbService{

	@Autowired
	private MzywBnbDao mzywBnbDao;
	
	//
	@Override
	public List<MzywBnb> queryList(Map<Object, Object> map) {
		
		return mzywBnbDao.queryList(map);
	}

	@Override
	public int queryListCount(Map<Object, Object> map) {
		
		return mzywBnbDao.queryListCount(map);
	}

	@Override
	public MzywBnb queryInfoById(String id) {
		
		return mzywBnbDao.queryInfoById(id);
	}
	
	@Override
	public void saveXxbsBsJg(MzywBnb mzywBnb) {
		
		mzywBnbDao.saveXxbsBsJg(mzywBnb);
	}

	@Override
	public void updateStatusById(String id, String zcbs) {
		
		mzywBnbDao.updateStatusById(id,zcbs);
	}

	@Override
	public void updateXxbsBsJg(MzywBnb mzywBnb) {
		
		mzywBnbDao.updateXxbsBsJg(mzywBnb);
	}

	@Override
	public List<MzywBnb> queryListByBn(Map<Object, Object> map) {
		
		return mzywBnbDao.queryListByBn(map);
	}

	@Override
	public int queryListCountByBn(Map<Object, Object> map) {
		
		return mzywBnbDao.queryListCountByBn(map);
	}

}
