package com.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.bean.Award_records;
import com.bean.Member;
import com.bean.Member_account;
import com.bean.Member_deposit_record;
import com.bean.Member_tally;
import com.bean.Member_trade_record;
import com.bean.Member_withdraw_record;
@Service
@Transactional
public interface FinancialService {

	List<Award_records> lsa(String iphone,String start, String zhifu);//奖励记录表
	List<Member> lsm(String iphone);//用户信息表
	List<Member_deposit_record > lsmdr(String iphone,String start, String zhifu);//充值记录表
	List<Member_tally> lsmt(String iphone,String start, String zhifu);//生活消费
	List<Member_withdraw_record  > lsmw(String iphone,String start, String zhifu); //提现记录
	List<Member_trade_record  > lst(String iphone,String start,String type,String zhifu);//交易记录
	List<Member_account   > lsma(String iphone,String start, String zhifu);//余额表
	Boolean list1(String iphone);//查询手机号
}
