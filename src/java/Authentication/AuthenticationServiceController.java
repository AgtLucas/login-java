package Authentication;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "AuthenticationServiceController", urlPatterns = {"/AuthenticationService"}, initParams = {
    @WebInitParam(name = "Nome", value = "Valor")})

public class AuthenticationController extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        WebUtil util = new WebUtil();
        
        String login = util.readParameter(request, "name", "");
        String password = util.readParameter(request, "password", "");
        
        
        AuthenticationService service = new AuthenticationService();
        
        User user = service.authentication(login, password);
        
        if (user != null) {
            HttpSession session = request.getSession(true);
            session.setAttribute("userID", String.valueOf(user.getId()));
            session.setAttribute("username", user.getName());
            response.sendRedirect("dashboard.jsp");
        } else {
            response.sendRedirect("index.jsp");
        }
        
    }
    
    /**
     * 
     * Handles the HTTP
     * <code>GET</code> method.
     * 
     * @param request servlet request
     * @param request response servlet response
     * @throws ServletException if a servlet-specifc errors occurs
     * @throws IOException if an I/O error occurs
     */
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        processRequest(request, response);
        
    }
    
    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        processRequest(request, response);
    }
    
    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
//    @Override
//    public String getServletInfo() {
//        return "Something...";
//    }
    
}
