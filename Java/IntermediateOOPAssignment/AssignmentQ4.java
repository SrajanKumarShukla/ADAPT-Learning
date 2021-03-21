// 4. Test the following principles of an abstract class:
// • If any class has any of its method abstract then you must declare entire class abstract.
// • Abstract class cannot be instantiated.
// • When we extend an abstract class, we must either override all the abstract methods in sub class or 
//   declare subclass as abstract.
// • Abstract class cannot be private.
// • Abstract class cannot be final.
// • You can declare a class abstract without having any abstract method.
// Description:- Write a program in such a way that all the conditions above for abstract class should satisfy.
package Java.IntermediateOOPAssignment;
abstract class AbstractCheck
{
	public int a=2;
	public void Method1()
	{
		int b=100;
		System.out.println(b);
	}
	public abstract void emptyMethod1();
	public abstract int emptyMethod2();
}

//empty abstract method
abstract class emptyAbstract
{
	
}


//subclass as abstract
//When we extend an abstract class, we must either override all the abstract methods in sub class or declare subclass as abstract.

abstract class example extends AbstractCheck
{
	
}

public class AssignmentQ4 extends AbstractCheck
{
	public static void main(String args[])
	{
		
	}
	
	@Override
	public void emptyMethod1()
	{
		
	}
	
	@Override
	public int emptyMethod2()
	{
		return 0;
	}
	
}