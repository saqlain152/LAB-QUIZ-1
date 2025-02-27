package users;

import util.PasswordValidator;

public class UserManager {
    private String registeredUsername;
    private String registeredPassword;

  
    public UserManager(String username, String password) {
        this.registeredUsername = username;
        this.registeredPassword = password;
    }

  
    public static class LoginHandler {
        public boolean validateCredentials(String enteredUsername, String enteredPassword,
                                           String registeredUsername, String registeredPassword) {
            return enteredUsername.equals(registeredUsername) && enteredPassword.equals(registeredPassword);
        }
    }

   
    public class PasswordValidator {
        public boolean isValid(String password) {
          
            return password.length() >0;
        }
    }

   
    public boolean login(String username, String password) {
        LoginHandler loginHandler = new LoginHandler();
        return loginHandler.validateCredentials(username, password, registeredUsername, registeredPassword);
    }
}