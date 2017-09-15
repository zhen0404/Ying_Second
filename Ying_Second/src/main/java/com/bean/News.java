package com.bean;
/*
 * …æ¡ÀtypeId
 */
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table
@Entity
public class News {

	private int id;
	private String title;
	private String subTitle;
	private int sort;
	private String info;
	private String cPhoto;
	private String link;
	private String author;
	private String source;
	private String label;
	private int clickNumber;
	private String text;
	private String filelink;
	private String seoTitle;
	private String seoKey;
	private String seoDes;
	private int placTop;
	private int recommend;
	private int audit;
	private int addId;
	private int updId;
	private Date updTime;
	private Date addTime;
	private int typeId;

	public int getTypeId() {
		return typeId;
	}

	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}
	
	private News_type news_type;
	

	@ManyToOne
	@JoinColumn(name="tid")
	public News_type getNews_type() {
		return news_type;
	}

	public void setNews_type(News_type news_type) {
		this.news_type = news_type;
	}

	public String getSubTitle() {
		return subTitle;
	}

	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	public int getSort() {
		return sort;
	}

	public void setSort(int sort) {
		this.sort = sort;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getcPhoto() {
		return cPhoto;
	}

	public void setcPhoto(String cPhoto) {
		this.cPhoto = cPhoto;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public int getClickNumber() {
		return clickNumber;
	}

	public void setClickNumber(int clickNumber) {
		this.clickNumber = clickNumber;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getFilelink() {
		return filelink;
	}

	public void setFilelink(String filelink) {
		this.filelink = filelink;
	}

	public String getSeoTitle() {
		return seoTitle;
	}

	public void setSeoTitle(String seoTitle) {
		this.seoTitle = seoTitle;
	}

	public String getSeoKey() {
		return seoKey;
	}

	public void setSeoKey(String seoKey) {
		this.seoKey = seoKey;
	}

	public String getSeoDes() {
		return seoDes;
	}

	public void setSeoDes(String seoDes) {
		this.seoDes = seoDes;
	}

	public int getPlacTop() {
		return placTop;
	}

	public void setPlacTop(int placTop) {
		this.placTop = placTop;
	}

	public int getRecommend() {
		return recommend;
	}

	public void setRecommend(int recommend) {
		this.recommend = recommend;
	}

	public int getAudit() {
		return audit;
	}

	public void setAudit(int audit) {
		this.audit = audit;
	}

	public int getAddId() {
		return addId;
	}

	public void setAddId(int addId) {
		this.addId = addId;
	}

	public int getUpdId() {
		return updId;
	}

	public Date getUpdTime() {
		return updTime;
	}

	public void setUpdTime(Date updTime) {
		this.updTime = updTime;
	}

	public Date getAddTime() {
		return addTime;
	}

	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}

	public void setUpdId(int updId) {
		this.updId = updId;
	}

	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
