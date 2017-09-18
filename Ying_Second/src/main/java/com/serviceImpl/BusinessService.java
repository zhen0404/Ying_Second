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
import com.dao.CollegeDao;
import com.daoImpl.BusinessDao;
import com.service.BaseService;
import com.service.CollegeService;

@Service
@Transactional
public class BusinessService implements CollegeService<News> {

	@Autowired(required=true)
	@Qualifier(value="businessDao")
	private CollegeDao<News> collegeDao ;

	public List<News_type> typeList() {
		return this.collegeDao.typeList();
	}
	
	
	public List<News> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public void save(News news) {
		this.collegeDao.save(news);
		
	}

	public void delete(News news) {
		this.collegeDao.delete(news);
		
	}

	public News getById(int id) {
		return  this.collegeDao.getById(id);
		
	}

	public void update(News news) {
		this.collegeDao.update(news);
		
	}

	public List<News> listAll(Map map) {
		return this.collegeDao.listAll(map);
	}
}
