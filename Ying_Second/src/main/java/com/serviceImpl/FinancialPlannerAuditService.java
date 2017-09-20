package com.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bean.Financial_planner;
import com.dao.BaseDao;
import com.service.BaseService;

@Service
@Transactional
public class FinancialPlannerAuditService implements BaseService<Financial_planner>{

	@Autowired
	@Qualifier("financialPlannerAuditDao")
	private BaseDao<Financial_planner> baseDao;
	
	public List<Financial_planner> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public void save(Financial_planner t) {
		// TODO Auto-generated method stub
		
	}

	public void delete(Financial_planner t) {
		// TODO Auto-generated method stub
		
	}

	public Financial_planner getById(int id) {
		return baseDao.getById(id);
	}

	public void update(Financial_planner t) {
		// TODO Auto-generated method stub
		
	}

	public List<Financial_planner> listAll(Map map) {
		return baseDao.listAll(map);
	}

	@Override
	public List<Financial_planner> listAll(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(int id) {
		// TODO Auto-generated method stub
		
	}
	
	

}
