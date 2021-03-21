// Q7. Convert every key-value pair of the map into a string and append them all into a single string, in iteration order. 
// HINT: Use Map.entrySet() method & a StringBuilder to construct the result String.
// Description:- Write a java program using Map.entrySet() method & a StringBuilder which will return a string by 
// appending all the key value pairs of a map into a single string ,in insertion order.
package Java.LambdaExpressionAssignment;
import java.util.HashMap;
import java.util.Map;

public class AssignmentQ7 {

    public String convertKeyValueToString(HashMap<String, Integer> map) {
        StringBuilder S = new StringBuilder();
        for(Map.Entry<String,Integer> app : map.entrySet())
        {
            S.append(app.getKey());
            S.append(app.getValue());
        }
        return S.toString();
    }

    public static void main(String[] args) {

        HashMap<String,Integer> obj = new HashMap<>();
        obj.put("map.entrySet()",1);
        obj.put("StringBuilder",2);

        AssignmentQ7 obj1 = new AssignmentQ7();
        System.out.println(obj1.convertKeyValueToString(obj));
    }
}