package com.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.bean.Member_profit_record;

@Component
public interface MemberAddSerivce {

	List<Member_profit_record> getMemberProfitRecordByMid(int mid);
	
}
