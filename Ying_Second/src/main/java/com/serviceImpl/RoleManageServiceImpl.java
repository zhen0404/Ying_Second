package com.serviceImpl;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.bean.Resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.bean.Member;
import com.bean.Page;
import com.bean.Roles;
import com.bean.User_role;
import com.dao.RoleManagerDao;
import com.service.RoleManageService;

@Service
public class RoleManageServiceImpl implements RoleManageService {

	@Autowired
	@Qualifier("roleManagerDaoImpl")
	private RoleManagerDao roleManageDao;
	
	@Autowired
	private Page page;
	
	public List<User_role> listRole(int currentPage, Map m, String type, Model model) {
		// TODO Auto-generated method stub
		String count=(String)this.roleManageDao.count(m);
		this.page.setRows(Integer.parseInt(count));
		if("next".equals(type)&&currentPage<this.page.getAllPage()){
			currentPage=currentPage+1;
		}else if("last".equals(type)&&currentPage>1) {
			currentPage=currentPage-1;
		}
		model.addAttribute("currentPage",currentPage);
		return roleManageDao.listRole(m,currentPage);
	}

	public void saveRole(User_role m) {
		// TODO Auto-generated method stub
		this.roleManageDao.saveRole(m);
	}

	public void deleteRole(int id) {
		// TODO Auto-generated method stub
		
	}

	public void updateRole(Member m) {
		// TODO Auto-generated method stub
		
	}

	public Roles getRole(int id) {
		// TODO Auto-generated method stub
		return null;
	}

//	public List<User_role> ListAll() {
//		List<User_role> UserRoleList=roleManageDao.ListAll();
//		return UserRoleList;
//	}

	@Override
	public List ListAlltrue(int id) {
		// TODO Auto-generated method stub
		List UserRoleList=roleManageDao.ListAlltrue(id);
		return UserRoleList;
	}

	@Override
	public Set<String> ListAllByName(Object object) {
		// TODO Auto-generated method stub
		Set<String> set=roleManageDao.ListAllByName(object);
		return set;
	}

	@Override
	public List<Resources> ListAll(Object...objects) {
		List<Resources> UserResources=roleManageDao.ListAll();
		return UserResources;
	}

	@Override
	public void save(Object... objects) {
		// TODO Auto-generated method stub
		roleManageDao.save(objects);
	}

}
