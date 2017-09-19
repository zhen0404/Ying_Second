package com.daoImpl;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bean.User;
import com.bean.Users;
import com.dao.BackDaskLoginDao;
import com.dao.BaseDao;

@Component
public class BackDeskLoginDaoImpl implements BackDaskLoginDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public Session getsession(){
		return sessionFactory.openSession();
	}
	
	
	public Set<String> getRolesByName(String username) {
		Set<String> roles=new HashSet();
		String sql = "select rname from roles where id = (select identity from users where user_name='"+username+"')";
		List rlist=getsession().createSQLQuery(sql).list();
		for(int i=0;i<rlist.size();i++){
			roles.add((String) rlist.get(i));
		}
		return roles;
	}

	public Set<String> getPermissions(String userName) {
		Set<String> permission=new HashSet();
		String sql = "select pname from permission where id in (SELECT pid from role_per where rid = (select id from roles where id = (select identity from users where user_name='"+userName+"')))";
		List plist=getsession().createSQLQuery(sql).list();
		for(int i=0;i<plist.size();i++){
			permission.add((String) plist.get(i));
		}
		return permission;
	}
	
	
	public int getIdByUname(String uname){
		String sql="select id from users where user_name='"+uname+"'";
		List ilist=getsession().createSQLQuery(sql).list();
		for(int i=0;i<ilist.size();i++){
			return (Integer) ilist.get(i);
		}
		return -1;
	}
	
	public Users getUserBuUname(String uname){
//		return  (Users) getsession().get(Users.class, getIdByUname(uname));
//		Session session=getsession();
//		String hql="from Users ";
//		List<Users> list=session.createQuery(hql).list();
//		if(list.size()>0){
//			return list.get(0);
//		}
//		return null;
		Session session=getsession();
		System.out.println("uname:"+uname);
		String hql="from Users u where u.user_name='"+uname+"'";
		List<Users> list=session.createQuery(hql).list();
		System.out.println(list.size());
		if(list.size()>0){
			return list.get(0);
		}
		return null;
	}

}
