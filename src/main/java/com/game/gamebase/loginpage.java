
package com.game.gamebase;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class loginpage extends javax.swing.JFrame {

    public loginpage() {
        initComponents();
        progressbar.setForeground(Color.BLUE);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        email = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        userlogin = new javax.swing.JButton();
        login = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        progressbar = new javax.swing.JProgressBar();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 600));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 255), new java.awt.Color(102, 102, 255), new java.awt.Color(102, 102, 255), new java.awt.Color(102, 102, 225)));

        email.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        email.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        email.setOpaque(true);
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        password.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        password.setOpaque(true);

        userlogin.setBackground(new java.awt.Color(102, 102, 255));
        userlogin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        userlogin.setForeground(new java.awt.Color(255, 255, 255));
        userlogin.setText("Login as User");
        userlogin.setBorder(null);
        userlogin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        userlogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userloginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                userloginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                userloginMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                userloginMousePressed(evt);
            }
        });

        login.setBackground(new java.awt.Color(102, 102, 255));
        login.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        login.setForeground(new java.awt.Color(255, 255, 255));
        login.setText("Login as Seller");
        login.setBorder(null);
        login.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                loginMousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Enter email address :");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Enter password :");

        progressbar.setBackground(new java.awt.Color(102, 102, 255));
        progressbar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        progressbar.setForeground(new java.awt.Color(255, 255, 255));
        progressbar.setOpaque(true);
        progressbar.setStringPainted(true);
        progressbar.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                progressbarComponentAdded(evt);
            }
        });
        progressbar.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                progressbarStateChanged(evt);
            }
        });
        progressbar.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                progressbarPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(15, 15, 15))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(email, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(userlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(progressbar, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(progressbar, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(102, 102, 255));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\OneDrive\\Desktop\\gamelogo_2_90_2_50-removebg-preview (2).png")); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(138, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseClicked
     
              boolean correct_passcode = checkpassword_Seller();
              boolean correct_emailaddress = checkmail_Seller();
              if (correct_passcode && correct_emailaddress){
                  String seller = "SELLER";
                        fill(seller);
                   
              }
              else {
                  JOptionPane.showMessageDialog(null, "Incorrect username or password!",
      "error", JOptionPane.ERROR_MESSAGE);
              }
              
        
       
        
  
    }//GEN-LAST:event_loginMouseClicked

    private void userloginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userloginMouseClicked
        boolean correct_passcode = checkpassword_User();
              boolean correct_emailaddress = checkmail_User();
              if (correct_passcode && correct_emailaddress){
                  String user = "USER";
                  fill(user);
                  
              }
              else {
                 JOptionPane.showMessageDialog(null, "Incorrect username or password!",
      "error", JOptionPane.ERROR_MESSAGE);
              }
    }//GEN-LAST:event_userloginMouseClicked

    private void userloginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userloginMouseEntered
        userlogin.setBackground(new Color(255, 255, 255));
        userlogin.setForeground(new Color (0,0,0));
    }//GEN-LAST:event_userloginMouseEntered

    private void userloginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userloginMouseExited
        userlogin.setBackground(new Color(102, 102, 255));
        userlogin.setForeground(new Color (255,255,255));
    }//GEN-LAST:event_userloginMouseExited

    private void loginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseEntered
        login.setBackground(new Color(255, 255, 255));
        login.setForeground(new Color (0,0,0));
    }//GEN-LAST:event_loginMouseEntered

    private void loginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseExited
        login.setBackground(new Color(102, 102, 255));
        login.setForeground(new Color (255,255,255));
    }//GEN-LAST:event_loginMouseExited

    private void progressbarStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_progressbarStateChanged

    }//GEN-LAST:event_progressbarStateChanged

    private void loginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMousePressed
         login.setForeground(new Color (0,0,0));
    }//GEN-LAST:event_loginMousePressed

    private void userloginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userloginMousePressed
       userlogin.setForeground(new Color (0,0,0));
    }//GEN-LAST:event_userloginMousePressed

    private void progressbarPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_progressbarPropertyChange

    }//GEN-LAST:event_progressbarPropertyChange

    private void progressbarComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_progressbarComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_progressbarComponentAdded
     
    
    public  void fill(String x)
    {
        Thread t =new Thread(new Runnable(){
            @Override
            public void run(){
               progressbar.setForeground(new Color( 0, 0, 0 ));
                for (int i=0; i<100;i++){
                    try{
                        progressbar.setValue(i);
                        Thread.sleep(50);
                }catch (InterruptedException ex){
                    Logger.getLogger(loginpage.class.getName()).log(Level.SEVERE ,null,ex);
                }
            }
                if("USER".equals (x) ){
              display_user();
            }
                else if("SELLER".equals(x)){
                    display_seller();
                }
        }});
        t.start();
        }
            
   
    
    public void display_seller(){
        new sellermenu().setVisible(true);
                     this.setVisible(false);  
    }
    public void display_user(){
        new Catalogue().setVisible(true);
                     this.setVisible(false);  
    }
 public boolean checkmail_User(){
    String a = email.getText();
if("user@mail.com".equals(a) )
{return true; }
else 
{ return false;

}
}
    public  boolean checkpassword_User(){
        
        
       char[] passwordcorrect = new char[]{ 'g','a','m','e'};
        char[] enteredpassword = password.getPassword();
        if (enteredpassword.length != passwordcorrect.length )
            return false;
        for( int i=0; i<enteredpassword.length; i++){
                if(enteredpassword[i] != passwordcorrect[i])
                return false;
            }
            return true;
        }   
    
public boolean checkmail_Seller(){
    String a = email.getText();
if("seller@mail.com".equals(a) )
{return true; }
else 
{ return false;

}
}
    public  boolean checkpassword_Seller(){
        
        
       char[] passwordcorrect = new char[]{ 's','t','o','r','e'};
        char[] enteredpassword = password.getPassword();
        if (enteredpassword.length != passwordcorrect.length )
            return false;
        for( int i=0; i<enteredpassword.length; i++){
                if(enteredpassword[i] != passwordcorrect[i])
                return false;
            }
            return true;
        }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(loginpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton login;
    private javax.swing.JPasswordField password;
    private javax.swing.JProgressBar progressbar;
    private javax.swing.JButton userlogin;
    // End of variables declaration//GEN-END:variables
}
