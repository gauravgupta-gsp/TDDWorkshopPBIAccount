
import org.junit.Assert;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gaurav.bs.gupta
 */
public class AuthenticateUserTest {
    
    @Test
    public void loginSuccessfullIfCorrectUsernameAndPasswordArePassed(){
        String username="admin";
        String password = "123456";
        String expected ="Login Successfull";
        
        AccountCreation accountCreation = new AccountCreation();
        accountCreation.createAccount(username, password);
        
        Assert.assertTrue(UserStore.getUserStore().userStore.containsKey(username));
      
        AuthenticateUser instance = new AuthenticateUser();
        String result=  instance.authenticateUser(username, password);
        
        Assert.assertEquals(expected, result);
    }
  
        
    @Test
    public void loginFailedIncaseInvalidUsernameIsPassed(){
        String username="admin";
        String password = "123456";
        String expected ="Login Failed, Invalid username";
        
        AccountCreation accountCreation = new AccountCreation();
        accountCreation.createAccount(username, password);
        
        Assert.assertTrue(UserStore.getUserStore().userStore.containsKey(username));
        
        AuthenticateUser instance = new AuthenticateUser();
        String result=  instance.authenticateUser("admin1", "123456");
        
        Assert.assertEquals(expected, result);
    }
    
    @Test
    public void loginFailedIncaseInvalidPasswordIsPassed(){
        String username="admin";
        String password = "12345";
        String expected ="Login Failed, Invalid password";
      
        AccountCreation accountCreation = new AccountCreation();
        accountCreation.createAccount(username, password);
        
        Assert.assertTrue(UserStore.getUserStore().userStore.containsKey(username));
      
        
        AuthenticateUser instance = new AuthenticateUser();
        String result=  instance.authenticateUser("admin", "123");
        
        Assert.assertEquals(expected, result);
    }    
}
