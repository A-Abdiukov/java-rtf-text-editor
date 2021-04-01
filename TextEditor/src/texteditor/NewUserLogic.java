package texteditor;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import static texteditor.UserDetails.loginCredentials;

public class NewUserLogic {
    //This method attempts to add a new user to the text file

    public static String AttemptToAddNewUser(String username, String password,
            String password2, String firstName, String lastName,
            int comboboxChoice, LocalDate dob) {

        //INPUT VALIDATION
        if (username.length() < 1) {
            return "Please enter something into \"Username\" field";
        }
        if (password.length() < 1) {
            return "Please enter something into \"Password\" field";
        }
        if (!password.equals(password2)) {
            return "The passwords you entered do not match";
        }
        if (firstName.length() < 1) {
            return "Please enter something into \"First Name\" field";
        }
        if (lastName.length() < 1) {
            return "Please enter something into \"Last Name\" field";
        }
        if (comboboxChoice == -1) {
            return "Please select something in the \'User Type\' field";
        }
        if (dob == null) {
            return "Please select a date";
        }
        //The program checks for commas, because when reading the text file, the program treats commas as separators of data
        //By using commas, the program knows when this field ends and a new field starts.
        if (username.contains(",") || password.contains(",")
                || firstName.contains(",") || lastName.contains(",")
                || dob.toString().contains(",")) {
            return "Error. One of the fields contains a comma. Please remove all commas.";
        }

        //CREATING A NEW USER
        User newUserToAdd = new User(username, password, comboboxChoice,
                firstName, lastName, dob);

        //Checking whether the user exists
        for (User user : UserDetails.loginCredentials) {
            if (user.Username.equals(newUserToAdd.Username)) //if user with matching username already exists - returns error
            {
                return "Error. Person with that username already exists";
            
            }
        }
        //END OF VALIDATION
        //START OF WRITING TO THE TEXT FILE
        try {
            FileWriter myWriter = new FileWriter(UserDetails.USER_FILE_NAME, true);
            myWriter.write(newUserToAdd.Username + "," + newUserToAdd.Password
                    + "," + newUserToAdd.UserType + "," + newUserToAdd.FirstName
                    + "," + newUserToAdd.LastName + "," + newUserToAdd.DateOfBirth + "\n");
            loginCredentials.add(newUserToAdd);
            myWriter.close();
        } catch (IOException e) {
            return "Failed to write onto a file";
        }
        //END OF WRITING TO THE TEXT FILE
        return "success";

    }
}
