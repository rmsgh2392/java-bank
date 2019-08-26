package com.bitcamp.domain;

public class AdminBean extends MemberBean {
	private int employnumber;
	
	public void setEmployNumber(int employnumber) {
		this.employnumber = employnumber;
	}
	public int getEmploynumber() {
		return employnumber;
	}
	
	@Override
	public String toString() {
		return String.format("1.아이디:%s\n"
				+ "2.비밀번호 :%s\n"
				+ "3.이름 :\n"
				+ "4.주민번호:\n"
				+ "5.사번 :\n"
				,super.getId(),super.getPw(),super.getName(),super.getSsn(),employnumber);
	}
	
	
}
