// Q3. Write a program to consider saving & current account in the bank. Saving account holder has ‘Fixed Deposits’ 
// whereas Current account holder has cash credit. Apply polymorphism to find out total cash in the bank.
// Description:- Write a program to claculate the total cash available in the bank. 
// In this bank,bank will provide two types of accounts one is savings accounts and another is current account 
// where current account has cash credits and savings account has fixed deposit options.
package Java.IntermediateOOPAssignment;
import java.util.ArrayList;

public class AssignmentQ3 {
    private int totalCash = 0;
    public int totalCashInBank(ArrayList<Integer> cash){
        int total = 0;
        for(Integer cashList:cash){
            total += cashList;
        }
        totalCash = total;

        return total;
    }
    public int getCash(){
        return totalCash;
    }
    public static void main(String[] args) {}
}
class CurrentAccount extends AssignmentQ3{
    int totalDeposits = 10000;
    int creditLimit = 2000;
    @Override
    public int getCash() {
        return totalDeposits - creditLimit;
    }
}
class SavingsAccount extends AssignmentQ3{
    int totalDeposits = 10000;
    int fixedDepositAmount = 5000;
    @Override
    public int getCash() {
        return totalDeposits + fixedDepositAmount;
    }
}