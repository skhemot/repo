package com.infosys.oops ;

public class FixedDeposite extends SavingAccount{


	private double depositAmount;
	private int durationInYears;
	
	
	public FixedDeposite(String accountNumber, double balance, double interestRate,double depositAmount,int durationInYears) {
	    super(accountNumber, balance, interestRate);
		this.depositAmount =depositAmount;   
		this.durationInYears = durationInYears; 
	}
	
	public void createFixedDeposite() {
		System.out.println("FD open for amount :"+depositAmount+" with interest of :"+durationInYears);
	}
	
	
}
