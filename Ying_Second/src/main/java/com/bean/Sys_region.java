package com.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Sys_region {
 
	         private int ID;
	         private String gb2260;
	         private String name;
	         private int region_level;
	         private int parent_id;
	         private String parent_ids;
	         private String parent_gb2260;
	         private String dialling_code;
	         private Date create_date;
	         private Date last_modified;
	        
	         @Id
	         @GeneratedValue
			public int getID() {
				return ID;
			}
			public void setID(int iD) {
				ID = iD;
			}
			public String getGb2260() {
				return gb2260;
			}
			public void setGb2260(String gb2260) {
				this.gb2260 = gb2260;
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public int getRegion_level() {
				return region_level;
			}
			public void setRegion_level(int region_level) {
				this.region_level = region_level;
			}
			public int getParent_id() {
				return parent_id;
			}
			public void setParent_id(int parent_id) {
				this.parent_id = parent_id;
			}
			public String getParent_ids() {
				return parent_ids;
			}
			public void setParent_ids(String parent_ids) {
				this.parent_ids = parent_ids;
			}
			public String getParent_gb2260() {
				return parent_gb2260;
			}
			public void setParent_gb2260(String parent_gb2260) {
				this.parent_gb2260 = parent_gb2260;
			}
			public String getDialling_code() {
				return dialling_code;
			}
			public void setDialling_code(String dialling_code) {
				this.dialling_code = dialling_code;
			}
			public Date getCreate_date() {
				return create_date;
			}
			public void setCreate_date(Date create_date) {
				this.create_date = create_date;
			}
			public Date getLast_modified() {
				return last_modified;
			}
			public void setLast_modified(Date last_modified) {
				this.last_modified = last_modified;
			}
	         
	         
	         
	         
}
