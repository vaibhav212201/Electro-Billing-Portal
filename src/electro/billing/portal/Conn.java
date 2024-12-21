package electro.billing.portal;

import java.sql.*;

public class Conn {

    Connection c;
    Statement s;
    Conn() {
        try {
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebp", "root", "1234567890");
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
