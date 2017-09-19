package com.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Subject_bbin_purchase_record {
               
	              private int id;
	              private String serial_number;
	              private int amount;
	              private String deal_ip;
	              private int subject_id;
	              private int member_id;
	              private int delflag;
	              private Date create_date;
	              private Date update_date;
	              private int interest;
	              private int ispayment;
	              private int pay_interest_times;
	              private int last_profit_day;
	              private Subject subject;
	              
	              
		            @ManyToOne
		            @JoinColumn(name="sid")
		            public Subject getSubject() {
						return subject;
					}
					public void setSubject(Subject subject) {
						this.subject = subject;
					}
		
	              public int getPay_interest_times() {
					return pay_interest_times;
				}
				public void setPay_interest_times(int pay_interest_times) {
					this.pay_interest_times = pay_interest_times;
				}
				public int getLast_profit_day() {
					return last_profit_day;
				}
				public void setLast_profit_day(int last_profit_day) {
					this.last_profit_day = last_profit_day;
				}
				private Member member;
	              
	            @ManyToOne
	            @JoinColumn(name="mid")
	            public Member getMember() {
					return member;
				}
				public void setMember(Member member) {
					this.member = member;
				}
				@Id
	            @GeneratedValue
				public int getId() {
					return id;
				}
				public void setId(int id) {
					this.id = id;
				}
				public String getSerial_number() {
					return serial_number;
				}
				public void setSerial_number(String serial_number) {
					this.serial_number = serial_number;
				}
				public int getAmount() {
					return amount;
				}
				public void setAmount(int amount) {
					this.amount = amount;
				}
				public String getDeal_ip() {
					return deal_ip;
				}
				public void setDeal_ip(String deal_ip) {
					this.deal_ip = deal_ip;
				}
				public int getSubject_id() {
					return subject_id;
				}
				public void setSubject_id(int subject_id) {
					this.subject_id = subject_id;
				}
				public int getMember_id() {
					return member_id;
				}
				public void setMember_id(int member_id) {
					this.member_id = member_id;
				}
				public int getDelflag() {
					return delflag;
				}
				public void setDelflag(int delflag) {
					this.delflag = delflag;
				}
				public Date getCreate_date() {
					return create_date;
				}
				public void setCreate_date(Date create_date) {
					this.create_date = create_date;
				}
				public Date getUpdate_date() {
					return update_date;
				}
				public void setUpdate_date(Date update_date) {
					this.update_date = update_date;
				}
				public int getInterest() {
					return interest;
				}
				public void setInterest(int interest) {
					this.interest = interest;
				}
				public int getIspayment() {
					return ispayment;
				}
				public void setIspayment(int ispayment) {
					this.ispayment = ispayment;
				}
	              
	              
	       
}
