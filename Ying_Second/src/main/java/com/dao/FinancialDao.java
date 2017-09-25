package com.dao;

import java.util.List;

import com.bean.Award_records;
import com.bean.Member;
import com.bean.Member_account;
import com.bean.Member_deposit_record;
import com.bean.Member_tally;
import com.bean.Member_trade_record;
import com.bean.Member_withdraw_record;

public interface FinancialDao {

	List<Award_records> lsa(String iphone,String start);//奖励记录表
	List<Member> lsm(String iphone);//用户信息表
	List<Member_deposit_record > lsmdr(String iphone,String start);//充值记录表
	List<Member_tally> lsmt(String iphone,String start);//生活消费
	List<Member_withdraw_record  > lsmw(String iphone,String start); //提现记录
	List<Member_trade_record  > lst(String iphone,String start,String type,String zhifu);//交易记录
	List<Member_account   > lsma(String iphone,String start);//余额表
}
