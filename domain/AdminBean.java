package com.bitcamp.domain;

public class AdminBean extends MemberBean {
	private String employnumber;
	
	public void setEmployNumber(String employnumber) {
		this.employnumber = employnumber;
	}
	public String getEmploynumber() {
		return employnumber;
	}
	
	@Override
	public String toString() {
		return String.format("1.아이디:%s\n"
				+ "2.비밀번호 :%s\n"
				+ "3.이름 :\n"
				+ "4.주민번호:\n"
				+ "5.사번 :\n"
				,getId(),getPw(),getName(),getSsn(),employnumber);
	}
}
