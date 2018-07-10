package com.abhinav.webapp.login;

public class LoginService {
    
    public boolean validateUser(String username, String password){
    
        if(username.equalsIgnoreCase("abhi") && password.equals("1234"))
            return true;
        
        return false;
    }
}
