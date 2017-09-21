package com.service;

import java.util.List;
import java.util.Map;

import com.bean.Subject;

public interface FrontSubjectService {

		List<Subject> list(Map map);
	    String listDataHql(String hql,Map map);
	    List<Subject > query(String hql);
}
