package com.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.bean.Push_notice;
import com.dao.GgManagerDao;
import com.service.GgManagerService;

@Service
public class GgManagerServiceImpl implements GgManagerService {

	@Autowired
	@Qualifier("ggManagerDaoImpl")
	private GgManagerDao manager;
	
	//查询所有公告，新闻
	public List<Push_notice> listSubject(){
		return manager.ListAll();
}
	//查询所有反馈意见表
	
	public List listfeedback() {
		return manager.Feed();
	}

	public List<Push_notice> listPush_notice(String hql) {
		System.out.println("1");
		return this.manager.list(hql);
	}

	//根据ID查询公告内容

	public Push_notice chakan(int id) {
		return manager.chakan(id);
	}
	//编辑公告
	public Push_notice chakang(int id) {
		return manager.chakan(id);
	}

	public List<Push_notice> chakan() {
		return null;
	}

	public List<Push_notice> chakang() {
		// TODO Auto-generated method stub
		return null;
	}
	//添加
		public void save(Object... objects) {
			manager.save(objects);
			System.out.println(objects);
		}
    

		public List<Push_notice> updatelist() {
			// TODO Auto-generated method stub
			return null;
		}
		//修改
	public void updatelist(int id, String title, String content) {
		this.manager.updatelist(id, title,content);

	}

	


}
