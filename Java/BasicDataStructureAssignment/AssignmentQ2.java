// Q2. Find out all the Armstrong numbers falling in the range of 100-999
// Description :-An Armstrong number of three digits is an integer, where the sum of the cubes of its digits is equal to the number itself.
// Consider the example: 371=> 3^3 + 7^3 + 1^3 = 371 ( If you add those all numbers, the final digit should be same as given number ).
// Find the Armstrong numbers between 100 to 999.
package Java.BasicDataStructureAssignment;

import java.util.ArrayList;
import java.util.List;

public class AssignmentQ2 {
    public static void main (String [] args) {
        int min = 100;int max = 999;
        ArmstrongNumBetweenRange armstrongNumBetweenRange = new ArmstrongNumBetweenRange();
        int [] arr = armstrongNumBetweenRange.armstrongNumbersInRange(min,max);
        for(int number:arr){
            System.out.print(number + "  ");
        }
    }
}
class ArmstrongNumBetweenRange{
    public int[] armstrongNumbersInRange(int min , int max){
        int i,temp;
        List<Integer> arrayOfArmStrongNumbers = new ArrayList<>();
        for(i=min+1; i<max; i++){
            int sum = 0, digit, original=i;
            temp = i;

            while(temp>0){
                digit = temp%10;
                temp /= 10;
                sum += digit * digit * digit;
            }

            if(sum==original){
                arrayOfArmStrongNumbers.add(original);
            }
        }

        int[] arr = arrayOfArmStrongNumbers.stream()
                .mapToInt(Integer::intValue)
                .toArray();

        return arr;
    }
}
