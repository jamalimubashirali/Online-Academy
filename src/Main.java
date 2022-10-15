import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice;
        Scanner sc =new Scanner(System.in);
        System.out.println("\t\tWelcome to Online Academy");
        System.out.println("\t\t1.LogIn\t2.SignUp");
        choice = sc.nextInt();
        if (choice==1){
            new LogIn();
        } else if (choice==2) {
            new Register();
        }else {
            System.out.println("Wrong Selection.");
            System.out.println("If not have an account get yourself registered.");
        }
    }
}