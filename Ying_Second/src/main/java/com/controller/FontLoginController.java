package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bean.Member;
import com.service.FontLoginService;
import com.util.CryptographyUtil;

@Controller
@RequestMapping("font")
public class FontLoginController {

	@Autowired
	@Qualifier("fontLoginServiceImpl")
	private FontLoginService fontloginS;
	
	//前台确认登录
	@RequestMapping("login")
	public String login(String mobilePhone,String password,HttpSession session){
		Member member=this.fontloginS.getMember(mobilePhone,CryptographyUtil.md5(password, "javamd"));
		session.setAttribute("member", member);
		String url=(String) session.getAttribute("url");
		System.out.println("url:"+url);
		if(member!=null){
			if("toBuy".equals(url)){
				return "/Ying_Second/frontLast";
			}else if("myadd".equals(url)){
				return "redirect:/"+url;
			}
			return "font_desk/frontHome";
		}
		return "font_desk/frontIframeLogin";
	}
	
	//手机号验证
	@RequestMapping("fontSignPhone")
	public void signPhone(String phone,HttpServletResponse response){
		PrintWriter pw;
		Member member=this.fontloginS.getMemberByPhone(phone);
		try {
			pw = response.getWriter();
			if(member!=null){
				pw.print("no");
				pw.flush();
				pw.close();
			}else{
				pw.print("yes");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//前台注册
	@RequestMapping("sureFontSign")
	public void sureFontSign(Member member,HttpServletResponse response){
		System.out.println("Sign");
		member.setIdentity(this.fontloginS.getIdentity());
		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String date=df.format(new Date());
		try {
			PrintWriter pw=response.getWriter();
			member.setCreate_date(df.parse(date));
			member.setUpdate_date(df.parse(date));
			member.setSalt("javamd");
			member.setPassword(CryptographyUtil.md5(member.getPassword(), "javamd"));
			this.fontloginS.saveMember(member);
			pw.print("yes");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
	
}
