package com.dao;

import java.util.List;
import java.util.Map;

import com.bean.News_type;

public interface CollegeDao<T> {

	List<T> listAll();
	
	void save(T t);
	
	void delete(T t);
	
	T getById(int id);
	
	void update(T t);

	List<T> listAll(Map map);

	List<News_type> typeList();

	News_type getTypeId(int id);
	

	
	
}
