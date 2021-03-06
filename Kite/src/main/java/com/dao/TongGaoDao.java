package com.dao;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.po.MzywFjxx;
import com.po.MzywTzgg;

@Repository
public class TongGaoDao {

	@Autowired
	private SessionFactory sessionFactory;

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	public List<MzywTzgg> queryList(Map<Object, Object> map) {
		String sql = "select * from t_mzyw_tzgg where tzggbt like ? and fbsj between ? and ? and tzggzt=? limit ?,?";
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

	public int queryListCount(Map<Object, Object> map) {
		String sql = "SELECT COUNT(1) FROM t_mzyw_tzgg WHERE tzggbt LIKE ? AND fbsj BETWEEN ? AND ? AND tzggzt=?";
		SQLQuery query = getSession().createSQLQuery(sql);
		query.setParameter(0, map.get("tzggbt"));
		query.setParameter(1, map.get("startDate"));
		query.setParameter(2, map.get("endDate"));
		query.setParameter(3, map.get("tzggzt"));
		int count = ((Number) query.uniqueResult()).intValue();
		System.out.println("count=" + count);
		return count;
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// 删除信息
	public void delete(String id) {
		MzywTzgg mzywTzgg = new MzywTzgg();
		mzywTzgg.setId(id);
		getSession().delete(mzywTzgg);
	}

	// 通告通过id查
	public MzywTzgg queryById(String id) {
		MzywTzgg mzywTzgg = (MzywTzgg) getSession().get(MzywTzgg.class, id);
		return mzywTzgg;
	}
	
	// 通告通过id查出附件和通告的一一对应
	public MzywFjxx queryTFById(String id) {
		String sql="SELECT t1.*,t2.* FROM t_mzyw_tzgg t1,t_mzyw_fjxx t2 where t1.id=t2.ysbxxid AND t1.id=:id";
		SQLQuery sqlQuery = getSession().createSQLQuery(sql);
		sqlQuery.setParameter("id", id);
		MzywFjxx mzywFjxx = (MzywFjxx) sqlQuery.uniqueResult();
		return mzywFjxx;
	}
	
	

	//通知公告发布，通过id更新状态
	public void updateZtById(String id, String tzggzt) {
		String sql="UPDATE  t_mzyw_tzgg set tzggzt =:tzggzt WHERE id =:id ";
		SQLQuery sqlQuery = getSession().createSQLQuery(sql);
		sqlQuery.setParameter("tzggzt", tzggzt);
		sqlQuery.setParameter("id", id);
		sqlQuery.executeUpdate();
	}

	//通知公告保存
	public void tzggZanCun(MzywTzgg mzywTzgg) {
		getSession().save(mzywTzgg);
	}

	public void tzggGX(String tzggbt, String tzggzw,String id) {
		String sql="UPDATE  t_mzyw_tzgg set tzggbt =:tzggbt,tzggzw =:tzggzw where id=:id";
		SQLQuery sqlQuery = getSession().createSQLQuery(sql);
		sqlQuery.setParameter("tzggbt", tzggbt);
		sqlQuery.setParameter("tzggzw", tzggzw);
		sqlQuery.setParameter("id", id);
		sqlQuery.executeUpdate();
	}
    //上传
	public void upload(MzywFjxx mzywFjxx) {
		getSession().update(mzywFjxx);
	}
	public void upload(MzywTzgg mzywTzgg) {
		getSession().save(mzywTzgg);
	}
	
	//通过id查附件
	public MzywFjxx queryByFJId(String ysbxxid) {
		String sql="select * from t_mzyw_fjxx where ysbxxid=:ysbxxid";
		SQLQuery sqlQuery = getSession().createSQLQuery(sql).addEntity(MzywFjxx.class);
		sqlQuery.setParameter("ysbxxid", ysbxxid);
		List<MzywFjxx> list = sqlQuery.list();
		return list.get(0);
	}
	
	//通过附件id更新
	public void updateFJGX(MzywFjxx mzywFjxx) {
		getSession().update(mzywFjxx);
	}

	

}
