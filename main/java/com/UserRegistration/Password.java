package com.UserRegistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {
    public static void main(String[] args) throws InvalidInputByUser{

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter password");
        String password = sc.next();
        Password userRegistrationProblem = new Password();
        userRegistrationProblem.passwordCheck(password);
    }
    public boolean passwordCheck(String password) throws InvalidInputByUser {
        Pattern pattern1 = Pattern.compile("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$");
        Matcher matcher1 = pattern1.matcher(password);
        if (matcher1.matches()) {
            System.out.println("Valid First Name");
            return true;
        } else
            throw new  InvalidInputByUser("invalid password :" +
                "passward should hava minimum  8 Characters" +
                "password should have atleast 1 UpperCase" +
                "password should have atleast 1 numeric number");
       // invalidInputByUser.printStackTrace();
    }
}
        // return false;

