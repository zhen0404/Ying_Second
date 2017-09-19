package com.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.bean.Member_account;
import com.dao.BuyDao;
import com.service.BuyService;

@Service
public class BuyServiceImpl implements BuyService {

	@Autowired
	@Qualifier("buyDaoImpl")
	private BuyDao bd;
	
	public Member_account getByMemberId(int mid) {
		// TODO Auto-generated method stub
		return this.bd.getByMemberId(mid);
	}

}
