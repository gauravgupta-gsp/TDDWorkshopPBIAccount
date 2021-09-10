
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
    public Map<String, String> userStore = new HashMap<String, String>();
    
    String INVALID_USERNAME_MESSAGE ="Login Failed, Invalid username";
    
    public String authenticateUser(String username, String password) {
//        String CREATED_USERNAME="admin";
//        String CREATED_PASSWORD = "123456";
        String SUCCESS_LOGIN_MESSAGE="Login Successfull";
        String INVALID_PASSWORD_MESSAGE ="Login Failed, Invalid password";
        
        if(username == null) {
            return INVALID_USERNAME_MESSAGE;
        }
       
        return SUCCESS_LOGIN_MESSAGE;
    }

    private boolean validateUsername(String username) {
       boolean userExists = userStore.containsKey(username);
       if(userExists) {
        
       } 
       else {
                return INVALID_USERNAME_MESSAGE;
       }
    }
    
}
