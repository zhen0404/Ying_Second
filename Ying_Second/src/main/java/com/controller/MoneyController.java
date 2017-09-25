package com.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bean.Member;
import com.bean.Member_account;
import com.bean.Member_deposit_record;
import com.service.FrontProductService;
import com.service.MemberCenterService;

@Controller
@RequestMapping("money")
public class MoneyController {

	@Autowired
	@Qualifier("frontProductServiceImpl")
	private FrontProductService frontProductServiceImpl;
	
	@Autowired
    @Qualifier("memberCenterServiceImpl")
    private MemberCenterService mcs;
	
	@RequestMapping("index")
	public String index(){
		return "font_desk/money_deal/index";
	}
	
	@RequestMapping("notify_url")
	public String notify_url(HttpSession session,Member_deposit_record mdr){
		return_url(session, mdr);
		return "redirect:/Ying_Second/memberCenter/cz";
	}
	
	@RequestMapping("return_url")
	public String return_url(HttpSession session,Member_deposit_record mdr){
		Member member=(Member) session.getAttribute("member");
		if(member==null){
			//跳转到登录页面
			return "redirect:/frontIframeLogin";
		}else{
			//查询用户的余额
			Member_account memberAccount=(Member_account) session.getAttribute("memberAccount");
			if(memberAccount==null){
				memberAccount=this.frontProductServiceImpl.ListAllByMemberId(member.getId());
			}
			//修改用户余额
			memberAccount.setUseable_balance(memberAccount.getUseable_balance()+Integer.parseInt((String)session.getAttribute("chongMoney")));
			this.frontProductServiceImpl.updateMemberAccount(memberAccount);
			//修改充值信息的状态
			mdr=(Member_deposit_record) session.getAttribute("mdr");
			mdr.setStatus(1);
			Date date=new Date();
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			try {
				mdr.setUpdate_date(sdf.parse(sdf.format(date)));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return "redirect:/Ying_Second/memberCenter/cz";
	}
	
	/**
	 * 
	 * @param WIDout_trade_no 商户订单号
	 * @param WIDtotal_amount 充值金额
	 * @return
	 */
	@RequestMapping("pay")
	public String pay(Member_deposit_record mdr,String WIDout_trade_no,String WIDtotal_amount,HttpSession session){
		Member member=(Member) session.getAttribute("member");
		if(member==null){
			//跳转到登录页面
			return "redirect:/frontIframeLogin";
		}else{
			session.setAttribute("chongMoney", WIDtotal_amount);
			mdr.setAmount(Integer.parseInt(WIDtotal_amount));
			mdr.setSerial_number("TZSY201601191"+WIDout_trade_no);
			mdr.setMember_id(member.getId());
			mdr.setStatus(0);
			mdr.setPay_channel_name("支付宝充值");
			mdr.setDelFlag(0);
			mdr.setPay_channel_order_no(WIDout_trade_no);
			Date date=new Date();
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			try {
				mdr.setCreate_date(sdf.parse(sdf.format(date)));
				mdr.setUpdate_date(sdf.parse(sdf.format(date)));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			session.setAttribute("mdr", mdr);
			//添加充值信息
			this.mcs.saveMoneyRecord(mdr);
		}
		return "font_desk/money_deal/alipay";
	}
}
