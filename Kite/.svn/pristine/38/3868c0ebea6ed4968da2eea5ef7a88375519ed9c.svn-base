package com.dao;

import java.util.List;
import java.util.Map;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.po.MzywFxb;

@Repository
public class FxbDao {

	@Autowired
	private SessionFactory sessionFactory;

	public Session getSession() {
		return sessionFactory.openSession();
	}

	public List<MzywFxb> queryList(Map<Object, Object> map) {
		String sql = "select * from t_mzyw_fxb  where xxbt like :xxbt and zhxgsj between :startDate and :endDate ";
		if (!map.get("shjg").equals("")) {
			sql += "and shjg =:shjg ";
		} 
		
		if (!map.get("tjzt").equals("")) {
			sql += "and tjzt =:tjzt ";
		} 

		if (!map.get("lmmc").equals("")) {
			sql += "and lmmc =:lmmc ";
		}
		sql += " limit :start,:end ";
		SQLQuery query = getSession().createSQLQuery(sql).addEntity(MzywFxb.class);
		query.setParameter("xxbt", map.get("xxbt"));
		query.setParameter("startDate", map.get("startDate"));
		query.setParameter("endDate", map.get("endDate"));
		query.setParameter("start", map.get("start"));
		query.setParameter("end", map.get("end"));
		if (!map.get("shjg").equals("")) {
			query.setParameter("shjg", map.get("shjg"));
		} 
		if (!map.get("tjzt").equals("")) {
			query.setParameter("tjzt", map.get("tjzt"));
		} 
		if (!map.get("lmmc").equals("")) {
			query.setParameter("lmmc", map.get("lmmc"));
		} 
		List<MzywFxb> list = query.list();
		System.out.println(list.size());
		return list;
	}

	// 获取列表长度
	public int queryListCount(Map<Object, Object> map) {
		String sql = "select count(1) from t_mzyw_fxb where xxbt like :xxbt and zhxgsj between :startDate and :endDate ";
		if (!map.get("shjg").equals("")) {
			sql += "and shjg =:shjg ";
		} 
		
		if (!map.get("tjzt").equals("")) {
			sql += "and tjzt =:tjzt ";
		} 

		if (!map.get("lmmc").equals("")) {
			sql += "and lmmc =:lmmc ";
		}
		SQLQuery query = getSession().createSQLQuery(sql);
		query.setParameter("xxbt", map.get("xxbt"));
		query.setParameter("startDate", map.get("startDate"));
		query.setParameter("endDate", map.get("endDate"));
		if (!map.get("shjg").equals("")) {
			query.setParameter("shjg", map.get("shjg"));
		} 
		if (!map.get("tjzt").equals("")) {
			query.setParameter("tjzt", map.get("tjzt"));
		} 
		if (!map.get("lmmc").equals("")) {
			query.setParameter("lmmc", map.get("lmmc"));
		} 
		int count = ((Number) query.uniqueResult()).intValue();
		System.out.println("countfxb=" + count);
		return count;
	}

	public MzywFxb queryById(String id) {
		MzywFxb MzywFxb = (MzywFxb) getSession().get(MzywFxb.class, id);
		return MzywFxb;
	}

	
	
	//获取稿费列表数据
	public List<MzywFxb> queryListGF(Map<Object, Object> map) {
		String sql = "select * from t_mzyw_fxb  where jbrq between ? and ?  limit ?,? ";
		SQLQuery query = getSession().createSQLQuery(sql).addEntity(MzywFxb.class);
		query.setParameter(0, map.get("startDate"));
		query.setParameter(1, map.get("endDate"));
		query.setParameter(2, map.get("start"));
		query.setParameter(3, map.get("end"));
		List<MzywFxb> list = query.list();
		System.out.println(list.size());
		return list;
	}
	
	
	//获取稿费列表长度
	public int queryListCountGF(Map<Object, Object> map) {
		String sql = "select count(1) from t_mzyw_fxb where jbrq between ? and ? ";
		SQLQuery query = getSession().createSQLQuery(sql);
		query.setParameter(0, map.get("startDate"));
		query.setParameter(1, map.get("endDate"));
		int count = ((Number) query.uniqueResult()).intValue();
		System.out.println("countfxb=" + count);
		return count;
	}
	
	
	
	//稿费采用明细报表分页查询
	public List<MzywFxb> queryListGFCY(Map<Object, Object> map) {
		String sql = "select * from t_mzyw_fxb where jbrq between :startDate and :endDate ";
		if (!map.get("lmmc").equals("")) {
			sql += "and lmmc = :lmmc ";
		}
		sql += " limit :start,:end ";
		SQLQuery query = getSession().createSQLQuery(sql).addEntity(MzywFxb.class);
		query.setParameter("startDate", map.get("startDate"));
		query.setParameter("endDate", map.get("endDate"));
		query.setParameter("start", map.get("start"));
		query.setParameter("end", map.get("end"));
		if (!map.get("lmmc").equals("")) {
			query.setParameter("lmmc", map.get("lmmc"));
		} 
	
		
		List<MzywFxb> list = query.list();
		System.out.println(list.size());
		return list;
	}

	// 获取稿费采用明细报表长度
	public int queryListCountGFCY(Map<Object, Object> map) {
		String sql = "select count(1) from t_mzyw_fxb where jbrq between ? and ? ";
		if (!map.get("lmmc").equals("")) {
			sql += "and lmmc =:lmmc ";
		}
		SQLQuery query = getSession().createSQLQuery(sql);
		query.setParameter(0, map.get("startDate"));
		query.setParameter(1, map.get("endDate"));
		if (!map.get("lmmc").equals("")) {
			query.setParameter("lmmc", map.get("lmmc"));
		} 
		int count = ((Number) query.uniqueResult()).intValue();
		System.out.println("countfxb=" + count);
		return count;
	}
	
}
