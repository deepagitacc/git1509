package org.emp;

public class Employee {
	
	public void EmpId() {
		
		System.out.println("emp id is 1234");
		
	}
	
	public void EmpName() {
		
		System.out.println("emp name sam");
		
	}
	
	public void EmpDob() {
		
		System.out.println("emp dob 15.2.1999");
	}
	
	public void EmpPhone() {
		
		System.out.println("emp phone vivo");
	}
	
	public void EmpEmail() {
		
		System.out.println("emp email yahoo.com");
	}
	
	public void EmpAddress() {
		
		System.out.println("emp address chennai");
		
	}
	
	public static void main(String[]args) {
		
		Employee e=new Employee();
		e.EmpId();
		e.EmpName();
		e.EmpDob();
		e.EmpPhone();
		e.EmpEmail();
		e.EmpAddress();
	}
	
	

}
