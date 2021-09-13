
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gaurav.bs.gupta
 */
class AccountCreation {
    
   public  HashMap<String, String> userStore = new HashMap<>();
   
   public HashMap<String,String> getUserStore(){
       return userStore;
   }

    public String createAccount(String userName, String password) {
        String successMessage = "Account created Successfully";
        String userNameNullMessage = "User creation failed as username or password is null";
        String invalidUserName = "Account Creation fails as Username is invalid";        
        String passwordShouldContainOnlyNumbers = "User Creation failed as password is invalid";
        
        if ( userName == null || userName.isEmpty() || password == null  ) {
            return userNameNullMessage;
        }        
        else if(!validateUsername(userName)){
            return invalidUserName;
        }
        else if(validatePassword(password)) {
            return passwordShouldContainOnlyNumbers;
        }        
        UserStore.getUserStore().userStore.put(userName, password);
        
        return successMessage;
              
    }
    
    private boolean validateUsername(String username) {
        if( username.length()>11 || !username.matches("[a-zA-Z]+")) {
            return false;
        }
        return true;
    }
    
    private boolean validatePassword(String password) {
        return !password.matches("[0-9]*");        
    }    
}
