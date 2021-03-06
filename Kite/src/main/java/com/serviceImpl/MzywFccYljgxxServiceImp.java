package com.serviceImpl;


import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.MzywFccYljgxxDao;
import com.po.MzywFccYljgxx;
import com.service.MzywFccYljgxxService;
import com.utils.PageDto;
@Service
@Transactional
public class MzywFccYljgxxServiceImp implements MzywFccYljgxxService{
	
	@Autowired
	private MzywFccYljgxxDao mzywFccYljgxxDao;
	//查询信息
	@Override
	public PageDto<MzywFccYljgxx> queryMzywFccYljgxx(int pageIndex, int pageSize, String mc,String startDate,String endDate,String bszt) {
		return mzywFccYljgxxDao.queryMzywFccYljgxx(pageIndex, pageSize, mc, startDate, endDate, bszt);
	}
	//暂存信息
	@Override
	public void zcMzywFccYljgxx(MzywFccYljgxx mzywFccYljgxx) {
		Date now=new Date();    
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		String dqsj=df.format(now);
		mzywFccYljgxx.setCjsj(dqsj);
		mzywFccYljgxx.setBszt("1");
		if(mzywFccYljgxx.getId().equals("")) {
			mzywFccYljgxx.setId(null);
		}
		mzywFccYljgxxDao.zcMzywFccYljgxx(mzywFccYljgxx);
	}
	//报送养老信息
	@Override
	public void bsMzywFccYljgxx(MzywFccYljgxx mzywFccYljgxx) {
		Date now=new Date();    
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		String dqsj=df.format(now);
		mzywFccYljgxx.setCjsj(dqsj);
		mzywFccYljgxx.setZhxgsj(dqsj);
		mzywFccYljgxx.setBszt("0");
		if(mzywFccYljgxx.getId().equals("")) {
			mzywFccYljgxx.setId(null);
		}
		mzywFccYljgxxDao.bsMzywFccYljgxx(mzywFccYljgxx);
	}
	//根据上报单位查询
	@Override
	public PageDto<MzywFccYljgxx> queryMzywFccYljgxxdw(int pageIndex, int pageSize, String mc, String startDate,
			String endDate, String sbdw) {
		return mzywFccYljgxxDao.queryMzywFccYljgxxjdw(pageIndex, pageSize, mc, startDate, endDate, sbdw);
		
	}
	//保存养老信息
	@Override
	public void saveMzywFccYljgxx(MzywFccYljgxx mzywFccYljgxx) {
		mzywFccYljgxxDao.saveMzywFccYljgxx(mzywFccYljgxx);
		
	}
	//根据ID删除养老信息
	@Override
	public int scMzywFccYljgxx(String id) {
		return mzywFccYljgxxDao.scMzywFccYljgxx(id);
	}
	@Override
	//根据ID查询养老信息
	public MzywFccYljgxx queryMzywFccYljgxxbyid(String id) {
		return mzywFccYljgxxDao.queryMzywFccYljgxxbyid(id);
		
	}
}
