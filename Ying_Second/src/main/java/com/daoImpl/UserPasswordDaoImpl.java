package com.daoImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dao.UserPasswordDao;

@Component
public class UserPasswordDaoImpl implements UserPasswordDao {

	@Autowired
	private SessionFactory sf;
	
	public Session getSession(){
		return sf.getCurrentSession();
	}
	
	public void updateUserPassword(String user_name,String ps) {
		String sql="update users set password ='"+ps+"' where user_name='"+user_name+"'";
		getSession().createSQLQuery(sql).executeUpdate();
	}

}
