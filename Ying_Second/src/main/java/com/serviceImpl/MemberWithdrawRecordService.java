package com.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bean.Member_withdraw_record;
import com.dao.BaseDao;
import com.service.BaseService;

@Service
@Transactional
public class MemberWithdrawRecordService implements BaseService<Member_withdraw_record>{

	@Autowired
	@Qualifier("memberWithdrawRecordDao")
	private BaseDao<Member_withdraw_record> baseDao;
	
	@Override
	public List<Member_withdraw_record> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Member_withdraw_record t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Member_withdraw_record t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Member_withdraw_record getById(int id) {
		return baseDao.getById(id);
	}

	@Override
	public List<Member_withdraw_record> listAll(Map map) {
		return baseDao.listAll(map);
	}

	@Override
	public void update(Member_withdraw_record t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Member_withdraw_record> listAll(int id) {
		return baseDao.listAll(id);
	}

}
