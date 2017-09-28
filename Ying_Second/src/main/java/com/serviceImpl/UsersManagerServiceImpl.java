package com.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.bean.Member;
import com.bean.Page;
import com.bean.User_role;
import com.bean.Users;
import com.dao.UsersManagerDao;
import com.service.UsersManagerService;

@Service
public class UsersManagerServiceImpl implements UsersManagerService {

	@Autowired
	@Qualifier("usersManagerDaoImpl")
	private UsersManagerDao usersManagerDao;
	
	@Autowired
	private Page page;
	
	public List<Users> listMember(int currentPage,Map m,String type,Model model) {
		// TODO Auto-generated method stub
		String count=(String)this.usersManagerDao.count(m);
		this.page.setRows(Integer.parseInt(count));
		if("next".equals(type)&&currentPage<this.page.getAllPage()){
			currentPage=currentPage+1;
		}else if("last".equals(type)&&currentPage>1) {
			currentPage=currentPage-1;
		}
		model.addAttribute("currentPage",currentPage);
		return usersManagerDao.listMember(m,currentPage);
	}

	public void saveMember(Member m) {
		// TODO Auto-generated method stub
		this.usersManagerDao.saveMember(m);
	}

	public void deleteUser(int uid) {
		 this.usersManagerDao.deleteUser(uid);
	}

	public void updateMember(Member m) {
		// TODO Auto-generated method stub
		this.usersManagerDao.updateMember(m);
	}

	public Member getMember(int id) {
		// TODO Auto-generated method stub
		return this.usersManagerDao.getMember(id);
	}

	@Override
	public void updateUserRole(int uid, int rid) {
		// TODO Auto-generated method stub
		this.usersManagerDao.updateUserRole(uid,rid);
	}

	@Override
	public void saveUsers(Users users) {
		// TODO Auto-generated method stub
		this.usersManagerDao.saveUsers(users);
	}

	@Override
	public User_role getUR(int rid) {
		// TODO Auto-generated method stub
		return this.usersManagerDao.getUR(rid);
	}

}
