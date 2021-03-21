// Q1. Write a singleton class. Confirm that singleton class cannot be inherited.
// Singleton Class:-The singleton design pattern is used to restrict the instantiation of a class and ensures 
// that only one instance of the class exists in the JVM. In other words, a singleton class is a class that can 
// have only one object (an instance of the class) at a time per JVM instance.
// Specifications :
// class SingletonInheritanceCheck{ }
// public class Assignment2Q1 {}
package Java.IntermediateOOPAssignment;
class SingletonInheritanceCheck
{
	
	private static SingletonInheritanceCheck instance=null;
	public String check;
	private SingletonInheritanceCheck()
	{
		check="my singleton";
		
	}
	
	public static SingletonInheritanceCheck getInstance()
	{
		if(instance==null)
		{
			instance=new SingletonInheritanceCheck();
		}
		
		return instance;
	}
	
	
}
