// Q9. Create a Class SavingAccount with field’s acc_balance, acc_ID, accountHoldername, isSalaryAccount. 
// Also add setter and getter methods with business method like withdraw and deposit.
// a. Create class BankAccountList which will maintain SavingAccount objects. Ensure that this class should not allow 
// duplicates as well as data should be displayed in sorted order. (as per acc_ID)

package Java.CollectionFrameworkAssignment;

import java.util.*;

class SavingAccount {

    private double acc_balance;
    private int acc_ID;
    private String accountHolderName;
    private boolean isSalaryAccount;

    public SavingAccount(double acc_balance, int acc_ID, String accountHolderName, boolean isSalaryAccount) {
        this.acc_balance = acc_balance;
        this.acc_ID = acc_ID;
        this.accountHolderName = accountHolderName;
        this.isSalaryAccount = isSalaryAccount;
    }

    public double getAcc_balance() {
        return acc_balance;
    }

    public void setAcc_balance(double acc_balance) {
        this.acc_balance = acc_balance;
    }

    public int getAcc_ID() {
        return acc_ID;
    }

    public void setAcc_ID(int acc_ID) {
        this.acc_ID = acc_ID;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public boolean isSalaryAccount() {
        return isSalaryAccount;
    }

    public void setSalaryAccount(boolean salaryAccount) {
        isSalaryAccount = salaryAccount;
    }

    public void deposite(double deposite)
    {
        this.acc_balance = deposite;
    }

    public void withdraw(double withdraw)
    {
        if(withdraw <= this.acc_balance){
            this.acc_balance = withdraw;
        }
    }

    public int compareTo(SavingAccount compare) {
        if (this.acc_ID > compare.acc_ID) {
            return 1;
        }
        else {
            return 0;
        }
    }

    public void add(SavingAccount savingAccount) {
    }
}

class BankAccountList{

    private TreeSet<SavingAccount> savingAccounts = new TreeSet<>();

    public boolean addSavingAccount(SavingAccount savingAccount) {
        if(savingAccount != null){
            savingAccount.add(savingAccount);
            return true;
        }
        return false;
    }

    public List<Integer> displaySavingAccountIds() {
        Iterator<SavingAccount> obj = savingAccounts.iterator();
        List<Integer> l = new ArrayList<>();
        while (obj.hasNext()){
            l.add(obj.next().getAcc_ID());
        }
        return l;
    }
}

public class Assignment3Q9 {
    public static void main(String[] args) {

    }
}
© 2021 GitHub, Inc.
