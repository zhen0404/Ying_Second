package com.daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bean.Member_trade_record;
import com.bean.Subject;
import com.dao.WalletDao;

@Component
public class WalletDaoImpl implements WalletDao{
	
	@Autowired
	public SessionFactory sessionFactory;

	
	public Session getSession() {
		 return sessionFactory.getCurrentSession();
	}

	@Override
	public List<Member_trade_record> listAll() {
		String hql="from Member_trade_record";
		  Session session=getSession();
		  List<Member_trade_record> list=session.createQuery(hql).list();
		  return list;
	}

	@Override
	public List<Member_trade_record> query(String hql) {
		  Session session=getSession();
		  List<Member_trade_record> list=session.createQuery(hql).list();
		return list;
	}

}
