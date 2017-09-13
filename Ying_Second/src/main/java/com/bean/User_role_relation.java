package com.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class User_role_relation {
           
	         private int user_id;
	         private int role_id;
	         private Date create_date;
	         
	        @Id
	        @GeneratedValue
			public int getUser_id() {
				return user_id;
			}
			public void setUser_id(int user_id) {
				this.user_id = user_id;
			}
			public int getRole_id() {
				return role_id;
			}
			public void setRole_id(int role_id) {
				this.role_id = role_id;
			}
			public Date getCreate_date() {
				return create_date;
			}
			public void setCreate_date(Date create_date) {
				this.create_date = create_date;
			}
	         
	         
}
