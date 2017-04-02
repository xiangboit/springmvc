package com.mstf.bean;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Info {
	private Long id ;
	
	private String name ;
	
	private String birthday ;
	private Set<Zuyuan>zuyuan=new HashSet<Zuyuan>();
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public Set<Zuyuan> getZuyuan() {
		return zuyuan;
	}

	public void setZuyuan(Set<Zuyuan> zuyuan) {
		this.zuyuan = zuyuan;
	}
	
	
}
