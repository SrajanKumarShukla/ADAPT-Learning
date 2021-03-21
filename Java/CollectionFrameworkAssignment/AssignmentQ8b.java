// Q8.2. Test fail-safe iterators within multithreaded environment. Note example of fail fast iterator is Vector, 
// ArrayList, HashSet etc. And fail-safe is ConcurrentHashMap, CopyOnWriteArrayList etc.
// Fail Safe:
// Fail-Safe iterators don’t throw any exceptions if a collection is structurally modified while iterating over it. 
// This is because, they operate on the clone of the collection, not on the original collection and that’s why they are 
// called fail-safe iterators. Iterator on CopyOnWriteArrayList, ConcurrentHashMap classes are examples of fail-safe 
// Iterator.
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class AssignmentQ8b {
    public static CopyOnWriteArrayList<Integer> failFast(CopyOnWriteArrayList<Integer> list){
        Iterator<Integer> obj = list.iterator();

        while(obj.hasNext())
        {
            System.out.println(obj.next());
            list.add(2021);
        }
        return list;
    }

    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> obj = new CopyOnWriteArrayList<Integer>();
        obj.add(21);
        obj.add(4);
        obj.add(2000);
        failFast(obj);
    }
}
