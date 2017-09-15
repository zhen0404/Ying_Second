package com.serviceImpl;

import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.bean.News;
import com.bean.News_type;
import com.dao.BaseDao;
import com.service.BaseService;

@Service
@Transactional
public class ClassifyService implements BaseService<News_type> {

	
	@Autowired(required=true)
	@Qualifier(value="classifyDao")
	private BaseDao<News_type> baseDao;

	public List<News_type> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public void save(News_type news_type) {
		this.baseDao.save(news_type);
		
	}

	public void delete(News_type news_type) {
		this.baseDao.delete(news_type);
		
	}

	public News_type getById(int id) {
	
		return this.baseDao.getById(id);
	}

	public void update(News_type news_type) {
		this.baseDao.update(news_type);
		
	}

	public List<News_type> listAll(Map map) {
		return this.baseDao.listAll(map);
	}
	

	

}
