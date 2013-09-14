package Authentication;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.xml.ws.Response;

public class AuthenticationService {
    
  
    public User authentication(String login, String password) {
        
        User u = null;       
        try {
            u = this.findAuthenticate(login, password);
        } catch (Exception e) {
            System.out.println("Error!!!!");
        }
        
        return u;
        
    }

    private User findAuthenticate(String login, String password) throws Exception {                      
        User u = this.findAuthenticateFullScan(login, password);
        return u;
        
    }

    private User findAuthenticateFullScan(String login, String password) throws Exception {
        
        User user = null;
        
        UserDAO dao = new UserDAO();        
        ArrayList<User> users = (ArrayList) dao.findAll();
        
        for (User u : users) {            
            if ((u.getName().equals(login)) && (u.getPassword().equals(password))) {
                user = u;
                break;
            }
        }
        return user;
    }
    
}
