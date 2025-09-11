package com.coreconcepts;

public class MainTest {
	
	public static void main(String[] args) {
		
		
		Employee emp =new Employee();
		emp.setEmpid("emp123");
		emp.setName("Veeresh");
		emp.setMobileNumber(12345l);
		emp.setSalary(145.0);
		
		
		System.out.println("EmployeeId: "+emp.getEmpid()+" EmployeeName: "+emp.getName()+" \t "+emp.getMobileNumber()+"\t"+emp.getSalary());
		
		
	}

}
