package com.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.po.MzywDcbCxbdjf;
import com.po.MzywDcbPxbzjf;
import com.utils.PageDto;

@Service
public interface DcbService {

	//按条件查询
	public PageDto<MzywDcbCxbdjf> findPxbzByBsdwTime(int pageIndex,int pageSize,String bsdw,String startDate,String endDate);

	//通过ID查询评先表彰人信息
	public MzywDcbCxbdjf lookOne(String id);

	//宣传报道查询分页
	public PageDto<MzywDcbPxbzjf> findXcbdByBsdwTime(int pageIndex, int pageSize, String bsdw, String startDate,
			String endDate, String bdlx);
}
