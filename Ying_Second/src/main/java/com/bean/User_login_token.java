package com.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class User_login_token {
            private String token;
            private int user_id;
            private String user_name;
            private String password;
            private Date expire_time;
            private Date create_date;
            private Date update_date;
            
            @Id
            @GeneratedValue
			public String getToken() {
				return token;
			}
			public void setToken(String token) {
				this.token = token;
			}
			public int getUser_id() {
				return user_id;
			}
			public void setUser_id(int user_id) {
				this.user_id = user_id;
			}
			public String getUser_name() {
				return user_name;
			}
			public void setUser_name(String user_name) {
				this.user_name = user_name;
			}
			public String getPassword() {
				return password;
			}
			public void setPassword(String password) {
				this.password = password;
			}
			public Date getExpire_time() {
				return expire_time;
			}
			public void setExpire_time(Date expire_time) {
				this.expire_time = expire_time;
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
