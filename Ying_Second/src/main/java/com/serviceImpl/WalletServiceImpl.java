package com.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bean.Member_trade_record;
import com.dao.WalletDao;
import com.service.WalletService;

@Service
@Transactional
public class WalletServiceImpl implements WalletService{
	
	 @Autowired
     @Qualifier("walletDaoImpl")
       private WalletDao walletDaoImpl;

	@Override
	public List<Member_trade_record> listAll() {
		return walletDaoImpl.listAll();
	}

	@Override
	public List<Member_trade_record> query(String hql) {
		return walletDaoImpl.query(hql);
	}

}
