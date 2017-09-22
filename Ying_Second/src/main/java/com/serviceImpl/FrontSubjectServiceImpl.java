package com.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bean.Subject;
import com.dao.FrontSubjectDao;
import com.service.FrontSubjectService;

@Service
@Transactional
public class FrontSubjectServiceImpl implements FrontSubjectService{
                      
	 @Autowired
     @Qualifier("frontSubjectDaoImpl")
       private FrontSubjectDao frontSubjectDaoImpl;
	             
	public List<Subject> list(Map map) {
		return frontSubjectDaoImpl.list(map);
	}

	public String listDataHql(String hql, Map map) {
		return frontSubjectDaoImpl.listDataHql(hql, map);
	}

	public List<Subject> query(String hql) {
		  return this.frontSubjectDaoImpl.query(hql);
	}

}
