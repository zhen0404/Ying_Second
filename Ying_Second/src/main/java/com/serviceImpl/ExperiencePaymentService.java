package com.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bean.Subject_bbin_purchase_record;
import com.dao.BaseDao;
import com.service.BaseService;

@Service
@Transactional
public class ExperiencePaymentService implements BaseService<Subject_bbin_purchase_record>{

	@Autowired
	@Qualifier("experiencePaymentDao")
	private BaseDao<Subject_bbin_purchase_record> baseDao;

	@Override
	public List<Subject_bbin_purchase_record> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Subject_bbin_purchase_record t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Subject_bbin_purchase_record t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Subject_bbin_purchase_record getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Subject_bbin_purchase_record> listAll(Map map) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Subject_bbin_purchase_record t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(int id) {
		Subject_bbin_purchase_record sRecord=baseDao.getById(id);
		sRecord.setIspayment(1);
		baseDao.update(sRecord);
	}

	@Override
	public List<Subject_bbin_purchase_record> listAll(int id) {
		return baseDao.listAll(id);
	}
	
	

}
