package com.daoImpl;

import java.util.List;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bean.Member;
import com.dao.BaseDao;

/**
 * 账号管理
 * @author Maibenben
 *
 */
@Component
public class AccountManagementDao implements BaseDao<Member>{

	@Autowired
	private SessionFactory sf;
	
	public Session getSession(){
		return sf.getCurrentSession();
	}
	
	
	public List<Member> listAll(Map map) {
		String hql="from Member where 0=0 ";
		hql=listDataHql(hql, map);
		Session session=getSession();
		System.out.println("hql=="+hql);
		List<Member> listMember=session.createQuery(hql).list();
		return listMember;
	}

	
	public String listDataHql(String hql,Map map){
		String member_name=(String)map.get("member_name");
		String name=(String)map.get("name");
		String mobile_Phone=(String)map.get("mobile_Phone");
		String identity=(String)map.get("identity");
		String invitationCode=(String)map.get("invitationCode");
		String create_date=(String)map.get("create_date");
		if(member_name!=null&&!member_name.equals("")){
			hql+=" and member_name like '%"+member_name+"%'";
		}
		if(name!=null&&!name.equals("")){
			hql+=" and name like '%"+name+"%' ";
		}
		if(mobile_Phone!=null&&!mobile_Phone.equals("")){
			hql+=" and mobile_Phone like '%"+mobile_Phone+"%'";
		}
		if(identity!=null&&!identity.equals("")){
			hql+=" and identity like '%"+identity+"%'";
		}
		if(invitationCode!=null&&!invitationCode.equals("")){
			hql+=" and invitationCode like '%"+invitationCode+"%'";
		}
		if(create_date!=null&&!create_date.equals("")){
			hql+=" and create_date like '%"+create_date+"%'";
		}
		return hql;
	}



	public List<Member> listAll() {
		return null;
	}



	public void save(Member t) {
		// TODO Auto-generated method stub
		
	}



	public void delete(Member t) {
		// TODO Auto-generated method stub
		
	}



	public Member getById(int id) {
		Session session=getSession();
		Member member=(Member)session.get(Member.class, id);
		return member;
	}



	public void update(Member member) {
		
	}


	@Override
	public List<Member> listAll(int id) {
		// TODO Auto-generated method stub
		return null;
	}


}
