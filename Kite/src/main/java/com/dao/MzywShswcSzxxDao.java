package com.dao;

import java.util.List;
import java.util.Map;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.po.MzywShswcSzxx;
@Repository
public class MzywShswcSzxxDao {
	@Autowired
    private SessionFactory sessionFactory;
	
    //获取和当前线程绑定的Seesion
    private Session getSession()
    {
        return sessionFactory.openSession();
    }
    //获取逝者信息列表
    public List<MzywShswcSzxx> queryList(Map<Object,Object> map){
    	String sql="select * from t_mzyw_shswc_szxx "
    			+ "where szxm like ? "
    			+ "and zhxgsj between ? and ? "
    			+ "and szsfzhm like ? "
    			+ "and bygmc=? limit ?,? ";
    	SQLQuery query = getSession().createSQLQuery(sql).addEntity(MzywShswcSzxx.class);
    	query.setParameter(0, map.get("szxm"));
    	query.setParameter(1, map.get("startDate"));
    	query.setParameter(2, map.get("endDate"));
    	query.setParameter(3, map.get("szsfzhm"));
    	query.setParameter(4, map.get("bygmc"));
    	query.setParameter(5, map.get("start"));
    	query.setParameter(6, map.get("end"));
		@SuppressWarnings("unchecked")
		List<MzywShswcSzxx> list = query.list();
		System.out.println(list.size());
    	return list;
    }
  //获取逝者信息列表长度
    public int queryListCount(Map<Object,Object> map) {
    	String sql="select count(1) from t_mzyw_shswc_szxx "
    			+ "where szxm like ? "
    			+ "and zhxgsj between ? and ? "
    			+ "and szsfzhm like ? "
    			+ "and bygmc=?";
    	SQLQuery query = getSession().createSQLQuery(sql).addEntity(MzywShswcSzxx.class);
    	query.setParameter(0, map.get("szxm"));
    	query.setParameter(1, map.get("startDate"));
    	query.setParameter(2, map.get("endDate"));
    	query.setParameter(3, map.get("szsfzhm"));
    	query.setParameter(4, map.get("bygmc"));
		int count = (int) query.uniqueResult();
		System.out.println("count="+count);
    	return count;
    }
}
