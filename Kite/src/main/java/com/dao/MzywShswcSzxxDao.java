package com.dao;

import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.po.MzywShswcGhjz;
import com.po.MzywShswcMzxx;
import com.po.MzywShswcSzxx;
import com.po.MzywShswcYtwy;
@Repository
public class MzywShswcSzxxDao {
	@Autowired
    private SessionFactory sessionFactory;
	
    //获取和当前线程绑定的Seesion
    private Session getSession()
    {
        return sessionFactory.getCurrentSession();
    }
    
    /*逝者信息 start*/
    //获取逝者信息列表
	public List<MzywShswcSzxx> queryList(Map<Object,Object> map){
    	String sql="select * from t_mzyw_shswc_szxx "
    			+ "where szxm like ? "
    			+ "and zhxgsj between ? and ? "
    			+ "and szsfzhm like ? "
    			+ "and zcbs like ? ";
    	if(!map.get("bygmc").equals("")) {
    		sql+="and bygmc = ? ";
    	}else {
    		sql+="and 1=1 or bygmc =? ";
    	}
    	sql+=" order by zhxgsj desc limit ?,? ";
    	SQLQuery query = getSession().createSQLQuery(sql).addEntity(MzywShswcSzxx.class);
    	query.setParameter(0, map.get("szxm"));
    	query.setParameter(1, map.get("startDate"));
    	query.setParameter(2, map.get("endDate"));
    	query.setParameter(3, map.get("szsfzhm"));
    	query.setParameter(4, map.get("zcbs"));
    	query.setParameter(5, map.get("bygmc"));
    	query.setParameter(6, map.get("start"));
    	query.setParameter(7, map.get("end"));
		@SuppressWarnings("unchecked")
		List<MzywShswcSzxx> list = query.list();
    	return list;
    }
	//获取逝者信息列表长度
    public int queryListCount(Map<Object,Object> map) {
    	String sql="select count(1) from t_mzyw_shswc_szxx "
    			+ "where szxm like ? "
    			+ "and zhxgsj between ? and ? "
    			+ "and szsfzhm like ? and zcbs like ? ";
    	    	if(!map.get("bygmc").equals("")) {
    	    		sql+="and bygmc =?";
    	    	}else {
    	    		sql+="and 1=1 or bygmc =?";
    	    	}
    	SQLQuery query = getSession().createSQLQuery(sql);
    	query.setParameter(0, map.get("szxm"));
    	query.setParameter(1, map.get("startDate"));
    	query.setParameter(2, map.get("endDate"));
    	query.setParameter(3, map.get("szsfzhm"));
    	query.setParameter(4, map.get("zcbs"));
    	query.setParameter(5, map.get("bygmc"));
    	int count=((Number)query.uniqueResult()).intValue();  
    	return count;
    }
	//根据id获取逝者信息
    public MzywShswcSzxx queryById(String id) {
    	MzywShswcSzxx mzywShswcSzxx = (MzywShswcSzxx)getSession().get(MzywShswcSzxx.class, id);
		return mzywShswcSzxx;
	}
	//根据id删除逝者信息
	public void deleteById(String id) {
		MzywShswcSzxx m=new MzywShswcSzxx();
		m.setId(id);
		getSession().delete(m);
	}
	//更新对象信息
	public void update(MzywShswcSzxx mzy) {
		getSession().update(mzy);
	}
	//新增对象信息
	public void add(MzywShswcSzxx mzy) {
		getSession().save(mzy);
	}
	/*逝者信息 end*/
	/*骨灰江葬 end*/
	 //获取骨灰江葬信息列表
		public List<MzywShswcGhjz> queryGhjzList(Map<Object,Object> map){
	    	String sql="select t1.*,t2.bygmc from t_mzyw_shswc_ghjz as t1,t_mzyw_shswc_szxx as t2"
	    			+ "where t1.szsfzhm=t2.szsfzhm and t1.szxm like ? "
	    			+ "and t1.zhxgsj between ? and ? "
	    			+ "and t1.szsfzhm like ? "
	    			+ "and t1.zcbs like ? ";
	    	if(!map.get("bygmc").equals("")) {
	    		sql+="and t2.bygmc = ? ";
	    	}else {
	    		sql+="and 1=1 or t2.bygmc =? ";
	    	}
	    	sql+=" order by t1.zhxgsj desc limit ?,? ";
	    	SQLQuery query = getSession().createSQLQuery(sql).addEntity(MzywShswcGhjz.class);
	    	query.setParameter(0, map.get("szxm"));
	    	query.setParameter(1, map.get("startDate"));
	    	query.setParameter(2, map.get("endDate"));
	    	query.setParameter(3, map.get("szsfzhm"));
	    	query.setParameter(4, map.get("zcbs"));
	    	query.setParameter(5, map.get("bygmc"));
	    	query.setParameter(6, map.get("start"));
	    	query.setParameter(7, map.get("end"));
			@SuppressWarnings("unchecked")
			List<MzywShswcGhjz> list = query.list();
	    	return list;
	    }
		//获取骨灰江葬信息列表长度
	    public int queryGhjzListCount(Map<Object,Object> map) {
	    	String sql="select count(1) from t_mzyw_shswc_ghjz as t1,t_mzyw_shswc_szxx as t2"
	    			+ "where t1.szsfzhm=t2.szsfzhm and t1.szxm like ? "
	    			+ "and t1.zhxgsj between ? and ? "
	    			+ "and t1.szsfzhm like ? "
	    			+ "and t1.zcbs like ? ";
	    	if(!map.get("bygmc").equals("")) {
	    		sql+="and t2.bygmc = ? ";
	    	}else {
	    		sql+="and 1=1 or t2.bygmc =? ";
	    	}
	    	SQLQuery query = getSession().createSQLQuery(sql);
	    	query.setParameter(0, map.get("szxm"));
	    	query.setParameter(1, map.get("startDate"));
	    	query.setParameter(2, map.get("endDate"));
	    	query.setParameter(3, map.get("szsfzhm"));
	    	query.setParameter(4, map.get("zcbs"));
	    	query.setParameter(5, map.get("bygmc"));
	    	int count=((Number)query.uniqueResult()).intValue();  
	    	return count;
	    }
		//根据id获取骨灰江葬信息
	    public MzywShswcGhjz queryGhjzById(String id) {
	    	MzywShswcGhjz mzywShswcGhjz = (MzywShswcGhjz)getSession().get(MzywShswcGhjz.class, id);
			return mzywShswcGhjz;
		}
		//根据id删除骨灰江葬信息
		public void deleteGhjzById(String id) {
			MzywShswcGhjz m=new MzywShswcGhjz();
			m.setId(id);
			getSession().delete(m);
		}
		//更新骨灰江葬对象信息
		public void updateGhjz(MzywShswcGhjz mzy) {
			getSession().update(mzy);
		}
		//新增骨灰江葬对象信息
		public void addGhjz(MzywShswcGhjz mzy) {
			getSession().save(mzy);
		}
	//更新骨灰江葬信息
	public void updateGhjzById(String id, String zcbs, String szsfzhm, String szxm, String szhjd, String jbrsfzhm,
			String jbrxm, String jbrlxdh) {
		String hql="update MzywShswcSzxx set zcbs=?,szsfzhm=?,szxm=?,szhjd=?,jbrsfzhm=?,jbrxm=?,jbrlxdh=? where id=?";
		Query query = getSession().createQuery(hql);
		query.setParameter(0, zcbs);
		query.setParameter(1, szsfzhm);
		query.setParameter(2, szxm);
		query.setParameter(3, szhjd);
		query.setParameter(4, jbrsfzhm);
		query.setParameter(5, jbrxm);
		query.setParameter(6, jbrlxdh);
		query.setParameter(7, id);
		query.executeUpdate();
	}
	/*骨灰江葬 end*/
	/*遗体外运 start*/
	//获取遗体外运列表
	public List<MzywShswcYtwy> queryYtwyList(Map<Object,Object> map){
    	String sql="select t1.*,t2.bygmc from t_mzyw_shswc_ytwy as t1 , t_mzyw_shswc_szxx as t2 "
    			+ "where t1.szsfzhm = t2.szsfzhm szxm like ? "
    			+ "and zhxgsj between ? and ? "
    			+ "and szsfzhm like ? "
    			+ "and zcbs like ? ";
    	if(!map.get("bygmc").equals("")) {
    		sql+="and t2.bygmc = ? ";
    	}else {
    		sql+="and 1=1 or t2.bygmc =? ";
    	}
    	sql+=" limit ?,?";
    	SQLQuery query = getSession().createSQLQuery(sql).addEntity(MzywShswcYtwy.class);
    	query.setParameter(0, map.get("szxm"));
    	query.setParameter(1, map.get("startDate"));
    	query.setParameter(2, map.get("endDate"));
    	query.setParameter(3, map.get("szsfzhm"));
    	query.setParameter(4, map.get("zcbs"));
    	query.setParameter(5, map.get("bygmc"));
    	query.setParameter(6, map.get("start"));
    	query.setParameter(7, map.get("end"));
		@SuppressWarnings("unchecked")
		List<MzywShswcYtwy> list = query.list();
    	return list;
    }
	//获取遗体外运列表长度
    public int queryListYtwyCount(Map<Object,Object> map) {
    	String sql="select count(1) from t_mzyw_shswc_ytwy "
    			+ "where szxm like ? "
    			+ "and zhxgsj between ? and ? "
    			+ "and szsfzhm like ? and zcbs like ? ";
    	    	if(!map.get("bygmc").equals("")) {
    	    		sql+="and bygmc =?";
    	    	}else {
    	    		sql+="and 1=1 or bygmc =?";
    	    	}
    	SQLQuery query = getSession().createSQLQuery(sql);
    	query.setParameter(0, map.get("szxm"));
    	query.setParameter(1, map.get("startDate"));
    	query.setParameter(2, map.get("endDate"));
    	query.setParameter(3, map.get("szsfzhm"));
    	query.setParameter(4, map.get("zcbs"));
    	query.setParameter(5, map.get("bygmc"));
    	int count=((Number)query.uniqueResult()).intValue();  
    	return count;
    }
  //根据id获取遗体外运信息
    public MzywShswcYtwy queryYtwyById(String id) {
    	MzywShswcYtwy mzywShswcYtwy = (MzywShswcYtwy)getSession().get(MzywShswcYtwy.class, id);
		return mzywShswcYtwy;
	}
	//根据id删除遗体外运信息
	public void deleteYtwyById(String id) {
		MzywShswcYtwy m=new MzywShswcYtwy();
		m.setId(id);
		getSession().delete(m);
	}
	//更新遗体外运对象信息
	public void updateYtwy(MzywShswcYtwy mzy) {
		getSession().update(mzy);
	}
	//新增遗体外运对象信息
	public void addYtwy(MzywShswcYtwy mzy) {
		getSession().save(mzy);
	}
    /*遗体外运 end*/
	
	/*墓葬信息 start*/
	//获取墓葬信息列表
	public List<MzywShswcMzxx> queryMzxxList(Map<Object,Object> map){
    	String sql="select t1.*,t2.bygmc from t_mzyw_shswc_ytwy as t1 , t_mzyw_shswc_szxx as t2 "
    			+ "where t1.szsfzhm = t2.szsfzhm szxm like ? "
    			+ "and zhxgsj between ? and ? "
    			+ "and szsfzhm like ? "
    			+ "and zcbs like ? ";
    	if(!map.get("bygmc").equals("")) {
    		sql+="and t2.bygmc = ? ";
    	}else {
    		sql+="and 1=1 or t2.bygmc =? ";
    	}
    	sql+=" limit ?,?";
    	SQLQuery query = getSession().createSQLQuery(sql).addEntity(MzywShswcMzxx.class);
    	query.setParameter(0, map.get("szxm"));
    	query.setParameter(1, map.get("startDate"));
    	query.setParameter(2, map.get("endDate"));
    	query.setParameter(3, map.get("szsfzhm"));
    	query.setParameter(4, map.get("zcbs"));
    	query.setParameter(5, map.get("bygmc"));
    	query.setParameter(6, map.get("start"));
    	query.setParameter(7, map.get("end"));
		@SuppressWarnings("unchecked")
		List<MzywShswcMzxx> list = query.list();
    	return list;
    }
	//获取墓葬信息列表长度
    public int queryListMzxxCount(Map<Object,Object> map) {
    	String sql="select count(1) from t_mzyw_shswc_ytwy "
    			+ "where szxm like ? "
    			+ "and zhxgsj between ? and ? "
    			+ "and szsfzhm like ? and zcbs like ? ";
    	    	if(!map.get("bygmc").equals("")) {
    	    		sql+="and bygmc =?";
    	    	}else {
    	    		sql+="and 1=1 or bygmc =?";
    	    	}
    	SQLQuery query = getSession().createSQLQuery(sql);
    	query.setParameter(0, map.get("szxm"));
    	query.setParameter(1, map.get("startDate"));
    	query.setParameter(2, map.get("endDate"));
    	query.setParameter(3, map.get("szsfzhm"));
    	query.setParameter(4, map.get("zcbs"));
    	query.setParameter(5, map.get("bygmc"));
    	int count=((Number)query.uniqueResult()).intValue();  
    	return count;
    }
  //根据id获取墓葬信息信息
    public MzywShswcMzxx queryMzxxById(String id) {
    	MzywShswcMzxx mzywShswcMzxx = (MzywShswcMzxx)getSession().get(MzywShswcMzxx.class, id);
		return mzywShswcMzxx;
	}
	//根据id删除墓葬信息信息
	public void deleteMzxxById(String id) {
		MzywShswcMzxx m=new MzywShswcMzxx();
		m.setId(id);
		getSession().delete(m);
	}
	//更新墓葬信息对象信息
	public void updateMzxx(MzywShswcMzxx mzy) {
		getSession().update(mzy);
	}
	//新增墓葬信息对象信息
	public void addMzxx(MzywShswcMzxx mzy) {
		getSession().save(mzy);
	}
	/*墓葬信息 end*/
}
