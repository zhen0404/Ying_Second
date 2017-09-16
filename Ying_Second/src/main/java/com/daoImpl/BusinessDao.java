package com.daoImpl;

/**
 * ��ѧԺ����
 */
import java.util.List;
import java.util.Map;

import org.aspectj.weaver.ast.And;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bean.Member;
import com.bean.News;
import com.bean.News_type;
import com.bean.Page;
import com.dao.BaseDao;

@Component
public class BusinessDao  implements BaseDao<News> {
	@Autowired
	private SessionFactory sessionFactory;

	public Session getSession(){
		return sessionFactory.getCurrentSession();
	}

	public List<News> listAll() {
		return null;
	}

	public List<News> listAll(Map map) {
		String hql="from News  order by addTime desc ";
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
		List<News> list=session.createQuery(hql).setFirstResult((currentPage-1)*size).setMaxResults(size).list();
		return list;
	}


	
	
	
	public void save(News news) {
		Session session=getSession();
		session.save(news);
		
	}

	public void delete(News news) {
		Session session=getSession();
		session.delete(news);
		
	}

	public News getById(int id) {
		Session session=getSession();
		News news=(News)session.get(News.class,id);
		return news;
	}

	public void update(News news) {
		Session session=getSession();
		session.update(news);
		
	}

	public String listDataHql(Map map,String hql){
		String qname=(String)map.get("qname");
		if(qname!=null&&!qname.equals("")){
			hql+=" and title like '%"+qname+"%'" ;
		}
		return hql;
	}
	
	public int getCount(Map map){
		String sql="select count(*) from News where 0=0 ";
		sql=listDataHql(map, sql);
		Session session=getSession();
		int count=Integer.valueOf(session.createSQLQuery(sql).uniqueResult().toString());
		return count;
	}
	
	


	
}