package com.service;


import com.po.MzywFccYljgxx;
import com.utils.PageDto;

public interface MzywFccYljgxxService {
	
	public PageDto<MzywFccYljgxx> queryMzywFccYljgxx(int pageIndex, int pageSize, String mc,String startDate,String endDate,String bszt);
}
