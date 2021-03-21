// Q3. Find out the simple as well as the compound interest of supplied value
// Description:-
// Simple Interest:- Generally, simple interest paid or received over a certain period is a fixed percentage of the principal amount that was borrowed or lent
//               Simple Interest = (P×r×n)/100
//               where:
//               P = Principal amount
//               r = Annual interest rate
//               n = Term of loan, in years
// ​Compound Interest:-Compound interest accrues and is added to the accumulated interest of previous periods; it includes interest on interest, in other words.
//               Compound Interest = P(1+r)^t-P
//               Where:
//               P=Principal amount
//               r=Annual interest rate
//               t=Number of years interest is applied
package Java.BasicDataStructureAssignment;

public class AssignmentQ3 {
    public static void main(String[] args){
        SiCi siCi = new SiCi();
        System.out.println(siCi.simpleInterest(2000, 1, 5));
        System.out.println(siCi.compoundInterest(2000,2,5));
    }
    
}
class SiCi {
    public double simpleInterest(double principalAmount,int time,double interestRate){
        double a = (principalAmount*time*interestRate)/100;
        return a ;
    }
    public double compoundInterest(double principalAmount,int time,double interestRate){
        double a = (principalAmount*(Math.pow((1+(interestRate)/100),time))) - principalAmount;
        return a ;
    }
}
