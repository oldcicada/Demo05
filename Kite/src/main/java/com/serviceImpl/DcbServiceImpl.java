package com.serviceImpl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.DcbDao;
import com.po.MzywDcbCxbdjf;
import com.po.MzywShswcSzxx;
import com.service.DcbService;
import com.utils.PageDto;

@Service
public class DcbServiceImpl implements DcbService {

	@Autowired
	private DcbDao dcbDao;
	
	@Override
	public PageDto<MzywDcbCxbdjf> findPxbzByBsdwTime(int pageIndex, int pageSize, String bsdw, String startDate,
			String endDate) {
		if(startDate.length()==0) {
			startDate="2001-01-01";
		}
		if(endDate.length()==0) {
			Date now=new Date();    
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
			endDate=df.format(now);
		}
		Map<Object, Object> map=new HashMap<>();
		map.put("start", (pageIndex - 1) * pageSize);
		map.put("end", pageSize);
		map.put("startDate", startDate);
		map.put("endDate", endDate);
		map.put("bsdw", bsdw);
		List<MzywDcbCxbdjf> list = dcbDao.queryList(map);
		PageDto<MzywDcbCxbdjf> dto=new PageDto<>();
		dto.setList(list);
		dto.setPageIndex(pageIndex);
		dto.setPageSize(pageSize);
		int count=dcbDao.queryListCount(map);
		dto.setCount(count);
		dto.setPageTotal(count,pageSize);
		return dto;
	}

}
