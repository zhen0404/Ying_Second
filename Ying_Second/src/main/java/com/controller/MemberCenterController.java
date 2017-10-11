package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bean.Member;
import com.bean.Member_account;
import com.bean.Member_bankcards;
import com.bean.Member_trade_record;
import com.bean.Member_withdraw_record;
import com.bean.Sys_region;
import com.service.FrontProductService;
import com.service.MemberCenterService;
import com.service.TouziService;

@Component
@RequestMapping("memberCenter")
public class MemberCenterController {
	          
		  @Autowired
		  @Qualifier("touziServiceImpl")
		  private TouziService touziServiceImpl;
		  
		  @Autowired
		  @Qualifier("memberCenterServiceImpl")
		  private MemberCenterService mcs;
		  
		  @Autowired
		  @Qualifier("frontProductServiceImpl")
		  private FrontProductService frontProductServiceImpl;
		  
		  @RequestMapping("list")
		  public String listTouziAll(HttpSession se,Model model,HttpServletRequest he){
			 Member member=(Member)se.getAttribute("member");
			 int id=member.getId();
             //投资记录
			 List list=touziServiceImpl.listAll(id);
			  model.addAttribute("List", list);
			  he.setAttribute("size", list.size());
			  //预约记录
			  List list2=touziServiceImpl.listAllyu(id);
			  model.addAttribute("List2", list2);
			  he.setAttribute("size2", list2.size());
			    return "font_desk/memberMain/touZi";
		  }
		  
		  @RequestMapping("cz")
		  public String Cz(HttpSession se,Model model){
			 Member member=(Member)se.getAttribute("member");
			 int id=member.getId();
			 List list=touziServiceImpl.listAllchong(id);
			 model.addAttribute("List",list);
			  return "font_desk/memberMain/ChongZi";
		  }
		  
		  @RequestMapping("tiKuan")
		  public String tiKuan(HttpSession se,Model model){
			 Member member=(Member)se.getAttribute("member");
			 int id=member.getId();
			 List list=touziServiceImpl.listAllti(id);
			 model.addAttribute("List",list);
			  return "font_desk/memberMain/tikuan";
		  }
		  
		  @RequestMapping("tiyanj")
		  public String tiyanj(HttpSession se,Model model){
			 Member member=(Member)se.getAttribute("member");
			 int id=member.getId();
			 List list=touziServiceImpl.listAlltiyanj(id);
			 model.addAttribute("List",list);
			  return "font_desk/memberMain/tiyanjin";
		  }
	      
		  @RequestMapping("updateMemberTps")
			public String updateMemberTps(String ps,HttpSession session){
				Member member=(Member) session.getAttribute("member");
				member.setWithdraw_password(ps);
				this.mcs.updateps(member);
				session.removeAttribute("member");
				return "redirect:/fontmember/tikuan";
			}
		  
		  @RequestMapping("updateMemberps")
			public String updateMemberPs(String ps,HttpSession session){
				Member member=(Member) session.getAttribute("member");
				member.setPassword(ps);
				this.mcs.updateps(member);
				session.removeAttribute("member");
				return "redirect:/frontIframeLogin";
			}
		  
		  @RequestMapping("boundCard")
			public String boundCard(Member_bankcards mb,String province,String shi,String xiang){
				mb.setDelflag(0);
				mb.setType("ZSYH");
				Date date=new Date();
				SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				try {
					mb.setCreate_date(sdf.parse(sdf.format(date)));
					mb.setUpdate_date(sdf.parse(sdf.format(date)));
					Sys_region sr=this.mcs.getRegion(Integer.parseInt((province)));
					province=sr.getName();
					sr=this.mcs.getRegion(Integer.parseInt(shi));
					shi=sr.getName();
					sr=this.mcs.getRegion(Integer.parseInt(xiang));
					xiang=sr.getName();
					mb.setCardaddress(province+"-"+shi+"-"+xiang);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				this.mcs.boundCard(mb);
				return "redirect:/fontmember/czjl";
			}
		  
		  @RequestMapping("boundSheng")
			public void getBoundSheng(HttpServletResponse response){
			    List<Sys_region> sList=this.mcs.getSheng();
			    PrintWriter pw;
				try {
					pw = response.getWriter();
					 JSONArray json = new JSONArray();
			            for(int i=0;i<sList.size();i++){
			                JSONObject jo = new JSONObject();
			                jo.put("id", sList.get(i).getId());
			                jo.put("name", sList.get(i).getName());
			                json.put(jo);
			            }
			        System.out.println(json);
					pw.print(json);
					pw.flush();
					pw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			@RequestMapping("boundShi")
			@ResponseBody
			public List<Sys_region> getBoundShi(HttpServletResponse response,int sid){
				return this.mcs.getShi(sid);
			}
			
			@RequestMapping("boundXiang")
			@ResponseBody
			public List<Sys_region> getBoundXiang(HttpServletResponse response,int shid){
				return this.mcs.getxiang(shid);
			}
			
			@RequestMapping("idcardcheck")
			public void idcardcheck(String idcard,HttpServletResponse res){
				List<Member> mList=this.mcs.idcheck(idcard);
				try {
					PrintWriter pw=res.getWriter();
					if(mList.size()>0){
						pw.print("no");
					}else{
						pw.println("yes");
					}
					pw.flush();
					pw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			@RequestMapping("bankCardCheck")
			public void bankCardCheck(String bankCark,HttpServletResponse res){
				List<Member_bankcards> mList=this.mcs.bankCarkcheck(bankCark);
				try {
					PrintWriter pw=res.getWriter();
					if(mList.size()>0){
						pw.print("no");
					}else{
						pw.println("yes");
					}
					pw.flush();
					pw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			//校验提款密码
			@RequestMapping("sureTikuan")
			public String passwordCheck(Member_trade_record memberTradeRecord,Member_withdraw_record mwr,String ps,HttpServletResponse res,HttpSession session,String money){
				Member member=(Member) session.getAttribute("member");
				if(member!=null){
					Member_account memberAccount=(Member_account) session.getAttribute("memberAccount");
					if(memberAccount==null){
						memberAccount=this.frontProductServiceImpl.ListAllByMemberId(member.getId());
					}
					//修改用户余额
					memberAccount.setUseable_balance(memberAccount.getUseable_balance()-Integer.parseInt(money));
					this.frontProductServiceImpl.updateMemberAccount(memberAccount);
					
					Date date=new Date();
					SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
					
					//添加提现记录
//					18
					SimpleDateFormat sdf1=new SimpleDateFormat("yyyyMMddHHmmss");
					String serial_number=sdf1.format(date)+(Math.random()*9999+10000);
					mwr.setSerial_number(serial_number);
					mwr.setMember_id(member.getId());
					mwr.setAmount(Integer.parseInt(money));
					
					//查询绑卡信息
					List sList=this.mcs.bankCark(member.getId());
					Member_bankcards mb=(Member_bankcards) sList.get(0);
					
					mwr.setBank_name(mb.getType());
					mwr.setBank_card(mb.getCard_no());
					mwr.setDelFlag(0);
					mwr.setCardaddress(mb.getCardaddress());
					try {
						mwr.setCreate_date(sdf.parse(sdf.format(date)));
						mwr.setUpdate_date(sdf.parse(sdf.format(date)));
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					//添加交易记录
					memberTradeRecord.setMember(member);
					memberTradeRecord.setTrade_no(serial_number);
					memberTradeRecord.setTrade_name("提现");
					memberTradeRecord.setCounterpart("");
					memberTradeRecord.setAmount(Integer.parseInt(money));
					memberTradeRecord.setTrade_type("MOBILE_RECHARGE");
					memberTradeRecord.setFund_flow(0);
					memberTradeRecord.setTrade_status(0);
					memberTradeRecord.setExt_field_1("扩展1");
					memberTradeRecord.setExt_field_2("扩展2");
					memberTradeRecord.setExt_field_3("扩展3");
					try {
						memberTradeRecord.setCreate_date(sdf.parse(sdf.format(date)));
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					try {
						memberTradeRecord.setUpdate_date(sdf.parse(sdf.format(date)));
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					this.frontProductServiceImpl.saveMemberTradeRecord(memberTradeRecord);
					
				}else{
					//跳转到登录页面
					return "redirect:/frontIframeLogin";
				}
				return "redirect:/Ying_Second/memberCenter/tiKuan";
			}
               
}
