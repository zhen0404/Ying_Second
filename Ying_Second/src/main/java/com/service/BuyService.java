package com.service;

import com.bean.Member_account;

public interface BuyService {

	Member_account getByMemberId(int mid);
	
}
