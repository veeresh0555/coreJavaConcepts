package com.coreconcepts.inheritance;

/*
 * Single Inheritance
 */
public class SbiBank extends Bank implements RBi,RBINDSL{
	
	public void sbidebitcard() {
		
		System.out.println("SBI Bank Debit card issued to the customer");
	}

	@Override
	public void bankrule1() {
		System.out.println("RBI passing new Rule");
		
	}

	@Override
	public void rbindsdlRule() {
		// TODO Auto-generated method stub
		
	}
	
	/*public static void main(String[] args) {
		
		Bank bank=new SbiBank();
		bank.debitCard();//superclass why?
		
		//bank.sbidebitcard();//why this is not working
		
		SbiBank sbi=new SbiBank();
		sbi.debitCard();//super class
		sbi.sbidebitcard();//subclass features
		
		
	}*/
	
	
	

}
