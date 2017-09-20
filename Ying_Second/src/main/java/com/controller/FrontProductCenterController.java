package com.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bean.Member;
import com.bean.Member_account;
import com.bean.Member_bankcards;
import com.bean.Member_profit_record;
import com.bean.Member_tally;
import com.bean.Member_trade_record;
import com.bean.Subject;
import com.bean.Subject_purchase_record;
import com.service.FrontProductService;

/**
 * ǰ̨��Ʒ���� ������
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/product")
public class FrontProductCenterController {

	@Autowired
	@Qualifier("frontProductServiceImpl")
	private FrontProductService frontProductServiceImpl;
	
//	//�����Ʒ���İ�ť  Я�����ݹ�ȥ
//	@RequestMapping("/login")
//	public String login(Model model){
//		List<Subject> subjectList=frontProductServiceImpl.listAll(1);
//		model.addAttribute("subjectList", subjectList);
//		return "frontProductCenter";
//	}
	
	//���ȥ�������뵽����ҳ��ȥ
	@RequestMapping("/toBuy")
	public String goToBuy(String id,Model model,HttpSession session){
		//��һ����ʾ�����Ϣ
		Subject subject=(Subject) this.frontProductServiceImpl.getById(Integer.parseInt(id));
		int datePeriod=subject.getPeriod();
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			subject.setStart_date(sdf.parse(sdf.format(date)));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//���뿪ʼ��Ϣʱ��
		Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH, +datePeriod);//�����ʱ��ӱ������
        date = calendar.getTime();
		try {
			subject.setEnd_date(sdf.parse(sdf.format(date)));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//����Ԥ�Ƶ���ʱ��
		this.frontProductServiceImpl.saveOrUpdateProduct(subject);
		subject=(Subject) this.frontProductServiceImpl.getById(Integer.parseInt(id));
		model.addAttribute("subject", subject);
		calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH, +1);//Ԥ�Ƶ������ڼ�һ��
        date = calendar.getTime();
		model.addAttribute("lastDatePlusOne", sdf.format(date));
		
		//��һ����ʾ�û������Ϣ
		Object object=session.getAttribute("member");
		if (object!=null) {
			Member member=(Member) object;
			int memberId=member.getId();
			Member_account memberAccount=this.frontProductServiceImpl.ListAllByMemberId(memberId);
			model.addAttribute("memberAccount", memberAccount);
			
			//��һ���ж���û�а����п�
			Member_bankcards memberBankcards=this.frontProductServiceImpl.ListCardByMemberId(memberId);
			model.addAttribute("memberBankcards", memberBankcards);
		}
		return "font_desk/productBuy";
	}
	
	/**
	 * �÷������������������֮����ת��ҳ��
	 * @throws ParseException 
	 */
	@RequestMapping("/afterBuy")
	public String afterBuy(String subjectId,String amountYuE,String mytext,Model model,HttpSession session,
							Member_profit_record memberProfitRecord,Member_trade_record memberTradeRecord,
							Member_tally member_tally,Subject_purchase_record subjectPurchaseRecord) throws ParseException{
		System.out.println(subjectId+"--"+amountYuE+"--"+mytext);
		//��session��ȡmember��Ϣ
		Object object=session.getAttribute("member");
		if (object!=null) {
			Member member=(Member) object;
			int memberId=member.getId();
			String sysDate=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
			String sysDateAndRandom=new SimpleDateFormat("yyyyMMddHHmmss").format(new Date())+(int)(Math.random()*9)+(int)(Math.random()*9);
			Calendar now=Calendar.getInstance();
			//0 ����subject��
			Subject subject=this.frontProductServiceImpl.getSubjectById(Integer.parseInt(subjectId));
			subject.setBought(subject.getBought()+1);
			subject.setAmount(subject.getAmount()+Integer.parseInt(mytext));
			this.frontProductServiceImpl.updateSubject(subject);
			subject=this.frontProductServiceImpl.getSubjectById(Integer.parseInt(subjectId));
			float interest=((((Integer.parseInt(mytext)*(subject.getYear_rate()+1))/100)/365)*(subject.getPeriod()));
			
			//1��������Ա�˻�������
			Member_account memberAccount=this.frontProductServiceImpl.ListAllByMemberId(memberId);
			memberAccount.setUseable_balance(Integer.parseInt(amountYuE)-Integer.parseInt(mytext));
			try {
				memberAccount.setUpdate_date(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(sysDate));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			memberAccount.setInvest_amount(Integer.parseInt(mytext)+memberAccount.getInvest_amount());
			memberAccount.setMember(member);
			this.frontProductServiceImpl.updateMemberAccount(memberAccount);
			
			//2��������Ա�����
			memberProfitRecord.setMember(member);
			memberProfitRecord.setSubject(subject);
			memberProfitRecord.setSerial_number(sysDateAndRandom);
			memberProfitRecord.setType(0);
			memberProfitRecord.setAmount(interest);
			memberProfitRecord.setDelflag(0);
			try {
				memberProfitRecord.setCreate_date(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(sysDate));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				memberProfitRecord.setUpdate_date((new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(sysDate)));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			memberProfitRecord.setComment("������"+subject.getName());
			memberProfitRecord.setProfit_year(now.get(Calendar.YEAR));
			memberProfitRecord.setProfit_month(now.get(Calendar.MONTH+1));
			memberProfitRecord.setProfit_day(now.get(Calendar.DAY_OF_MONTH));
			this.frontProductServiceImpl.saveMemberProfitRecord(memberProfitRecord);
			
			//3�������׼�¼��
			memberTradeRecord.setMember(member);
			memberTradeRecord.setTrade_no(sysDateAndRandom);
			memberTradeRecord.setTrade_name("������"+subject.getName());
			memberTradeRecord.setCounterpart("ӯ+��ƹ�˾");
			memberTradeRecord.setAmount(Integer.parseInt(mytext));
			memberTradeRecord.setTrade_type(subject.getName());
			memberTradeRecord.setFund_flow(0);
			memberTradeRecord.setTrade_status(0);
			memberTradeRecord.setExt_field_1("��չ1");
			memberTradeRecord.setExt_field_2("��չ2");
			memberTradeRecord.setExt_field_3("��չ3");
			try {
				memberTradeRecord.setCreate_date(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(sysDate));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				memberTradeRecord.setUpdate_date(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(sysDate));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.frontProductServiceImpl.saveMemberTradeRecord(memberTradeRecord);
			
			//4 �������˱�
			member_tally.setMember(member);
			member_tally.setType_id(1);
			member_tally.setType_name("A��");
			member_tally.setAmount(Integer.parseInt(mytext));
			try {
				member_tally.setPay_date(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(sysDate));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				member_tally.setCreate_date(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(sysDate));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.frontProductServiceImpl.saveMember_tally(member_tally);
			
			//5������Ĺ����
			subjectPurchaseRecord.setSubject(subject);
			subjectPurchaseRecord.setMember(member);
			subjectPurchaseRecord.setSerial_number(sysDate);
			subjectPurchaseRecord.setAmount(Integer.parseInt(mytext));
			subjectPurchaseRecord.setDeal_id("127.0.0.1");
			subjectPurchaseRecord.setDelflag(0);
			subjectPurchaseRecord.setCreate_date(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(sysDate));
			subjectPurchaseRecord.setUpdate_date(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(sysDate));
			subjectPurchaseRecord.setInterset(interest);
			subjectPurchaseRecord.setIspayment(1);
			subjectPurchaseRecord.setPay_interest_times(1);
			subjectPurchaseRecord.setLast_profit_day(Integer.parseInt(new SimpleDateFormat("yyyyMMdd").format(new Date())));
			subjectPurchaseRecord.setBonus_info("��");
			this.frontProductServiceImpl.saveSubjectPurchaseRecord(subjectPurchaseRecord);
			int cnt=this.frontProductServiceImpl.getCntBySubjectIdAndMemberId(Integer.parseInt(subjectId), memberId);
			List<Subject_purchase_record> sList=this.frontProductServiceImpl.listSubjectPurchaseRecordAll(Integer.parseInt(subjectId), memberId);
			if(sList!=null&&sList.size()>0){
				for (Subject_purchase_record subjectPurchaseRecord2 : sList) {
					subjectPurchaseRecord2.setMember(member);
					subjectPurchaseRecord2.setSubject(subject);
					subjectPurchaseRecord2.setPay_interest_times(cnt);
					this.frontProductServiceImpl.updateSubjectPurchaseRecordAfterSave(subjectPurchaseRecord2);
				}
			}
			
			model.addAttribute("memberAccount", memberAccount);
			//��һ���ж���û�а����п�
			Member_bankcards memberBankcards=this.frontProductServiceImpl.ListCardByMemberId(memberId);
			model.addAttribute("memberBankcards", memberBankcards);
			return "frontMemberCenter";//�����ɹ�����ת���������� ��ʾ�������Ϣ
		}
		return "frontUserLogin";
	}
}
