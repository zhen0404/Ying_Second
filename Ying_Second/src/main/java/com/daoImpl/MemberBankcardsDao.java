package com.daoImpl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bean.Member;
import com.bean.Member_bankcards;
import com.bean.Subject_bbin_purchase_record;
import com.dao.BaseDao;

/**
 * 绑卡管理
 * @author Maibenben
 *
 */
@Component
public class MemberBankcardsDao implements BaseDao<Member_bankcards>{

	@Autowired
	private SessionFactory sf;
	
	private Session getSession(){
		return sf.getCurrentSession();
	}
	public String hqlData(String hql,Map map){
		String member_name=(String)map.get("member_name");
		String mobile_Phone=(String)map.get("mobile_Phone");
		String card_no=(String)map.get("card_no");
		String create_date=(String)map.get("create_date");
		if(member_name!=null&&!member_name.equals("")){
			hql+="and M.member.member_name like '%"+member_name+"%'";
		}
		if(mobile_Phone!=null&&!mobile_Phone.equals("")){
			hql+="and M.member.mobile_Phone like '%"+mobile_Phone+"%'";
		}
		if(card_no!=null&&!card_no.equals("")){
			hql+="and M.card_no like '%"+card_no+"%'";
		}
		if(create_date!=null&&!create_date.equals("")){
			hql+="and M.create_date like '%"+create_date+"%'";
		}
		return hql;
	}

	@Override
	public List<Member_bankcards> listAll(Map map) {
		String hql="from Member_bankcards M where 0=0 ";
		hql=hqlData(hql, map);
		Session session=getSession();
		List<Member_bankcards> list=session.createQuery(hql).list();
		return list;
	}
	@Override
	public List<Member_bankcards> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Member_bankcards t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Member_bankcards t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Member_bankcards getById(int id) {
		Session session=getSession();
		Member_bankcards member_bankcards=(Member_bankcards)session.get(Member_bankcards.class, id);
		return member_bankcards;
	}

	@Override
	public void update(Member_bankcards member_bankcards) {
		Session session=getSession();
		Date date=new Date();
		member_bankcards.setUpdate_date(date);
		session.update(member_bankcards);
		
	}
	@Override
	public List<Member_bankcards> listAll(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
