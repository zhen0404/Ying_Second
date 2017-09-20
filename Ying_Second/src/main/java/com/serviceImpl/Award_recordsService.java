package com.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bean.Award_records;
import com.dao.BaseDao;
import com.service.BaseService;

@Service
@Transactional
public class Award_recordsService implements BaseService<Award_records>{
	
	@Autowired
	@Qualifier("award_recordsDao")
	private BaseDao<Award_records> baseDao;

	@Override
	public List<Award_records> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Award_records t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Award_records t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Award_records getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Award_records t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Award_records> listAll(Map map) {
		return baseDao.listAll(map);
	}

	@Override
	public List<Award_records> listAll(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
