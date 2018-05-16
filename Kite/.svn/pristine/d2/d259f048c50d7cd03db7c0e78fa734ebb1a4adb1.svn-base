package com.serviceImpl;


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
	private MzywFccYljgxxDao MzywFccYljgxxDao;
	
	@Override
	public PageDto<MzywFccYljgxx> queryMzywFccYljgxx(int pageIndex, int pageSize, String mc,String startDate,String endDate,String bszt) {
		return MzywFccYljgxxDao.queryMzywFccYljgxx(pageIndex, pageSize, mc, startDate, endDate, bszt);
	}
}
