package com.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.bean.Push_notice;

@Service
@Transactional
public interface GgManagerService {

	//查询所有公告，新闻
	public List<Push_notice>listSubject();
	//查询是否有该标题
	public List<Push_notice> listPush_notice(String hl);
	//根据id查询公告内容
	public List<Push_notice> chakan();
	public <T> T chakan(int id);
	//编辑公告
	public List<Push_notice> chakang();
	public <T> T chakang(int id);
	//添加公告
	public void save (Object...objects);
    //修改公告
	public List<Push_notice> updatelist();
	void updatelist(int id, String title, String content);
	//查询所有反馈意见表
	public List listfeedback();
	
}
