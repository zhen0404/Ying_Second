package com.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bean.Member_account;
import com.dao.BaseDao;
import com.service.BaseService;

@Service
@Transactional
public class MemberAcountService implements BaseService<Member_account>{

	@Autowired
	@Qualifier("memberAcount")
	private BaseDao<Member_account> basedao;
	@Override
	public List<Member_account> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Member_account t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Member_account t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Member_account getById(int id) {
		return basedao.getById(id);
	}

	@Override
	public List<Member_account> listAll(Map map) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Member_account t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Member_account> listAll(int id) {
		return basedao.listAll(id);
	}

}
