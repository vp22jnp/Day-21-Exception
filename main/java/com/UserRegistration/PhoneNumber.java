package com.UserRegistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber extends Exception {
    public static void main(String[] args) throws InvalidInputByUser{

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter phone number");
        String phonenumber = sc.next();
        PhoneNumber userRegistrationProblem = new PhoneNumber();
        userRegistrationProblem.phoneNumberCheck(phonenumber);
    }
    public boolean phoneNumberCheck(String phonenumber) throws InvalidInputByUser {
        Pattern pattern1 = Pattern.compile("^\\d{10}$");
        Matcher matcher1 = pattern1.matcher(phonenumber);
        if (matcher1.matches()) {
            System.out.println("Valid phonenumber");
            return true;
        } else
            throw new InvalidInputByUser("Entered number is not valid");
        // return false;
    }

}


