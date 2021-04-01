
package texteditor;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class UserDetails {
        
    public static ArrayList<User> loginCredentials = new ArrayList<User>();
    public static final String USER_FILE_NAME = "login.txt";

    //This method loads all the usernames and passwords from a text file
    public static void LoadUserDetails() {

        //defining which file we wish to write our login and password details to
        File password_storage = new File(USER_FILE_NAME);

        //if  file does not exist, create a new file
        try {
            if (!password_storage.exists()) {
                password_storage.createNewFile();
            }

            //reading the file with a scanner
            Scanner myReader = new Scanner(password_storage);
            while (myReader.hasNextLine()) {

                String data = myReader.nextLine();
                String[] datas = data.split(",");

                //creating a user object which stores that information
                User userFromTextFile = new User(datas[0], datas[1], 
                        Integer.parseInt(datas[2]), datas[3], datas[4], 
                        LocalDate.parse(datas[5]));

                loginCredentials.add(userFromTextFile);
            }
            myReader.close();
        } catch (IOException | NumberFormatException ex) {
            System.out.println("An error had occured while reading the login & passwords file " + ex.getMessage());
        }
    }
}
