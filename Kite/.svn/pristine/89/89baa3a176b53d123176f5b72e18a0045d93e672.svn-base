package com.dao;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.po.User;

@Repository
public class UserDao {
    
	@Autowired
    private SessionFactory sessionFactory;
	
    //获取和当前线程绑定的Seesion
    private Session getSession()
    {
        return sessionFactory.openSession();
    }

    
	public User queryUser(String name, String password) {
		String sql="select * from user where name=:name and password=:password";
		SQLQuery query = getSession().createSQLQuery(sql).addEntity(User.class);
		query.setParameter("name", name);
		query.setParameter("password", password);
		User user = (User) query.uniqueResult();

		return user;
	}
}
