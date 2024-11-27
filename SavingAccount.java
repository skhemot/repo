package com.infosys.oops;

public class SavingAccount extends BankAccount{

	private double interestRate;
	
	public SavingAccount(String accountNumber, double balance,double interestRate) {
		super(accountNumber, balance);
		this.interestRate =interestRate; 
		
	}
	


	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void addInterst() {
		double interest = super.getBalance() * interestRate /100;
		System.out.println("Interest added is :"+interest);
	}
	
	
}
