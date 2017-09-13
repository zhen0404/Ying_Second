package com.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Subject {
            private int id;
            private String serial_number;
            private String serial_no;
            private String name;
            private int type;
            private int status;
            private int floor_amount;
            private int amount;
            private int first_id;
            private int parent_id;
            private int period;
            
            @Id
            @GeneratedValue
			public int getId() {
				return id;
			}
			public void setId(int id) {
				this.id = id;
			}
			public String getSerial_number() {
				return serial_number;
			}
			public void setSerial_number(String serial_number) {
				this.serial_number = serial_number;
			}
			public String getSerial_no() {
				return serial_no;
			}
			public void setSerial_no(String serial_no) {
				this.serial_no = serial_no;
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public int getType() {
				return type;
			}
			public void setType(int type) {
				this.type = type;
			}
			public int getStatus() {
				return status;
			}
			public void setStatus(int status) {
				this.status = status;
			}
			public int getFloor_amount() {
				return floor_amount;
			}
			public void setFloor_amount(int floor_amount) {
				this.floor_amount = floor_amount;
			}
			public int getAmount() {
				return amount;
			}
			public void setAmount(int amount) {
				this.amount = amount;
			}
			public int getFirst_id() {
				return first_id;
			}
			public void setFirst_id(int first_id) {
				this.first_id = first_id;
			}
			public int getParent_id() {
				return parent_id;
			}
			public void setParent_id(int parent_id) {
				this.parent_id = parent_id;
			}
			public int getPeriod() {
				return period;
			}
			public void setPeriod(int period) {
				this.period = period;
			}
            
            
}
