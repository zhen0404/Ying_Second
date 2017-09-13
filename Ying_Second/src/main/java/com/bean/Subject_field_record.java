package com.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Subject_field_record {
               private int id;
               private int subject_id;
               private int field_id;
               private String field_value;
               private int delflag;
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
			public int getSubject_id() {
				return subject_id;
			}
			public void setSubject_id(int subject_id) {
				this.subject_id = subject_id;
			}
			public int getField_id() {
				return field_id;
			}
			public void setField_id(int field_id) {
				this.field_id = field_id;
			}
			public String getField_value() {
				return field_value;
			}
			public void setField_value(String field_value) {
				this.field_value = field_value;
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
               
               
               
}
