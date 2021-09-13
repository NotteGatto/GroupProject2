package com.company.GroupProject.Task5;
    /*Create Registration Class in which you would have variables as email, userName and password that have an access scope
    only within its own class. After creating an object of the class user should be able to call methods and in each method
    separately pass values to set users email, username and password.
    Requirements:
    A.Valid email consider to be only yahoo
    B.Valid userName and password cannot be empty and should be of length larger than 6 characters.
    Also, valid password cannot contain userName.*/

public class Registration {
    private String email;
    private String userName;
    private String password;

    public void getEmail(String email) {
        if (email.contains("yahoo.com")){System.out.println("You have a valid email");
            this.email = email;
        }else{System.out.println("Your email has to be on yahoo domain");}}

    public void getUserName(String userName) {
        if (userName.length()>6 && !userName.isEmpty()){
            System.out.println("It's a valid userName");
            this.userName = userName;
        }else{System.out.println("Its not a valid userName");}}

    public void getPassword(String password) {
        if (password.isEmpty()){System.out.println("Password can not be empty");
        } else if (password.length()<6 || password.contains(userName)) {
            System.out.println("Your password is not valid");
        } else{
            System.out.println("Your password is valid.");
            this.password = password;
        }
    }}








