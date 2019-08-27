package com.bitcamp.controller;
import com.bitcamp.service.AccountService;
import com.bitcamp.serviceImpls.AccountServiceImpl;
public class Test {

	public static void main(String[] args) {
		AccountService s = new AccountServiceImpl();
		s.createAccountNum();
	}

}
