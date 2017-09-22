package com.dao;

import java.util.List;

import com.bean.Member_profit_record;

public interface MemberAddDao {

	List<Member_profit_record> getMemberProfitRecordByMid(int mid);
	
	
	
}
