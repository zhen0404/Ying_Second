package com.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bean.News;
import com.dao.BaseDao;
import com.dao.NDao;
import com.service.BaseService;
import com.service.NService;

@Service
@Transactional
public class NewsService implements NService<News>{
	
	@Autowired
	@Qualifier("newsDao")
	private NDao<News> nDao;

	@Override
	public List<News> listAll() {
		return nDao.listAll();
	}

	@Override
	public void save(News t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(News t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public News getById(int id) {
		return nDao.getById(id);
	}

	@Override
	public void update(News t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<News> listAll(Map map) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<News> listAll(int id) {
		return nDao.listAll(id);
	}

}
