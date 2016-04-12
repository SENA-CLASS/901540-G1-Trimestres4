package dao;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author javaknowledge
 */
public class Database {

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/uploadimage",
                    "root", "bari123");
            return con;
        } catch (Exception ex) {
            System.out.println("Database.getConnection() Error -->" + ex.getMessage());
            return null;
        }
    }

    public static void close(Connection con) {
        try {
            con.close();
        } catch (Exception ex) {
        }
    }
}
