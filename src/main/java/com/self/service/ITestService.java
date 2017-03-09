package com.self.service;

import java.util.List;

import com.self.model.TestNo1;

public interface ITestService {
	TestNo1 load(String id);
	
	TestNo1 get(String id);
	
	List<TestNo1> findAll();
	
	String save(TestNo1 entity);
	
	void delete(String id);
	
	void saveOrUpdate(TestNo1 entity);
}
