package com.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bean.Member_bankcards;
import com.dao.BaseDao;
import com.daoImpl.MemberBankcardsDao;
import com.service.BaseService;

@Service
@Transactional
public class MemberBankcardsService implements BaseService<Member_bankcards>{

	@Autowired
	@Qualifier("memberBankcardsDao")
	private BaseDao<Member_bankcards> baseDao;
	
	@Override
	public List<Member_bankcards> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Member_bankcards t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Member_bankcards t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Member_bankcards getById(int id) {
		return null;
	}

	public void update(int id) {
		Member_bankcards member_bankcards=baseDao.getById(id);
		member_bankcards.setDelflag(1);
		baseDao.update(member_bankcards);
	}

	@Override
	public List<Member_bankcards> listAll(Map map) {
		return baseDao.listAll(map);
	}

	@Override
	public void update(Member_bankcards t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Member_bankcards> listAll(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
