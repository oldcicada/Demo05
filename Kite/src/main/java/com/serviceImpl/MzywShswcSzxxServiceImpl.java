package com.serviceImpl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.MzywShswcSzxxDao;
import com.po.MzywShswcSzxx;
import com.service.MzywShswcSzxxService;
import com.utils.DictUtil;
import com.utils.PageDto;

@Service
@Transactional
public class MzywShswcSzxxServiceImpl implements MzywShswcSzxxService {
	
	@Autowired
	private MzywShswcSzxxDao mzywShswcSzxxDao;
	// 获取逝者信息列表
	public PageDto<MzywShswcSzxx> queryList(int pageIndex,int pageSize,String szxm,String startDate,String endDate,String szsfzhm,String bygmc) {
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
		map.put("szxm", "%" + szxm + "%");
		map.put("startDate", startDate);
		map.put("endDate", endDate);
		map.put("bygmc",bygmc);
		map.put("szsfzhm", "%" + szsfzhm + "%");
		List<MzywShswcSzxx> list = mzywShswcSzxxDao.queryList(map);
		for (MzywShswcSzxx  mzy : list) {
			String bygmcMc = DictUtil.getDictMc("funeral", mzy.getBygmc());
			mzy.setBygmc(bygmcMc);
		}
		PageDto<MzywShswcSzxx> dto=new PageDto<>();
		dto.setList(list);
		dto.setPageIndex(pageIndex);
		dto.setPageSize(pageSize);
		int count=mzywShswcSzxxDao.queryListCount(map);
		dto.setCount(count);
		dto.setPageTotal(count,pageSize);
		return dto;
	}

	//根据id获取逝者信息
	public MzywShswcSzxx queryById(String id) {
		MzywShswcSzxx mzywShswcSzxx = mzywShswcSzxxDao.queryById(id);	
		return mzywShswcSzxx;
	}
	
}
