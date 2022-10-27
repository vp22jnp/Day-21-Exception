package com.UserRegistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email extends Exception{
    public static void main(String[] args) throws InvalidInputByUser {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter email");
        String email = sc.next();
        Email userRegistrationProblem = new Email();
        userRegistrationProblem.EmailCheck(email);
    }
    public boolean EmailCheck(String name) throws InvalidInputByUser {
        Pattern pattern1 = Pattern.compile("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$");
        Matcher matcher1 = pattern1.matcher(name);
        if (matcher1.matches()) {
            System.out.println("Valid Email");
            return true;
        } else  throw new InvalidInputByUser("Not valid");
        // return false;
    }

}


