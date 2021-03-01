package com.assignment.Q1;

public class Customer {
	private String customerName,customerId, customerContact;
    private Address customerAddress;
 Customer(String customerName,String customerId,String customerContact,Address customerAddress){
	this.customerName=customerName;
	this.customerId=customerId;
	this.customerContact=customerContact;
	this.customerAddress=customerAddress;
 }
    public String getCustomerName() {
      return customerName;
  }
    public String getCustomerId() {
      return customerId;
  }
    public String getCustomerContact() {
      return customerContact;
  }
    public Address getCustomerAddress() {
      return customerAddress;
  }
//    Uncomment the following line for setter injection and do same in Address.java and spring_config.xml
//    public String getCustomerName() {
//        return customerName;
//    }
// 
//    public void setCustomerName(String customerName) {
//        this.customerName = customerName;
//    }
// 
//    public String getCustomerId() {
//        return customerId;
//    }
// 
//    public void setCustomerId(String customerId) {
//        this.customerId = customerId;
//    }
//    public String getCustomerContact() {
//        return customerContact;
//    }
// 
//    public void setCustomerContact(String customerContact) {
//        this.customerContact = customerContact;
//    }
//    public Address getCustomerAddress() {
//        return customerAddress;
//    }
// 
//    public void setCustomerAddress(Address customerAddress) {
//        this.customerAddress = customerAddress;
//    }
}
