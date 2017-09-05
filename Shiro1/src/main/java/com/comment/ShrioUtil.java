package com.comment;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;

public class ShrioUtil {

	public static Subject login(String configFile,String userName,String password){
		// 读取配置文件，初始化securityManager工厂
		Factory<SecurityManager> factory = new IniSecurityManagerFactory(configFile);
		// 获取securityManager实例
		SecurityManager secutityManager = factory.getInstance();
		// 把securityManager实例绑定到securityUtils
		SecurityUtils.setSecurityManager(secutityManager);
		// 得到当前用户
		Subject currentUser = SecurityUtils.getSubject();
		// 创建token令牌 ，用户名、密码
		UsernamePasswordToken token = new UsernamePasswordToken(userName, password);
		try {
			currentUser.login(token);
			System.out.println("认证成功");
		} catch (AuthenticationException e) {
			e.printStackTrace();
			System.out.println("认证失败");
		}
		return currentUser;		
	}
	
}
