package com.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.bean.Push_notice;
import com.bean.Award_records;
import com.bean.Finance_product_funds;
import com.bean.Member;
import com.bean.Member_withdraw_record;
import com.bean.Subject;
import com.bean.Sys_recharge_price_config;
import com.bean.Member_trade_record;
import com.bean.Member_tally;
@Service
@Transactional
public interface GgManagerService {

	//查询所有公告，新闻
	public List<Push_notice>listSubject();
	//查询是否有该标题
	public List<Push_notice> listPush_notice(String hl);
	public List<Member> listPush_notice1(String hql);
	//根据id查询公告内容
	public List<Push_notice> chakan();
	public <T> T chakan(int id);
	//编辑公告
	public List<Push_notice> chakang();
	public <T> T chakang(int id);
	//添加公告
	public void save (Object...objects);
    //修改公告
	public List<Push_notice> updatelist();
	void updatelist(int id, String title, String content);
	//查询所有反馈意见表
	public List listfeedback();
	//红包统计
			public List<Award_records> ListCop(String creatTime,String endTime, int month);

			public List<Award_records> ListCop1(String creatTime,String endTime, int month);

			public List<Finance_product_funds> ListCop2(String creatTime,String endTime, int month);

			public List<Subject> ListCop3(String creatTime,String endTime, int month);
			
			public List<Subject> ListCop4(String creatTime,String endTime, int month);
			public List<Sys_recharge_price_config> ListCop5(String creatTime,String endTime, int month);

			public List<Sys_recharge_price_config> ListCop6(String creatTime,String endTime, int month);

			public List<Member_withdraw_record> ListCop7(String creatTime,String endTime, int month);

			public List<Member_withdraw_record> ListCop8(String creatTime,String endTime, int month);

			public List<Finance_product_funds> ListCop9(String creatTime,String endTime, int month);

			public List<Subject> ListCop10(String creatTime,String endTime, int month);

			public List<Subject> ListCop11(String creatTime,String endTime, int month);

			public List<Member_trade_record> ListCop12(String creatTime,String endTime, int month);

			public List<Member_trade_record> ListCop13(String creatTime,String endTime, int month);

			public List<Member_tally> ListCop14(String creatTime,String endTime, int month);
			

}
