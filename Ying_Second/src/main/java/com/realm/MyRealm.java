package com.realm;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.bean.Users;
import com.dao.BackDaskLoginDao;

public class MyRealm extends AuthorizingRealm{

	@Autowired
	@Qualifier("backDeskLoginDaoImpl")
	private BackDaskLoginDao userdao;
	
	/**
	 * 赋予用户权限，角色
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		String userName=(String)principals.getPrimaryPrincipal();
		SimpleAuthorizationInfo authoriza=new SimpleAuthorizationInfo();
		authoriza.setRoles(userdao.getRolesByName(userName));
		authoriza.setStringPermissions(userdao.getPermissions(userName));
		return authoriza;
	}

	/**
	 *验证用户身份
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		String userName=(String)token.getPrincipal();
		Users users=userdao.getUserBuUname(userName);
		if(users!=null){
			AuthenticationInfo authentic=new SimpleAuthenticationInfo(users.getUser_name(),users.getPassword(),"xx");
			return authentic;
		}
		return null;
	}

}	
