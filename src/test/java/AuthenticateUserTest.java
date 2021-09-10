
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
      
        AuthenticateUser instance = new AuthenticateUser();
        String result=  instance.authenticateUser(username, password);
        
        Assert.assertEquals(expected, result);
    }
    
    @Test
    public void loginFailsIfUsernameIsPassedAsNull(){
        String username=null;
        String password = "123456";
        String expected ="Login Failed, Invalid username";
      
        AuthenticateUser instance = new AuthenticateUser();
        String result=  instance.authenticateUser(username, password);
        
        Assert.assertEquals(expected, result);
    }
        
    @Test
    public void loginFailedIncaseInvalidUsernameIsPassed(){
        String username="admin1";
        String password = "123456";
        String expected ="Login Failed, Invalid username";
      
        AuthenticateUser instance = new AuthenticateUser();
        String result=  instance.authenticateUser(username, password);
        
        Assert.assertEquals(expected, result);
    }
//    
//    @Test
//    public void loginFailedIncaseInvalidPaasswordIsPassed(){
//        String username="admin";
//        String password = "12345";
//        String expected ="Login Failed, Invalid password";
//      
//        AuthenticateUser instance = new AuthenticateUser();
//        String result=  instance.authenticateUser(username, password);
//        
//        Assert.assertEquals(expected, result);
//    }    
}
