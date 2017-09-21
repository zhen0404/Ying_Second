package com.dao;

import java.util.List;

import com.bean.Push_notice;

public interface GgManagerDao {

	public List ListAll() ;

	public List Feed();
	
	//查询是否有该标题
	public List<Push_notice> list(String hql);
	//根据id查询公告内容
			public Push_notice chakan(int id);
	//编辑公告
	public Push_notice chakang(int id);
	//添加
		public void save(Object...objects);
   //修改
		public void updatelist(int id,String title,String content);
}
