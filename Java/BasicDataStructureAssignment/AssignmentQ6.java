// Q6. Consider a CUI based application, where you are asking a user to enter his Login name and password, after entering the valid user-id 
// and password it will print the message “Welcome” along with user name. As per the validation is concerned, the program should keep a 
// track of login attempts. After three attempts a message should be flashed saying “Contact Admin” and the program should terminate.              
// Description:- You have to create a CUI based application in which you will declare and initialize the userId and password.
// You have to enter the credentials when you login to the application(when you run the program it should ask the user to enter the credentials),
// if the entered credentials are validated correctly you should see a welcome message with the userId or else you should have total 3 attempts 
// to enter the correct credentials.If you fail to enter the right credentials in your 3rd attempt you should display a message "Contact Admin".
// Test Cases:-
// SampleInput:- (as per Specifications)
// userId = "Ajay",password = "password";
// SampleOutput:-
// Example1:-
// Enter userId
// ajay
// Enter password
// password
// You have entered wrong credentials ,please enter the right credentials.
// Example2:-
// Enter userId
// Ajay
// Enter password
// pass
// You have entered wrong credentials ,please enter the right credentials.
// Example3:-
// Enter userId
// Ajay1
// Enter password
// password
// You have entered wrong credentials 3 times
// Contact Admin
// Example4:-
// Enter userId
// Ajay
// Enter password
// password
// Welcome Ajay
package Java.BasicDataStructureAssignment;

public class AssignmentQ6 {
    public static void main(String[] args){
        Login login = new Login();
        System.out.println(login.loginUser("Ajay","password"));
    }
}
class Login {
    String userId = "Ajay",password = "password";
    public String loginUser(String user, String pass) {
        String result="";
        int count;
        for(count=0;count<3;count++){
            if(user.equals(userId) && pass.equals(password)){
                result = "Welcome "+userId;
                break;
            }else{
                if(count==2){
                    result = "You have entered wrong credentials 3 times\nContact Admin";
                    break;
                }else{
                    result = "You have entered wrong credentials ,please enter the right credentials.";
                }
            }
        }
        return result;
    }
}