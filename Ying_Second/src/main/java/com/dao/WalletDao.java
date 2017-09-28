package com.dao;

import java.util.List;

import com.bean.Member_trade_record;

public interface WalletDao {
	  List<Member_trade_record> listAll();
	  List<Member_trade_record> query(String hql);  
}
