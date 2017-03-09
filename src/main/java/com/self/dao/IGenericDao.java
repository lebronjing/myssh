package com.self.dao;

import java.io.Serializable;
import java.util.List;

public interface IGenericDao<T,PK extends Serializable> {
	T load(PK id);
	
	T get(PK id);
	
	List<T> findAll();
	
	PK save(T entity);
	
	void delete(PK id);
	
	void saveOrUpdate(T entity);
}
