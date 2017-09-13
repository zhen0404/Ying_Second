package com.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Subject_order_record {
           private int id;
           private String serial_number;
           private int deal_type;
           private int amout;
           private int status;
           private int subject_id;
           private int member_id;
           private int delfalg;
           private Date create_date;
           private Date update_date;
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
		public int getDeal_type() {
			return deal_type;
		}
		public void setDeal_type(int deal_type) {
			this.deal_type = deal_type;
		}
		public int getAmout() {
			return amout;
		}
		public void setAmout(int amout) {
			this.amout = amout;
		}
		public int getStatus() {
			return status;
		}
		public void setStatus(int status) {
			this.status = status;
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
		public int getDelfalg() {
			return delfalg;
		}
		public void setDelfalg(int delfalg) {
			this.delfalg = delfalg;
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
           
           
}
