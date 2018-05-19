package com.service;

import com.po.MzywShswcSzxx;
import com.utils.PageDto;

public interface MzywShswcSzxxService {
	//获取逝者信息列表
	PageDto<MzywShswcSzxx> queryList(int pageIndex,int pageSize,String szxm,String startDate,String endDate,String szsfzhm,String bygmc,String zcbs);
	//根据id获取逝者信息
	MzywShswcSzxx queryById(String id);
	//根据id删除逝者信息
	void deleteById(String id);
	//更新对象信息
	void update(MzywShswcSzxx mzy);
	//新增对象信息
	void add(MzywShswcSzxx mzy);
}
