package com.serviceImpl;

import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.bean.Member;
import com.bean.News;
import com.bean.News_type;
import com.dao.BaseDao;
import com.daoImpl.BusinessDao;
import com.service.BaseService;

@Service
@Transactional
public class BusinessService implements BaseService<News> {

	@Autowired(required=true)
	@Qualifier(value="businessDao")
	private BaseDao<News> baseDao;
	
	public List<News> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public void save(News news) {
		this.baseDao.save(news);
		
	}

	public void delete(News news) {
		this.baseDao.delete(news);
		
	}

	public News getById(int id) {
		return  this.baseDao.getById(id);
		
	}

	public void update(News news) {
		this.baseDao.update(news);
		
	}

	public List<News> listAll(Map map) {
		return this.baseDao.listAll(map);
	}
}
