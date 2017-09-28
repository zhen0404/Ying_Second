package com.service;

import java.util.List;

import com.bean.Member_trade_record;

public interface WalletService {
	
	 List<Member_trade_record> listAll();
	 
	 List<Member_trade_record> query(String hql);

}
