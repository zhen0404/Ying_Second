package com.daoImpl;

import java.util.List;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bean.Member;
import com.dao.UsersManagerDao;

@Component
public class UsersManagerDaoImpl implements UsersManagerDao {

	@Autowired
	private SessionFactory sf;
	
	public Session getSession(){
		return sf.getCurrentSession();
	}
	
	public void saveMember(Member m) {
		// TODO Auto-generated method stub
		getSession().save(m);
	}

	public void deleteMember(int id) {
		// TODO Auto-generated method stub
		getSession().delete(getMember(id));
	}

	public void updateMember(Member m) {
		// TODO Auto-generated method stub
		getSession().update(m);
	}

	public Member getMember(int id) {
		// TODO Auto-generated method stub
		return (Member) getSession().get(Member.class, id);
	}

	public List<Member> listMember(Map m,int currentPage) {
		// TODO Auto-generated method stub
		String hql="from Member where 0=0 ";
		hql=getHql(hql,m);
		List<Member> mlist=getSession().createQuery(hql).setFirstResult((currentPage-1)*5).setMaxResults(5).list();
		return mlist;
	}
	
	public String getHql(String hql,Map m){
		String member_name=(String) m.get("member_name");//
		String mobile_phone=(String) m.get("mobile_phone");
		String name=(String) m.get("name");//
		String invitationCode =(String) m.get("invitationCode");
		String create_date=(String) m.get("create_date");
		if(member_name!=null&&!"".equals(member_name)){
			hql+=hql+" and member_name='"+member_name+"'";
		}
		if(mobile_phone!=null&&!"".equals(mobile_phone)){
			hql+=hql+" and mobile_phone='"+mobile_phone+"'";
		}
		if(name!=null&&!"".equals(name)){
			hql+=hql+" and name='"+name+"'";
		}
		if(invitationCode!=null&&!"".equals(invitationCode)){
			hql+=hql+" and invitationCode='"+invitationCode+"'";
		}
		if(create_date!=null&&!"".equals(create_date)){
			hql+=hql+" and create_date='"+create_date+"'";
		}
		return hql;
	}
	
	public Object count(Map map){
		String sql="select count(*) from member where 0=0 ";
		sql=getHql(sql, map);
		Session session=getSession();
		return session.createSQLQuery(sql).uniqueResult().toString();
	}
	
	public String listDataHql(String hql,Map map){
		String qname=(String)map.get("qname");
		if(qname!=null&&!qname.equals("")){
			hql+=" and name like '%"+qname+"%'";
		}
		return hql;
	}

}
