package com.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bean.Member_deposit_record;
import com.dao.BaseDao;
import com.service.BaseService;

@Service 
@Transactional
public class MemberDepositRecordService implements BaseService<Member_deposit_record>{

	@Autowired
	@Qualifier("memberDepositRecordDao")
	private BaseDao<Member_deposit_record> baseDao;
	
	@Override
	public List<Member_deposit_record> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Member_deposit_record t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Member_deposit_record t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Member_deposit_record getById(int id) {
		return baseDao.getById(id);
	}

	@Override
	public List<Member_deposit_record> listAll(Map map) {
		return baseDao.listAll(map);
	}

	@Override
	public void update(Member_deposit_record t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Member_deposit_record> listAll(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
