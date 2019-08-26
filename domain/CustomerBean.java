package com.bitcamp.domain;

public class CustomerBean extends MemberBean{
	private String credit;
	
	public void setCredit(String credit) {
		this.credit = credit;
	}
	public String getCredit() {
		return credit;
	}
	
	@Override
	public String toString() {
		return String.format("1.아이디:%s\n"
				+ "2.비번:%s\n"
				+ "3.이름:%s\n"
				+ "4.주민번호:%s\n"
				+ "5.고객신용도 :%s등급"
				,super.getId(),super.getPw(),super.getName(),super.getSsn(),credit);
	}
	
}
