package com.bitcamp.service;
import com.bitcamp.domain.AccountBean;
public interface AccountService {
//	계좌
	public void createAccount(int money);//돈을 넣으면 계좌 생성
	public String createAccountNum();//아래에서 랜덤으로 뽑은 계좌 넣음
//	계좌번호 생성(1234-5678)랜덤으로 만듬
	public AccountBean[] findAll();
	public AccountBean findByAccountNum(String accountNum);
	public int countAccounts();
	public boolean existAccountNum(String accountNum);
	public String findDate();//오늘 날짜,현재시간(분까지)반환
	public void depositMoney(AccountBean param);
	public void withdrawMoney(AccountBean param);
	public void deleteAccountNum(String accountNum);
			
	
	
}
