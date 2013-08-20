package Authentication;

import java.util.ArrayList;

public class UserDAO {
    
    public ArrayList<User> findAll() {
        ArrayList<User> Users = new ArrayList<>();
        
        Users.add(this.getInstance("Lucas", "lucas@agtlucas.com", "abc123"));
        Users.add(this.getInstance("Admin", "admin@admin.com", "123456"));
        
        return Users;
    }
 
    private User getInstance(String name, String email, String password) {
        User u = new User();
        u.setName(name);
        u.setEmail(email);
        u.setPassword(password);
        return u;
    }
}
