package com.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class Finance_product_funds {

	private int id;
	private String type;
	private String name;
	private int status;
	private int period;
	private int floor_amount;
	private int year_rate;
	private int subscribe_count;
	private String product_topic;
	private String product_factor;
	private String product_strategy;
	private String product_manager;
	private Date create_date;
	private Date update_date;
	private String product_manager_name;
	private String product_manager_pic;
	private String product_manager_title;
	private String product_manager_desc;
	private String invest_points;
	private int amount;
	private int sold_amount;
	private int buyer_count;
	private Date start_date;
	private Date end_date;
	private String ratio;
	private String contract;
	private String bank_account;
	
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getPeriod() {
		return period;
	}
	public void setPeriod(int period) {
		this.period = period;
	}
	public int getFloor_amount() {
		return floor_amount;
	}
	public void setFloor_amount(int floor_amount) {
		this.floor_amount = floor_amount;
	}
	public int getYear_rate() {
		return year_rate;
	}
	public void setYear_rate(int year_rate) {
		this.year_rate = year_rate;
	}
	public int getSubscribe_count() {
		return subscribe_count;
	}
	public void setSubscribe_count(int subscribe_count) {
		this.subscribe_count = subscribe_count;
	}
	public String getProduct_topic() {
		return product_topic;
	}
	public void setProduct_topic(String product_topic) {
		this.product_topic = product_topic;
	}
	public String getProduct_factor() {
		return product_factor;
	}
	public void setProduct_factor(String product_factor) {
		this.product_factor = product_factor;
	}
	public String getProduct_strategy() {
		return product_strategy;
	}
	public void setProduct_strategy(String product_strategy) {
		this.product_strategy = product_strategy;
	}
	public String getProduct_manager() {
		return product_manager;
	}
	public void setProduct_manager(String product_manager) {
		this.product_manager = product_manager;
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
	public String getProduct_manager_name() {
		return product_manager_name;
	}
	public void setProduct_manager_name(String product_manager_name) {
		this.product_manager_name = product_manager_name;
	}
	public String getProduct_manager_pic() {
		return product_manager_pic;
	}
	public void setProduct_manager_pic(String product_manager_pic) {
		this.product_manager_pic = product_manager_pic;
	}
	public String getProduct_manager_title() {
		return product_manager_title;
	}
	public void setProduct_manager_title(String product_manager_title) {
		this.product_manager_title = product_manager_title;
	}
	public String getProduct_manager_desc() {
		return product_manager_desc;
	}
	public void setProduct_manager_desc(String product_manager_desc) {
		this.product_manager_desc = product_manager_desc;
	}
	public String getInvest_points() {
		return invest_points;
	}
	public void setInvest_points(String invest_points) {
		this.invest_points = invest_points;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getSold_amount() {
		return sold_amount;
	}
	public void setSold_amount(int sold_amount) {
		this.sold_amount = sold_amount;
	}
	public int getBuyer_count() {
		return buyer_count;
	}
	public void setBuyer_count(int buyer_count) {
		this.buyer_count = buyer_count;
	}
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	public Date getEnd_date() {
		return end_date;
	}
	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}
	public String getRatio() {
		return ratio;
	}
	public void setRatio(String ratio) {
		this.ratio = ratio;
	}
	public String getContract() {
		return contract;
	}
	public void setContract(String contract) {
		this.contract = contract;
	}
	public String getBank_account() {
		return bank_account;
	}
	public void setBank_account(String bank_account) {
		this.bank_account = bank_account;
	}
	
}
