package com.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.bean.Push_notice;
import com.bean.Subject;
import com.dao.GgManagerDao;
import com.service.GgManagerService;
import com.bean.Award_records;
import com.bean.Member_tally;
import com.bean.Member_trade_record;
import com.bean.Sys_recharge_price_config;
import com.bean.Member_withdraw_record;
@Service
public class GgManagerServiceImpl implements GgManagerService {

	@Autowired
	@Qualifier("ggManagerDaoImpl")
	private GgManagerDao manager;
	
	//查询所有公告，新闻
	public List<Push_notice> listSubject(){
		return manager.ListAll();
}
	//查询所有反馈意见表
	
	public List listfeedback() {
		return manager.Feed();
	}

	public List<Push_notice> listPush_notice(String hql) {
		System.out.println("1");
		return this.manager.list(hql);
	}

	//根据ID查询公告内容

	public Push_notice chakan(int id) {
		return manager.chakan(id);
	}
	//编辑公告
	public Push_notice chakang(int id) {
		return manager.chakan(id);
	}

	public List<Push_notice> chakan() {
		return null;
	}

	public List<Push_notice> chakang() {
		// TODO Auto-generated method stub
		return null;
	}
	//添加
		public void save(Object... objects) {
			manager.save(objects);
			System.out.println(objects);
		}
    

		public List<Push_notice> updatelist() {
			// TODO Auto-generated method stub
			return null;
		}
		//修改
	public void updatelist(int id, String title, String content) {
		this.manager.updatelist(id, title,content);

	}

	public List<Award_records> ListCop(String creatTime) {
		return manager.ListCop(creatTime);
	}

	public List<Award_records> ListCop1(String creatTime) {
		return manager.ListCop1(creatTime);
	}

	public List<Subject> ListCop2(String creatTime, String endTime) {
		return manager.ListCop2(creatTime, endTime);
	}

	public List<Subject> ListCop3(String creatTime, String endTime) {
		return manager.ListCop3(creatTime, endTime);
	}

	public List<Subject> ListCop4(String creatTime, String endTime) {
		return manager.ListCop4(creatTime, endTime);
	}

	public List<Sys_recharge_price_config> ListCop5(String creatTime) {
		return manager.ListCop5(creatTime);
	}

	public List<Sys_recharge_price_config> ListCop6(String creatTime) {
		return manager.ListCop6(creatTime);
	}

	public List<Member_withdraw_record> ListCop7(String creatTime) {
		return manager.ListCop7(creatTime);
	}

	public List<Member_withdraw_record> ListCop8(String creatTime) {
		return manager.ListCop8(creatTime);
	}

	public List<Subject> ListCop9(String creatTime, String endTime) {
		return manager.ListCop9(creatTime, endTime);
	}

	public List<Subject> ListCop10(String creatTime, String endTime) {
		return manager.ListCop10(creatTime, endTime);
	}

	public List<Subject> ListCop11(String creatTime, String endTime) {
		return manager.ListCop11(creatTime, endTime);
	}

	public List<Member_trade_record> ListCop12(String creatTime) {
		return manager.ListCop12(creatTime);
	}

	public List<Member_trade_record> ListCop13(String creatTime) {
		return manager.ListCop13(creatTime);
	}

	public List<Member_tally> ListCop14(String creatTime) {
		return manager.ListCop14(creatTime);
	}

	


}
