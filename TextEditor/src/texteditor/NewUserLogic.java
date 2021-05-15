package texteditor;

import java.io.IOException;
import java.time.LocalDate;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

public class NewUserLogic {

    private static Logger logger;
    private static FileHandler handler;

    public static void SetupLogger() {
        try {
            logger = Logger.getLogger(NewUserLogic.class.getName());
            handler = new FileHandler("NewUser.log", true);
            logger.addHandler(handler);
        } catch (IOException ex) {
            System.out.println("An error has occured at SetupLogger(). " + ex.getMessage());
        }
    }
    //This method attempts to add a new user to the text file
    public static String AttemptToAddNewUser(String username, String password,
            String password2, String firstName, String lastName,
            int comboboxChoice, LocalDate dob) {

        //INPUT VALIDATION
        if (username.length() < 1) {
            logger.info("Failed to create new user."
                    + "\nReason =  username provided has a length of less than 1");
            return "Please enter something into \"Username\" field";
        }
        if (password.length() < 1) {
            logger.info("Failed to create new user."
                    + "\nReason =  password provided has a length of less than 1");
            return "Please enter something into \"Password\" field";
        }
        if (!password.equals(password2)) {
            logger.info("Failed to create new user."
                    + "\nReason =  \"password\" and \"re-enter password\" fields do not match");
            return "The passwords you entered do not match";
        }
        if (firstName.length() < 1) {
            logger.info("Failed to create new user."
                    + "\nReason =  first name provided has a length of less than 1");
            return "Please enter something into \"First Name\" field";
        }
        if (lastName.length() < 1) {
            logger.info("Failed to create new user."
                    + "\nReason =  last name provided has a length of less than 1");
            return "Please enter something into \"Last Name\" field";
        }
        if (comboboxChoice == -1) {
            logger.info("Failed to create new user."
                    + "\nReason =  the user has not selected anything in combobox (user type combobox)");
            return "Please select something in the \'User Type\' field";
        }
        if (dob == null) {
            logger.info("Failed to create new user."
                    + "\nReason =  the user has not selected anything in date time picker (date of birth picker)");
            return "Please select a date";
        }

        //CREATING A NEW USER
        User newUser = new User(username, password, comboboxChoice,
                firstName, lastName, dob);

        if (DatabaseConnection.AddNewUser(newUser)) {
            return "success";
        } else {
            return "Failed to update the database.";
        }

    }
}
