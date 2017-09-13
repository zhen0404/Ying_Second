package com.service;

import java.util.List;
import java.util.Map;


public interface BaseService<T> {

	List<T> listAll();
	
	void save(T t);
	
	void delete(T t);
	
	T getById(int id);
	
	void update(T t);

	List<T> listAll(Map map);
	
}
