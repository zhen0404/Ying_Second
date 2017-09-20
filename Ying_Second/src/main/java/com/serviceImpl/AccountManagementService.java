package com.serviceImpl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bean.Member;
import com.dao.BaseDao;
import com.service.BaseService;

/**
 * 账号管理
 * @author Maibenben
 * @param <T>
 *
 */
@Service
@Transactional
public class AccountManagementService implements BaseService<Member>{

	@Autowired(required=true)
	@Qualifier(value="accountManagementDao")
	private BaseDao<Member> baseDao;
	
	

	public List<Member> listAll(Map map) {
		return baseDao.listAll(map);
	}



	public List<Member> listAll() {
		// TODO Auto-generated method stub
		return null;
	}



	public void save(Member t) {
		// TODO Auto-generated method stub
		
	}



	public void delete(Member t) {
		// TODO Auto-generated method stub
		
	}



	public Member getById(int id) {
		
		return baseDao.getById(id);
	}



	public void update(Member member) {
		
	}



	@Override
	public List<Member> listAll(int id) {
		// TODO Auto-generated method stub
		return baseDao.listAll(id);
	}



	@Override
	public void update(int id) {
		// TODO Auto-generated method stub
		
	}



}
