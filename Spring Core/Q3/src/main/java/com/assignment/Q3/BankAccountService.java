//Create an interface BankAccountService with following methods:

//public double withdraw(long accountId, double balance)
//public double deposit(long accountId, double balance)
//public double getBalance(long accountId)
//public boolean fundTransfer(long fromAccount, long toAccount, double amont
package com.assignment.Q3;

public interface BankAccountService {
	public double withdraw(long accountId, double balance);
	public double deposit(long accountId, double balance);
	public double getBalance(long accountId);
	public boolean fundTransfer(long fromAccount, long toAccount, double amont);

}
