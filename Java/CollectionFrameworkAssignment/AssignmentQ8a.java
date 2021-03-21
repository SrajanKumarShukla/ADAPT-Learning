// Q8.1.  Test fail-fast iterators within multithreaded environment. Note example of fail fast iterator is Vector, 
// ArrayList, HashSet etc. And fail-safe is ConcurrentHashMap, CopyOnWriteArrayList etc.
// Fail Fast: Iterators in java are used to iterate over the Collection objects.Fail-Fast iterators immediately 
// throw ConcurrentModificationException if there is structural modification of the collection. Structural modification 
// means adding, removing or updating any element from collection while a thread is iterating over that collection. 
// Iterator on ArrayList, HashMap classes are some examples of fail-fast Iterator.
import java.util.*;
public class AssignmentQ8a {

    public static void failFast(Map<String, String> cityCode){
        Iterator obj = cityCode.keySet().iterator();

        while (obj.hasNext())
        {
            System.out.println(cityCode.get(obj.next()));
            cityCode.put("LA","USA");
        }
    }

    public static void main(String[] args) {

        Map<String,String> obj = new HashMap<String,String>();
        obj.put("Paris","France");
        obj.put("Mumbai","India");
        failFast(obj);

    }
}