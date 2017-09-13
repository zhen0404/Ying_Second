package com.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class User_role {
              
	         private int id;
	         private String cname;
	         private String ename;
	         private int available;
	         private String remark;
	         private Date create_date;
	         private Date update_date;
	         private String category;
	         private int source_type;
	         private int source_id;
	         private int del_flag;
	        
	         @Id
	         @GeneratedValue
			public int getId() {
				return id;
			}
			public void setId(int id) {
				this.id = id;
			}
			public String getCname() {
				return cname;
			}
			public void setCname(String cname) {
				this.cname = cname;
			}
			public String getEname() {
				return ename;
			}
			public void setEname(String ename) {
				this.ename = ename;
			}
			public int getAvailable() {
				return available;
			}
			public void setAvailable(int available) {
				this.available = available;
			}
			public String getRemark() {
				return remark;
			}
			public void setRemark(String remark) {
				this.remark = remark;
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
			public String getCategory() {
				return category;
			}
			public void setCategory(String category) {
				this.category = category;
			}
			public int getSource_type() {
				return source_type;
			}
			public void setSource_type(int source_type) {
				this.source_type = source_type;
			}
			public int getSource_id() {
				return source_id;
			}
			public void setSource_id(int source_id) {
				this.source_id = source_id;
			}
			public int getDel_flag() {
				return del_flag;
			}
			public void setDel_flag(int del_flag) {
				this.del_flag = del_flag;
			}
	         
	         
}
