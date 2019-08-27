package com.bitcamp.domain;

public class AccountBean {
	private String accountNum,today,money;
	
	public void setMoney(String money) {
		this.money = money;
	}
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	public void setToday(String today) {
		this.today = today;
	}
	public String getMoney() {
		return money;
	}
	public String getAccountNum() {
		return accountNum;
	}
	public String getToday() {
		return today;
	}
	@Override
	public String toString() {
		return "AccountBean 돈 =" + money + ""
				+ ", 계좌번호 =" + accountNum + ""
				+ ", 거래일자 =" + today + "";
	}

	
	
}
