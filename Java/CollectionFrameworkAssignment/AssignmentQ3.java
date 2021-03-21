
package Java.CollectionFrameworkAssignment;
import java.util.*;
public class AssignmentQ3 {
    public static List traverseReverse(ArrayList aList){
        List list = new ArrayList();
        ListIterator listIterator = aList.listIterator();

        while(listIterator.hasNext()){
            listIterator.next();
        }

        while(listIterator.hasPrevious()){
            list.add(listIterator.previous());

        }

        return list;
    }
    public static void main(String[] args) {
        ArrayList<String> aList = new ArrayList<String>();
        aList.add("Amanda");
        aList.add("Peter");
        aList.add("Julie");
        aList.add("James");
        aList.add("Emma");
        System.out.println(traverseReverse(aList));

    }
    
}
