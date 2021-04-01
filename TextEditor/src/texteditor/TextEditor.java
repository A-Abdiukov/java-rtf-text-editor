package texteditor;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TextEditor extends javax.swing.JFrame {

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_textEditor = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem_fileNew = new javax.swing.JMenuItem();
        jMenuItem_fileOpen = new javax.swing.JMenuItem();
        jMenuItem_fileSave = new javax.swing.JMenuItem();
        jMenuItem_fileSaveAs = new javax.swing.JMenuItem();
        jMenuItem_fileExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem_editCut = new javax.swing.JMenuItem();
        jMenuItem_editCopy = new javax.swing.JMenuItem();
        jMenuItem_editPaste = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem_helpAbout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jTextArea_textEditor.setColumns(20);
        jTextArea_textEditor.setRows(5);
        jScrollPane1.setViewportView(jTextArea_textEditor);

        jMenu1.setText("File");

        jMenuItem_fileNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/texteditor/icons/New.png"))); // NOI18N
        jMenuItem_fileNew.setText("New");
        jMenuItem_fileNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_fileNewActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_fileNew);

        jMenuItem_fileOpen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/texteditor/icons/Open.png"))); // NOI18N
        jMenuItem_fileOpen.setText("Open");
        jMenuItem_fileOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_fileOpenActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_fileOpen);

        jMenuItem_fileSave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem_fileSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/texteditor/icons/Save.png"))); // NOI18N
        jMenuItem_fileSave.setText("Save");
        jMenuItem_fileSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_fileSaveActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_fileSave);

        jMenuItem_fileSaveAs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/texteditor/icons/SaveAs.png"))); // NOI18N
        jMenuItem_fileSaveAs.setText("Save as");
        jMenuItem_fileSaveAs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_fileSaveAsActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_fileSaveAs);

        jMenuItem_fileExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/texteditor/icons/Exit.png"))); // NOI18N
        jMenuItem_fileExit.setText("Exit");
        jMenuItem_fileExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_fileExitActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_fileExit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jMenuItem_editCut.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem_editCut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/texteditor/icons/Cut.png"))); // NOI18N
        jMenuItem_editCut.setText("Cut");
        jMenuItem_editCut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_editCutActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem_editCut);

        jMenuItem_editCopy.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem_editCopy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/texteditor/icons/Copy.png"))); // NOI18N
        jMenuItem_editCopy.setText("Copy");
        jMenuItem_editCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_editCopyActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem_editCopy);

        jMenuItem_editPaste.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem_editPaste.setIcon(new javax.swing.ImageIcon(getClass().getResource("/texteditor/icons/Paste.png"))); // NOI18N
        jMenuItem_editPaste.setText("Paste");
        jMenuItem_editPaste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_editPasteActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem_editPaste);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Help");

        jMenuItem_helpAbout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/texteditor/icons/About.png"))); // NOI18N
        jMenuItem_helpAbout.setText("About");
        jMenuItem_helpAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_helpAboutActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem_helpAbout);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Constructor #1 - default constructor.
    //By default, the selected file is null
    public TextEditor() {
        initComponents();
        //String loadedText = 
                TextEditorLogic.loadDefaultFile();
        
        //jTextArea_textEditor.setText(loadedText);
    }

    //Upon closing it goes back
    //This method closes the current page and opens the login page
    private void goBack() {
        new Login().setVisible(true);
        this.dispose();
    }

    //When user selects File -> Exit, the method to close current page is called
    private void jMenuItem_fileExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_fileExitActionPerformed
        goBack();
    }//GEN-LAST:event_jMenuItem_fileExitActionPerformed

    //When user attempts to close the application, the method to close current page is called
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        goBack();
    }//GEN-LAST:event_formWindowClosing

    //When user selects File -> New, the method asks user whether to clean notepad, and then opens a new file and reads it
    private void jMenuItem_fileNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_fileNewActionPerformed
        if (TextEditorLogic.AskToClearNotepad() == true) {
            jTextArea_textEditor.setText("");
        }
        TextEditorLogic.CreateNewFileAndWriteIt(jTextArea_textEditor.getText());
    }//GEN-LAST:event_jMenuItem_fileNewActionPerformed
    //When user selects File->Save as, the method saves the textarea input onto the file and asks user where to save the file
    private void jMenuItem_fileSaveAsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_fileSaveAsActionPerformed
        TextEditorLogic.CreateNewFileAndWriteIt(jTextArea_textEditor.getText());
    }//GEN-LAST:event_jMenuItem_fileSaveAsActionPerformed
    //When the user selects File -> Open, the method opens the file and reads it onto JTextArea
    private void jMenuItem_fileOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_fileOpenActionPerformed
        jTextArea_textEditor.setText(TextEditorLogic.OpenAndReadRTF());
    }//GEN-LAST:event_jMenuItem_fileOpenActionPerformed
    //When the user selects Help -> About, this method displays a message
    private void jMenuItem_helpAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_helpAboutActionPerformed
        JOptionPane.showMessageDialog(new JFrame(), "If you need any assistance, please contact the developer. "
                + "The icons for menu have been provided to the developer under LGPL Licence by Everaldo Coelho", "About", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItem_helpAboutActionPerformed

    //When the user selects File -> Save, the method saves the contents of textarea onto the file
    private void jMenuItem_fileSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_fileSaveActionPerformed
        TextEditorLogic.WriteOntoFile(jTextArea_textEditor.getText());
    }//GEN-LAST:event_jMenuItem_fileSaveActionPerformed

    //#2 - EDIT, CUT, COPY
    private void jMenuItem_editCutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_editCutActionPerformed
        //CUT
        jTextArea_textEditor.cut();
    }//GEN-LAST:event_jMenuItem_editCutActionPerformed

    private void jMenuItem_editCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_editCopyActionPerformed
        //COPY
        jTextArea_textEditor.copy();

    }//GEN-LAST:event_jMenuItem_editCopyActionPerformed

    private void jMenuItem_editPasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_editPasteActionPerformed
        //PASTE
        jTextArea_textEditor.paste();
    }//GEN-LAST:event_jMenuItem_editPasteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem_editCopy;
    private javax.swing.JMenuItem jMenuItem_editCut;
    private javax.swing.JMenuItem jMenuItem_editPaste;
    private javax.swing.JMenuItem jMenuItem_fileExit;
    private javax.swing.JMenuItem jMenuItem_fileNew;
    private javax.swing.JMenuItem jMenuItem_fileOpen;
    private javax.swing.JMenuItem jMenuItem_fileSave;
    private javax.swing.JMenuItem jMenuItem_fileSaveAs;
    private javax.swing.JMenuItem jMenuItem_helpAbout;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea_textEditor;
    // End of variables declaration//GEN-END:variables
}
