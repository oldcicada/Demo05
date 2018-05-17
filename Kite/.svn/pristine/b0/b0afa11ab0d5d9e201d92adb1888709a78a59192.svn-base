package com.dao;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.po.MzywFccSqylfwss;
import com.utils.PageDto;
@Repository
public class MzywFccSqylfwDao {

	@Autowired
    private SessionFactory sessionFactory;
	
    //获取和当前线程绑定的Seesion
    private Session getSession()
    {
        return sessionFactory.getCurrentSession();
    }
    
  //查询养老设施信息
    public PageDto<MzywFccSqylfwss> queryMzywFccSqylfwss(int pageIndex, int pageSize, String mc,String startDate,String endDate,String bszt) {
    	if(startDate.length()==0) {
			startDate="2001-01-01";
		}
		if(endDate.length()==0) {
			Date now=new Date();    
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
			endDate=df.format(now);
		}
    	String sql="SELECT * FROM t_mzyw_fcc_sqylfw WHERE mc LIKE ? AND cjsj BETWEEN ? AND ?";
    	if(!bszt.equals("")) {
    		sql+="AND bszt =:bszt";
    	}
    	sql += " LIMIT ?,?";
    	SQLQuery query = getSession().createSQLQuery(sql).addEntity(MzywFccSqylfwss.class);
    	query.setParameter(0, "%"+mc+"%");
    	query.setParameter(1, startDate);
    	query.setParameter(2, endDate);
    	if(!bszt.equals("")) {
        	query.setParameter("bszt", bszt);
    	}
    	query.setParameter(3, (pageIndex-1)*pageSize);
    	query.setParameter(4, pageSize);
    	@SuppressWarnings("unchecked")
		List<MzywFccSqylfwss> MzywFccSqylfwss = query.list();
    	PageDto<MzywFccSqylfwss> dto =new PageDto<>();
    	dto.setPageIndex(pageIndex);
    	dto.setPageSize(pageSize);
    	dto.setList(MzywFccSqylfwss);
    	dto.setPageTotal(queryMzywFccSqylfwsscount(mc, startDate, endDate, bszt), pageSize);
		return dto;
	}
    
  //查询养老设施条数
    public int queryMzywFccSqylfwsscount(String mc,String startDate,String endDate,String bszt) {
    	if(startDate.length()==0) {
			startDate="2001-01-01";
		}
		if(endDate.length()==0) {
			Date now=new Date();    
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
			endDate=df.format(now);
		}
    	String sql="SELECT COUNT(1) FROM t_mzyw_fcc_sqylfw WHERE mc LIKE ?  AND cjsj BETWEEN ? AND ? ";
    	if(!bszt.equals("")) {
    		sql+="AND bszt =:bszt ";
    	}
		SQLQuery query = getSession().createSQLQuery(sql);
		query.setParameter(0, "%"+mc+"%");
    	query.setParameter(1, startDate);
    	query.setParameter(2, endDate);
    	if(!bszt.equals("")) {
        	query.setParameter("bszt", bszt);
    	}
    	int count=((Number)query.uniqueResult()).intValue();  
    	return count;
    }
}
