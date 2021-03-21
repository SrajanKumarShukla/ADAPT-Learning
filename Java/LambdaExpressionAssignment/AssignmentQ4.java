// Q4. Remove the words that have odd lengths from the list. HINT: Use one of the new methods from JDK 8. 
// Use removeIf() method from Collection interface.
// Description:- Write a program using java 8 features which can remove the odd length words from the list.
package Java.LambdaExpressionAssignment;
import java.util.ArrayList;

public class AssignmentQ4 {

    public ArrayList<String> removeOddLength(ArrayList<String> employeeList)
    {
        employeeList.removeIf(obj -> obj.length()%2 !=0);
        return employeeList;
    }

    public static void main(String[] args) {
        AssignmentQ4 obj = new AssignmentQ4();
        ArrayList<String> list = new ArrayList<>();

        list.add("even");
        list.add("odd");
        System.out.println(obj.removeOddLength(list));
    }
}