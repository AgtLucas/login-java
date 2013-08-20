package Authentication;

import java.util.ArrayList;

public class UserDAO {
    
    public ArrayList<User> findAll() {
        ArrayList<User> Users = new ArrayList<>();
        
        Users.add(this.getInstance("Lucas", "abc123"));
        Users.add(this.getInstance("Admin", "123456"));
        
        return Users;
    }
 
    public void getInstance() {
        
    }
}
