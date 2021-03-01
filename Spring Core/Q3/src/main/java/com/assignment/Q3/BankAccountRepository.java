//Create an interface BankAccountRepository with following methods:

//public double getBalance(long accountId)
//public double updateBalance(long accountId, double newBalance):
//Note: Above method returns updated balance.
package com.assignment.Q3;

public interface BankAccountRepository {
	public double getBalance(long accountId);
	public double updateBalance(long accountId, double newBalance);
}
