package com.self.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.self.dao.ITestDao;
import com.self.model.TestNo1;
import com.self.service.ITestService;

@Service("testService")
public class TestServiceImpl implements ITestService{
	
	@Autowired
	private ITestDao testDao;

	@Override
	public TestNo1 load(String id) {
		return null;
	}

	@Override
	public TestNo1 get(String id) {
		return null;
	}

	@Override
	public List<TestNo1> findAll() {
		return this.testDao.findAll();
	}

	@Override
	public String save(TestNo1 entity) {
		return testDao.save(entity);
	}

	@Override
	public void delete(String id) {
		
	}

	@Override
	public void saveOrUpdate(TestNo1 entity) {
		
	}

}
