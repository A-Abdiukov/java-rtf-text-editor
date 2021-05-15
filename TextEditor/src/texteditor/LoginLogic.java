package texteditor;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

public class LoginLogic {

    private static Logger logger;
    private static FileHandler handler;

    public static void SetupLogger() {
        try {
            logger = Logger.getLogger(LoginLogic.class.getName());
            handler = new FileHandler("Login.log", true);
            logger.addHandler(handler);
        } catch (IOException ex) {
            System.out.println("An error has occured at SetupLogger(). " + ex.getMessage());
        }
    }

    //This method attemps to log in with the information provided
    public static Boolean AttemptToLogin(String username, String password) {

        User tocheck = new User(username, password);
        Boolean success = DatabaseConnection.AttemptLogin(tocheck);

        if (success) {
            logger.info("Success login for username = " + username);
            return true;
        } else {
            logger.info("Failed to login for username = " + username);
            return false;
        }
    }
}
