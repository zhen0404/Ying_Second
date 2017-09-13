package com.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Subject_purchase_record {
                  
	       private int id;
	       private String serial_number;
	       private int amount;
	       private String deal_id;
	       private int subject_id;
	       private int member_id;
	       private int delflag;
	       private Date create_date;
	       private Date update_date;
	       private int interset;
	       private int ispayment;
	       
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
		public String getDeal_id() {
			return deal_id;
		}
		public void setDeal_id(String deal_id) {
			this.deal_id = deal_id;
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
		public int getInterset() {
			return interset;
		}
		public void setInterset(int interset) {
			this.interset = interset;
		}
		public int getIspayment() {
			return ispayment;
		}
		public void setIspayment(int ispayment) {
			this.ispayment = ispayment;
		}
	       
	       
}
