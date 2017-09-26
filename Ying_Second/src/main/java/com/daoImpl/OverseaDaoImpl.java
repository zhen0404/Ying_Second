package com.daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bean.Oversea_config;
import com.bean.Oversea_config_subscribe;
import com.bean.Subject;
import com.dao.OverseaDao;

@Component
public class OverseaDaoImpl implements OverseaDao<Oversea_config>{
	
			@Autowired
			public SessionFactory sessionFactory;
			
			public Session getSession() {
				 return sessionFactory.getCurrentSession();
			}
	
			public List<Oversea_config> listAll() {
				Session session=getSession();
				String hql ="from Oversea_config";
				List list=session.createQuery(hql).list();
				return list;
			}

			public List<Oversea_config_subscribe> All(int id) {
				Session session=getSession();
				String hql ="from Oversea_config_subscribe where id="+id;
				List list=session.createQuery(hql).list();
				return list;
			}

			public void overAdd(Oversea_config oc) {
				 Session session=getSession();
			     session.save(oc);
				
			}

			public Oversea_config getById(int id) {
				Oversea_config oc=(Oversea_config)this.getSession().get(Oversea_config.class, id);
				return oc;
			}

			public void updateOver(Oversea_config oc) {
				 Session session=getSession();
			     session.update(oc);
			}

}
