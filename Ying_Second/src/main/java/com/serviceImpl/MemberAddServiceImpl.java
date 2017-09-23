package com.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.bean.Member_profit_record;
import com.dao.MemberAddDao;
import com.service.MemberAddSerivce;

@Service
public class MemberAddServiceImpl implements MemberAddSerivce {

	@Autowired
	@Qualifier("memberAddDaoImpl")
	private MemberAddDao mad;

	@Override
	public List<Member_profit_record> getMemberProfitRecordByMid(int mid) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
