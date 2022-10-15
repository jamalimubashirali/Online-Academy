import java.util.*;
public class LogIn {
   private String enteredName;
   private String enteredPassword;
   Register rg;
    LogIn(){
        boolean codition = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Username or Email: ");
        enteredName = sc.next();
        System.out.println("Enter Your Password");
        enteredPassword = sc.next();
        for (int i = 0;i< rg.userNames.size() ; i++){
            if(enteredName.equals(rg.userNames.get(i))||enteredName.equals(rg.emails.get(i))){
                System.out.println("LogIn SuccessFull....");
                codition=false;
                break;
            }
            if (codition==true) System.out.println(" Wrong Email or password ");
        }
    }
}
