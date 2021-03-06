package com.dao;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.po.MzywDcbCxbdjf;
import com.po.MzywDcbPxbzjf;
import com.po.MzywFccSqylfwss;
import com.po.MzywFccYljgxx;
import com.utils.PageDto;

@Repository
public class MzywFccYljgxxDao {
	@Autowired
    private SessionFactory sessionFactory;
	
    //获取和当前线程绑定的Seesion
    private Session getSession()
    {
        return sessionFactory.getCurrentSession();
    }
    //查询养老机构信息报送状态
    public PageDto<MzywFccYljgxx> queryMzywFccYljgxx(int pageIndex, int pageSize, String mc,String startDate,String endDate,String bszt) {
    	if(startDate.length()==0) {
			startDate="2001-01-01";
		}
		if(endDate.length()==0) {
			Date now=new Date();    
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
			endDate=df.format(now);
		}
    	String sql="SELECT * FROM t_mzyw_fcc_yljgxx WHERE mc LIKE :mc AND cjsj BETWEEN :startDate AND :endDate ";
    	if(!bszt.equals("")) {
    		sql+="AND bszt =:bszt";
    	}
    	sql += " LIMIT :pagestart,:pageSize";
    	SQLQuery query = getSession().createSQLQuery(sql).addEntity(MzywFccYljgxx.class);
    	query.setParameter("mc", "%"+mc+"%");
    	query.setParameter("startDate", startDate);
    	query.setParameter("endDate", endDate);
    	if(!bszt.equals("")) {
        	query.setParameter("bszt", bszt);
    	}
    	query.setParameter("pagestart", (pageIndex-1)*pageSize);
    	query.setParameter("pageSize", pageSize);
    	@SuppressWarnings("unchecked")
		List<MzywFccYljgxx> fccYljgxxs = query.list();
    	PageDto<MzywFccYljgxx> dto =new PageDto<>();
    	dto.setPageIndex(pageIndex);
    	dto.setPageSize(pageSize);
    	dto.setList(fccYljgxxs);
    	dto.setPageTotal(queryMzywFccYljgxxcount(mc, startDate, endDate, bszt), pageSize);
		return dto;
	}
    //查询养老机构条数报送状态
    public int queryMzywFccYljgxxcount(String mc,String startDate,String endDate,String bszt) {
    	if(startDate.length()==0) {
			startDate="2001-01-01";
		}
		if(endDate.length()==0) {
			Date now=new Date();    
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
			endDate=df.format(now);
		}
    	String sql="SELECT COUNT(1) FROM t_mzyw_fcc_yljgxx WHERE mc LIKE :mc  AND cjsj BETWEEN :startDate AND :endDate ";
    	if(!bszt.equals("")) {
    		sql+="AND bszt =:bszt ";
    	}
		SQLQuery query = getSession().createSQLQuery(sql);
		query.setParameter("mc", "%"+mc+"%");
    	query.setParameter("startDate", startDate);
    	query.setParameter("endDate", endDate);
    	if(!bszt.equals("")) {
        	query.setParameter("bszt", bszt);
    	}
    	int count=((Number)query.uniqueResult()).intValue();  
    	return count;
    }
    //查询养老机构信息报送单位
    public PageDto<MzywFccYljgxx> queryMzywFccYljgxxjdw(int pageIndex, int pageSize, String mc,String startDate,String endDate,String sbdw) {
    	if(startDate.length()==0) {
			startDate="2001-01-01";
		}
		if(endDate.length()==0) {
			Date now=new Date();    
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
			endDate=df.format(now);
		}
    	String sql="SELECT * FROM t_mzyw_fcc_yljgxx WHERE mc LIKE :mc AND cjsj BETWEEN :startDate AND :endDate ";
    	if(!sbdw.equals("")) {
    		sql+="AND sbdw =:sbdw";
    	}
    	sql += " LIMIT :pagestart,:pageSize";
    	SQLQuery query = getSession().createSQLQuery(sql).addEntity(MzywFccYljgxx.class);
    	query.setParameter("mc", "%"+mc+"%");
    	query.setParameter("startDate", startDate);
    	query.setParameter("endDate", endDate);
    	if(!sbdw.equals("")) {
        	query.setParameter("sbdw", sbdw);
    	}
    	query.setParameter("pagestart", (pageIndex-1)*pageSize);
    	query.setParameter("pageSize", pageSize);
    	@SuppressWarnings("unchecked")
		List<MzywFccYljgxx> fccYljgxxs = query.list();
    	PageDto<MzywFccYljgxx> dto =new PageDto<>();
    	dto.setPageIndex(pageIndex);
    	dto.setPageSize(pageSize);
    	dto.setList(fccYljgxxs);
    	dto.setPageTotal(queryMzywFccYljgxxcountdw(mc, startDate, endDate, sbdw), pageSize);
		return dto;
	}
    

    //查询养老机构条数报送单位
    public int queryMzywFccYljgxxcountdw(String mc,String startDate,String endDate,String sbdw) {
    	if(startDate.length()==0) {
			startDate="2001-01-01";
		}
		if(endDate.length()==0) {
			Date now=new Date();    
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
			endDate=df.format(now);
		}
    	String sql="SELECT COUNT(1) FROM t_mzyw_fcc_yljgxx WHERE mc LIKE :mc  AND cjsj BETWEEN :startDate AND :endDate ";
    	if(!sbdw.equals("")) {
    		sql+="AND sbdw =:sbdw ";
    	}
		SQLQuery query = getSession().createSQLQuery(sql);
		query.setParameter("mc", "%"+mc+"%");
    	query.setParameter("startDate", startDate);
    	query.setParameter("endDate", endDate);
    	if(!sbdw.equals("")) {
        	query.setParameter("sbdw", sbdw);
    	}
    	int count=((Number)query.uniqueResult()).intValue();  
    	return count;
    }
    //暂存养老机构信息
    public void zcMzywFccYljgxx(MzywFccYljgxx mzywFccYljgxx) {
    	getSession().saveOrUpdate(mzywFccYljgxx);
    }
    
    //报送养老机构信息
    public void bsMzywFccYljgxx(MzywFccYljgxx mzywFccYljgxx) {
    	getSession().saveOrUpdate(mzywFccYljgxx);
    }
    //保存养老机构信息
    public void saveMzywFccYljgxx(MzywFccYljgxx mzywFccYljgxx) {
    	getSession().saveOrUpdate(mzywFccYljgxx);
    }
    //删除养老机构信息
    public int scMzywFccYljgxx(String id) {
    	String sql="delete from t_mzyw_fcc_yljgxx where id=?";
		SQLQuery query = getSession().createSQLQuery(sql);
		query.setParameter(0, id);
		int bs = query.setResultTransformer(Transformers.aliasToBean(MzywFccYljgxx.class)).executeUpdate();	
		return bs;
    }
    //根据id查询单个养老机构信息
    public MzywFccYljgxx queryMzywFccYljgxxbyid(String id) {
    	String sql= "select * from t_mzyw_fcc_yljgxx where id=?";
		SQLQuery query = getSession().createSQLQuery(sql);
		query.setParameter(0, id);
    	MzywFccYljgxx yljgxx = (MzywFccYljgxx) query.setResultTransformer(Transformers.aliasToBean(MzywFccYljgxx.class)).uniqueResult();
    	return yljgxx;
    }
}