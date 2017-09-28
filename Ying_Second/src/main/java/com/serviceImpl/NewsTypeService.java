package com.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bean.News_type;
import com.dao.BaseDao;
import com.service.BaseService;

@Service
@Transactional
public class NewsTypeService implements BaseService<News_type>{
	
	@Autowired
	@Qualifier("newsTypeDao")
	private BaseDao<News_type> baseDao;

	@Override
	public List<News_type> listAll() {
		return baseDao.listAll();
	}

	@Override
	public void save(News_type t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(News_type t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public News_type getById(int id) {
		return baseDao.getById(id);
	}

	@Override
	public void update(News_type t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<News_type> listAll(Map map) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<News_type> listAll(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
