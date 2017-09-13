package com.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class Finance_product_subscribe_record {

	private int id;
	private int member_id;
	private int subscribe_id;
	private String tech_user_id;
	private String tech_user_seal;
	private String org_path;
	private String new_path;
	private int status;
	private Date create_date;
	private Date update_date;
	private String filed1;
	
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMember_id() {
		return member_id;
	}
	public void setMember_id(int member_id) {
		this.member_id = member_id;
	}
	public int getSubscribe_id() {
		return subscribe_id;
	}
	public void setSubscribe_id(int subscribe_id) {
		this.subscribe_id = subscribe_id;
	}
	public String getTech_user_id() {
		return tech_user_id;
	}
	public void setTech_user_id(String tech_user_id) {
		this.tech_user_id = tech_user_id;
	}
	public String getTech_user_seal() {
		return tech_user_seal;
	}
	public void setTech_user_seal(String tech_user_seal) {
		this.tech_user_seal = tech_user_seal;
	}
	public String getOrg_path() {
		return org_path;
	}
	public void setOrg_path(String org_path) {
		this.org_path = org_path;
	}
	public String getNew_path() {
		return new_path;
	}
	public void setNew_path(String new_path) {
		this.new_path = new_path;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
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
	public String getFiled1() {
		return filed1;
	}
	public void setFiled1(String filed1) {
		this.filed1 = filed1;
	}
	
}
