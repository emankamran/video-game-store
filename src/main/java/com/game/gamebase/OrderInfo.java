
package com.game.gamebase;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import javax.swing.JOptionPane;


public class OrderInfo extends javax.swing.JFrame {

    public OrderInfo() {
        initComponents();
         discountlabel.setVisible(false);
          entercode.setVisible(false);
          entercodesave.setVisible(false);
        displayorderdetails();
        gameinfo();
        
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttongroup = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        orderid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        gameordered = new javax.swing.JTextField();
        discountlabel = new javax.swing.JLabel();
        entercodesave = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        dprice = new javax.swing.JTextField();
        entercode = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        orders = new javax.swing.JTextField();
        rb2 = new javax.swing.JRadioButton();
        rb1 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        rbsave = new javax.swing.JButton();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Generated Order Report");
        jLabel1.setOpaque(true);

        jLabel2.setText("Order ID :");

        orderid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setText("Game Ordered :");

        gameordered.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        discountlabel.setText("Enter Discount Code :");

        entercodesave.setBackground(new java.awt.Color(102, 102, 255));
        entercodesave.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        entercodesave.setForeground(new java.awt.Color(255, 255, 255));
        entercodesave.setText("Save");
        entercodesave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                entercodesaveMouseClicked(evt);
            }
        });

        jLabel5.setText("Discounted Price:");

        dprice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        entercode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setText("OrderStatus :");

        orders.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        rb2.setBackground(new java.awt.Color(255, 255, 255));
        buttongroup.add(rb2);
        rb2.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        rb2.setText("No");
        rb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb2ActionPerformed(evt);
            }
        });

        rb1.setBackground(new java.awt.Color(255, 255, 255));
        buttongroup.add(rb1);
        rb1.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        rb1.setText("Yes");
        rb1.setOpaque(true);

        jLabel6.setText("Apply Discount :");

        rbsave.setBackground(new java.awt.Color(102, 102, 255));
        rbsave.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rbsave.setForeground(new java.awt.Color(255, 255, 255));
        rbsave.setText("Save");
        rbsave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbsaveMouseClicked(evt);
            }
        });

        back.setBackground(new java.awt.Color(51, 51, 51));
        back.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText("Back");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 238, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(302, 302, 302))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(rb1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rb2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbsave))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(37, 37, 37))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(discountlabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(orders, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dprice, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(entercode, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(entercodesave))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(orderid, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                                .addComponent(gameordered)))))
                .addGap(195, 195, 195))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(back))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(orderid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(gameordered, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(rb1)
                    .addComponent(rb2)
                    .addComponent(rbsave))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(discountlabel)
                    .addComponent(entercode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entercodesave))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(dprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(orders, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void entercodesaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entercodesaveMouseClicked
      
        
     int gid= getting_id(); 
        
        String a = entercode.getText();
      if (a.isEmpty()){
           JOptionPane.showMessageDialog(null, "Enter code to get discount!",
      "error", JOptionPane.ERROR_MESSAGE);
           
      }
      
      else if("GAME345".equals(a)){
          String sql = "Select orderquantity,price, last_row from (SELECT ORDERquantity,price,c.last_row FROM VIDEOGAME_T v inner join customer_orderline_t c on c.gameid=v.gameid where V.gameid = '" + gid + "') where last_row=(select max(last_row) from customer_orderline_t)";
  
        try {
            Connection connection = DBConnect.connect();
            Statement s = connection.prepareStatement(sql);
            ResultSet rs = s.executeQuery(sql);
            if(rs.next()){
                int quantity = rs.getInt(1);
                String game_price = rs.getString (2);
                int price = Integer.parseInt(game_price);
                ShippingDetails d = new ShippingDetails();
                 double shipment_rate= d.displayQuantity();
                 System.out.println(shipment_rate);
                 System.out.println(price);
                 int new_price = quantity * price;
                 System.out.println(new_price);
                 double original = new_price + shipment_rate; 
                  System.out.println(original);
                 insert_discount(original);

               discount_Procedure.stored_proc();
             
               displaydiscount();
            
               }}  
        
            catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Connection Failed!");
    ex.printStackTrace();
    return;
        }
      }
      else {
          JOptionPane.showMessageDialog(null, "Invalid Code!",
      "error", JOptionPane.ERROR_MESSAGE);
        
      
      }
      
      
      
    }//GEN-LAST:event_entercodesaveMouseClicked

    private void rb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb2ActionPerformed

    private void rbsaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbsaveMouseClicked
      rb1.setActionCommand("Yes");
      rb2.setActionCommand("No");
      String value = buttongroup.getSelection().getActionCommand();
      System.out.println(value);
      if ("Yes".equals(value)){
          discountlabel.setVisible(true);
          entercode.setVisible(true);
            entercodesave.setVisible(true);
          
          
      }else{
          discountlabel.setVisible(false);
          entercode.setVisible(false);
          entercodesave.setVisible(false);
          dprice.setText("No discount");
          display_status();
          
      }
      
    }//GEN-LAST:event_rbsaveMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
     new ShippingDetails().setVisible(true);
                     this.setVisible(false); 
    }//GEN-LAST:event_backMouseClicked

    public void displayorderdetails(){
       


 String sql = "SELECT * FROM Customer_Order_T where last_row = (select max(last_row) from Customer_Order_T)";
  
        try {
            Connection connection = DBConnect.connect();
            Statement s = connection.prepareStatement(sql);
            ResultSet rs = s.executeQuery(sql);
            if(rs.next()){
                
                String order_id = rs.getString (1);
                
                 orderid.setText(order_id);
                 }
        }
            catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Connection Failed!");
    ex.printStackTrace();
    return;
        }
        
    }
    
     public  void gameinfo(){
        
            String sql = "SELECT * FROM customer_orderline_t where last_row = (select max(last_row) from customer_orderline_t)";
  
        try {
            Connection connection = DBConnect.connect();
            Statement s = connection.prepareStatement(sql);
            ResultSet rs = s.executeQuery(sql);
            if(rs.next()){
                int game_id = rs.getInt (2);
             
                show_game_title(game_id);
             
                 }  
        }
            catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Connection Failed!");
    ex.printStackTrace();
    return;
        }}
     public void show_game_title(int gid){
       String sql = "SELECT * FROM VIDEOGAME_T where gameid = '" + gid + "'";
  
        try {
            Connection connection = DBConnect.connect();
            Statement s = connection.prepareStatement(sql);
            ResultSet rs = s.executeQuery(sql);
            if(rs.next()){
                String game_title = rs.getString (2);
                gameordered.setText(game_title);
                 }  
        }
            catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Connection Failed!");
    ex.printStackTrace();
    return;
        }}
     
     public void insert_discount(double org){
        try {
              Connection connection = DBConnect.connect();
        try {
            
             
                System.out.println("succesful");
                 String sql6= "INSERT INTO Sale_Price(originalPrice) VALUES (?)";
					 PreparedStatement statement6 = connection.prepareStatement(sql6);
                                         statement6.setDouble(1,org);
                                    System.out.println(org);
                                         int row1 = statement6.executeUpdate();
               
         
        } catch(HeadlessException | NumberFormatException | SQLException e){
                System.out.println("failed");
            }
        
    
    }catch (SQLException e) {
             JOptionPane.showMessageDialog(this, "Connection Failed!");
    e.printStackTrace();
    return;
}
     }
     
    /**
     *
     */
    public void displaydiscount(){
     
      JOptionPane.showMessageDialog(this, "Discount Granted");
              String sql1 = "SELECT Discount FROM Sale_Price where last_row = (select max(last_row) from Sale_Price)";
  
        try {
            Connection connection1 = DBConnect.connect();
            Statement s1 = connection1.prepareStatement(sql1);
            ResultSet rs1 = s1.executeQuery(sql1);
            if(rs1.next()){
                Double discount = rs1.getDouble(1);
                String s = discount.toString();
                System.out.println(s);
              
                dprice.setText('$'+s);}
            display_status();
        }
            catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Connection Failed!");
    ex.printStackTrace();
    return;
        }
     }
     
     public void display_status(){
     
              String sql1 = "SELECT * FROM Customer_Order_T";
  
        try {
            Connection connection1 = DBConnect.connect();
            Statement s1 = connection1.prepareStatement(sql1);
            ResultSet rs1 = s1.executeQuery(sql1);
            if(rs1.next()){
                String status = rs1.getString (4);
                orders.setText(status);}
          
        }
            catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Connection Failed!");
    ex.printStackTrace();
    return;
        }
     }
     public  int getting_id(){
        
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
            java.util.logging.Logger.getLogger(OrderInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.ButtonGroup buttongroup;
    private javax.swing.JLabel discountlabel;
    private javax.swing.JTextField dprice;
    private javax.swing.JTextField entercode;
    private javax.swing.JButton entercodesave;
    private javax.swing.JTextField gameordered;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField orderid;
    private javax.swing.JTextField orders;
    private javax.swing.JRadioButton rb1;
    private javax.swing.JRadioButton rb2;
    private javax.swing.JButton rbsave;
    // End of variables declaration//GEN-END:variables

private int RAND(int i) {
         Random num = new Random();
       int X=num.nextInt(i) + 6;
       return X;
    
}
}