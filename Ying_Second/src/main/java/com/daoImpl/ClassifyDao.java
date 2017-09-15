package com.daoImpl;

import java.util.List;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bean.News_type;
import com.bean.Page;
import com.dao.BaseDao;
@Component
public class ClassifyDao  implements BaseDao<News_type> {

	@Autowired
	private SessionFactory sessionFactory;

	public Session getSession(){
		return sessionFactory.getCurrentSession();
	}
	
	public List<News_type> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public void save(News_type news_type) {
		Session session=getSession();
		session.save(news_type);
		
	}

	public void delete(News_type news_type) {
		Session session=getSession();
		session.delete(news_type);
		
	}

	public News_type getById(int id) {
		Session session=getSession();
		News_type news_type=(News_type)session.get(News_type.class,id);
		return news_type;
	}

	public void update(News_type news_type) {
		Session session=getSession();
		session.update(news_type);
		
	}

	public List<News_type> listAll(Map map) {
		String hql="from News_type  order by addTime desc ";
		Page pb=(Page)map.get("pb");
		int currentPage=pb.getCurrentPage();
		int size=pb.getSize();
		String flag=(String)map.get("flag");
		int count=getCount(map);
		pb.setRows(count);
		if(flag!=null){
			if("next".equals(flag)){
				if(currentPage+1>pb.getAllPage()){
					currentPage=pb.getAllPage();
				}else{
					currentPage=currentPage+1;
				}
			}
			if("up".equals(flag)){
				if(currentPage-1<1){
					currentPage=1;
				}else{
					currentPage=currentPage-1;
				}
			}
			if("first".equals(flag)){
				currentPage=1;
			}
			if("last".equals(flag)){
				currentPage=pb.getAllPage();
			}
		}
		pb.setCurrentPage(currentPage);
		Session session=getSession();
		hql=listDataHql(map, hql);
		List<News_type> list=session.createQuery(hql).setFirstResult((currentPage-1)*size).setMaxResults(size).list();
		return list;
	}

	
	public String listDataHql(Map map,String hql){
		String tname=(String)map.get("tname");
		if(tname!=null&&!tname.equals("")){
			hql+=" and name like '%"+tname+"%'";
		}
		return hql;
	}
	
	public int getCount(Map map){
		String sql="select count(*) from News_type where 0=0 ";
		sql=listDataHql(map, sql);
		Session session=getSession();
		int count=Integer.valueOf(session.createSQLQuery(sql).uniqueResult().toString());
		return count;
	}
}
