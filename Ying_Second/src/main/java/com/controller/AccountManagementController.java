package com.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bean.Financial_planner;
import com.bean.Member;
import com.bean.Member_account;
import com.bean.Member_deposit_record;
import com.bean.Member_trade_record;
import com.bean.Member_withdraw_record;
import com.bean.Subject_purchase_record;
import com.service.BaseService;

/**
 * 账号管理
 * @author Maibenben
 * @param <T>
 *
 */
@Controller
@RequestMapping("/account")
public class AccountManagementController {
	
	
	@Autowired
	@Qualifier("accountManagementService")
	private BaseService<Member> ambaseService;
	@Autowired
	@Qualifier("memberAcountService")
	private BaseService<Member_account> mabaseService;
	@Autowired
	@Qualifier("financialPlannerAuditService")
	private BaseService<Financial_planner> fpbaseService;
	@Autowired
	@Qualifier("sub_pur_ReService")
	private BaseService<Subject_purchase_record> sprbaseService;
	@Autowired
	@Qualifier("memberWithdrawRecordService")
	private BaseService<Member_withdraw_record> mwrbaseService;
	@Autowired
	@Qualifier("memberDepositRecordService")
	private BaseService<Member_deposit_record> mdrbaseService;
	@Autowired
	@Qualifier("member_trade_recordService")
	private BaseService<Member_trade_record> mtrbaseService;
	
	
	@RequestMapping("/list")
	public String listMember(Model model,String member_name,
			String name,String mobile_Phone,
			String identity,String invitationCode,String create_date){
		Map map=new HashMap();
		map.put("member_name", member_name);
		map.put("name", name);
		map.put("mobile_Phone", mobile_Phone);
		map.put("identity", identity);
		map.put("invitationCode", invitationCode);
		map.put("create_date", create_date);
		List<Member> listMember=ambaseService.listAll(map);
		model.addAttribute("listMember", listMember);
		model.addAttribute("member_name", member_name);
		model.addAttribute("name", name);
		model.addAttribute("mobile_Phone", mobile_Phone);
		model.addAttribute("identity", identity);
		model.addAttribute("invitationCode", invitationCode);
		model.addAttribute("create_date", create_date);
		System.out.println(listMember.size());
		return "backModel/vip/acc/accountManagement";
	}
	@RequestMapping("/list2/{id}")
	public String list2(@PathVariable("id")int id,Model model){
		Member member=ambaseService.getById(id);
		model.addAttribute("member", member);
		System.out.println(member.getIdentity());
		Member_account member_account=(Member_account)mabaseService.getById(id);
		model.addAttribute("member_account", member_account);
		System.out.println("balance:"+member_account.getUseable_balance());
		Subject_purchase_record spr=sprbaseService.getById(id);
		model.addAttribute("spr", spr);
		Member_withdraw_record mwr=mwrbaseService.getById(id);
		model.addAttribute("mwr", mwr);
		Member_deposit_record mdr=mdrbaseService.getById(id);
		model.addAttribute("mdr", mdr);
		Member_trade_record mtr=mtrbaseService.getById(id);
		model.addAttribute("mtr", mtr);
		return "backModel/vip/tx/zhxq";
	}
}
