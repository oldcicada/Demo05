package com.service;

import com.po.MzywFccYljgxx;
import com.utils.PageDto;

public interface MzywFccYljgxxService {
	//根据id查询单个养老机构信息
	public MzywFccYljgxx queryMzywFccYljgxxbyid(String id);
	//分页查询根据报送状态
	public PageDto<MzywFccYljgxx> queryMzywFccYljgxx(int pageIndex, int pageSize, String mc,String startDate,String endDate,String bszt);
	//分页查询根据报送单位
	public PageDto<MzywFccYljgxx> queryMzywFccYljgxxdw(int pageIndex, int pageSize, String mc,String startDate,String endDate,String sbdw);
	//暂存信息
	public void zcMzywFccYljgxx(MzywFccYljgxx mzywFccYljgxx);
	//报送养老机构信息
	public void bsMzywFccYljgxx(MzywFccYljgxx mzywFccYljgxx);
	//保存养老机构信息
	public void saveMzywFccYljgxx(MzywFccYljgxx mzywFccYljgxx);
	//删除养老机构信息
	public int scMzywFccYljgxx(String id);
	
}
