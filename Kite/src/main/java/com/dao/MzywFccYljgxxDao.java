package com.dao;

import java.util.List;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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
    
    public PageDto<MzywFccYljgxx> queryMzywFccYljgxx(int pageIndex, int pageSize, String mc,String startDate,String endDate,String bszt) {
    	String sjpd="AND cjsj BETWEEN ? AND ? ";
    	String sql="SELECT * FROM t_mzyw_fcc_yljgxx WHERE "
    			+ "mc LIKE ? "
    			+ sjpd
    			+ "AND bszt=? "
    			+ "LIMIT ?,?";
    	SQLQuery query = getSession().createSQLQuery(sql).addEntity(MzywFccYljgxx.class);
    	query.setParameter(0, "%"+mc+"%");
    	query.setParameter(1, startDate);
    	query.setParameter(2, endDate);
    	query.setParameter(3, bszt);
    	query.setParameter(4, (pageIndex-1)*pageSize);
    	query.setParameter(5, pageSize);
    	@SuppressWarnings("unchecked")
		List<MzywFccYljgxx> fccYljgxxs = query.list();
    	PageDto<MzywFccYljgxx> dto =new PageDto<>();
    	dto.setPageIndex(pageIndex);
    	dto.setPageSize(pageSize);
    	dto.setList(fccYljgxxs);
    	dto.setPageTotal(queryMzywFccYljgxxcount(mc, startDate, endDate, bszt), pageSize);
		return dto;
	}
    public int queryMzywFccYljgxxcount(String mc,String startDate,String endDate,String bszt) {
		String sql="SELECT COUNT(1) FROM t_mzyw_fcc_yljgxx "
    			+ "WHERE mc LIKE ? "
    			+ "AND cjsj BETWEEN ? AND ? "
    			+ "AND bszt=? ";
		SQLQuery query = getSession().createSQLQuery(sql);
		query.setParameter(0, "%"+mc+"%");
    	query.setParameter(1, startDate);
    	query.setParameter(2, endDate);
    	query.setParameter(3, bszt);
    	int count=((Number)query.uniqueResult()).intValue();  
    	return count;
    }
}