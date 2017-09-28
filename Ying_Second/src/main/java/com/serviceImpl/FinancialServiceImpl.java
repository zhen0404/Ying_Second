package com.serviceImpl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.bean.Award_records;
import com.bean.Member;
import com.bean.Member_account;
import com.bean.Member_deposit_record;
import com.bean.Member_tally;
import com.bean.Member_trade_record;
import com.bean.Member_withdraw_record;
import com.dao.FinancialDao;
import com.service.FinancialService;
@Service
public class FinancialServiceImpl implements FinancialService{

	@Autowired
	@Qualifier("financialDaoImpl")
	private FinancialDao financialDaoImpl;

	public List<Award_records> lsa(String iphone,String start, String zhifu) {
		return financialDaoImpl.lsa(iphone, start,zhifu);
	}

	public List<Member> lsm(String iphone) {
		return financialDaoImpl.lsm(iphone);
	}
//
	public List<Member_deposit_record> lsmdr(String iphone,String start, String zhifu) {
		return financialDaoImpl.lsmdr(iphone, start,zhifu);
	}

	public List<Member_tally> lsmt(String iphone,String start, String zhifu) {
		return financialDaoImpl.lsmt(iphone, start ,zhifu);
	}

	public List<Member_withdraw_record> lsmw(String iphone,String start, String zhifu) {
		return financialDaoImpl.lsmw(iphone, start,zhifu);
	}

	public List<Member_trade_record> lst(String iphone,String start,String type,String zhifu) {
		return financialDaoImpl.lst(iphone, start,type,zhifu);
	}

	public List<Member_account> lsma(String iphone,String start, String zhifu) {
		return financialDaoImpl.lsma(iphone, start,zhifu);
	}

	@Override
	public Boolean list1(String iphone) {
		// TODO Auto-generated method stub
		return financialDaoImpl.list1(iphone);
	}
}
