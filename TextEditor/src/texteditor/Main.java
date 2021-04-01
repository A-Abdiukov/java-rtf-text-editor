package texteditor;

//The main class of the application
public class Main {
    public static void main(String[] args) {
        UserDetails.LoadUserDetails();
        new Login().setVisible(true);
    }
}
