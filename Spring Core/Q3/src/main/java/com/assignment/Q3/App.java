//Create a Test class with main() method, get BankAccountController bean object from ApplicationContext and perform all the operations.
package com.assignment.Q3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public BankAccount account;

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		BankAccountController controller = (BankAccountController)context.getBean("bankAccountController");
		double amountLeft = controller.withdraw(controller.getAccount().getAccountId(), 10000);
	    System.out.println(amountLeft);
		System.out.println(controller);
	}

	@Override
	public String toString() {
		return "BankAccountController [account=" + account + "]";
	}

}
