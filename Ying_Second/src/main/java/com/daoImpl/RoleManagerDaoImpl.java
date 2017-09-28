package com.daoImpl;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bean.Member;
import com.bean.Resources;
import com.bean.Roles;
import com.bean.User_role;
import com.dao.RoleManagerDao;

@Component
public class RoleManagerDaoImpl implements RoleManagerDao {

	@Autowired
	private SessionFactory sf;
	
	public Session getSession(){
		return sf.getCurrentSession();
	}
	public void saveRole(User_role m) {
		// TODO Auto-generated method stub
		getSession().save(m);
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
	public List<User_role> listRole(Map m, int currentPage) {
		// TODO Auto-generated method stub
		String hql="from User_role ";
		return getSession().createQuery(hql).setFirstResult((currentPage-1)*5).setMaxResults(5).list();
	}
	
	//查询板块信息
	public  List<Resources> ListAll() {
		Session session = getSession();
		List<Resources> UserRoleList = session.createQuery("from Resources").list();
		return UserRoleList;
	}
	
	//查询是否勾选
	public List ListAlltrue(int id) {
		String sql="select pid from role_Res where rid="+id;
		List UserRoleList=getSession().createSQLQuery(sql).list();
		return UserRoleList;
	}

     //根据用户名查询角色
     public  Set<String> ListAllByName(Object object) {
		Session session=getSession();
		String sql="select r.cname from users u,user_role r where u.rid=r.id "
				+ " and u.user_name= '"+object+"'";
		List<String> rnameList=session.createSQLQuery(sql).list();
		session.flush();
		Set< String > set=new HashSet<String>(rnameList);
		return set;
	}
     
   //查询板块信息
//   		public  List<Resources> ListAll() {
//   			System.out.println("开始查询");
//   			Session session = getSession();
//   			List<Resources> UserRoleList = session.createQuery("from Resources").list();
//   			System.out.println(UserRoleList.size()+"aaa");
//   			return UserRoleList;
//   		}
     
     public void save(Object...objects) {
			Session session = getSession();
			int id=(int) objects[1];
			delete(id);
			String[] sourceStrArray = ((String)objects[0]).split(",");
			for (int i = 0; i < sourceStrArray.length; i++) {
				int i1=(Integer.parseInt(sourceStrArray[i]));
				User_role userRole=(User_role)session.get(User_role.class, id);  
				Resources resources=(Resources)session.get(Resources.class,i1);
				userRole.getResour().add(resources);  
				resources.getResour().add(userRole);
			}
		}
     
     public void delete(int id) {
			Session session = getSession();
			String sql="delete  from role_Res where rid="+id;
			session.createSQLQuery(sql).executeUpdate();
			session.flush();
		}

}
