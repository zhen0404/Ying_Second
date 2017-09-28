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
import com.dao.CollegeDao;
import com.service.BaseService;
import com.service.CollegeService;

@Service
@Transactional
public class ClassifyService implements CollegeService<News_type> {

	
	@Autowired(required=true)
	@Qualifier(value="classifyDao")
	private CollegeDao<News_type> collegeDao;

	public List<News_type> listAll() {
		return null;
	}

	public void save(News_type news_type) {
		this.collegeDao.save(news_type);
		
	}

	public void delete(News_type news_type) {
		this.collegeDao.delete(news_type);
		
	}

	public News_type getById(int id) {
		return this.collegeDao.getById(id);
	}

	public void update(News_type news_type) {
		this.collegeDao.update(news_type);
		
	}

	public List<News_type> listAll(Map map) {
		return this.collegeDao.listAll(map);
	}

	public List<News_type> typeList() {
		
		return this.collegeDao.typeList();
	}

	public News_type getTypeId(int tid) {
		// TODO Auto-generated method stub
		return null;
	}

	

	

}
