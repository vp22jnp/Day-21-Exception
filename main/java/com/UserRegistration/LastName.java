package com.UserRegistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LastName extends Exception{
    public static void main(String[] args) throws InvalidInputByUser{

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter last Name");
        String lastName = sc.next();
        LastName userRegistrationProblem = new LastName();
        userRegistrationProblem.lastNameCheck(lastName);
    }
    public boolean lastNameCheck(String name) throws InvalidInputByUser {
        Pattern pattern1 = Pattern.compile("[A-Z]{1}[a-z]{3,}");
        Matcher matcher1 = pattern1.matcher(name);
        if (matcher1.matches()) {
            System.out.println("Valid last Name");
            return true;
        } else
            throw new InvalidInputByUser("Entered name is not valid");
        // return false;
    }

}



