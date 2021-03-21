// Q9. Accept the marks of three students for the subject say A, B, C. Find the total scored and the average in all the subjects. 
// Also Find the Total and Average scored by students in each respective Subject.           
// Description:- Enter the marks of 3 students for subjects A,B,C. Find the total marks secured by respective student in all 
// the subjects and also find the total and average scored by students subject wise.
// Example:-
//         Sample Input:-
//             marks of Student 1 in subjects A,B,C
//                 10 20 30
//             marks of Student 2 in subjects A,B,C
//                 10 20 30
//             marks of Student 3 in subjects A,B,C
//                 10 20 30                          
//         Sample Output:-
//                 180                                    //Total marks of all the students in all subjects
//                 60.0                                   //Average marks of all the students in all subjects
//                 30                                     // Total marks scored by students in subject A
//                 10.0                                   // Average marks scored by students in subject A
//                 60                                     // Total marks scored by students in subject B
//                 20.0                                   // Average marks scored by students in subject B
//                 90                                     // Total marks scored by students in subject C
//                 30.0                                   // Average marks scored by students in subject C 

package Java.BasicDataStructureAssignment;

public class AssignmentQ9 {
    public static void main(String[] args){
        Student student = new Student(10,20,30);
    }  
}
class Student {
    private int subjectA,subjectB,subjectC;

    public Student(int subjectA,int subjectB,int subjectC){
        this.subjectA = subjectA;
        this.subjectB = subjectB;
        this.subjectC = subjectC;
    }

    public int studentsTotalMarksInAllSubjects(Student[] students) {
        int totalMarks = 0;
        for(Student student:students){
            totalMarks = totalMarks + student.subjectA + student.subjectB + student.subjectC;
        }
        return totalMarks;
    }

    public double studentsAverageMarksInAllSubjects(Student[] students) {
        int totalMarks = 0;
        for(Student student:students){
            totalMarks = totalMarks + student.subjectA + student.subjectB + student.subjectC;
        }

        return (double) (totalMarks/students.length);
    }

    public int[] subjectWiseMarks(Student[] students,String subjectName){

        int[] arr = new int[students.length];
        for(int i=0; i<students.length;i++){

            if(subjectName.equals("subjectA")){
                arr[i] = students[i].subjectA;
            }else if(subjectName.equals("subjectB")){
                arr[i] = students[i].subjectB;
            }else if(subjectName.equals("subjectC")){
                arr[i] = students[i].subjectC;
            }

        }
        return arr;
    }

    public int subjectATotalByStudents(int[] marks) {
        int totalMarks = 0;
        for(int mark:marks){
            totalMarks += mark;
        }
        return totalMarks;
    }
}