package com.dao;

import java.util.List;
import java.util.Map;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.po.MzywTzgg;

@Repository
public class TongGaoDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public Session getSession() {
		return sessionFactory.openSession();
	}
	
    public List<MzywTzgg> queryList(Map<Object,Object> map){
    	String sql="select * from t_mzyw_tzgg where tzggbt like ? and fbsj between ? and ? and tzggzt=? limit ?,?";
    	SQLQuery query = getSession().createSQLQuery(sql).addEntity(MzywTzgg.class);
    	query.setParameter(0, map.get("tzggbt"));
    	query.setParameter(1, map.get("startDate"));
    	query.setParameter(2, map.get("endDate"));
    	query.setParameter(3, map.get("tzggzt"));
    	query.setParameter(4, map.get("start"));
    	query.setParameter(5, map.get("end"));
		@SuppressWarnings("unchecked")
		List<MzywTzgg> list = query.list();
		System.out.println("dao");
		System.out.println(list.size());
    	return list;
    }
    
    public int queryListCount(Map<Object,Object> map) {
    	String sql="SELECT COUNT(1) FROM t_mzyw_tzgg WHERE tzggbt LIKE ? AND fbsj BETWEEN ? AND ? AND tzggzt=?";
    	SQLQuery query = getSession().createSQLQuery(sql);
    	query.setParameter(0, map.get("tzggbt"));
    	query.setParameter(1, map.get("startDate"));
    	query.setParameter(2, map.get("endDate"));
    	query.setParameter(3, map.get("tzggzt"));
    	int count=((Number)query.uniqueResult()).intValue();  
		System.out.println("count="+count);
    	return count;
    }
	
	
	
	
	
}
