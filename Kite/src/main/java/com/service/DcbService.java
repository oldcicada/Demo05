package com.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.po.MzywDcbCxbdjf;
import com.utils.PageDto;

@Service
public interface DcbService {

	public PageDto<MzywDcbCxbdjf> findPxbzByBsdwTime(int pageIndex,int pageSize,String bsdw,String startDate,String endDate);
}
