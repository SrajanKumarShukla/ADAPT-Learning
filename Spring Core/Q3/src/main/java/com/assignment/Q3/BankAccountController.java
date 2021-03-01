//Create a class BankAccount controller with following operations:


//public double withdraw(long accountId, double balance)
//public double deposit(long accountId, double balance)
//public double getBalance(long accountId)
//public boolean fundTransfer(long fromAccount, long toAccount, double amont
package com.assignment.Q3;

import org.springframework.context.ApplicationContext;

public class BankAccountController {
	private BankAccount account;	
	public BankAccountController(BankAccount account) {
		super();
		this.account = account;
	}

	public BankAccount getAccount() {
		return account;
	}
	public void setAccount(BankAccount account) {
		this.account = account;
	}
	public double withdraw(long accountId, double balance) {
		//we use account id if it was in database; no need of id here
		double amountLeft = account.getAccountBalance()-balance;
		account.setAccountBalance(amountLeft);
		return amountLeft;
	}
	public double deposit(long accountId, double balance) {
		//we use account id if it was in database; no need of id here
		double totalAmount = account.getAccountBalance()+balance;
		account.setAccountBalance(totalAmount);
		return totalAmount;
	}
	public double getBalance(long accountId) {
		//we use account id if it was in database; no need of id here
		return account.getAccountBalance();
	}
	/*public boolean fundTransfer(long fromAccount, long toAccount, double amont) {
		
	}*/
	
}
