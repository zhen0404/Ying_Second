package com.daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dao.Role_PermissionDao;

@Component
public class Role_PermissionDaoImpl implements Role_PermissionDao {

	@Autowired
	private SessionFactory sf;
	
	public Session getSession(){
		return sf.getCurrentSession();
	}
	
	public List r_plist(int rid) {
		// TODO Auto-generated method stub
		List r_plist=getSession().createSQLQuery("select * from role_per where rid="+rid+"").list();
		return r_plist;
	}

}
