package com.self.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.self.dao.ITestDao;
import com.self.model.TestNo1;
@Repository("testDao")
public class TestDaoImpl implements ITestDao{
	@Autowired
	protected SessionFactory sessionFactory;
	
	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public TestNo1 load(String id) {
		return null;
	}

	@Override
	public TestNo1 get(String id) {
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<TestNo1> findAll() {
		List<TestNo1> list = this.getSession().createQuery("from TestNo1").setCacheable(true).list();
		return list;
	}

	@Override
	public String save(TestNo1 entity) {
		return (String) this.getSession().save(entity);
	}

	@Override
	public void delete(String id) {
		
	}

	@Override
	public void saveOrUpdate(TestNo1 entity) {
		
	}
	
}
