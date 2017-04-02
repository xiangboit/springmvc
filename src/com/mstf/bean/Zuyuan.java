package com.mstf.bean;

public class Zuyuan {
private Long id ;
	
	private String name ;
	
	private String birthday ;
	private Info info;
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

	public Info getInfo() {
		return info;
	}

	public void setInfo(Info info) {
		this.info = info;
	}

	@Override
	public String toString() {
		return "Zuyuan [id=" + id + ", name=" + name + ", birthday=" + birthday
				+ "]";
	}
	
	
}
