package com.dao;

import java.util.List;
import java.util.Map;

import org.hibernate.Session;

import com.bean.Subject;

public interface FrontSubjectDao {
		List<Subject> list(Map map);
	    String listDataHql(String hql,Map map);
	    List<Subject > query(String hql);
}
