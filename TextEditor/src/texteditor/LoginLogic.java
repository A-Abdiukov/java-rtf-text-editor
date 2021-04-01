package texteditor;
public class LoginLogic {

    //This method attemps to log in with the information provided
    public static Boolean AttemptToLogin(String username, String password) {

        User tocheck = new User(username, password);

        for (User userToCheck : UserDetails.loginCredentials) {
            if (userToCheck.Username.equals(tocheck.Username)
                    && userToCheck.Password.equals(tocheck.Password)) {
                //if user with matching username & password exists - returns true
                return true;
            }
        }
        //if the login or password are incorrect, return false
        return false;
    }
}
