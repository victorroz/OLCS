package com.company;

public class UserRegistration {
    private static int id;
    private String name;
    private String email;
    private String username;
    private String password;

    public UserRegistration(String name, String email, String username, String password) {
        if(this.emailVerifier(email) && this.passwordLengthChecker(password)){
            this.id += 1;
            this.name = name;
            this.email = email;
            this.username = username;
            this.password = password;
            System.out.println("Account created successfully!!");
        }
        else {
            System.out.println("Please check your inputs");
        }
    }

    public void showInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Email: " + this.email);
        System.out.println("Username: " + this.username);
    }

    public boolean emailVerifier(String email) {
        return (email.contains("@") && email.contains(".com")) ? true : false;
    }

    public boolean passwordLengthChecker(String password) {
        return (password.length() > 8 && password.length() < 16) ? true : false;
    }
}
