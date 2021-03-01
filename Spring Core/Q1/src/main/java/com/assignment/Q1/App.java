package com.assignment.Q1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App {
		private static ApplicationContext context;

		public static void main(String as[]) {
	        context = new ClassPathXmlApplicationContext("spring-config.xml");
	        Customer customer = (Customer)context.getBean("Customer");
	        Address address = (Address)context.getBean("address");
	        System.out.println("Customer Name : " +customer.getCustomerName());
	        System.out.println("Customer ID : " +customer.getCustomerId());
	        System.out.println("Customer ID : " +customer.getCustomerContact());
	        System.out.println("Addres :" +customer.getCustomerAddress().getStreet());
	        System.out.println("--" + address.getCity());
	        System.out.println("--" + address.getState());
	        System.out.println("--" + address.getZip());
	        System.out.println("--" + address.getCountry());
	    }
}
