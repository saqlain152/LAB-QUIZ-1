package main;

import users.UserManager;
import util.PasswordValidator;


public class LoginSystem {
    public static void main(String[] args) {
      
        String registeredUsername = "admin";
        String registeredPassword = "password123";

        UserManager userManager = new UserManager(registeredUsername, registeredPassword);

        
        System.out.println("=== Login System ===");
        String username = System.console().readLine("Enter username: ");
        String password = System.console().readLine("Enter password: ");


        UserManager.PasswordValidator passwordValidator = userManager.new PasswordValidator();
        if (!passwordValidator.isValid(password)) {
            System.out.println("Invalid password format!");
            return;
        }

        if (userManager.login(username, password)) {
            System.out.println("Access granted! Welcome, " + username + ".");
        } else {
            System.out.println("Access denied! Invalid credentials.");
        }
    }
}