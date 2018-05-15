package com.dao;

import java.util.List;
import java.util.Map;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.po.MzywDcbCxbdjf;
import com.po.MzywShswcSzxx;

@Repository
public class DcbDao {

	@Autowired
    private SessionFactory sessionFactory;
	
    //获取和当前线程绑定的Seesion
    private Session getSession()
    {
        return sessionFactory.openSession();
    }
    
    //获取评先表彰集合
	public List<MzywDcbCxbdjf> queryList(Map<Object, Object> map) {
		String sql="select * from T_MZYW_DCB_PXBZJF "
    			+ "where bsdw=? "
    			+ "and bssj between ? and ? ";
    			
    	SQLQuery query = getSession().createSQLQuery(sql).addEntity(MzywDcbCxbdjf.class);
    	query.setParameter(0, map.get("bsdw"));
    	query.setParameter(1, map.get("startDate"));
    	query.setParameter(2, map.get("endDate"));
    	query.setParameter(5, map.get("start"));
    	query.setParameter(6, map.get("end"));
		@SuppressWarnings("unchecked")
		List<MzywDcbCxbdjf> list = query.list();
		System.out.println(list.size());
    	return list;
	}

	//获取评先表彰信息总条数
	public int queryListCount(Map<Object, Object> map) {
		String sql="select count(1) from T_MZYW_DCB_PXBZJF "
				+ "where bsdw=? "
    			+ "and bssj between ? and ? ";
    	SQLQuery query = getSession().createSQLQuery(sql);
    	query.setParameter(0, map.get("bsdw"));
    	query.setParameter(1, map.get("startDate"));
    	query.setParameter(2, map.get("endDate"));
    	int count=((Number)query.uniqueResult()).intValue();  
		System.out.println("count="+count);
    	return count;
	}

}