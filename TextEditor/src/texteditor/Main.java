package texteditor;

//The main class of the application
public class Main {
    public static void main(String[] args) {
        //setting up loggers
        DatabaseConnection.SetupLogger();
        LoginLogic.SetupLogger();
        NewUserLogic.SetupLogger();
        
        new Login().setVisible(true);
    }
}
