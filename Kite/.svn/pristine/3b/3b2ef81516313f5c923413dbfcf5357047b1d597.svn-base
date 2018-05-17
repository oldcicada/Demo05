package com.service;
import com.po.MzywFxb;
import com.utils.PageDto;



public interface FxbService {
	PageDto<MzywFxb> queryList(int pageIndex,int pageSize,String xxbt,String startDate,String endDate,
			String shjg,String tjzt,String lmmc);
		//根据id获取信息
	MzywFxb queryById(String id);
	
	
	//稿费统计分页查询
	PageDto<MzywFxb> queryList(int pageIndex,int pageSize,String startDate,String endDate);
	
	
	//稿费采用明细报表分页查询
	PageDto<MzywFxb> queryList(int pageIndex,int pageSize,String startDate,String endDate,String lmmc);
	
}
