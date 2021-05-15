package texteditor;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

public class DatabaseConnection {

    private static Connection conn;
    private static ResultSet rs;
    private static PreparedStatement stmt;
    private static String url, uName = "root";
    private static Logger logger;
    private static FileHandler handler;

    public static void SetupLogger() {
        try {
            logger = Logger.getLogger(DatabaseConnection.class.getName());
            handler = new FileHandler("DatabaseConnection.log", true);
            logger.addHandler(handler);
        } catch (IOException ex) {
            System.out.println("An error has occured at SetupLogger(). " + ex.getMessage());
        }
    }

    public static Boolean AttemptLogin(User user) {
        try {
            connectToDb();
            stmt = conn.prepareStatement("call usp_AttemptLogin(?,?);");
            stmt.setString(1, user.Username);
            stmt.setString(2, user.Password);

            rs = stmt.executeQuery();
            rs.next();
            Boolean success = rs.getBoolean(1);

            return success;

        } catch (Exception ex) {
            logger.severe("An error has occured at AttemptLogin(). " + ex.getMessage());
        }
        return false;
    }

    public static Boolean AddNewUser(User user) {
        try {
            connectToDb();
            stmt = conn.prepareStatement("call usp_AddNewUser(?,?,?,?,?,?);");

            stmt.setString(1, user.Username);
            stmt.setString(2, user.Password);
            stmt.setString(3, user.FirstName);
            stmt.setString(4, user.LastName);
            stmt.setString(5, String.valueOf(user.UserType));
            stmt.setString(6, user.DateOfBirth.toString());

            rs = stmt.executeQuery();

            return true;
        } catch (Exception ex) {
            logger.severe("An error has occured at AddNewUser(). " + ex.getMessage());
        }
        return false;
    }

    public static void connectToDb() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            url = "jdbc:mysql://localhost:3306/authentification";
            conn = DriverManager.getConnection(url, uName, "root");
        } catch (Exception ex) {
            logger.severe("An error has occured at connectToDb(). " + ex.getMessage());
        }
    }

}
