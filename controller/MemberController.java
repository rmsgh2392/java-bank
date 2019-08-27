package com.bitcamp.controller;
import com.bitcamp.serviceImpls.MemberServiceImpl;
import com.bitcamp.service.MemberService;
import com.bitcamp.domain.MemberBean;
import javax.swing.JOptionPane;
import com.bitcamp.domain.CustomerBean;
import com.bitcamp.domain.AdminBean;
public class MemberController {
	
	
	
	public static void main(String[] args) {
		MemberService service = new MemberServiceImpl();
		MemberBean member = null;
		CustomerBean customer= null;
		AdminBean admin = null;
		String temp = "";
		String[] arr = null;
		
		
		while(true) {
			switch (JOptionPane.showInputDialog("0.종료 \n"
					+ "1.은행가입 \n"
					+ "2.고객페이지\n")) {
			case "0":
				JOptionPane.showMessageDialog(null, "시스템 종료하겠습니다.");
				return;
				
			case "1":
				temp = JOptionPane.showInputDialog("아이디,비번,이름,주민번호,신용도");
				arr = temp.split(",");
				customer = new CustomerBean();
				customer.setId(arr[0]);
				customer.setPw(arr[1]);
				customer.setName(arr[2]);
				customer.setSsn(arr[3]);
				customer.setCredit(arr[4]);
				break;
				
			case "2":
				
				
				break;
			default:
				break;
			}
		}
		
		
	}

}
