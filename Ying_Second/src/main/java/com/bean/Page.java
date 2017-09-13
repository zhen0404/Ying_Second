package com.bean;

import org.springframework.stereotype.Component;

@Component
public class Page {

	private int currentPage;
	private int allPage;
	private int rows;
	private int size=5;
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getAllPage() {
		if(rows%size==0){
			allPage=rows/size;
		}else {
			allPage=rows/size+1;
		}
		return allPage;
	}
	public void setAllPage(int allPage) {
		this.allPage = allPage;
	}
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
}
