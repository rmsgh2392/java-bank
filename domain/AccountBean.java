package com.bitcamp.domain;

public class AccountBean {
	private int money;
	private String accountNum,today;
	
	public void setMoney(int money) {
		this.money = money;
	}
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	public void setToday(String today) {
		this.today = today;
	}
	public int getMoney() {
		return money;
	}
	public String getAccountNum() {
		return accountNum;
	}
	public String getToday() {
		return today;
	}
	
	
	
}
