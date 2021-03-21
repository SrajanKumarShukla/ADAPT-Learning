// Q1: Find out if the given number is an Armstrong number or not. 
// Description :- An Armstrong number of three digits is an integer, where the sum of the cubes of its digits is equal to the number itself.
// Consider the example: 371=> 3^3 + 7^3 + 1^3 = 371 ( If you add those all numbers, the final digit should be same as given number ).
package Java.BasicDataStructureAssignment;
class AssignmentQ1 {
    public static void main(String[] args) {
        ArmstrongOrNot a = new ArmstrongOrNot();
        if(a.armstrongCheck(371)==true)
        {
            System.out.print("Armstrong Number");
        }
        if(a.armstrongCheck(371)==false){
            System.out.print("Not Armstrong Number");
        }

    }
}
class ArmstrongOrNot {
    public boolean armstrongCheck(int num) {
        int a,b,c=0;
        b=num;
        while(num>0){
            a=num%10;
            num=num/10;
            c=c+(a*a*a);
        }
        if(b==c){
            return true;
        }
        else{
            return false;
        }
        
    }
}