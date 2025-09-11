package com.coreconcepts.inheritance;

public class IciciBank extends Bank {

	public void iciciDebitcard() {

		System.out.println("ICICI Bank Debit card issued to the customer");
	}

	public static void main(String[] args) {
		
		Bank bank=new IciciBank();
		bank.debitCard();
		
		
		IciciBank icici=new IciciBank();
		
		icici.debitCard();
		icici.iciciDebitcard();

	}

}
