package com.coreconcepts.polymorphs;

public class Customer2 {
	
	Customer customer1=new Customer();
	
	
	public Customer2(Customer customer1) {
		super();
		this.customer1 = customer1;
	}


	public String getName(String name) {
		String custName=name;
		System.out.println("This is Customer2");
		return custName;
	}
	
	
	/*
	 * public static void main(String[] args) {
	 * 
	 * 
	 * Customer customer1=new Customer(); customer1.getName("customer1");
	 * 
	 * Customer2 customer2 =new Customer2(); customer2.getName("customer2");
	 * 
	 * 
	 * 
	 * }
	 */
	

}
