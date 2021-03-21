// Q4. Supply marks of three subject and declare the result, result declaration is based on below conditions:
//               Condition 1: -All subjects marks is greater than 60 is Passed
//               Condition 2: -Any two subjects marks are greater than 60 is Promoted
//               Condition 3: -Any one subject mark is greater than 60 or all subjects’ marks less than 60 is failed.
// Description:-
// Specify the marks of 3 subjects and the results will be declared based on the conditions above and for reference go through the test cases for better understanding.      
// Test cases:-
//               TestCase1:-
//                             Input:-     10          10          10
//                             Output:-  failed
//               TestCase2:-
//                             Input:-      70          10          10
//                             Output:-   failed
//               TestCase3:-
//                             Input:-      10          20          40
//                             Output:-   passed
//               TestCase4:-
//                              Input:-      10          30          40
//                             Output:-    Passed
//                                             promoted 
package Java.BasicDataStructureAssignment;

class AssignmentQ4 {
    public static void main(String[] args)
    {
        ResultDeclaration resultDeclaration = new ResultDeclaration();
        System.out.println(resultDeclaration.declareResults(10,10,10));
        System.out.println(resultDeclaration.declareResults(70,10,10));
        System.out.println(resultDeclaration.declareResults(10,20,40));
        System.out.println(resultDeclaration.declareResults(10,30,40));
    }
}
class ResultDeclaration {
    public String declareResults( double subject1Marks, double subject2Marks, double subject3Marks) {
        if((subject1Marks + subject2Marks + subject3Marks)>60){
            if(subject1Marks >60|| subject2Marks >60|| subject3Marks>60){
                return "failed";
            }
            else{
                if((subject1Marks + subject2Marks)>60 || (subject2Marks+subject3Marks)>60 || (subject1Marks+subject3Marks)>60){
                    return "passed\npromoted";
                }
                else{
                    return "passed";
                }
            }
        }
        else{
        return "failed";
        }
    }
}