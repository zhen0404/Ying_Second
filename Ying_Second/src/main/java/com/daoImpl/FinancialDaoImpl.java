package com.daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bean.Award_records;
import com.bean.Member;
import com.bean.Member_account;
import com.bean.Member_deposit_record;
import com.bean.Member_tally;
import com.bean.Member_trade_record;
import com.bean.Member_withdraw_record;
import com.dao.FinancialDao;
@Component
public class FinancialDaoImpl implements FinancialDao{

	@Autowired
	private SessionFactory sf;
	
	public Session getSession(){
		return sf.getCurrentSession();
	}
	public List<Award_records> lsa(String iphone,String start) {
		Session session=getSession();
		String hql="select SUM(amount) from award_records where 0=0";
		 List<Member> m=lsm(iphone);
			int i=m.get(0).getId();
			if(start!=null&&!"".equals(start)){
	       		 hql+=" and addTime like '%"+start+"%'";
	       	 }
			if(i!=0){
				hql+=" and invitingid ='"+i+"' GROUP BY invitingid";
			}
		
    	
			System.out.println(hql);
		List list=session.createSQLQuery(hql).list();
		return list;
	}

	public List<Member> lsm(String iphone) {
		Session session=getSession();
		String hql=" from Member where 0=0";
		if(iphone!=null&&!"".equals(iphone)){
			hql+=" and mobile_Phone ='"+iphone+"'";
		}
		
		System.out.println(hql);
		List<Member> list=session.createQuery(hql).list();
		return list;
	}

	public List<Member_deposit_record> lsmdr(String iphone,String start) {
		Session session=getSession();
		String hql="select SUM(amount) from member_deposit_record where 0=0  ";
		 List<Member> m=lsm(iphone);
			int i=m.get(0).getId();
			if(start!=null&&!"".equals(start)){
	       		 hql+=" and create_date like '%"+start+"%'";
	       	 }
			if(i!=0){
				hql+=" and member_id ='"+i+"' GROUP BY member_id" ;
			}
			
			System.out.println(hql);
		List list=session.createSQLQuery(hql).list();
		return list;
	}

	public List<Member_tally> lsmt(String iphone,String start) {
		Session session=getSession();
		String hql="select SUM(amount) from member_tally where 0=0";
		 List<Member> m=lsm(iphone);
			int i=m.get(0).getId();
			if(i!=0){
				hql+=" and member_id ='"+i+"' GROUP BY member_id";
			}
			if(start!=null&&!"".equals(start)){
	       		 hql+=" and create_date like '%"+start+"%'";
	       	 }
			System.out.println(hql);
		List list=session.createSQLQuery(hql).list();
		return list;
	}

	public List<Member_withdraw_record> lsmw(String iphone,String start) {
		Session session=getSession();
		String hql="select SUM(amount) from member_withdraw_record where 0=0";
		 List<Member> m=lsm(iphone);
			int i=m.get(0).getId();
			if(start!=null&&!"".equals(start)){
	       		 hql+=" and create_date like '%"+start+"%'";
	       	 }
			if(i!=0){
				hql+=" and member_id ='"+i+"' GROUP BY member_id";
			}
			System.out.println(hql);
		List list=session.createSQLQuery(hql).list();
		return list;
	}

	public List<Member_trade_record> lst(String iphone,String start,String type,String zhifu) {
		Session session=getSession();
		String hql=" from Member_trade_record where 0=0";
		 List<Member> m=lsm(iphone);
			int i=m.get(0).getId();
			if(i!=0){
				hql+=" and member_id ='"+i+"'";
			}
			if(start!=null&&!"".equals(start)){
	       		 hql+=" and create_date like '%"+start+"%'";
	       	 }
			if(type!=null&&!"".equals(type)){
				hql+=" and trade_type ='"+type+"'";
			}
			if(zhifu!=null&&!"".equals(zhifu)){
				hql+=" and ext_field_3 = '"+zhifu+"'";
			}
			System.out.println(hql);
		List<Member_trade_record> list=session.createQuery(hql).list();
		System.out.println(list.size()+"qwee");
		return list;
	}

	public List<Member_account> lsma(String iphone,String start) {
		Session session=getSession();
		System.out.println("aaaa");
		String hql=" from Member_account ";
		 List<Member> m=lsm(iphone);
			int i=m.get(0).getId();
			if(i!=0){
				hql+=" where  member_id ='"+i+"'";
			}
			if(start!=null&&!"".equals(start)){
	       		 hql+=" and create_date like '%"+start+"%'";
	       	 }
			System.out.println(hql);
		List<Member_account> list=session.createQuery(hql).list();
		System.out.println(list.size()+"123132131");
		return list;
	}
	

}
