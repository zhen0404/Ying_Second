package com.daoImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bean.Award_records;
import com.bean.Member_tally;
import com.bean.Member_trade_record;
import com.bean.Member_withdraw_record;
import com.bean.Push_notice;
import com.bean.Subject;
import com.bean.Sys_recharge_price_config;
import com.dao.GgManagerDao;

@Component
public class GgManagerDaoImpl implements GgManagerDao  {

	@Autowired
	public SessionFactory sessionFactory;
	
	public Session getSession(){
		return this.sessionFactory.getCurrentSession();
	}
	//查询所有公告，新闻
	public List ListAll() {
		Session session = getSession();
		String hql="from Push_notice";
		 List list =session.createQuery(hql).list();
		return list;
	}
	//查询所有反馈意见表
	public List Feed(){
		Session session = getSession();
		StringBuffer buffer = new StringBuffer();
		buffer.append(" from  Feedback  u  inner  join fetch u.member ");
		Query query = session.createQuery(buffer.toString());
		List list = query.list();
		System.out.println(list.size());
		return list;

		
	}
	//查询是否有该标题
	public List<Push_notice> list(String hql){
		Session session=getSession();
		List list=session.createQuery(hql).list();
		return list;
	}
	//根据id查询公告内容
			public Push_notice chakan(int id){
				Session session=getSession();
				Push_notice pushNotice = (Push_notice) session.get(Push_notice.class, id);
				return pushNotice;
	}
	//编辑公告
	public Push_notice chakang(int id){
		Session session=getSession();
		Push_notice pushNotice = (Push_notice) session.get(Push_notice.class, id);
		return pushNotice;
	}
	//添加
		public void save(Object...objects){
			Session session=getSession();
			session.save(objects[0]);
		}
   //修改
		public void updatelist(int id,String title,String content){
			Session session=getSession();
			String hql="update push_notice user set user.title='"+title+"', user.content='"+content+"' where user.id="+id;
			System.out.println(title+content);
			session.createSQLQuery(hql).executeUpdate();
		}
		//红包统计
         public List<Award_records> ListCop(String creatTime) {
        	 Session session = getSession();
     		String hql="select sum(amount) from award_records where type=0 and isAward=1";
     		if(creatTime!=null&&!"".equals(creatTime)){
        		 hql+=" and addTime like '%"+creatTime+"%'";
        	 }
     		 List list =session.createSQLQuery(hql).list();
     		return list;
}
       //红包统计
		public List<Award_records> ListCop1(String creatTime) {
			 Session session = getSession();
	     		String hql="select sum(amount) from award_records where type=1 and isAward=1";
	     		if(creatTime!=null&&!"".equals(creatTime)){
	        		 hql+=" and addTime like '%"+creatTime+"%'";
	        	 }
	     		 List list2 =session.createSQLQuery(hql).list();
	     		return list2;
		}
		//收益统计
		public List<Subject> ListCop2(String creatTime,String endTime) {
			 Session session = getSession();
	     		String hql="select sum(amount) from Subject where type=0 ";
	     		if(creatTime!=null&&!"".equals(creatTime)){
	        		 hql+=" and start_date like '%"+creatTime+"%'";
	        	 }
	     		if(endTime!=null&&!"".equals(endTime)){
	        		 hql+=" and end_date like '%"+endTime+"%'";
	        	 }
	     		 List list3 =session.createSQLQuery(hql).list();
	     		return list3;
		}
		//收益统计
		public List<Subject> ListCop3(String creatTime,String endTime) {
			 Session session = getSession();
	     		String hql="select sum(amount) from Subject where type=1 ";
	     		if(creatTime!=null&&!"".equals(creatTime)){
	        		 hql+=" and start_date like '%"+creatTime+"%'";
	        	 }
	     		if(endTime!=null&&!"".equals(endTime)){
	        		 hql+=" and end_date like '%"+endTime+"%'";
	        	 }
	     		 List list4 =session.createSQLQuery(hql).list();
	     		return list4;
		}
		//收益统计
		public List<Subject> ListCop4(String creatTime,String endTime) {
			 Session session = getSession();
	     		String hql="select sum(amount) from Subject where type=2 ";
	     		if(creatTime!=null&&!"".equals(creatTime)){
	        		 hql+=" and start_date like '%"+creatTime+"%'";
	        	 }
	     		if(endTime!=null&&!"".equals(endTime)){
	        		 hql+=" and end_date like '%"+endTime+"%'";
	        	 }
	     		 List list5 =session.createSQLQuery(hql).list();
	     		return list5;
		}
		public List<Sys_recharge_price_config> ListCop5(String creatTime) {
			 Session session = getSession();
	     		String hql="select sum(market_price) from Sys_recharge_price_config where type='MOBILE' ";
	     		if(creatTime!=null&&!"".equals(creatTime)){
	        		 hql+=" and create_date like '%"+creatTime+"%'";
	        	 }
	     		 List list6 =session.createSQLQuery(hql).list();
	     		return list6;
		}
		@Override
		public List<Sys_recharge_price_config> ListCop6(String creatTime) {
			Session session = getSession();
     		String hql="select sum(market_price) from Sys_recharge_price_config where type='OIL' ";
     		if(creatTime!=null&&!"".equals(creatTime)){
       		 hql+=" and create_date like '%"+creatTime+"%'";
       	 }
     		 List list7 =session.createSQLQuery(hql).list();
     		return list7;
		}
		@Override
		public List<Member_withdraw_record> ListCop7(String creatTime) {
			Session session = getSession();
     		String hql="select sum(amount) from Member_withdraw_record where channel_name='FUIOU' ";
     		if(creatTime!=null&&!"".equals(creatTime)){
          		 hql+=" and create_date like '%"+creatTime+"%'";
          	 }
     		 List list8 =session.createSQLQuery(hql).list();
     		return list8;
		}
		@Override
		public List<Member_withdraw_record> ListCop8(String creatTime) {
			Session session = getSession();
     		String hql="select sum(amount) from Member_withdraw_record where channel_name='BEIFU' ";
     		if(creatTime!=null&&!"".equals(creatTime)){
         		 hql+=" and create_date like '%"+creatTime+"%'";
         	 }
     		 List list9 =session.createSQLQuery(hql).list();
     		return list9;
		}
		@Override
		public List<Subject> ListCop9(String creatTime,String endTime) {
			 Session session = getSession();
	     		String hql="select sum(floor_amount) from Subject where type=0 ";
	     		if(creatTime!=null&&!"".equals(creatTime)){
	        		 hql+=" and start_date like '%"+creatTime+"%'";
	        	 }
	     		if(endTime!=null&&!"".equals(endTime)){
	        		 hql+=" and end_date like '%"+endTime+"%'";
	        	 }
	     		 List list10 =session.createSQLQuery(hql).list();
	     		return list10;
		}
		@Override
		public List<Subject> ListCop10(String creatTime,String endTime) {
			 Session session = getSession();
	     		String hql="select sum(floor_amount) from Subject where type=1 ";
	     		if(creatTime!=null&&!"".equals(creatTime)){
	        		 hql+=" and start_date like '%"+creatTime+"%'";
	        	 }
	     		if(endTime!=null&&!"".equals(endTime)){
	        		 hql+=" and end_date like '%"+endTime+"%'";
	        	 }
	     		 List list11 =session.createSQLQuery(hql).list();
	     		return list11;
		}
		@Override
		public List<Subject> ListCop11(String creatTime,String endTime) {
			 Session session = getSession();
	     		String hql="select sum(floor_amount) from Subject where type=2 ";
	     		if(creatTime!=null&&!"".equals(creatTime)){
	        		 hql+=" and start_date like '%"+creatTime+"%'";
	        	 }
	     		if(endTime!=null&&!"".equals(endTime)){
	        		 hql+=" and end_date like '%"+endTime+"%'";
	        	 }
	     		 List list12 =session.createSQLQuery(hql).list();
	     		return list12;
		}
		@Override
		public List<Member_trade_record> ListCop12(String creatTime) {
			Session session = getSession();
     		String hql="select sum(amount) from member_trade_record where trade_name LIKE '%手机充值%'";
     		if(creatTime!=null&&!"".equals(creatTime)){
       		 hql+=" and create_date like '%"+creatTime+"%'";
       	 }
     		 List list13 =session.createSQLQuery(hql).list();
     		return list13;
		}
		@Override
		public List<Member_trade_record> ListCop13(String creatTime) {
			Session session = getSession();
     		String hql="select sum(amount) from member_trade_record where trade_name LIKE '%石化卡充值 %'";
     		if(creatTime!=null&&!"".equals(creatTime)){
          		 hql+=" and create_date like '%"+creatTime+"%'";
          	 }
     		 List list14 =session.createSQLQuery(hql).list();
     		return list14;
		}
		@Override
		public List<Member_tally> ListCop14(String creatTime) {
			Session session = getSession();
     		String hql="select sum(amount) from member_tally where 0=0";
     		if(creatTime!=null&&!"".equals(creatTime)){
         		 hql+=" and create_date like '%"+creatTime+"%'";
         	 }
     		 List list15 =session.createSQLQuery(hql).list();
     		return list15;
		}
		}
