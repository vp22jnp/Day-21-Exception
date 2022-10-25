package com.UserRegistration;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class FirstName extends Exception {
    public static void main(String[] args) throws InvalidInputByUser{

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Name");
        String firstName = sc.next();
        FirstName userRegistrationProblem = new FirstName();
        userRegistrationProblem.firstNameCheck(firstName);
    }
    public boolean firstNameCheck(String name) throws InvalidInputByUser {
        Pattern pattern1 = Pattern.compile("[A-Z]{1}[a-z]{3,}");
        Matcher matcher1 = pattern1.matcher(name);
        if (matcher1.matches()) {
            System.out.println("Valid First Name");
            return true;
        } else
            throw new InvalidInputByUser("Entered name is not valid");
       // return false;
    }

}


