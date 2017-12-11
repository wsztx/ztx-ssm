package com.core.ztx.entity;

public class Member {
    private Long id;

    private Long userId;

    private String memberType;

    private String sts;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType == null ? null : memberType.trim();
    }

    public String getSts() {
        return sts;
    }

    public void setSts(String sts) {
        this.sts = sts == null ? null : sts.trim();
    }

	@Override
	public String toString() {
		return "Member [id=" + id + ", userId=" + userId + ", memberType=" + memberType + ", sts=" + sts + "]";
	}
    
    
}