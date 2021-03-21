// Q2. Write a program that describes the hierarchy of an organization. Here we need to 
// write 3 classes Employee, Manager & Labour where Manager & Labour are the sub classes of the Employee. 
// Manager has incentive & Labour has over time. Add the functionality to calculate total salary of all the employees. 
// Use polymorphism i.e. method overriding.      
// Description:- Write a program to claculate the total salaries given to all the employees by an organization. 
// In this organization there are employees category under which Manager and Labour are working where manager will 
// recieve incentive and labourer will receive overtime benifits.
package Java.IntermediateOOPAssignment;
import java.util.ArrayList;

public class AssignmentQ2 {
    int salary = 10000;

    public int getSalary(int salary){
        return salary;
    }

    public int totalEmployeesSalary(ArrayList<Integer> employeeSalaries){
        int total =0;
        for(Integer employeeSalary: employeeSalaries){
            total += employeeSalary;
        }
        return total;
    }

    public static void main(String[] args) {}
}
class Labour extends AssignmentQ2{
    @Override
    public int getSalary(int salary) {
        int overtime = 500;
        return salary + overtime;
    }
}
class Manager extends AssignmentQ2{
    @Override
    public int getSalary(int salary) {
        int incentive = 5000;
        return salary + incentive;
    }
}