package texteditor;

import java.time.LocalDate;

//Struct data type - holds information about user, but does not contain any methods
public class User {
    public enum UserTypeEnum{Basic_User, User_with_full_permissions}
    public int UserType;
    public String Username;
    public String Password;
    public String FirstName;
    public String LastName;
    public LocalDate DateOfBirth;

    //Constructor #1. 
    //This constructor is used for storing information full information about user.
    public User(String Username, String Password, int UserType,
            String FirstName, String LastName, LocalDate DateOfBirth) {
        this.UserType = UserType;
        this.Username = Username;
        this.Password = Password;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.DateOfBirth = DateOfBirth;
    }

    //Constructor #2. 
    //This constructor is used for storing only username and password.
    //This is useful for checking whether user can log into the application with the username and password
    public User(String Username, String Password) {
        this.Username = Username;
        this.Password = Password;
    }

}
