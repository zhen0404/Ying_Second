package com.service;

import java.util.List;
import java.util.Map;


public interface NService<T> {

	List<T> listAll();
	
	void save(T t);
	
	void delete(T t);
	
	T getById(int id);
	
	void update(T t);
	
	void update(int id);

	List<T> listAll(Map map);
	
	List<T> listAll(int id);
	
}
