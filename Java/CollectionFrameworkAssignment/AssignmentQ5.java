package Java.CollectionFrameworkAssignment;
import java.util.Hashtable;
public class AssignmentQ5 {
    public static void main(String[] args) {
        Hashtable<Employee,String> hashtable = new Hashtable<>();
        Employee employee1 = new Employee("amit",1);
        Employee employee2 = new Employee("sumit",2);
        hashtable.put(employee1,"amit");
        hashtable.put(employee2,"sumit");

        System.out.println(hashtable.get(employee1));
    }
}
 class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;

        return id == employee.id &&
                Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }
}