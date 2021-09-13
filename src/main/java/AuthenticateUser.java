
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gaurav.bs.gupta
 */
class AuthenticateUser {
    
    String INVALID_USERNAME_MESSAGE ="Login Failed, Invalid username";
    String SUCCESS_LOGIN_MESSAGE="Login Successfull";
    String INVALID_PASSWORD_MESSAGE ="Login Failed, Invalid password";
    
    public String authenticateUser(String username, String password) {
        
        if(validateUsername(username)){
            if(validatePassword(username, password)) {
                return SUCCESS_LOGIN_MESSAGE;
            }
            else {
                return INVALID_PASSWORD_MESSAGE;
            }
        } else {
            return INVALID_USERNAME_MESSAGE;
        }        
    }

    private boolean validateUsername(String username) {
       return UserStore.getUserStore().userStore.containsKey(username);      
    }
    private boolean validatePassword(String username, String password) {        
       return UserStore.getUserStore().userStore.get(username).equals(password);      
    }
    
    
    
}
