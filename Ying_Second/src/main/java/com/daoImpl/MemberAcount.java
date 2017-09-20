package com.daoImpl;

import java.util.List;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bean.Member_account;
import com.dao.BaseDao;

/**
 * 资金信息
 * @author Maibenben
 *
 */
@Component
public class MemberAcount implements BaseDao<Member_account>{

	@Autowired
	private SessionFactory sf;
	
	public Session getSession(){
		return sf.getCurrentSession();
	}
	@Override
	public List<Member_account> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Member_account t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Member_account t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Member_account getById(int id) {
		String hql="from Member_account where member_id="+id;
		Session session=getSession();
		List<Member_account> list=session.createQuery(hql).list();
		if(list.size()>0){
			return list.get(0);
		}
		return null;
	}

	@Override
	public void update(Member_account t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Member_account> listAll(Map map) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Member_account> listAll(int id) {
		String hql="from Member_account where member_id="+id;
		Session session=getSession();
		List<Member_account> list=session.createQuery(hql).list();
		return list;
	}

}
