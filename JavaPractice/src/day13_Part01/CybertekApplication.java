package day13_Part01;

import java.util.Scanner;

public class CybertekApplication {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your username: ");
        String username = scan.next();
        System.out.println("Enter your password: ");
        String password = scan.next();
        scan.close();
        String credential1 = "Cydeo";
        String credential2 = "WoodenSpoon";

        if (username.equals(credential1) && password.equals(credential2)){
            System.out.println("Logged in.");
        }else {
            System.out.println("Incorrect username or password");
        }


    }
}
/*
8. You are writing a code for the log-in function of the Cybertek
Application, assume that your credentials are:
username: Cydeo
password: WoodenSpoon
Ask the user to enter their credentials. If credentials are
matched, your program should print "Logged in."
otherwise print "Incorrect username or password" as error message
Hints: In order to login, both username and password MUST
be correct
you will need to use equals() method
 */