package com.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Sys_biz_institution {
                  
	  private int id;
	  private String province;
	  private String city;
	  private String biz_type;
	  private String biz_sub_type;
	  private String institution_name;
	  private String institution_code;
	  
	  @Id
	  @GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getBiz_type() {
		return biz_type;
	}
	public void setBiz_type(String biz_type) {
		this.biz_type = biz_type;
	}
	public String getBiz_sub_type() {
		return biz_sub_type;
	}
	public void setBiz_sub_type(String biz_sub_type) {
		this.biz_sub_type = biz_sub_type;
	}
	public String getInstitution_name() {
		return institution_name;
	}
	public void setInstitution_name(String institution_name) {
		this.institution_name = institution_name;
	}
	public String getInstitution_code() {
		return institution_code;
	}
	public void setInstitution_code(String institution_code) {
		this.institution_code = institution_code;
	}
	  
	   
}
