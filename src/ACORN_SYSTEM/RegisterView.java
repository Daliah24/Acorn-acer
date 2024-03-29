/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ACORN_SYSTEM;

import DATA.RegisterController;
import java.sql.Connection;
import javax.swing.JOptionPane;
import DATABASE.DatabaseHandler;

/**
 *
 * @author Clarence Miole
 */
public final class RegisterView extends javax.swing.JFrame {
         
   private  RegisterController controller;
   private boolean userIsLoggedIn = false;
   private static  DashView dashView;
   int maxAttempts = 3; 
   int attempts = 0; 
   String correctAnswer1 = "";
String correctAnswer2 = "correctAnswer2";
    private String user;
   
   public RegisterView(boolean fromAccountPage) {
        initComponents();
    }      
   
    /**
     * Creates new form RegisterView
     */
        public RegisterView() {
        initComponents();
        setTitle("Register");
        DatabaseHandler databaseHandler = new DatabaseHandler();
        this.controller = new RegisterController(databaseHandler);
        RegisterView.dashView = dashView;
        setLocationRelativeTo(null);
        
        
        
        
        
    }
    public javax.swing.JButton getSaveButton(){
        return saves;
    }
    
     public javax.swing.JCheckBox getShowPassCheckBox() {
        return showpass;
    }
      public javax.swing.JPasswordField getPasswordField() {
        return passe;
    }
    private boolean isUserLoggedIn() {
    return userIsLoggedIn;
}
    
    private boolean isInvalidSecurityAnswer(String answer) {
    return answer == null || answer.trim().isEmpty();
}

 
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        usere = new javax.swing.JTextField();
        passe = new javax.swing.JPasswordField();
        showpass = new javax.swing.JCheckBox();
        saves = new javax.swing.JButton();
        fnamee = new javax.swing.JTextField();
        agee = new javax.swing.JTextField();
        lnamee = new javax.swing.JTextField();
        fname1 = new javax.swing.JLabel();
        lname1 = new javax.swing.JLabel();
        age1 = new javax.swing.JLabel();
        gender1 = new javax.swing.JLabel();
        age2 = new javax.swing.JLabel();
        addresse = new javax.swing.JTextField();
        gendere = new javax.swing.JComboBox<>();
        Back = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(225, 239, 237));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Kristen ITC", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Username");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 28, -1, -1));

        jLabel5.setFont(new java.awt.Font("Kristen ITC", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Password");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 105, -1, -1));

        usere.setBackground(new java.awt.Color(148, 174, 137));
        usere.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        usere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usereActionPerformed(evt);
            }
        });
        jPanel3.add(usere, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 65, 312, 34));

        passe.setBackground(new java.awt.Color(148, 174, 137));
        passe.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        passe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passeActionPerformed(evt);
            }
        });
        jPanel3.add(passe, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 142, 312, 34));

        showpass.setFont(new java.awt.Font("Kristen ITC", 0, 12)); // NOI18N
        showpass.setText("Show Password");
        showpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showpassActionPerformed(evt);
            }
        });
        jPanel3.add(showpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 182, -1, -1));

        saves.setBackground(new java.awt.Color(148, 174, 137));
        saves.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        saves.setText("Save");
        saves.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        saves.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                savesMouseClicked(evt);
            }
        });
        saves.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savesActionPerformed(evt);
            }
        });
        jPanel3.add(saves, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 260, 110, 50));

        fnamee.setBackground(new java.awt.Color(148, 174, 137));
        fnamee.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        fnamee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameeActionPerformed(evt);
            }
        });
        jPanel3.add(fnamee, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 65, 312, 34));

        agee.setBackground(new java.awt.Color(148, 174, 137));
        agee.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        agee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageeActionPerformed(evt);
            }
        });
        jPanel3.add(agee, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 219, 312, 34));

        lnamee.setBackground(new java.awt.Color(148, 174, 137));
        lnamee.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        lnamee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnameeActionPerformed(evt);
            }
        });
        jPanel3.add(lnamee, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 142, 312, 34));

        fname1.setFont(new java.awt.Font("Kristen ITC", 1, 18)); // NOI18N
        fname1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        fname1.setText("First Name");
        jPanel3.add(fname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 28, -1, -1));

        lname1.setFont(new java.awt.Font("Kristen ITC", 1, 18)); // NOI18N
        lname1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lname1.setText("Last Name");
        jPanel3.add(lname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 105, -1, -1));

        age1.setFont(new java.awt.Font("Kristen ITC", 1, 18)); // NOI18N
        age1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        age1.setText("Age");
        jPanel3.add(age1, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 182, -1, -1));

        gender1.setFont(new java.awt.Font("Kristen ITC", 1, 18)); // NOI18N
        gender1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        gender1.setText("Gender");
        jPanel3.add(gender1, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 262, -1, -1));

        age2.setFont(new java.awt.Font("Kristen ITC", 1, 18)); // NOI18N
        age2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        age2.setText("Address");
        jPanel3.add(age2, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 339, -1, -1));

        addresse.setBackground(new java.awt.Color(148, 174, 137));
        addresse.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        addresse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addresseActionPerformed(evt);
            }
        });
        jPanel3.add(addresse, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 376, 312, 34));

        gendere.setBackground(new java.awt.Color(148, 174, 137));
        gendere.setFont(new java.awt.Font("Kristen ITC", 0, 12)); // NOI18N
        gendere.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Non-BInary" }));
        jPanel3.add(gendere, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 293, 312, 34));

        Back.setBackground(new java.awt.Color(148, 174, 137));
        Back.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        Back.setText("Back");
        Back.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        jPanel3.add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, 110, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ACORN_SYSTEM/skies.png"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 440));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usereActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usereActionPerformed

    private void showpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showpassActionPerformed
      boolean showPassword = getShowPassCheckBox().isSelected();
          getPasswordField().setEchoChar(showPassword ? '\0' : '*');
    }//GEN-LAST:event_showpassActionPerformed

    private void savesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savesActionPerformed
   String fname = fnamee.getText();
String lname = lnamee.getText();
String address = addresse.getText();
String gender = gendere.getSelectedItem().toString();
String user = usere.getText();
String pass = passe.getText();
String ages = agee.getText();

try {
    // Check if ages is a valid integer
    if (!ages.matches("\\d+")) {
        JOptionPane.showMessageDialog(null, "Please enter a valid numeric value for Age.", "Error", JOptionPane.ERROR_MESSAGE);
        return; // Don't proceed further if the age is not a number
    }

    int age = Integer.parseInt(agee.getText());

    if (controller.doesUsernameExist(user)) {
        JOptionPane.showMessageDialog(null, "Username already exists. Please choose a different username.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Add security questions
    String securityQuestion1 = JOptionPane.showInputDialog(null, "What is the maiden name of your mother:", "Security Question 1", JOptionPane.QUESTION_MESSAGE);

    if (isInvalidSecurityAnswer(securityQuestion1)) {
        JOptionPane.showMessageDialog(null, "Invalid security answer. Please provide a valid answer.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    String securityQuestion2 = JOptionPane.showInputDialog(null, "What is the name of your first pet:", "Security Question 2", JOptionPane.QUESTION_MESSAGE);

    if (isInvalidSecurityAnswer(securityQuestion2)) {
        JOptionPane.showMessageDialog(null, "Invalid security answer. Please provide a valid answer.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Check password length
    if (pass.length() < 2) {
        JOptionPane.showMessageDialog(null, "Password must be at least 3 characters long.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Proceed with registration
    controller.registerUser(fname, lname, age, gender, address, user, pass, securityQuestion1, securityQuestion2);

    JOptionPane.showMessageDialog(null, "New account created");
    LoginView viewer = new LoginView();
    viewer.setVisible(true);
    this.dispose();
} catch (NumberFormatException e) {
    // Handle the case where parseInt fails (e.g., invalid integer format for age)
    JOptionPane.showMessageDialog(null, "Please enter a valid numeric value for Age.", "Error", JOptionPane.ERROR_MESSAGE);
} catch (Exception e) {
    JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
}
    }//GEN-LAST:event_savesActionPerformed

    private void fnameeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameeActionPerformed

    private void ageeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageeActionPerformed

    private void lnameeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnameeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnameeActionPerformed

    private void addresseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addresseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addresseActionPerformed

    private void savesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_savesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_savesMouseClicked

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
      if (isUserLoggedIn()) {
        DashView view = new DashView(user);
        view.setVisible(true);
        this.dispose();
    } else {
        LoginView view = new LoginView();
        view.setVisible(true);
        this.dispose();
    }

    }//GEN-LAST:event_BackActionPerformed

    private void passeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
     try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegisterView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new RegisterView().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JTextField addresse;
    private javax.swing.JLabel age1;
    private javax.swing.JLabel age2;
    private javax.swing.JTextField agee;
    private javax.swing.JLabel fname1;
    private javax.swing.JTextField fnamee;
    private javax.swing.JLabel gender1;
    private javax.swing.JComboBox<String> gendere;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lname1;
    private javax.swing.JTextField lnamee;
    private javax.swing.JPasswordField passe;
    private javax.swing.JButton saves;
    private javax.swing.JCheckBox showpass;
    private javax.swing.JTextField usere;
    // End of variables declaration//GEN-END:variables

    
}
