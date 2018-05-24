package com.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.MzywAzcBdxxDao;
import com.po.MzywAzcBdxx;
import com.service.MzywAzcBdxxService;

@Service
@Transactional
public class MzywAzcBdxxServiceImpl implements MzywAzcBdxxService {

	@Autowired
	private MzywAzcBdxxDao mzywAzcBdxxDao;
	
	@Override
	public List<MzywAzcBdxx> queryListAz(Map<Object, Object> map) {
		
		return mzywAzcBdxxDao.queryListAz(map);
	}

	@Override
	public int queryListCountAz(Map<Object, Object> map) {
	
		return mzywAzcBdxxDao.queryListCountAz(map);
	}

	@Override
	public List<String> querySbdw() {
		
		return mzywAzcBdxxDao.querySbdw();
	}

	@Override
	public List<String> queryXxmc() {
		
		return mzywAzcBdxxDao.queryXxmc();
	}

	@Override
	public MzywAzcBdxx queryXqById(String id) {
		
		return mzywAzcBdxxDao.queryXqById(id);
	}

	@Override
	public void delInfoById(MzywAzcBdxx bdxx) {
		
	   mzywAzcBdxxDao.delInfoById(bdxx);
		
	}

	@Override
	public void saveInfo(MzywAzcBdxx mzywAzcBdxx) {
	
		mzywAzcBdxxDao.saveInfo(mzywAzcBdxx);
	}

	@Override
	public void submitById(String id) {
		mzywAzcBdxxDao.submitById(id);
		
	}

	@Override
	public int queryListCountQx(Map<Object, Object> map) {
		
		return mzywAzcBdxxDao.queryListCountQx(map);
	}

	@Override
	public List<MzywAzcBdxx> queryListQx(Map<Object, Object> map) {
		
		return mzywAzcBdxxDao.queryListQx(map);
	}

}
