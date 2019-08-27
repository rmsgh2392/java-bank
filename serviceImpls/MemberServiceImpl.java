package com.bitcamp.serviceImpls;
import com.bitcamp.domain.AdminBean;
import com.bitcamp.domain.CustomerBean;
import com.bitcamp.domain.MemberBean;
import com.bitcamp.service.MemberService;
public class MemberServiceImpl implements MemberService{
//	서버는 저장소가 필요하다. 데이터베이스(저장소)와 연결된다 서비스(로직 구현)
//	서버니까 저장소가 필요하니까 포조방식으로 private걸어서 ~
	private CustomerBean[] customers;
	private AdminBean[] admins;
	private int countCus,Countad;
	
	public MemberServiceImpl() {
		customers = new CustomerBean[10];
		admins =  new AdminBean[10];
		countCus = 0;//고객수 카운트
		Countad = 0;//사원등록 카운트
	}
	
	
	@Override
	public void join(CustomerBean param) {//고객 회원가입 메서드
		customers[countCus] = param;//고객들이 회원가입 한 만큼 레퍼런스 변수인 커스터머스에 정보가 들어간다
		countCus++;
	}

	
	@Override
	public void register(AdminBean param) {//사원등록 메서드
		admins[Countad] = param;//사원들이 등록 한 만큼 레퍼런스 변수인 어드민스에 정보가 들어간다.
		Countad++;
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
		int count1=0,count2=0,count3=0;
		for(int i=0;i<countCus;i++) {
			if(name.equals(customers[i].getName())) {
				count1++;
				break;
//				고객용 기능
			}
		}
		for(int i =0;i<Countad;i++) {
			if(name.equals(admins[i].getName())) {
				count2++;
				break;
//				사원용 기능
			}
		}
		count3 = count1 + count2;
		MemberBean[] members = new MemberBean[count3];
		int j =0;
		for(int i=0;i<countCus;i++) {
			if(name.equals(customers[i].getName())) {
				members[j] = customers[i];
				j++;
				if(count1 == j) {
					break;
					
				}
//				고객용 기능
			}
		}
		int k =0;
		for(int i =0;i<Countad;i++) {
			if(name.equals(admins[i].getName())) {
				members[k] = admins[i];
				k++;j++;
				if(count2 == k) {
					break;
				}
//				사원용 기능
			}
		}
		return members;
	}

	@Override
	public MemberBean findById(String id){
		MemberBean c = new MemberBean();
		for(int i=0;i<countCus;i++) {
			if(id.equals(customers[i].getId())) {
				c = customers[i];
				break;
//				고객용 기능
			}
		}
		for(int i =0;i<Countad;i++) {
			if(id.equals(admins[i].getId())) {
				c = admins[i];
				break;
//				사원용 기능
			}
		}
		return c;
}	
	

	@Override
	public boolean login(MemberBean param) {
		boolean result = false;
//		for(int i=0;i<count;i++) {
//			if(param.getId().equals(members[i].getId())
//					&& param.getPw().equals(members[i].getPw())) {
//				result = false;
//				break;
//			}
//		}
		MemberBean b = findById(param.getId());
		if(b.getPw().equals(param.getPw())) {
			result = true;
		}
		return result;
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
	public boolean existId(String id) {//아이디 중복체크 조인메서드 보다 먼저 앞서 일어나야 한다.
		boolean result = false;
		for(int i=0;i<countCus;i++) {
			if(id.equals(customers[i].getId())) {
				result = true;
				break;
//				고객용 기능
			}
		}
		for(int i =0;i<Countad;i++) {
			if(id.equals(admins[i].getId())) {
			    result = true;
				break;
//				사원용 기능
			}
		}
		return result;
	}

	@Override
	public void updatePass(MemberBean param) {//절대 실패하지 않을 코드를 짜라 !!
		String id = param.getId();
		String[] pw = param.getPw().split(",");
		String oldPw = pw[0];
		String newPw = pw[1];
		param.setPw(oldPw);
		if(login(param)) {
			for(int i=0;i<countCus;i++) {
				if(id.equals(customers[i].getId())) {
					 customers[i].setPw(newPw);;
					break;
//					고객용 기능
				}
			}
			for(int i =0;i<Countad;i++) {
				if(id.equals(admins[i].getId())) {
					 admins[i].setPw(newPw);;
					break;
//					사원용 기능
				}
			}
		}
	}
		

	@Override
	public void deleteMember(MemberBean param) {
			if(login(param)) {
				int i=0;
				for(;i<countCus;i++) {
				if(customers[i].getId().equals(param.getId())) {
					customers[i] = null;
					customers[i] = customers[countCus-1];
					countCus--;
					break;
				}
					
			}
		
		i=0;
		for(;i<Countad;i++) {
			if(admins[i].getId().equals(param.getId())) {
				admins[i] = null;
				admins[i] = admins[Countad-1];
				countCus--;
				break;
			}
	     }
	  }

	

}
}
