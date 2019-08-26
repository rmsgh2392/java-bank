package com.bitcamp.domain;

public class MemberBean {
	private String id,pw,name,ssn;
	
	
	public void setId(String id) {
		this.id  = id;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getId() {
		return id;
	}
	public String getPw() {
		return pw;
	}
	public String getName() {
		return name;
	}
	public String getSsn() {
		return ssn;
	}
	
	@Override
	public String toString() {
		return String.format("1.아이디 :%s\n"
				+ "2.비밀번호:%s\n"
				+ "3.이름:%s\n"
				+ "4.주민번호:%s",id,pw,name,ssn);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
