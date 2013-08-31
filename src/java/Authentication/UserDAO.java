package Authentication;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UserDAO extends AbstractDAO {

    public final static String SQL_TO_FIND_ALL = "SELECT id, name, email, password FROM users";
    public final static String SQL_TO_FIND = "SELECT id, name, email, password FROM users WHERE (id=?)";
    public final static String SQL_TO_CREATE = "INSERT INTO users (name, email, password) VALUES (?,?,?,?,?)";
    public final static String SQL_TO_UPDATE = "UPDATE users SET name=?, email=?, password=? WHERE (id=?)";
    public final static String SQL_TO_COUNT_ALL = "SELECT COUNT(*) FROM users";
    public final static String SQL_TO_REMOVE_ALL = "DELETE FROM users";
    public final static String SQL_TO_REMOVE = "DELETE FROM users WHERE (id=?)";
    public final static String SQL_TO_FIRST = "SELECT * FROM users LIMIT 1,1";

    public void persist(User o) throws Exception {
        if (o != null) {
            if (o.getId() == 0) {
                addNew(o);
            } else {
                update(o);
            }
        } else {
            throw new NullPointerException();
        }
    }

    public ArrayList<User> findAll() throws Exception {
        ArrayList<User> lst = new ArrayList<>();

        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            con = super.__getConnection();
            stmt = con.prepareStatement(SQL_TO_FIND_ALL);
            rs = super.__doDatabaseQuery(stmt);
            while (rs.next()) {
                lst.add(this.fillObject(rs));
            }
        } catch (SQLException e) {
//           System.out.println(e.getMessage());
           throw e;
        } finally {
            super.__closeConnection(con, stmt, rs);
        }

        return lst;

//        Users.add(this.getInstance("Lucas", "lucas@agtlucas.com", "abc123"));
//        Users.add(this.getInstance("Admin", "admin@admin.com", "123456"));
//
//        return Users;
    }

    private User getInstance(String name, String email, String password) {
        User u = new User();
        u.setName(name);
        u.setEmail(email);
        u.setPassword(password);
        return u;
    }

    private void addNew(User o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void update(User o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private User fillObject(ResultSet rs) throws SQLException {
        User u = new User();
        u.setId(rs.getInt("id"));
        u.setName(rs.getString("name"));
        u.setEmail(rs.getString("email"));
        u.setPassword(rs.getString("password"));
        return u;
    }
}
