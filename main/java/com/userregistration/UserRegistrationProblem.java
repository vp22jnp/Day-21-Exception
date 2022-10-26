package com.userregistration;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class UserRegistrationProblem extends Exception{
    public static void main(String[] args) throws InvalidInputByUser {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter first Name");
        String firstName = in.nextLine();
        UserRegistrationProblem userRegistrationProblem = new UserRegistrationProblem();
        userRegistrationProblem.firstName(firstName);
        System.out.println("Enter last Name");
        String lastName = in.nextLine();
        userRegistrationProblem.lastName(lastName);
        System.out.println("Enter the User Email");
        String gmail = in.nextLine();
        userRegistrationProblem.email(gmail);
        System.out.println("Enter Phone Number ");
        String phoneNO = in.nextLine();
        userRegistrationProblem.phoneNO(phoneNO);
        System.out.println("Enter Password:" +
                "Rule 1: password must be minimum 8 character" +
                "Rule 2: passwrod must be contain numeric number" +
                "Rule 3: password must contain alleast one Upper Case");
        String password = in.nextLine();
        userRegistrationProblem.password(password);
    }

    private void password(String password) throws InvalidInputByUser{
        if(passwordCheck(password)){
            System.out.println("Valid input");
        }
        else {
            InvalidInputByUser invalidInputByUser = new InvalidInputByUser("invalid password :" +
                    "passward should hava minimum  8 Characters" +
                    "password should have atleast 1 UpperCase" +
                    "password should have atleast 1 numeric number");
            invalidInputByUser.printStackTrace();
        }
    }

    private void phoneNO(String phoneNO) throws InvalidInputByUser {
        if(phoneNOCheck(phoneNO)){
            System.out.println("Valid input");
        }
        else {
            InvalidInputByUser invalidInputByUser = new InvalidInputByUser("invalid phone number");
            invalidInputByUser.printStackTrace();
        }
    }

    private void email(String gmail) {
        if(emailCheck(gmail)){
            System.out.println("Valid input");
        }
        else {
            InvalidInputByUser invalidInputByUser = new InvalidInputByUser("invalid gmail");
            invalidInputByUser.printStackTrace();
        }
    }


    private void lastName(String lastName) {
        if(lastNameCheck(lastName)){
            System.out.println("Valid input");
        }
        else {
            InvalidInputByUser invalidInputByUser = new InvalidInputByUser("invalid first Name pattern");
            invalidInputByUser.printStackTrace();
        }
    }

    private void firstName(String firstName) {
        if(lastNameCheck(firstName)){
            System.out.println("Valid input");
        }
        else {
            InvalidInputByUser invalidInputByUser = new InvalidInputByUser("invalid last Name pattern");
            invalidInputByUser.printStackTrace();
        }
    }

    public boolean firstNameCheck(String name){
        Pattern pattern1 = Pattern.compile("[A-Z]{1}[a-z]{3,}");
        Matcher matcher1 = pattern1.matcher(name);
        if (matcher1.matches()) {
            System.out.println("Valid First Name");
            return true;
        } else System.out.println("Not valid");
        return false;
    }
    public boolean lastNameCheck(String name){
        UserRegistrationProblem userRegistrationProblem = new UserRegistrationProblem();
        return userRegistrationProblem.firstNameCheck(name);
    }
    public boolean emailCheck(String email){
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$");
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
            System.out.println("vaild");
            return true;
        } else System.out.println("not Valid");
        return false;
    }
    public boolean phoneNOCheck(String phoneNO){
        Pattern pattern2 = Pattern.compile("^(?:(?:\\+|0{0,2})91(\\s*[\\ -]\\s*)?|[0]?)?[789]\\d{9}|(\\d[ -]?){10}\\d$");
        Matcher matcher3 = pattern2.matcher(phoneNO);
        if (matcher3.matches()) {
            System.out.println("valid phone number");
            return true;
        } else {
            System.out.println("Not a valid Phone number");
        }
        return false;
    }
    public boolean passwordCheck(String password){
        Pattern pattern3 = Pattern.compile("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$");
        Matcher matcher4 = pattern3.matcher(password);
        if (matcher4.matches()) {
            System.out.println("valid password");
            return true;
        } else System.out.println("not valid password");
        return false;
    }

}

class InvalidInputByUser extends Exception{
    public InvalidInputByUser(String string){
        super(string);
    }
}



