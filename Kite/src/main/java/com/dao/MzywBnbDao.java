package com.dao;

import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.po.MzywBnb;

@Repository
public class MzywBnbDao {
	@Autowired
    private SessionFactory sessionFactory;
	
    //获取和当前线程绑定的Seesion
    private Session getSession()
    {
        return sessionFactory.getCurrentSession();
    }
    //获取不能办信息列表
    public List<MzywBnb> queryList(Map<Object,Object> map){
    	String sql="select * from t_mzyw_bnb "
    			+ "where zcbs like ? "
    			+ "and zhxgsj between ? and ? "
    			+ "limit ?,? ";
    	SQLQuery query = getSession().createSQLQuery(sql).addEntity(MzywBnb.class);
    	query.setParameter(0, map.get("zcbs"));
    	query.setParameter(1, map.get("startDate"));
    	query.setParameter(2, map.get("endDate"));
    	query.setParameter(3, map.get("start"));
    	query.setParameter(4, map.get("end"));
		@SuppressWarnings("unchecked")
		List<MzywBnb> list = query.list();
    	return list;
    }
    
  //获取不能办信息列表长度
    public int queryListCount(Map<Object,Object> map) {
    	String sql="select count(1) from t_mzyw_bnb "
    			+ "where zcbs like ? "
    			+ "and zhxgsj between ? and ? ";
    	SQLQuery query = getSession().createSQLQuery(sql);
    	query.setParameter(0, map.get("zcbs"));
    	query.setParameter(1, map.get("startDate"));
    	query.setParameter(2, map.get("endDate"));
    	int count=((Number)query.uniqueResult()).intValue();  
    	return count;
    }
    
    //查询不能办信息
	public MzywBnb queryInfoById(String id) {
		
		String hql="from MzywBnb where id =:id";
		Query query = getSession().createQuery(hql);
		query.setParameter("id", id);
		MzywBnb mzywBnb = (MzywBnb) query.uniqueResult();
		return mzywBnb;
	}
	
	//报送不能办信息
	public void saveXxbsBsJg(MzywBnb mzywBnb) {
		getSession().save(mzywBnb);
	}
	
	//报送不能办信息
	public void updateStatusById(String id, String zcbs) {
		String sql="UPDATE t_mzyw_bnb set zcbs =:zcbs WHERE id =:id ";
		SQLQuery sqlQuery = getSession().createSQLQuery(sql);
		sqlQuery.setParameter("zcbs", zcbs);
		sqlQuery.setParameter("id", id);
		sqlQuery.executeUpdate();
	}
	
	//暂存不能办信息
	
	public void updateXxbsBsJg(MzywBnb mzywBnb) {
		
		getSession().update(mzywBnb);
	
	}
	
	public List<MzywBnb> queryListByBn(Map<Object, Object> map) {
		String sql="select * from t_mzyw_bnb "
    			+ "where sbdw like ? "
    			+ "and zhxgsj between ? and ? "
    			+ "limit ?,? ";
    	SQLQuery query = getSession().createSQLQuery(sql).addEntity(MzywBnb.class);
    	query.setParameter(0, map.get("sbdw"));
    	query.setParameter(1, map.get("startDate"));
    	query.setParameter(2, map.get("endDate"));
    	query.setParameter(3, map.get("start"));
    	query.setParameter(4, map.get("end"));
		@SuppressWarnings("unchecked")
		List<MzywBnb> list = query.list();
    	return list;
	}
	//
	public int queryListCountByBn(Map<Object, Object> map) {
		
		String sql="select count(1) from t_mzyw_bnb "
    			+ "where sbdw like ? "
    			+ "and zhxgsj between ? and ? ";
    	SQLQuery query = getSession().createSQLQuery(sql);
    	query.setParameter(0, map.get("sbdw"));
    	query.setParameter(1, map.get("startDate"));
    	query.setParameter(2, map.get("endDate"));
    	int count=((Number)query.uniqueResult()).intValue();  
    	return count;
	}
	
}
