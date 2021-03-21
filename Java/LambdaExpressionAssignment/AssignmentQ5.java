// Q5. Create a string that consists of the first letter of each word in the list of Strings provided. 
// HINT: Use Consumer interface & a String Builder to construct the result.
// Description: Write a java program using StringBuilder and Consumer interface which will return a string. 
// The returned string should consistes of the first let of each word in the list of words.
package Java.LambdaExpressionAssignment;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class AssignmentQ5 {

    List<String> list = Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot");

    public static void main(String[] args) {
        Consumer<String> obj = name -> System.out.println(name);
        obj.accept(processWords(new AssignmentQ5().list));
    }

    public static String processWords(List<String> list)
    {
        StringBuilder s = new StringBuilder("");
        list.forEach(name->s.append(name.charAt(0)));
        return s.toString();
    }
}