import java.util.*;

public class Register {
    private String username;
    private String email;
    private String password;
    ArrayList<String> userNames = new ArrayList<String>();
    ArrayList<String> emails = new ArrayList<String>();
    ArrayList<String> passwords = new ArrayList<String>();
    Register(){
       Scanner sc = new Scanner(System.in);
        System.out.println("Create Your Username: ");
        username=sc.next();
        userNames.add(username);
        System.out.println("Enter Your Email: ");
        email=sc.next();
        emails.add(email);
        System.out.println("Create Your Password: ");
        password=sc.next();
        passwords.add(password);
    }
}
