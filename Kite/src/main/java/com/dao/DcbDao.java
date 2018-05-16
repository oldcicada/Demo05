package com.dao;

import java.util.List;
import java.util.Map;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.po.MzywDcbCxbdjf;
import com.po.MzywDcbPxbzjf;
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

	//通过ID查看个人信息
	public MzywDcbCxbdjf lookOne(String id) {
		String sql = "select hjmc,bzsj,bjdwmc,zpjf,bsdw from T_MZYW_DCB_PXBZJF where id=?";
		SQLQuery query = getSession().createSQLQuery(sql);
		query.setParameter(0, id);
		MzywDcbCxbdjf pxbzOne = (MzywDcbCxbdjf) query.setResultTransformer(Transformers.aliasToBean(MzywDcbCxbdjf.class)).uniqueResult();
		return pxbzOne;
	}

	//获取宣传报道集合
	public List<MzywDcbPxbzjf> queryXcbdList(Map<Object, Object> map) {
		String sql="select * from T_MZYW_DCB_XCBDJF "
    			+ "where bsdw=? "
    			+ "and bssj between ? and ? "
    			+ "and bdlx=?";
    			
    	SQLQuery query = getSession().createSQLQuery(sql).addEntity(MzywDcbCxbdjf.class);
    	query.setParameter(0, map.get("bsdw"));
    	query.setParameter(1, map.get("startDate"));
    	query.setParameter(2, map.get("endDate"));
    	query.setParameter(3, map.get("bdlx"));
    	
		@SuppressWarnings("unchecked")
		List<MzywDcbPxbzjf> list = query.list();
		System.out.println(list.size());
    	return list;
	}

	//获取宣传报道信息总条数
	public int queryXcbdListCount(Map<Object, Object> map) {
		String sql="select count(1) from T_MZYW_DCB_XCBDJF "
				+ "where bsdw=? "
    			+ "and bssj between ? and ? "
    			+ "and bdlx=?";;
    	SQLQuery query = getSession().createSQLQuery(sql);
    	query.setParameter(0, map.get("bsdw"));
    	query.setParameter(1, map.get("startDate"));
    	query.setParameter(2, map.get("endDate"));
    	query.setParameter(3, map.get("bdlx"));
    	int count=((Number)query.uniqueResult()).intValue();  
		System.out.println("count="+count);
    	return count;
	}

}
