package com.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bean.Member_trade_record;
import com.dao.BaseDao;
import com.service.BaseService;

@Service
@Transactional
public class Member_trade_recordService implements BaseService<Member_trade_record>{

	@Autowired
	@Qualifier("member_trade_recordDao")
	private BaseDao<Member_trade_record> baseDao;
	
	@Override
	public List<Member_trade_record> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Member_trade_record t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Member_trade_record t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Member_trade_record getById(int id) {
		return baseDao.getById(id);
	}

	@Override
	public void update(Member_trade_record t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Member_trade_record> listAll(Map map) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Member_trade_record> listAll(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
