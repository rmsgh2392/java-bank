package com.bitcamp.service;
import com.bitcamp.domain.MemberBean;
import com.bitcamp.domain.CustomerBean;
import com.bitcamp.domain.AdminBean;
public interface MemberService {
	public void join(CustomerBean param);
	public void register(AdminBean param);
	public CustomerBean[] findAllCustomers();
	public AdminBean[] findAllAdmins();
	public MemberBean[] findByName(String name); // 고객, 사원 공용메소드
	public MemberBean findById(String id); // 고객, 사원 공용메소드
	public boolean login(MemberBean param);
	public int countCustomers(); // 고객수
	public int countAdmins(); // 직원수
	public boolean existId(String id);
	public void updatePass(MemberBean param);
	public void deleteMember(MemberBean param);
	
	
}
