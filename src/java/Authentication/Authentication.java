package Authentication;

import java.util.ArrayList;

public class Authentication {

    public boolean Authenticate(String email, String password) {
        boolean isAuthenticated = false;
        
        UserDAO dao = new UserDAO();
        ArrayList<User> Users = (ArrayList) dao.findAll();
        
        for (User u:Users) {
            if (u.getEmail().equals(email) && (u.getPassword().equals(password))) {
                isAuthenticated = true;
                break;
            }
        }
        return isAuthenticated;
    }
}
