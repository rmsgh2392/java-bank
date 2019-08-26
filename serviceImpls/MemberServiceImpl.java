package com.bitcamp.serviceImpls;
import com.bitcamp.domain.AdminBean;
import com.bitcamp.domain.CustomerBean;
import com.bitcamp.domain.MemberBean;
import com.bitcamp.service.MemberService;
public class MemberServiceImpl implements MemberService{
	
	private CustomerBean[] customers;
	private MemberBean[] members;
	private AdminBean[] admins;
	private int count;
	
	public MemberServiceImpl() {
		customers = new CustomerBean[10];
		members = new MemberBean[10];
		admins =  new AdminBean[10];
		count = 0;//고객수 카운
	}
	
	
	@Override
	public void join(CustomerBean param) {
		customers[count] = param;
		count++;
	}

	@Override
	public CustomerBean[] findAllCustomers() {
//		CustomerBean[] customers = new CustomerBean[count];
//		for(int i=0;i<count;i++) {
//			customers[i] = this.customers[i].toString();
//		}
		return customers;
	}

	@Override
	public AdminBean[] findAllAdmins() {
		return admins;
	}

	@Override
	public MemberBean[] findByName(String name) {
		int j =0;
		for(int i =0;i<count;i++) {
			if(name.equals(members[i].getName())) {
				j++;
			}
		}
		j=0;
		MemberBean[] members = new MemberBean[j];
		for(int i=0;i<count;i++) {
			if(name.equals(this.members[i].getName())) {
				members[i] = this.members[i];
				j++;
				if(members.length == j) {
					break;
				}
				members[i] = this.members[i];
			}
		}
		return members;
	}

	@Override
	public MemberBean findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean login(MemberBean param) {
		
		
		
		return false;
	}

	@Override
	public int countCustomers() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int countAdmins() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean existId(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void updatePass(MemberBean param) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteMember(MemberBean param) {
		// TODO Auto-generated method stub
		
	}

	

}
