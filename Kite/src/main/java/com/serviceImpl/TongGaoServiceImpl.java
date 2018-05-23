package com.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.TongGaoDao;
import com.po.MzywFjxx;
import com.po.MzywTzgg;
import com.service.TongGaoService;


@Service
@Transactional
public class TongGaoServiceImpl implements TongGaoService {
	
	@Autowired
	private TongGaoDao tongGaoDao;

	// 获取通告信息列表
	public List<MzywTzgg> queryList(Map<Object, Object> map) {
		List<MzywTzgg> list = tongGaoDao.queryList(map);
		return list;
	}
	//获取通告信息列表长度
	public int queryListCount(Map<Object,Object> map) {
		int count = tongGaoDao.queryListCount(map);
		return count;
	}
	
	//通告删除
	public void delete(String id) {
		 tongGaoDao.delete(id);
	}
	
	//通告通过id查
	public MzywTzgg queryByID(String id) {
		MzywTzgg queryById = tongGaoDao.queryById(id);
		return queryById;
		
	}

	//通知公告发布，通过id更新状态
	public void updateZtById(String id, String tzggzt) {
		tongGaoDao.updateZtById(id,tzggzt);
	}

	
	//通告保存
	public void tzggZanCun(MzywTzgg mzywTzgg) {
		tongGaoDao.tzggZanCun(mzywTzgg);
	}
	
	//通知公告更新
	public void tzggGX(String tzggbt, String tzggzw,String id) {
		tongGaoDao.tzggGX(tzggbt,tzggzw,id);
	}
	//上传
	public void upload(MzywFjxx mzywFjxx) {
		tongGaoDao.upload(mzywFjxx);
	}
	public void upload(MzywTzgg mzywTzgg) {
		tongGaoDao.upload(mzywTzgg);
	}
	//查附件通过id
	public MzywFjxx queryByFJID(String ysbxxid) {
		MzywFjxx byId = tongGaoDao.queryByFJId(ysbxxid);
		return byId;
	}
	@Override
	public MzywFjxx queryTFById(String id) {
		MzywFjxx tfById = tongGaoDao.queryTFById(id);
		return tfById;
	}
	//通过附件id更新
	public void updateFJGX(MzywFjxx mzywFjxx) {
		tongGaoDao.updateFJGX(mzywFjxx);
		
	}
	
	
	
	
	
	
}
