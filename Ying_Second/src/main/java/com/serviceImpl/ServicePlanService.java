package com.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bean.Subject;
import com.dao.BaseDao;
import com.service.BaseService;

@Service
@Transactional
public class ServicePlanService implements BaseService<Subject>{

	@Autowired
	@Qualifier("servicePlanDao")
	private BaseDao<Subject> baseDao;
	
	@Override
	public List<Subject> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Subject t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Subject t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Subject getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Subject t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Subject> listAll(Map map) {
		return baseDao.listAll(map);
	}

	@Override
	public void update(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Subject> listAll(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
