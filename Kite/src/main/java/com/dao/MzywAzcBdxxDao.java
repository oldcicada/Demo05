package com.dao;

import java.util.List;
import java.util.Map;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.po.MzywAzcBdxx;
import com.po.MzywBnb;

@Repository
public class MzywAzcBdxxDao {
	
	@Autowired
    private SessionFactory sessionFactory;
	
    //获取和当前线程绑定的Seesion
    private Session getSession()
    {
        return sessionFactory.getCurrentSession();
    }

	public  List<MzywAzcBdxx> queryListAz(Map<Object, Object> map) {
		String sql="select * from t_mzyw_azc_bdxx "
    			+ "where xm like ? and sbsfzhm like ? "
				+"and xxmc like ? and sbdw like ? "
    			+ "and cjsj between ? and ? "
    			+ "limit ?,? ";
    	SQLQuery query = getSession().createSQLQuery(sql).addEntity(MzywAzcBdxx.class);
    	query.setParameter(0, map.get("xm"));
    	query.setParameter(1, map.get("sbsfzhm"));
    	query.setParameter(2, map.get("xxmc"));
    	query.setParameter(3, map.get("sbdw"));
    	query.setParameter(4, map.get("startDate"));
    	query.setParameter(5, map.get("endDate"));
    	query.setParameter(6, map.get("start"));
    	query.setParameter(7, map.get("end"));
		@SuppressWarnings("unchecked")
		List<MzywAzcBdxx> list = query.list();
    	return list;
	}

	public  int queryListCountAz(Map<Object, Object> map) {
		String sql="select count(1) from t_mzyw_azc_bdxx "
				+ "where xm like ? and sbsfzhm like ? "
				+"and xxmc like ? and sbdw like ? "
    			+ "and cjsj between ? and ? ";
    	SQLQuery query = getSession().createSQLQuery(sql);
    	query.setParameter(0, map.get("xm"));
    	query.setParameter(1, map.get("sbsfzhm"));
    	query.setParameter(2, map.get("xxmc"));
    	query.setParameter(3, map.get("sbdw"));
    	query.setParameter(4, map.get("startDate"));
    	query.setParameter(5, map.get("endDate"));
    	int count=((Number)query.uniqueResult()).intValue();  
    	return count;
	}

	public List<String> querySbdw() {
		
		String sql="SELECT DISTINCT  sbdw  FROM t_mzyw_azc_bdxx";
		SQLQuery query = getSession().createSQLQuery(sql);
		List<String> list = query.list();
		return list;
	}

	public List<String> queryXxmc() {
		String sql="SELECT DISTINCT  xxmc  FROM t_mzyw_azc_bdxx";
		SQLQuery query = getSession().createSQLQuery(sql);
		List<String> list = query.list();
		return list;
	}

	public MzywAzcBdxx queryXqById(String id) {
		
		String sql="SELECT *  FROM t_mzyw_azc_bdxx where id=:id";
		SQLQuery query = getSession().createSQLQuery(sql).addEntity(MzywAzcBdxx.class);
		query.setParameter("id", id);
		MzywAzcBdxx Azxq = (MzywAzcBdxx) query.uniqueResult();
		return Azxq;
	}

	public void delInfoById(MzywAzcBdxx bdxx) {
		
		getSession().delete(bdxx);
	}

	public void saveInfo(MzywAzcBdxx mzywAzcBdxx) {
		
		getSession().save(mzywAzcBdxx);
	}

	public void submitById(String id) {
		String sql="UPDATE t_mzyw_azc_bdxx set zcbs ='已报送' WHERE id =:id";
		SQLQuery sqlQuery = getSession().createSQLQuery(sql);
		sqlQuery.setParameter("id", id);
		sqlQuery.executeUpdate();
		
	}

	public int queryListCountQx(Map<Object, Object> map) {
		
		String sql="select count(1) from t_mzyw_azc_bdxx "
				+ "where xm like ? and sbsfzhm like ? "
				+"and sfcjmfpx like ? and zcbs like ? "
    			+ "and cjsj between ? and ? ";
    	SQLQuery query = getSession().createSQLQuery(sql);
    	query.setParameter(0, map.get("xm"));
    	query.setParameter(1, map.get("sbsfzhm"));
    	query.setParameter(2, map.get("sfcjmfpx"));
    	query.setParameter(3, map.get("zcbs"));
    	query.setParameter(4, map.get("startDate"));
    	query.setParameter(5, map.get("endDate"));
    	int count=((Number)query.uniqueResult()).intValue();  
    	return count;
	}

	public List<MzywAzcBdxx> queryListQx(Map<Object, Object> map) {
		
		String sql="select * from t_mzyw_azc_bdxx "
    			+ "where xm like ? and sbsfzhm like ? "
				+"and sfcjmfpx like ? and zcbs like ? "
    			+ "and cjsj between ? and ? "
    			+ "limit ?,? ";
    	SQLQuery query = getSession().createSQLQuery(sql).addEntity(MzywAzcBdxx.class);
    	query.setParameter(0, map.get("xm"));
    	query.setParameter(1, map.get("sbsfzhm"));
    	query.setParameter(2, map.get("sfcjmfpx"));
    	query.setParameter(3, map.get("zcbs"));
    	query.setParameter(4, map.get("startDate"));
    	query.setParameter(5, map.get("endDate"));
    	query.setParameter(6, map.get("start"));
    	query.setParameter(7, map.get("end"));
		@SuppressWarnings("unchecked")
		List<MzywAzcBdxx> list = query.list();
    	return list;
	}

}
