// Q6. Replace every word in the list with its upper case equivalent. Use replaceAll() method & Unary Operator interface.
// Using replaceAll() method and Unary Operator interface write a java program which replaces evry word in the list with 
// its upper case equivalent.
package Java.LambdaExpressionAssignment;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class AssignmentQ6 {

    public List<String> convertToUpperCase(List<String> list) {

        UnaryOperator<String> obj = s -> s.toUpperCase();
        list.replaceAll(obj);
        return list;
    }

    public static void main(String[] args) {

        List<String> list = Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot");

        AssignmentQ6 obj = new AssignmentQ6();
        System.out.println(obj.convertToUpperCase(list));
    }
}