package com.dao;

import java.util.List;

import com.bean.Award_records;
import com.bean.Finance_product_funds;
import com.bean.Member;
import com.bean.Member_tally;
import com.bean.Member_trade_record;
import com.bean.Member_withdraw_record;
import com.bean.Push_notice;
import com.bean.Subject;
import com.bean.Sys_recharge_price_config;

public interface GgManagerDao {

	public List ListAll() ;

	public List Feed();
	
	//查询是否有该标题
	public List<Push_notice> list(String hql);
	public List<Member> listFom(String hql);
	//根据id查询公告内容
			public Push_notice chakan(int id);
	//编辑公告
	public Push_notice chakang(int id);
	//添加
		public void save(Object...objects);
   //修改
		public void updatelist(int id,String title,String content);
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
