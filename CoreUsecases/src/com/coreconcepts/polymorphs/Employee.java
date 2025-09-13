package com.coreconcepts.polymorphs;
/**
 * Method Overloading
 */
public class Employee {
	
	public String getName(String name) {
		String eName=name;
		return eName;
	}
	
	
	public String getName(String name,Long eId) {
		String eName=name;
		Long empId=eId;
		return eName+" "+empId;
	}
	
	
	
	public static void main(String[] args) {
		Employee emp=new Employee();
		String rEmpName=emp.getName("LiKhith");
		String rEmpNameAndId=emp.getName("LiKhith", 1234l);
		System.out.println(""+rEmpName+"\n  \t"+rEmpNameAndId);
	}
	
	
	

}
