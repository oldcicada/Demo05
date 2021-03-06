package com.serviceImpl;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.MzywFccSqylfwDao;
import com.po.MzywFccSqylfwss;
import com.po.MzywFccYljgxx;
import com.service.MzywFccSqylfwService;
import com.utils.PageDto;

@Service
@Transactional
public class MzywFccSqylfwServiceImp implements MzywFccSqylfwService{

	@Autowired
	private MzywFccSqylfwDao mzywFccSqylfwDao;

	@Override
	public PageDto<MzywFccSqylfwss> queryMzywFccSqylfwss(int pageIndex, int pageSize, String mc, String startDate,String endDate, String bszt) {
		return mzywFccSqylfwDao.queryMzywFccSqylfwss(pageIndex, pageSize, mc, startDate, endDate, bszt);
	}
	//暂存养老设施
	@Override
	public void zcMzywFccSqylfwss(MzywFccSqylfwss mzywFccSqylfwss) {
		Date now=new Date();    
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		String dqsj=df.format(now);
		mzywFccSqylfwss.setCjsj(dqsj);
		mzywFccSqylfwss.setBszt("1");
		if(mzywFccSqylfwss.getId().equals("")) {
			mzywFccSqylfwss.setId(null);
		}
		mzywFccSqylfwDao.zcMzywFccSqylfwss(mzywFccSqylfwss);
	}
	//报送养老设施
	@Override
	public void bsMzywFccSqylfwss(MzywFccSqylfwss mzywFccSqylfwss) {
		Date now=new Date();    
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		String dqsj=df.format(now);
		mzywFccSqylfwss.setCjsj(dqsj);
		mzywFccSqylfwss.setZhxgsj(dqsj);
		mzywFccSqylfwss.setBszt("0");
		if(mzywFccSqylfwss.getId().equals("")) {
			mzywFccSqylfwss.setId(null);
		}
		mzywFccSqylfwDao.bsMzywFccSqylfwss(mzywFccSqylfwss);
	}

	@Override
	public PageDto<MzywFccSqylfwss> queryMzywFccSqylfwssFc(int pageIndex, int pageSize, String mc, String startDate,
			String endDate, String sbdw) {
		return mzywFccSqylfwDao.queryMzywFccSqylfwssFc(pageIndex, pageSize, mc, startDate, endDate, sbdw);
	}

	@Override
	public void saveMzywFccSqylfwss(MzywFccSqylfwss mzywFccSqylfwss) {
		Date now=new Date();    
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		String dqsj=df.format(now);
		mzywFccSqylfwss.setCjsj(dqsj);
		mzywFccSqylfwDao.saveMzywFccSqylfwss(mzywFccSqylfwss);
	}

	@Override
	//根据id查询养老设施
	public MzywFccSqylfwss queryMzywFccSqylfwssByid(String id) {
		return mzywFccSqylfwDao.queryMzywFccSqylfwssByid(id);
	}
	@Override
	public void scMzywFccSqylfwssByid(String id) {
		mzywFccSqylfwDao.scMzywFccSqylfwssByid(id);
	}
}
