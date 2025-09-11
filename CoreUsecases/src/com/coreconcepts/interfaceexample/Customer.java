package com.coreconcepts.interfaceexample;

public class Customer implements BankOperation {

	@Override
	public void createAccount() {
		System.out.println("Account created for the User ; Account number is 123");

	}

	@Override
	public void updateUserdetails() {
		System.out.println("User Details Updated");

	}

	@Override
	public void deposit() {
		System.out.println("Amount deposited: Rs. 100/-");

	}

	@Override
	public void withdrow() {
		System.out.println("Amount withdraw: Rs. 50/-");

	}

	public static void main(String[] args) {
		Customer customer = new Customer();

		customer.createAccount();
		customer.updateUserdetails();
		customer.deposit();
		customer.withdrow();

	}

}
