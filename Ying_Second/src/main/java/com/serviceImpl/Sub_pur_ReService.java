package com.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bean.Subject_purchase_record;
import com.dao.BaseDao;
import com.service.BaseService;

@Service
@Transactional
public class Sub_pur_ReService implements BaseService<Subject_purchase_record>{

	@Autowired
	@Qualifier("sub_pur_ReDao")
	private BaseDao<Subject_purchase_record> baseDao;
	
	@Override
	public List<Subject_purchase_record> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Subject_purchase_record t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Subject_purchase_record t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Subject_purchase_record getById(int id) {
		return baseDao.getById(id);
	}

	@Override
	public void update(Subject_purchase_record t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Subject_purchase_record> listAll(Map map) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Subject_purchase_record> listAll(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
