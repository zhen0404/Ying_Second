package com.daoImpl;

import java.util.List;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bean.Member;
import com.bean.Roles;
import com.dao.RoleManagerDao;

@Component
public class RoleManagerDaoImpl implements RoleManagerDao {

	@Autowired
	private SessionFactory sf;
	
	public Session getSession(){
		return sf.getCurrentSession();
	}
	public void saveRole(Member m) {
		// TODO Auto-generated method stub
		
	}

	public void deleteRole(int id) {
		// TODO Auto-generated method stub
		
	}

	public void updateRole(Member m) {
		// TODO Auto-generated method stub
		
	}

	public Member getRole(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public String count(Map map) {
		String sql="select count(*) from member where 0=0 ";
		Session session=getSession();
		return session.createSQLQuery(sql).uniqueResult().toString();
	}
	public List<Roles> listRole(Map m, int currentPage) {
		// TODO Auto-generated method stub
		String hql="from Roles ";
		return getSession().createQuery(hql).setFirstResult((currentPage-1)*5).setMaxResults(5).list();
	}

}
