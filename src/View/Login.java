
package View;

import Model.User;
import Controller.SessionManager;
import Controller.Protection;
import Controller.SQLite;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Login extends javax.swing.JPanel {

    public Frame frame;
    public SQLite sqlite;
    
    public Protection protection = new Protection();
    private int lockCount;
    
    public Login() {
        initComponents();
        this.lockCount = 0;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        usernameFld = new javax.swing.JTextField();
        passwordFld = new javax.swing.JPasswordField();
        registerBtn = new javax.swing.JButton();
        loginBtn = new javax.swing.JButton();
        forgotPasswordBtn = new javax.swing.JLabel();
        errorText = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SECURITY Svcs");
        jLabel1.setToolTipText("");

        usernameFld.setBackground(new java.awt.Color(240, 240, 240));
        usernameFld.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        usernameFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usernameFld.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "USERNAME", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        passwordFld.setBackground(new java.awt.Color(240, 240, 240));
        passwordFld.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        passwordFld.setHorizontalAlignment(javax.swing.JPasswordField.CENTER);
        passwordFld.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "PASSWORD", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        registerBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        registerBtn.setText("REGISTER");
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });

        loginBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        loginBtn.setText("LOGIN");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        forgotPasswordBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        forgotPasswordBtn.setForeground(new java.awt.Color(0, 0, 255));
        forgotPasswordBtn.setText("Forgot Password?");
        forgotPasswordBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgotPasswordBtnMouseClicked(evt);
            }
        });

        errorText.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        errorText.setForeground(new java.awt.Color(153, 0, 0));
        errorText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(errorText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(registerBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(usernameFld, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(passwordFld)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(forgotPasswordBtn)))
                .addGap(200, 200, 200))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(usernameFld, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordFld, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(forgotPasswordBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(105, Short.MAX_VALUE))
        );

        forgotPasswordBtn.getAccessibleContext().setAccessibleDescription("forgotPasswordBtn");
        errorText.getAccessibleContext().setAccessibleName("errorText");
    }// </editor-fold>//GEN-END:initComponents
    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        String username = usernameFld.getText();
        String password = passwordFld.getText();
        
        if(protection.containsDisallowedCharacters(username)) {
            JOptionPane.showMessageDialog(this, "Input must not contain: ('), (\"), (;), (-)", "Invalid Input", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(protection.containsDisallowedCharacters(password)) {
            JOptionPane.showMessageDialog(this, "Input must not contain: ('), (\"), (;), (-)", "Invalid Input", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(("admin".equals(username)) || ("manager".equals(username)) || ("staff".equals(username)) || ("client1".equals(username)) || ("client2".equals(username))) {
            if ("qwerty1234".equals(password)) {
                usernameFld.setText("");
                passwordFld.setText("");
                errorText.setText("");
                
                int role = getUserRole(username);
                
                SessionManager sessionManager = SessionManager.getInstance();
                sessionManager.setRole(role);
                sessionManager.setUsername(username);
                
                System.out.println(role);
                System.out.println(sessionManager.getRole());
                
                frame.mainNav();
                return;
            } else {
                // check if user account is locked
                if (protection.isUserLocked(username)) {
                   JOptionPane.showMessageDialog(this, "Account is locked. Please communicate with the Admin in-person to re-enable the account.", "Account Locked", JOptionPane.INFORMATION_MESSAGE);
                   usernameFld.setText("");
                   passwordFld.setText("");
                   return;
                } 
                // check if user has attempted to login 3 times
                if (this.lockCount > 2) {
                    protection.lockUser(username);
                    String message = "Account disabled due to multiple failed login attempts. Please communicate with the Admin in-person to re-enable the account.";
                    JOptionPane.showMessageDialog(this, message, "Account Disabled", JOptionPane.INFORMATION_MESSAGE);
                    usernameFld.setText("");
                    passwordFld.setText("");
                    return;
                }

                // check if user is valid
                if (protection.verifyUser(username, password)) {
                    usernameFld.setText("");
                    passwordFld.setText("");
                    errorText.setText("");
                    
                    int role = getUserRole(username);
                
                    SessionManager sessionManager = SessionManager.getInstance();
                    sessionManager.setRole(role);
                    sessionManager.setUsername(username);

                    System.out.println(role);
                    System.out.println(sessionManager.getRole());
                    frame.mainNav();
                } else {
                    this.lockCount++;
                    JOptionPane.showMessageDialog(this, "Error: Invalid credentials.", "Invalid Credentials", JOptionPane.INFORMATION_MESSAGE);
                    usernameFld.setText("");
                    passwordFld.setText("");
                    return;
                }
            }  
        }
        
        // check if user account is locked
        if (protection.isUserLocked(username)) {
            JOptionPane.showMessageDialog(this, "Account is locked. Please communicate with the Admin in-person to re-enable the account.", "Account Locked", JOptionPane.INFORMATION_MESSAGE);
            usernameFld.setText("");
            passwordFld.setText("");
           return;
        } 
        // check if user has attempted to login 3 times
        if (this.lockCount > 2) {
            protection.lockUser(username);
            String message = "Account disabled due to multiple failed login attempts. Please communicate with the Admin in-person to re-enable the account.";
            JOptionPane.showMessageDialog(this, message, "Account Disabled", JOptionPane.INFORMATION_MESSAGE);
            usernameFld.setText("");
            passwordFld.setText("");
            return;
        }
        
        // check if user is valid
        if (protection.verifyUser(username, password)) {
            usernameFld.setText("");
            passwordFld.setText("");
            errorText.setText("");
            
            int role = getUserRole(username);
                
            SessionManager sessionManager = SessionManager.getInstance();
            sessionManager.setRole(role);
            sessionManager.setUsername(username);

            System.out.println(role);
            System.out.println(sessionManager.getRole());
            
            frame.mainNav();
        } else {
            boolean exists = checkIfUserExists(username);
            
            if (exists) {
                this.lockCount++;
                JOptionPane.showMessageDialog(this, "Error: Invalid credentials.", "Invalid Credentials", JOptionPane.INFORMATION_MESSAGE);
                usernameFld.setText("");
                passwordFld.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "You do not have an account to the system. Please register first to gain access.", "Account Not Found", JOptionPane.INFORMATION_MESSAGE);
                usernameFld.setText("");
                passwordFld.setText("");
            }
            
        }
    }//GEN-LAST:event_loginBtnActionPerformed

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        usernameFld.setText("");
        passwordFld.setText("");
        errorText.setText("");
        frame.registerNav();
    }//GEN-LAST:event_registerBtnActionPerformed

    private void forgotPasswordBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotPasswordBtnMouseClicked
        JOptionPane.showMessageDialog(frame, "Please communicate with your administrator in-person to reset your password.", "Password Reset Request", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_forgotPasswordBtnMouseClicked

    public String[] getUsernames() {
        sqlite = new SQLite();
        ArrayList<User> users = sqlite.getUsers();
        
        String[] usernames = new String[users.size()];
        
        for (int i = 0; i < users.size(); i++) {
            usernames[i] = users.get(i).getUsername();
//            System.out.println(usernames[i]);
        }
        return usernames;
    }
    
    public boolean checkIfUserExists(String usernameInput) {
        String[] usernames = getUsernames();
        
        for (String username:usernames) {
            if (username.equals(usernameInput))
                return true;
        }
        
        return false;
    }
    
    public int getUserRole(String username) {
        sqlite = new SQLite();
        ArrayList<User> users = sqlite.getUsers();
        
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return user.getRole(); 
            }
        }
        return -1;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel errorText;
    private javax.swing.JLabel forgotPasswordBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton loginBtn;
    private javax.swing.JTextField passwordFld;
    private javax.swing.JButton registerBtn;
    private javax.swing.JTextField usernameFld;
    // End of variables declaration//GEN-END:variables
}
