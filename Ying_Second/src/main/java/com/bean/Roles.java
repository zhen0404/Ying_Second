package com.bean;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * 角色�?
 * @author Administrator
 *
 */

@Table(name="roles")
@Entity
public class Roles {

	private int id;
	private String rname;//角色名称
	private Set<Permission> pers=new HashSet<Permission>();
	
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="role_per",joinColumns=@JoinColumn(name="rid"),
		inverseJoinColumns=@JoinColumn(name="pid"))
	public Set<Permission> getPers() {
		return pers;
	}
	public void setPers(Set<Permission> pers) {
		this.pers = pers;
	}
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRname() {
		return rname;
	}
	public void setRname(String rname) {
		this.rname = rname;
	}
	
	
}
