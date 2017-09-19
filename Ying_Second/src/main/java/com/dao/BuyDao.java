package com.dao;

import com.bean.Member_account;

public interface BuyDao {

	Member_account getByMemberId(int mid);
	
	
	
}
