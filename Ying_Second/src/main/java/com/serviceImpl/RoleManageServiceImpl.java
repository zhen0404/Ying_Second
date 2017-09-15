package com.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.bean.Member;
import com.bean.Page;
import com.bean.Roles;
import com.dao.RoleManagerDao;
import com.service.RoleManageService;

@Service
public class RoleManageServiceImpl implements RoleManageService {

	@Autowired
	@Qualifier("roleManagerDaoImpl")
	private RoleManagerDao roleManageDao;
	
	@Autowired
	private Page page;
	
	public List<Roles> listRole(int currentPage, Map m, String type, Model model) {
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

	public void saveRole(Member m) {
		// TODO Auto-generated method stub
		
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

}
