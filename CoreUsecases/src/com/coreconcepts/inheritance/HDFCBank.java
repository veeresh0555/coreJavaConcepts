package com.coreconcepts.inheritance;


/*
 * Multi-level inheritance
 */
public class HDFCBank extends SbiBank{
	
public void hdfcdebitcard() {
		
		System.out.println("HDFC Bank Debit card issued to the customer");
	}



public static void main(String[] args) {
	
	
	Bank bank=new HDFCBank();
	bank.debitCard();
	
	
	HDFCBank hdfc=new HDFCBank();
	hdfc.debitCard();
	hdfc.sbidebitcard();
	hdfc.hdfcdebitcard();
	
	//Bank bank1=new SbiBank();
	SbiBank sbi=new SbiBank();
	sbi.debitCard();
	sbi.sbidebitcard();
	
	

	
}
	

}
