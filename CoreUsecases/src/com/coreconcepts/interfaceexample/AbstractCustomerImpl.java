package com.coreconcepts.interfaceexample;

public class AbstractCustomerImpl extends Abstractbank {

	@Override
	void createAccount() {
		System.out.println("Account created 123");
		
	}
	
	public static void main(String[] args) {
		AbstractCustomerImpl custimpl=new AbstractCustomerImpl();
		custimpl.createAccount();
		custimpl.updateUserdetails();
		
		
	}
	
	
	

}
