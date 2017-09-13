package com.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Subject_file {
               private int id;
               private int folder_id;
               private String path;
               private String file_name;
               private String original_name;
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
			public int getFolder_id() {
				return folder_id;
			}
			public void setFolder_id(int folder_id) {
				this.folder_id = folder_id;
			}
			public String getPath() {
				return path;
			}
			public void setPath(String path) {
				this.path = path;
			}
			public String getFile_name() {
				return file_name;
			}
			public void setFile_name(String file_name) {
				this.file_name = file_name;
			}
			public String getOriginal_name() {
				return original_name;
			}
			public void setOriginal_name(String original_name) {
				this.original_name = original_name;
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
