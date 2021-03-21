package Java.CollectionFrameworkAssignment;
import java.util.*;

public class AssignmentQ4  {

    public String getEmployee(HashMap<DateClass, String> dob, String employeeName){
        //question meaning is that compare given employeeName date with other employee name dates
        List<DateClass> list = new ArrayList<>();
        DateClass neededClass =null;
        for(Map.Entry pairEntry:dob.entrySet()){
            if(pairEntry.getValue().equals(employeeName)){
                DateClass dateClass =(DateClass) pairEntry.getKey();
                neededClass = dateClass;
                continue;
            }

            DateClass dateClass =(DateClass) pairEntry.getKey();
            list.add(dateClass);
            System.out.println(pairEntry.getValue());

        }
        System.out.println(employeeName);

        // ListIterator li = list.listIterator();

        // for(DateClass dateClass:list){
        //     li.next();
        //     while(li.hasNext()){
        //         DateClass tempDateClass = (DateClass) li.next();
        //         if(dateClass.getDate() == tempDateClass.getDate() && dateClass.getMonth()== tempDateClass.getMonth() && dateClass.getYear() != tempDateClass.getYear()){
        //             System.out.println(dateClass);
        //             System.out.println(tempDateClass);
        //             return "get method fails";
        //         }

        //     }
        //     li = list.listIterator();
        // }

        for(DateClass dateClass:list){
            System.out.println(dateClass);
        }
        // int c=0;
        // for(int i=0; i<list.size()-1;i++){
        //     for(int j=i+1; j<list.size();j++){
        //         if(list.get(i).getDate() == list.get(j).getDate() && list.get(i).getMonth() == list.get(j).getMonth() && list.get(i).getYear() != list.get(j).getYear()){
        //             System.out.println(list.get(i));
        //             System.out.println(list.get(j));
        //             c+=1;
        //             System.out.println(c);
        //             break;
        //         }
        //     }
        //     if(c==1){
        //         break;
        //     }
        // }

        // if(c==1){
        //     return employeeName;
        // }

        for(int i=0; i<list.size();i++){
            if(list.get(i).getDate()==neededClass.getDate() && list.get(i).getMonth()==neededClass.getMonth() && list.get(i).getYear() != neededClass.getYear()){
                return "get method fails";
            }
        }

        return employeeName;
    }
    public static void main(String[] args) {}
}
class DateClass {
    private int date;
    private int month;
    private int year;

    public DateClass(int date, int month, int year) {
        this.date = date;
        this.month = month;
        this.year = year;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "DateClass{" +
                "date=" + date +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}
