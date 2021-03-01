package com.assignment.Q1;

public class Address {
	
	private String street,city,state;
	private int zip;
	private String country;
	Address(String street,String city,String state,int zip,String country){
		this.street=street;
		this.city=city;
		this.state=state;
		this.zip=zip;
		this.country=country;
	}
	public String getStreet() 
	{ 
		return street;
	}
	public String getCity() 
	{ 
		return city;
	}
	public String getState() 
	{
	    return state;
	}
	public int getZip() 
	{ 
		return zip;
	}
	public String getCountry() 
	{ 
		return country;
	}
// Uncomment the following line for setter injection and do same in Customer.java and spring_config.xml	
//	public String getStreet() 
//	{ 
//		return street;
//	}
//	public void setStreet(String street) 
//	{ 
//		this.street = street;
//	}
//	public String getCity() 
//	{ 
//		return city;
//	}
//	public void setCity(String city) 
//	{
//	    this.city = city;
//	}
//	public String getState() 
//	{
//	    return state;
//	} 
//	public void setState(String state) 
//	{
//	    this.state = state;
//	}
//	public int getZip() 
//	{ 
//		return zip;
//	}
//	public void setZip(int zip) 
//	{ 
//		this.zip = zip;
//	}
//	public String getCountry() 
//	{ 
//		return country;
//	}
//	public void setCountry(String country) 
//	{ 
//		this.country = country;
//	}
	
}
