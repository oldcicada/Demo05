package com.serviceImpl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.FxbDao;
import com.po.MzywFxb;
import com.service.FxbService;
import com.utils.PageDto;

@Service
public class FxbServiceImpl implements FxbService {
	
	@Autowired
	private FxbDao fxbDao;
	

	//获取列表长度
	public int queryListCount(Map<Object,Object> map) {
		int count = fxbDao.queryListCount(map);
		return count;
	}
	
	//通过id查询
	@Override
	public MzywFxb queryById(String id) {
		MzywFxb MzywFxb = fxbDao.queryById(id);	
		return MzywFxb;
	}
	//分页查询
	public PageDto<MzywFxb> queryList(int pageIndex,int pageSize,String xxbt,String startDate,String endDate,
			String shjg,String tjzt,String lmmc){
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
		map.put("xxbt","%"+ xxbt +"%");
		map.put("startDate", startDate);
		map.put("endDate", endDate);
		map.put("shjg", shjg );
		map.put("tjzt",tjzt );
		map.put("lmmc",lmmc);
		List<MzywFxb> list = fxbDao.queryList(map);
		PageDto<MzywFxb> dto=new PageDto<>();
		dto.setList(list);
		dto.setPageIndex(pageIndex);
		dto.setPageSize(pageSize);
		int count=fxbDao.queryListCount(map);
		dto.setCount(count);
		dto.setPageTotal(count,pageSize);
		return dto;
		}
	
	
	//稿费统计分页查询
	@Override
	public PageDto<MzywFxb> queryList(int pageIndex, int pageSize, String startDate, String endDate) {
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
		List<MzywFxb> list = fxbDao.queryListGF(map);
		PageDto<MzywFxb> dto=new PageDto<>();
		dto.setList(list);
		dto.setPageIndex(pageIndex);
		dto.setPageSize(pageSize);
		int count=fxbDao.queryListCountGF(map);
		dto.setCount(count);
		dto.setPageTotal(count,pageSize);
		return dto;
	}
	
	
	//稿费采用明细报表分页查询
	@Override
	public PageDto<MzywFxb> queryList(int pageIndex, int pageSize, String startDate, String endDate, String lmmc) {
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
		map.put("lmmc",lmmc);
		List<MzywFxb> list = fxbDao.queryListGFCY(map);
		PageDto<MzywFxb> dto=new PageDto<>();
		dto.setList(list);
		dto.setPageIndex(pageIndex);
		dto.setPageSize(pageSize);
		int count=fxbDao.queryListCountGFCY(map);
		dto.setCount(count);
		dto.setPageTotal(count,pageSize);
		return dto;
	}
}