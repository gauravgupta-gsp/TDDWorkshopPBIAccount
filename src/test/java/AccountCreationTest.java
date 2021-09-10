
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
public class AccountCreationTest {
    
    @Test
    public void accountCreationIsSuccessByPassingUserNameAndPassword() {
        String expected = "Account created Successfully";
        String userName = "admin";
        String password = "123456";
        AccountCreation object = new AccountCreation();
        String message = object.createAccount(userName,password);
        Assert.assertEquals(expected, message);
    }
    @Test
    public void accountCreationFailsWhenUserNameIsNull() {
        String expected = "User creation failed as username or password is null";
        String userName = null;
        String password = "password";
        AccountCreation object = new AccountCreation();
        String message = object.createAccount(userName,password);
        Assert.assertEquals(expected, message);
    }
   
    @Test
    public void accountCreationFailsIfPasswordIsNull(){
        String expected = "User creation failed as username or password is null";
        String userName = "Admin";
        String password = null;
        AccountCreation object = new AccountCreation();
        String message = object.createAccount(userName,password);
        Assert.assertEquals(expected, message);        
    }
    
    @Test
    public void accountCreationFailsWhenUserNameAndPasswordBothAreNull() {
        String expected = "User creation failed as username or password is null";
        String userName = null;
        String password = null;
        AccountCreation object = new AccountCreation();
        String message = object.createAccount(userName,password);
        Assert.assertEquals(expected, message);
    }
    
    @Test
    public void accountCreationFailsWhenUserNameIsNotAlphabets() {
        String expected = "Account Creation fails as Username is invalid";
        String userName = "admin1";
        String password = "password";
        AccountCreation object = new AccountCreation();
        String message = object.createAccount(userName,password);
        Assert.assertEquals(expected, message);
    }
    
     @Test
    public void accountCreationFailsIfUserNameLengthisLessThanOne() { // Ask if existing code fulfill the new test case whether it should be introduced 
        String expected = "User creation failed as username or password is null";
        String userName = "";
        String password = "password";
        AccountCreation object = new AccountCreation();
        String message = object.createAccount(userName,password);
        Assert.assertEquals(expected, message);
    }
    
    @Test
    public void accountCreationFailsWhenUserNameLengthExceed11Chars() { // Ask if existing code fulfill the new test case whether it should be introduced 
        String expected = "Account Creation fails as Username is invalid";
        String userName = "TwelveCharac";
        String password = "password";
        AccountCreation object = new AccountCreation();
        String message = object.createAccount(userName,password);
        Assert.assertEquals(expected, message);
    }
    
    @Test
    public void userCreationFailsIfPasswordIsNotNumeric() { // Ask if existing code fulfill the new test case whether it should be introduced 
        String expected = "User Creation failed as password is invalid";
        String userName = "ElevenChara";
        String password = "password";
        AccountCreation object = new AccountCreation();
        String message = object.createAccount(userName,password);
        Assert.assertEquals(expected, message);
    }
}
