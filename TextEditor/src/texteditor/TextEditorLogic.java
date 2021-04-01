package texteditor;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class TextEditorLogic {

    private static File selectedFile;
    private static final String DEFAULT_FILE_LOCATION = "unsaved.rtf";
    
    //This method creates a new RTF file and writes the provided String onto it
    public static void CreateNewFileAndWriteIt(String notepad_contents) {
        CreateNewFileAs();
        WriteOntoFile(notepad_contents);
    }

    //This method assigns selected file to the default location
    //And then reads the contents of the default file
    //That's why if you exit the application and log in, you
    public static String loadDefaultFile() {
        TextEditorLogic.selectedFile = new File(TextEditorLogic.DEFAULT_FILE_LOCATION);
        String output = ReadRTF();
        return output;
    }

    //Calls a method that asks user to create a new file and assign a location to it
    private static void CreateNewFileAs() {
        //save as
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Specify a file to save");

        fileChooser.setAcceptAllFileFilterUsed(false);
        fileChooser.addChoosableFileFilter(new FileNameExtensionFilter(".rtf file", "rtf"));

        int userSelection = fileChooser.showSaveDialog(new JFrame());

        if (userSelection == JFileChooser.APPROVE_OPTION) {

            selectedFile = new File(fileChooser.getSelectedFile().getAbsoluteFile() + ".rtf");

            if (!selectedFile.exists()) {
                try {
                    selectedFile.createNewFile();
                } catch (IOException ex) {
                    Logger.getLogger(TextEditor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    //This method writes the string onto the file provided
    public static void WriteOntoFile(String toWrite) {
        if (toWrite.length() > 0) {
            try {
                DataOutputStream dos = new DataOutputStream(new FileOutputStream(selectedFile));
                dos.writeBytes(toWrite);
                dos.close();
            } catch (IOException ex) {
            }
        }
    }
    
    //This method asks user  whether they wish to clear the notepad
    public static Boolean AskToClearNotepad() {
        int reply = JOptionPane.showConfirmDialog(new JFrame(), "Do you wish to clear the notepad (text area)?",
                "About", JOptionPane.YES_NO_OPTION);

        if (reply == JOptionPane.YES_OPTION) {
            return true;
        }
        return false;
    }

    //This method opens the file and reads the contents
    public static String OpenAndReadRTF() {
        //Opening a dialogue to select an rtf file
        JFileChooser jfc = new JFileChooser();
        jfc.setAcceptAllFileFilterUsed(false);
        jfc.addChoosableFileFilter(new FileNameExtensionFilter(".rtf file", "rtf"));

        //If the user selected a file 
        if (jfc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            selectedFile = jfc.getSelectedFile();

            //Attempting to read the file
            return ReadRTF();
        }
        return "";
    }
    //This method reads the contents of the file onto a String
    public static String ReadRTF() {
        try {
            JEditorPane jep = new JEditorPane(selectedFile.getAbsolutePath(), "");
            jep.read(new FileInputStream(selectedFile.getAbsoluteFile()), null);
            return jep.getText();
        } catch (IOException ex) {
        }
        return "";
    }
}
