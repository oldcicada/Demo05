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
import com.po.MzywShswcGhjz;
import com.po.MzywShswcMzxx;
import com.po.MzywShswcSzxx;
import com.po.MzywShswcYtwy;
import com.service.MzywShswcSzxxService;
import com.utils.PageDto;

@Service
@Transactional
public class MzywShswcSzxxServiceImpl implements MzywShswcSzxxService {
	
	@Autowired
	private MzywShswcSzxxDao mzywShswcSzxxDao;
	  
    /*逝者信息 start*/
	// 获取逝者信息列表
	public PageDto<MzywShswcSzxx> queryList(int pageIndex,int pageSize,String szxm,String startDate,String endDate,String szsfzhm,String bygmc,String zcbs) {
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
		map.put("zcbs","%"+zcbs+"%");
		map.put("szsfzhm", "%" + szsfzhm + "%");
		List<MzywShswcSzxx> list = mzywShswcSzxxDao.queryList(map);
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

	//根据id删除逝者信息
	public void deleteById(String id) {
		mzywShswcSzxxDao.deleteById(id);
	}
	
	//更新对象信息
	public void update(MzywShswcSzxx mzy) {
		mzywShswcSzxxDao.update(mzy);
	}
	
	//新增对象信息
	public void add(MzywShswcSzxx mzy) {
		mzywShswcSzxxDao.add(mzy);
	}
	/*逝者信息 end*/
	/*骨灰江葬 start*/
	// 获取骨灰江葬信息列表
		public PageDto<MzywShswcGhjz> queryGhjzList(int pageIndex, int pageSize, String szxm, String startDate, String endDate,
				String szsfzhm, String bygmc, String zcbs){
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
			map.put("zcbs","%"+zcbs+"%");
			map.put("szsfzhm", "%" + szsfzhm + "%");
			List<MzywShswcGhjz> list = mzywShswcSzxxDao.queryGhjzList(map);
			PageDto<MzywShswcGhjz> dto=new PageDto<>();
			dto.setList(list);
			dto.setPageIndex(pageIndex);
			dto.setPageSize(pageSize);
			int count=mzywShswcSzxxDao.queryGhjzListCount(map);
			dto.setCount(count);
			dto.setPageTotal(count,pageSize);
			return dto;
		}

		// 根据id获取骨灰江葬信息
		public MzywShswcGhjz queryGhjzById(String id) {
			MzywShswcGhjz mzywShswcGhjz = mzywShswcSzxxDao.queryGhjzById(id);
			return mzywShswcGhjz;
		}

		// 根据id删除骨灰江葬信息
		public void deleteGhjzById(String id) {
			mzywShswcSzxxDao.deleteGhjzById(id);
		}

		// 更新骨灰江葬对象信息
		public void updateGhjz(MzywShswcGhjz mzy) {
			mzywShswcSzxxDao.updateGhjz(mzy);
		}

		// 新增骨灰江葬对象信息
		public void addGhjz(MzywShswcGhjz mzy) {
			mzywShswcSzxxDao.addGhjz(mzy);
		}
	//更新骨灰江葬信息
	public void updateGhjzById(String id,String zcbs, String szsfzhm, String szxm, String szhjd, String jbrsfzhm, String jbrxm,
				String jbrdhhm){
		mzywShswcSzxxDao.updateGhjzById(id,zcbs,szsfzhm,szxm,szhjd,jbrsfzhm,jbrxm,jbrdhhm);
	}
	/*骨灰江葬 end*/
	/*遗体外运 start*/
	// 获取遗体外运信息列表
		public PageDto<MzywShswcYtwy> queryYtwyList(int pageIndex,int pageSize,String szxm,String startDate,String endDate,String szsfzhm,String bygmc,String zcbs) {
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
			map.put("zcbs","%"+zcbs+"%");
			map.put("szsfzhm", "%" + szsfzhm + "%");
			List<MzywShswcYtwy> list = mzywShswcSzxxDao.queryYtwyList(map);
			PageDto<MzywShswcYtwy> dto=new PageDto<>();
			dto.setList(list);
			dto.setPageIndex(pageIndex);
			dto.setPageSize(pageSize);
			int count=mzywShswcSzxxDao.queryListYtwyCount(map);
			dto.setCount(count);
			dto.setPageTotal(count,pageSize);
			return dto;
		}

		//根据id获取遗体外运信息
		public MzywShswcYtwy queryYtwyById(String id) {
			MzywShswcYtwy mzywShswcYtwy = mzywShswcSzxxDao.queryYtwyById(id);	
			return mzywShswcYtwy;
		}

		//根据id删除遗体外运信息
		public void deleteYtwyById(String id) {
			mzywShswcSzxxDao.deleteById(id);
		}
		
		//更新遗体外运对象信息
		public void updateYtwy(MzywShswcYtwy mzy) {
			mzywShswcSzxxDao.updateYtwy(mzy);
		}
		
		//新增遗体外运对象信息
		public void addYtwy(MzywShswcYtwy mzy) {
			mzywShswcSzxxDao.addYtwy(mzy);
		}
	/*遗体外运 end*/
	/*墓葬信息 start*/
		// 获取遗体外运信息列表
		public PageDto<MzywShswcMzxx> queryMzxxList(int pageIndex, int pageSize, String szxm, String startDate, String endDate,
				String szsfzhm, String bygmc, String zcbs){
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
			map.put("zcbs","%"+zcbs+"%");
			map.put("szsfzhm", "%" + szsfzhm + "%");
			List<MzywShswcMzxx> list = mzywShswcSzxxDao.queryMzxxList(map);
			PageDto<MzywShswcMzxx> dto=new PageDto<>();
			dto.setList(list);
			dto.setPageIndex(pageIndex);
			dto.setPageSize(pageSize);
			int count=mzywShswcSzxxDao.queryListMzxxCount(map);
			dto.setCount(count);
			dto.setPageTotal(count,pageSize);
			return dto;
		}

		// 根据id获取遗体外运信息
		public MzywShswcMzxx queryMzxxById(String id) {
			MzywShswcMzxx mzywShswcMzxx = mzywShswcSzxxDao.queryMzxxById(id);
			return mzywShswcMzxx;
		}

		// 根据id删除遗体外运信息
		public void deleteMzxxById(String id) {
			mzywShswcSzxxDao.deleteMzxxById(id);
		}

		// 更新遗体外运对象信息
		public void updateMzxx(MzywShswcMzxx mzy) {
			mzywShswcSzxxDao.updateMzxx(mzy);
		}

		// 新增遗体外运对象信息
		public void addMzxx(MzywShswcMzxx mzy) {
			mzywShswcSzxxDao.addMzxx(mzy);
		}
	/*墓葬信息 end*/
}
