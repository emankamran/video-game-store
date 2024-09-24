
package com.game.gamebase;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;
import javax.swing.JOptionPane;

public class returnItem extends javax.swing.JFrame {

    public returnItem() {
        initComponents();
        return_item();   
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        rquantity = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        rdate = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        rnumber = new javax.swing.JTextField();
        confirm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Return Item as per our Policy");
        jLabel1.setOpaque(true);

        jLabel3.setText("Return Quantity:");

        rquantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rquantityActionPerformed(evt);
            }
        });

        jLabel4.setText("Return Number:");

        jLabel6.setText("Generating return number, please wait...");

        rdate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                rdateFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                rdateFocusLost(evt);
            }
        });

        jLabel7.setText(" Return Date:");

        confirm.setBackground(new java.awt.Color(102, 102, 255));
        confirm.setForeground(new java.awt.Color(255, 255, 255));
        confirm.setText("Confirm");
        confirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmMouseClicked(evt);
            }
        });
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(311, 311, 311)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rquantity, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(104, 104, 104)
                                        .addComponent(rdate, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(86, 86, 86))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(413, 413, 413)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)))
                .addGap(183, 183, 183))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(rnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(277, 277, 277))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(365, 365, 365))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(rquantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(29, 29, 29)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 109, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rquantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rquantityActionPerformed

    }//GEN-LAST:event_rquantityActionPerformed

    private void rdateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rdateFocusGained
    
    }//GEN-LAST:event_rdateFocusGained

    private void rdateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rdateFocusLost
   
    }//GEN-LAST:event_rdateFocusLost

    private void confirmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmMouseClicked
      
            new Catalogue().setVisible(true);
            this. setVisible(false);
    }//GEN-LAST:event_confirmMouseClicked

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmActionPerformed

       
    public void return_item(){
      
        
         String sql = "select orderquantity from customer_orderline_t where last_row = (select max(last_row) from customer_orderline_t)";
  
        try {
            Connection connection = DBConnect.connect();
            Statement s = connection.prepareStatement(sql);
            ResultSet rs = s.executeQuery(sql);
            if(rs.next()){
                
                String quanti = rs.getString (1);
               
               
                rquantity.setText(quanti);
                System.out.println("return");
                return_info(quanti);
    }}
         
            catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Connection Failed!");
    ex.printStackTrace();
   
        }
        }
    
    public void return_info(String x){
  
          try {
              Connection connection = DBConnect.connect();
 try {       int gid = return_game_id();
             int cust_id = return_cust_id();
                System.out.println("insert");
                 String sql6= "INSERT INTO return_item_t(returnNumber,returnQuantity,returnDate,gameid,customerid) VALUES (?,?,to_date(?,'ddMMyyyy'),?,?)";
					 PreparedStatement statement6 = connection.prepareStatement(sql6);
                                         statement6.setInt(1,RAND(666782));
                                         
                                         
                                         int number = Integer.parseInt(x);
                                         statement6.setInt(2, number);
                                         
                                         String d =date_return();
                                         statement6.setString(3, d);
                                                   statement6.setInt(4, gid);
                                                   statement6.setInt(5, cust_id);
                                         int row1 = statement6.executeUpdate();
               if (row1>0){
                 
                   display_return();
               }
         
        } catch(HeadlessException | NumberFormatException | SQLException e){
           e.printStackTrace();
            }
        
    
    }catch (SQLException e) {
             JOptionPane.showMessageDialog(this, "Connection Failed!");
    e.printStackTrace();
    return;
    
    
    }
    }
    
   public void display_return(){
       
        String sql = "select returnNumber, to_char(returnDate,'dd Mon, yyyy') from return_item_t where last_row = (select max(last_row) from return_item_t)";
  
        try {
            Connection connection = DBConnect.connect();
            Statement s = connection.prepareStatement(sql);
            ResultSet rs = s.executeQuery(sql);
            if(rs.next()){
                
                String returnnumb = rs.getString (1);
                rnumber.setText(returnnumb);
               
               
                String returndate = rs.getString (2);
                rdate.setText(returndate);
               
                
 
    }}
         
            catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Connection Failed!");
    ex.printStackTrace();
   
        }
        
    } public  int return_game_id(){
        
            String sql = "SELECT * FROM customer_orderline_t where last_row = (select max(last_row) from customer_orderline_t)";
  
        try {
            Connection connection = DBConnect.connect();
            Statement s = connection.prepareStatement(sql);
            ResultSet rs = s.executeQuery(sql);
            if(rs.next()){
                int game_id = rs.getInt (2);
             return game_id;
              
             
                 }  
        }
            catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Connection Failed!");
    ex.printStackTrace();
   
        } return 0;} 
     
     public int return_cust_id(){
         String sql = "SELECT * FROM customer_t where last_row = (select max(last_row) from customer_t)";
  
        try {
            Connection connection = DBConnect.connect();
            Statement s = connection.prepareStatement(sql);
            ResultSet rs = s.executeQuery(sql);
            if(rs.next()){
                int cust_id = rs.getInt (1);
             return cust_id;
              
             
                 }  
        }
            catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Connection Failed!");
    ex.printStackTrace();
   
        } return 0;} 
     


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
            java.util.logging.Logger.getLogger(returnItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(returnItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(returnItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(returnItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new returnItem().setVisible(true);
            }
        });
        
        
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField rdate;
    private javax.swing.JTextField rnumber;
    private javax.swing.JTextField rquantity;
    // End of variables declaration//GEN-END:variables

 private int RAND(int i) {
         Random num = new Random();
       int X=num.nextInt(i) + 6;
       return X;
    
}
private String date_return() {
   
DateFormat dateFormat = new SimpleDateFormat("ddMMyyyy");
Calendar c = Calendar.getInstance();
c.add(Calendar.DATE, 7);
String datestr= dateFormat.format(c.getTime());
return datestr;

     }




}
