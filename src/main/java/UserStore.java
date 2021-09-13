
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
public class UserStore {
    
    private static UserStore  instance; 
    private UserStore() {
    
    }
    public HashMap<String, String> userStore = new HashMap<>();
    
    public static UserStore getUserStore() {
        if(instance == null) {
            instance = new UserStore();
            System.out.println("creating object ......");
        }
        return instance;        
    }
    
}
