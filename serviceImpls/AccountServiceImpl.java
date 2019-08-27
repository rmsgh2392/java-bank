package com.bitcamp.serviceImpls;

import com.bitcamp.service.AccountService;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import com.bitcamp.domain.AccountBean;
public class AccountServiceImpl implements AccountService{
	
	private AccountBean[] accounts ;//서버 저장소 역활
	private int count;//서버 저장소 역활
	
	public AccountServiceImpl() {
		accounts = new AccountBean[10];
		count = 0;
	}
	
	
	@Override
	public void createAccount(int money) {
		AccountBean acc = new AccountBean();
		acc.setAccountNum(createAccountNum());
		acc.setMoney(money+"");
		acc.setToday(findDate());
		accounts[count] = acc;
		count++;
	}

	@Override
	public String createAccountNum() {
		Random random =  new Random();
		String accountNum = "";
		int t1 = random.nextInt();
		int t2 = random.nextInt();
		return String.format("%d-%04d", t1,t2);
		
//		for(int i=0;i<9;i++) {
//		accountNum += (i==4)? "-":random.nextInt(10);
//		}
//		return accountNum;
//		for(int i=0;i<9;i++){
//			if(i==4) {
//				accountNum += "-";
//			}else {
//				accountNum += random.nextInt(10);
//			}
//		}
//		return accountNum;
//	
	}

	@Override
	public AccountBean[] findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccountBean findByAccountNum(String accountNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countAccounts() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean existAccountNum(String accountNum) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String findDate() {
//		Date date = new Date();
		return new SimpleDateFormat("yyyy-MM-dd hh:mm").format(new Date());
	}

	@Override
	public void depositMoney(AccountBean param) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdrawMoney(AccountBean param) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAccountNum(String accountNum) {
		// TODO Auto-generated method stub
		
	}
	
}
