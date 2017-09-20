package com.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table
@Entity
public class Member_profit_record {

	private int id;
	private String serial_number;
	private int type;
	private float amount;
	private  int member_id;
	private int delflag;
	private Date create_date;
	private Date update_date;
	private String comment;
	private int purchase_id;
	private int profit_year;
	private int profit_month;
	private int profit_day;
	
	private Member member;
	private Subject subject;
	
	@ManyToOne
	@JoinColumn(name="sid")
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
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
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float interest) {
		this.amount = interest;
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
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public int getPurchase_id() {
		return purchase_id;
	}
	public void setPurchase_id(int purchase_id) {
		this.purchase_id = purchase_id;
	}
	public int getProfit_year() {
		return profit_year;
	}
	public void setProfit_year(int profit_year) {
		this.profit_year = profit_year;
	}
	public int getProfit_month() {
		return profit_month;
	}
	public void setProfit_month(int profit_month) {
		this.profit_month = profit_month;
	}
	public int getProfit_day() {
		return profit_day;
	}
	public void setProfit_day(int profit_day) {
		this.profit_day = profit_day;
	}
	
}

