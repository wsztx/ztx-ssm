package com.core.ztx.entity;

public class User {
    private Long id;

    private String loginName;

    private String loginPass;

    private String sts;

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
        this.loginName = loginName == null ? null : loginName.trim();
    }

    public String getLoginPass() {
        return loginPass;
    }

    public void setLoginPass(String loginPass) {
        this.loginPass = loginPass == null ? null : loginPass.trim();
    }

    public String getSts() {
        return sts;
    }

    public void setSts(String sts) {
        this.sts = sts == null ? null : sts.trim();
    }

	public User(String loginName, String loginPass) {
		super();
		this.loginName = loginName;
		this.loginPass = loginPass;
	}
    
}