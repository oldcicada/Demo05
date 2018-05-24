package com.dao;

import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.po.MzywAzcXxhzypz;
import com.po.MzywBnb;
import com.service.MzywAzcXxhzypzService;

@Repository
public class MzywAzcXxhzypzDao {

	@Autowired
    private SessionFactory sessionFactory;
	
    //获取和当前线程绑定的Seesion
    private Session getSession()
    {
        return sessionFactory.getCurrentSession();
    }
	
    //获取学校信息列表
	public List<MzywAzcXxhzypz> queryList(Map<Object, Object> map) {
		
		String sql="select * from t_mzyw_azc_xxhzypz "
    			+ "where pzmc like ? "
    			+ "limit ?,? ";
    	SQLQuery query = getSession().createSQLQuery(sql).addEntity(MzywAzcXxhzypz.class);
    	query.setParameter(0, map.get("pzmc"));
    	query.setParameter(1, map.get("start"));
    	query.setParameter(2, map.get("end"));
		@SuppressWarnings("unchecked")
		List<MzywAzcXxhzypz> list = query.list();
    	return list;
	}

	//获取学校信息总数
	public int queryListCount(Map<Object, Object> map) {
		
		String sql="select count(1) from t_mzyw_azc_xxhzypz "
    			+ "where pzmc like ? ";
    	SQLQuery query = getSession().createSQLQuery(sql);
    	query.setParameter(0, map.get("pzmc"));
    	int count=((Number)query.uniqueResult()).intValue();  
    	return count;
	}

	//根据ID查询学校信息
	public MzywAzcXxhzypz queryXqById(String id) {
		String sql="from MzywAzcXxhzypz where id=:id";
		Query query = getSession().createQuery(sql);
		query.setParameter("id", id);
		MzywAzcXxhzypz xxxq = (MzywAzcXxhzypz) query.uniqueResult();
		
		return xxxq;
	}
	
    //保存学校信息
	public void saveXxxx(MzywAzcXxhzypz mzywAzcXxhzypz) {
	
		getSession().save(mzywAzcXxhzypz);
	}

	public void xxfById(String id,String status) {
		String sql="update t_mzyw_azc_xxhzypz set status =:status WHERE id =:id ";
		SQLQuery sqlQuery = getSession().createSQLQuery(sql);
		sqlQuery.setParameter("status", status);
		sqlQuery.setParameter("id", id);
		sqlQuery.executeUpdate();
	}

	public void whXxxxById(String id, String pzmc, String xx, String zhxgsj, String zhxgyh) {
		String sql="update t_mzyw_azc_xxhzypz set pzmc=:pzmc,pzfj=:xx,zhxgsj=:zhxgsj,zhxgyh=:zhxgyh where id=:id";
		SQLQuery sqlQuery = getSession().createSQLQuery(sql);
		sqlQuery.setParameter("pzmc", pzmc);
		sqlQuery.setParameter("xx", xx);
		sqlQuery.setParameter("zhxgsj", zhxgsj);
		sqlQuery.setParameter("zhxgyh", zhxgyh);
		sqlQuery.setParameter("id", id);
		sqlQuery.executeUpdate();
	}

	public List<String> queryPzmc() {
		String sql="SELECT DISTINCT pzmc FROM t_mzyw_azc_xxhzypz ";
		SQLQuery sqlQuery = getSession().createSQLQuery(sql);
		List<String> list = sqlQuery.list();
		return list;
	}

	public String queryZy(String xxmc) {
		
		String sql="SELECT pzfj FROM t_mzyw_azc_xxhzypz where pzmc=:xxmc";
		SQLQuery sqlQuery = getSession().createSQLQuery(sql);
		sqlQuery.setParameter("xxmc", xxmc);
		String zy = (String) sqlQuery.uniqueResult();
		return zy;
	}

}
