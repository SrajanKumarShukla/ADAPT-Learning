// Q2. Write an application using lambda expressions to print Orders having 2 criteria implemented: 
// 1) order price more than 10000 
// 2) order status is ACCEPTED or COMPLETED.
// Description:
// Write a program in such a way that it has a method which returns the list of orders satisfying the 2 conditions mentioned
// in the question.
package Java.LambdaExpressionAssignment;
import java.util.ArrayList;
import java.util.Iterator;

public class AssignmentQ2 {
    private int totalPrice;
    private String status;

    public AssignmentQ2(int tp, String s)
    {
        this.totalPrice = tp;
        this.status = s;
    }

    public int getP()
    {
        return this.totalPrice;
    }

    public String getS()
    {
        return this.status;
    }

    public void setP(int tp)
    {
        this.totalPrice=tp;
    }

    public void set(String s)
    {
        this.status=s;
    }

    public static ArrayList<AssignmentQ2> listOfOrders(ArrayList<AssignmentQ2> orders)
    {
        Iterator<AssignmentQ2> i = orders.iterator();
        while (i.hasNext())
        {
            AssignmentQ2 obj = i.next();
            if(obj.getP()>=10000 && obj.getS().equals("Accepted")) {}
            else if(obj.getP()>=10000 && obj.getS().equals("Completed")){}
            else { i.remove(); }
        }
        return orders;
    }

    public static void main(String[] args) {

        AssignmentQ2 a1 = new AssignmentQ2(10000,"Accepted");
        AssignmentQ2 a2 = new AssignmentQ2(11000,"Completed");
        AssignmentQ2 a3 = new AssignmentQ2(9000,"Accepted");

        ArrayList<AssignmentQ2> obj = new ArrayList<AssignmentQ2>();
        obj.add(a1);
        obj.add(a2);
        obj.add(a3);

        obj = listOfOrders(obj);

        obj.forEach((order) -> {
            System.out.println(order.getP()+" "+order.getS());});
    }
}
