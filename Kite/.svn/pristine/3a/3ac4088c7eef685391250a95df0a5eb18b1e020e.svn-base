package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.po.MzywZd;

@Repository
public class MzywZdDao {
	@Autowired
	private SessionFactory sessionFactory;

	private Session getSesstion() {
		return sessionFactory.getCurrentSession();
	}

	@SuppressWarnings("unchecked")
	public List<MzywZd> queryDicList() {
		Query query = getSesstion().createQuery("from MzywZd where yxx=0");
		return query.list();
	}

}
