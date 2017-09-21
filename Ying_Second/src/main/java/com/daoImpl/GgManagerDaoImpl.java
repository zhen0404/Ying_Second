package com.daoImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bean.Push_notice;
import com.dao.GgManagerDao;

@Component
public class GgManagerDaoImpl implements GgManagerDao  {

	@Autowired
	public SessionFactory sessionFactory;
	
	public Session getSession(){
		return this.sessionFactory.getCurrentSession();
	}
	//查询所有公告，新闻
	public List ListAll() {
		Session session = getSession();
		String hql="from Push_notice";
		 List list =session.createQuery(hql).list();
		return list;
	}
	//查询所有反馈意见表
	public List Feed(){
		Session session = getSession();
		StringBuffer buffer = new StringBuffer();
		buffer.append(" from  Feedback  u  inner  join fetch u.member ");
		Query query = session.createQuery(buffer.toString());
		List list = query.list();
		System.out.println(list.size());
		return list;

		
	}
	//查询是否有该标题
	public List<Push_notice> list(String hql){
		Session session=getSession();
		List list=session.createQuery(hql).list();
		return list;
	}
	//根据id查询公告内容
			public Push_notice chakan(int id){
				Session session=getSession();
				Push_notice pushNotice = (Push_notice) session.get(Push_notice.class, id);
				return pushNotice;
	}
	//编辑公告
	public Push_notice chakang(int id){
		Session session=getSession();
		Push_notice pushNotice = (Push_notice) session.get(Push_notice.class, id);
		return pushNotice;
	}
	//添加
		public void save(Object...objects){
			Session session=getSession();
			session.save(objects[0]);
		}
   //修改
		public void updatelist(int id,String title,String content){
			Session session=getSession();
			String hql="update push_notice user set user.title='"+title+"', user.content='"+content+"' where user.id="+id;
			System.out.println(title+content);
			session.createSQLQuery(hql).executeUpdate();
		}
}
