package com.core.ztx.entity;

public class User {

	private Long id;
	private String loginName;
	private String loginPass;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getLoginPass() {
		return loginPass;
	}
	public void setLoginPass(String loginPass) {
		this.loginPass = loginPass;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", loginName=" + loginName + ", loginPass=" + loginPass + "]";
	}
	public User(String loginName, String loginPass) {
		super();
		this.loginName = loginName;
		this.loginPass = loginPass;
	}
	
}
