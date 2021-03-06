package com.dao;

import java.util.List;
import java.util.Map;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.po.MzywFjxx;
import com.po.MzywFxb;
import com.po.MzywJssz;

@Repository
public class FxbDao {

	@Autowired
	private SessionFactory sessionFactory;

	public Session getSession() {
		return sessionFactory.getCurrentSession();
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

	// 获取稿费列表数据
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

	// 获取稿费列表长度
	public int queryListCountGF(Map<Object, Object> map) {
		String sql = "select count(1) from t_mzyw_fxb where jbrq between ? and ? ";
		SQLQuery query = getSession().createSQLQuery(sql);
		query.setParameter(0, map.get("startDate"));
		query.setParameter(1, map.get("endDate"));
		int count = ((Number) query.uniqueResult()).intValue();
		System.out.println("countfxb=" + count);
		return count;
	}

	// 稿费采用明细报表分页查询
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

	// 基数设置分页查询
	public List<MzywJssz> queryListJSSZ(Map<Object, Object> map) {
		String sql = "select * from t_mzyw_jssz where 1=1";
		if (!map.get("bmmc").equals("")) {
			sql += " and bmmc = :bmmc ";
		}
		sql += " limit :start,:end ";
		SQLQuery query = getSession().createSQLQuery(sql).addEntity(MzywJssz.class);
		query.setParameter("start", map.get("start"));
		query.setParameter("end", map.get("end"));
		if (!map.get("bmmc").equals("")) {
			query.setParameter("bmmc", map.get("bmmc"));
		}
		List<MzywJssz> list = query.list();
		System.out.println(list.size());
		return list;
	}

	// 获取基数设置长度
	public int queryListCountJSSZ(Map<Object, Object> map) {
		String sql = "select count(1) from t_mzyw_jssz where 1=1";
		if (!map.get("bmmc").equals("")) {
			sql += " and bmmc =:bmmc ";
		}
		SQLQuery query = getSession().createSQLQuery(sql);
		if (!map.get("bmmc").equals("")) {
			query.setParameter("bmmc", map.get("bmmc"));
		}
		int count = ((Number) query.uniqueResult()).intValue();
		System.out.println("countfxb=" + count);
		return count;
	}

	// 报送
	public void updateZtById(String id, String zcbs) {
		String sql = "UPDATE  t_mzyw_fxb set zcbs =:zcbs WHERE id =:id ";
		SQLQuery sqlQuery = getSession().createSQLQuery(sql);
		sqlQuery.setParameter("zcbs", zcbs);
		sqlQuery.setParameter("id", id);
		sqlQuery.executeUpdate();
	}

	// 法宣办删除
	public void delete(String id) {
		MzywFxb mzywFxb = new MzywFxb();
		mzywFxb.setId(id);
		getSession().delete(mzywFxb);
	}

	public void fxbGX(String xxbt, String sbdw, String xxzw, String zz, String fgld, String sbry, String id) {
		String sql="UPDATE  t_mzyw_fxb set xxbt =:xxbt,sbdw =:sbdw,xxzw =:xxzw,zz =:zz,fgld =:fgld,sbry =:sbry where id=:id";
		SQLQuery sqlQuery = getSession().createSQLQuery(sql);
		sqlQuery.setParameter("xxbt", xxbt);
		sqlQuery.setParameter("sbdw", sbdw);
		sqlQuery.setParameter("xxzw", xxzw);
		sqlQuery.setParameter("zz", zz);
		sqlQuery.setParameter("fgld", fgld);
		sqlQuery.setParameter("sbry", sbry);
		sqlQuery.setParameter("id", id);
		sqlQuery.executeUpdate();
		
	}
	//通过附件id更新
		public void updateFJGX(MzywFjxx mzywFjxx) {
			getSession().update(mzywFjxx);
		}
	
		//通过id查附件
		public MzywFjxx queryByFJId(String ysbxxid) {
			String sql="select * from t_mzyw_fjxx where ysbxxid=:ysbxxid";
			SQLQuery sqlQuery = getSession().createSQLQuery(sql).addEntity(MzywFjxx.class);
			sqlQuery.setParameter("ysbxxid", ysbxxid);
			List<MzywFjxx> list = sqlQuery.list();
			return list.get(0);
		}

	
		
		
	
	
	
	//法宣办用户分页查询
	public List<MzywFxb> queryListFxbYh(Map<Object, Object> map) {
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
		if (!map.get("sbdw").equals("")) {
			sql += "and sbdw =:sbdw ";
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
		if (!map.get("sbdw").equals("")) {
			query.setParameter("sbdw", map.get("sbdw"));
		}
		List<MzywFxb> list = query.list();
		System.out.println(list.size());
		return list;
	}

	public int queryListCountFxbYh(Map<Object, Object> map) {
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
		if (!map.get("sbdw").equals("")) {
			sql += "and sbdw =:sbdw ";
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
		if (!map.get("sbdw").equals("")) {
			query.setParameter("sbdw", map.get("sbdw"));
		}
		int count = ((Number) query.uniqueResult()).intValue();
		System.out.println("countfxb=" + count);
		return count;
	}
	
	//法宣办用户审核，根据id更改提交状态
	public void updateSHById(String id, String tjzt) {
		String sql = "UPDATE  t_mzyw_fxb set tjzt =:tjzt WHERE id =:id ";
		SQLQuery sqlQuery = getSession().createSQLQuery(sql);
		sqlQuery.setParameter("tjzt", tjzt);
		sqlQuery.setParameter("id", id);
		sqlQuery.executeUpdate();
	}

	public MzywJssz queryByJSId(String id) {
		MzywJssz mzywJssz = (MzywJssz)getSession().get(MzywJssz.class, id);
		return mzywJssz;
	}
//基数更新
	public void updateGXJS(String id, String bmmc, String js) {
		String sql = "UPDATE  t_mzyw_jssz set bmmc =:bmmc,js =:js WHERE id =:id ";
		SQLQuery sqlQuery = getSession().createSQLQuery(sql);
		sqlQuery.setParameter("bmmc", bmmc);
		sqlQuery.setParameter("js", js);
		sqlQuery.setParameter("id", id);
		sqlQuery.executeUpdate();
	}
//机关处室
	public List<MzywJssz> queryJGCSList(String ssnd) {
		String sql = "select *from t_mzyw_jssz where ssnd =:ssnd";
		SQLQuery query = getSession().createSQLQuery(sql).addEntity(MzywJssz.class);
		query.setParameter("ssnd", ssnd);
		List<MzywJssz> list = query.list();
		return list;
		
		
	}

	public void fxbZanCun(MzywFxb mzywFxb) {
		getSession().save(mzywFxb);
		
	}

	
}
