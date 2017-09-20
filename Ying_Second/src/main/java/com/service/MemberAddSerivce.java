package com.service;

import org.springframework.stereotype.Component;

import com.bean.Member_profit_record;

@Component
public interface MemberAddSerivce {

	Member_profit_record getMemberProfitRecordByMid(int mid);
	
}
