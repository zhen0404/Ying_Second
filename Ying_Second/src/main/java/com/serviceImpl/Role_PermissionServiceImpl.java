package com.serviceImpl;

import java.util.List;

import com.dao.Role_PermissionDao;
import com.service.Role_PermissionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class Role_PermissionServiceImpl implements Role_PermissionService {

	@Autowired
	@Qualifier("role_PermissionDaoImpl")
	private Role_PermissionDao role_per;
	
	public List r_plist(int rid) {
		
		return this.role_per.r_plist(rid);
		
	}

}
