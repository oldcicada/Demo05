package com.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.MzywAzcXxhzypzDao;
import com.po.MzywAzcXxhzypz;
import com.service.MzywAzcXxhzypzService;

@Service
@Transactional
public class MzywAzcXxhzypzImpl implements MzywAzcXxhzypzService{

	@Autowired
	private MzywAzcXxhzypzDao mzywAzcXxhzypzDao;
	
	@Override
	public List<MzywAzcXxhzypz> queryList(Map<Object, Object> map) {
		
		return mzywAzcXxhzypzDao.queryList(map);
	}

	@Override
	public int queryListCount(Map<Object, Object> map) {
		
		return mzywAzcXxhzypzDao.queryListCount(map);
	}

	@Override
	public MzywAzcXxhzypz queryXqById(String id) {
		
		return mzywAzcXxhzypzDao.queryXqById(id);
	}

	@Override
	public void saveXxxx(MzywAzcXxhzypz mzywAzcXxhzypz) {
		
		mzywAzcXxhzypzDao.saveXxxx(mzywAzcXxhzypz);
	}

	@Override
	public void xfByID(String id,String status) {
		mzywAzcXxhzypzDao.xxfById(id, status);
	}

	@Override
	public void whXxxxById(String id, String pzmc, String xx, String zhxgsj, String zhxgyh) {
		mzywAzcXxhzypzDao.whXxxxById(id,pzmc,xx,zhxgsj,zhxgyh);
		
	}

	@Override
	public List<String> queryPzmc() {
		
		return mzywAzcXxhzypzDao.queryPzmc();
	}

	@Override
	public String queryZy(String xxmc) {
		
		return mzywAzcXxhzypzDao.queryZy(xxmc);
	}

}
