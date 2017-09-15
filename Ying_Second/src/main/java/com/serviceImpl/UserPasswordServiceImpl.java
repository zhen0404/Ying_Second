package com.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.dao.UserPasswordDao;
import com.service.UserPasswordService;

@Service
public class UserPasswordServiceImpl implements UserPasswordService {

	@Autowired
	@Qualifier("userPasswordDaoImpl")
	private UserPasswordDao ud;
	
	public void updateUserPassword(String user_name, String ps) {
		// TODO Auto-generated method stub
		this.ud.updateUserPassword(user_name, ps);
	}

}
