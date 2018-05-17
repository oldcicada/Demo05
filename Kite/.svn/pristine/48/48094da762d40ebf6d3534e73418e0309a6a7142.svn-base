package com.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.MzywFccSqylfwDao;
import com.po.MzywFccSqylfwss;
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
}
