// Q8. Create a new thread that prints the numbers from the list. Use class Thread & interface Consumer.
// Description:-Write a java program which will print the list of number using Thread and interface Consumer.
package Java.LambdaExpressionAssignment;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class AssignmentQ8 implements Runnable{
    public static void main(String[] args) {

    AssignmentQ8 obj = new AssignmentQ8();
    Thread one = new Thread(obj);
    one.start();
    List<String> list = Arrays.asList("alpha", "bravo", "charlie", "delta", "echo");
    obj.out.accept(list);
    }

    Consumer<List<String>> out = list -> {for(String obj1:list){
        System.out.println(obj1);
    }};

    @Override
    public void run() {

    }
}