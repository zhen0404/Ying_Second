package com.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Subject_folder {
          private int id;
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
