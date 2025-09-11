package com.coreconcepts;

/*
 * Access modifiers
 * 
 * public 
 * private
 * 
 * protected
 * 
 * default
 * 
 */
public class Employee {

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	private String empid;
	private String name;
	private Double salary;
	private Long mobileNumber;
	
	

	public String getEmpid() {
		return empid;
	}

	public void setEmpid(String empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setEmpid("emp123");
		emp.setName("Veeresh");
		emp.setMobileNumber(12345L);
		emp.setSalary(145.0);

		System.out.println("EmployeeId: " + emp.getEmpid() + " EmployeeName: " + emp.getName() + " \t "
				+ emp.getMobileNumber() + "\t" + emp.getSalary());

	}

}
