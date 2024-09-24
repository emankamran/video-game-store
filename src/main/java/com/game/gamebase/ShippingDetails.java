
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

public final class ShippingDetails extends javax.swing.JFrame {

   
    public ShippingDetails() {
        initComponents();
        gettingShipmentDates();
        displayDates();
       displayQuantity();

       
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        SNo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        SDate = new javax.swing.JLabel();
        DDate = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TNo = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        SType = new javax.swing.JComboBox<>();
        Stextfield = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        quantitytext = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        SRate = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        totalp = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        pp = new javax.swing.JTextField();
        placeorder = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Your order will be dispatched on :");

        SNo.setText("jLabel2");

        jLabel3.setText("Your order will be delivered to you in 5 working days on : ");

        SDate.setText("jLabel4");

        DDate.setText("jLabel2");

        jLabel4.setText("Order Shipment Number : ");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SHIPMENT DETAILS");
        jLabel2.setOpaque(true);

        TNo.setBackground(new java.awt.Color(51, 51, 51));
        TNo.setText("Please wait..");

        jLabel5.setText("Tracking Number");

        jLabel6.setText("Select Shipment Type: ");

        SType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Standard Shipping", "Express Shipping " }));
        SType.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        SType.setOpaque(true);
        SType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                STypeActionPerformed(evt);
            }
        });

        Stextfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Stextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StextfieldActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(102, 102, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Choose");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setText("Order will be shipped through :");

        jLabel8.setText("Selected product Quantity: ");

        quantitytext.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel9.setText("Shipment Rate:");

        SRate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        SRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SRateActionPerformed(evt);
            }
        });

        jLabel10.setText("Total Price:");

        totalp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        totalp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalpActionPerformed(evt);
            }
        });

        jLabel11.setText("Price");

        pp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        placeorder.setBackground(new java.awt.Color(102, 102, 255));
        placeorder.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        placeorder.setForeground(new java.awt.Color(255, 255, 255));
        placeorder.setText("Place Order");
        placeorder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                placeorderMouseClicked(evt);
            }
        });
        placeorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeorderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pp, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(totalp)
                            .addComponent(SRate)
                            .addComponent(quantitytext))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(placeorder, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(160, 160, 160))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SNo, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SDate, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DDate, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(153, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(TNo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Stextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(SDate))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(DDate))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(SNo))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(placeorder, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(SType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Stextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(TNo))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(quantitytext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(SRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(totalp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 873, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void STypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_STypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_STypeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
Stextfield.setText(SType.getSelectedItem().toString());

try {
              Connection connection = DBConnect.connect();
 try {
            
             
                System.out.println("succesful");
                 String sql6= "INSERT INTO SHIPMENT_INVOICE_T(TrackingNumber, ShipmentType) VALUES (?,?)";
					 PreparedStatement statement6 = connection.prepareStatement(sql6);
                                         statement6.setInt(1,RAND(6666982));
                                    String value = SType.getSelectedItem().toString();
                                        statement6.setString(2,value);

                                         int row1 = statement6.executeUpdate();
               
         
        } catch(HeadlessException | NumberFormatException | SQLException e){
                System.out.println("failed");
            }
        
    
    }catch (SQLException e) {
             JOptionPane.showMessageDialog(this, "Connection Failed!");
    e.printStackTrace();
    return;
}

 String sql = "SELECT * FROM SHIPMENT_INVOICE_T where last_row = (select max(last_row) from shipment_invoice_t)";
  
        try {
            Connection connection = DBConnect.connect();
            Statement s = connection.prepareStatement(sql);
            ResultSet rs = s.executeQuery(sql);
            if(rs.next()){
                
                String tracking_number = rs.getString (1);
                
                 TNo.setText(tracking_number);
                 }
        }
            catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Connection Failed!");
    ex.printStackTrace();
    return;
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void StextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StextfieldActionPerformed

    private void SRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SRateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SRateActionPerformed

    private void totalpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalpActionPerformed

    private void placeorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeorderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_placeorderActionPerformed

    private void placeorderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_placeorderMouseClicked
       if (Stextfield.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Select Shipping Type to Proceed ",
      "error", JOptionPane.ERROR_MESSAGE);
        }
        
        else{
        
        JOptionPane.showMessageDialog(this, "Thanks for Ordering!");
        
        new OrderInfo().setVisible(true);
        this.setVisible(false);
        }
    }//GEN-LAST:event_placeorderMouseClicked
public  void gettingShipmentDates(){
     
    insert_order();
        
     try {
              Connection connection1 = DBConnect.connect();
 try {
            
             int order_id=shipping_order_id();
             int cust_id = shipping_cust_id();
           
                System.out.println("succesful");
                 String sql= "INSERT INTO SHIPMENT_T(ShipmentNumber, ShippingDate, DeliveryDate,orderid ,customerid) VALUES (?,?,?,?,?)";
					 PreparedStatement statement = connection1.prepareStatement(sql);
					 
       
					 statement.setInt(1,RAND(6666982));
                                         String d =date_ship();
                                         statement.setString(2, d);
                                       String e =date_deliver();
					 statement.setString(3, e);
                                          statement.setInt(4,order_id);
                                         statement.setInt(5,cust_id);
                          
               int row = statement.executeUpdate();
               
               }catch(HeadlessException | NumberFormatException | SQLException e){
               e.printStackTrace();
            }
        } 
        catch (SQLException e) {
             JOptionPane.showMessageDialog(this, "Connection Failed!");
    e.printStackTrace();
    return;
}

 }
    
    
    public void insert_order(){
         try {
              Connection connection = DBConnect.connect();
 try {
            
             int gid = order_game_id();
             int cust_id = order_cust_id();
                System.out.println("succesful");
                 String sql6= "INSERT INTO Customer_Order_T(OrderID,GameID,CustomerID) VALUES (?,?,?)";
					 PreparedStatement statement6 = connection.prepareStatement(sql6);
                                         statement6.setInt(1,RAND(6666982));
                                         
                                         
                                         statement6.setInt(2,gid);
                                   
                                    statement6.setInt(3,cust_id);
                                         int row1 = statement6.executeUpdate();
               
               }catch(HeadlessException | NumberFormatException | SQLException e){
                System.out.println("failed");
            }
        } 
        catch (SQLException e) {
             JOptionPane.showMessageDialog(this, "Connection Failed!");
    e.printStackTrace();
    return;
}

 }
    
    public  void displayDates(){
        
                
     String sql = "SELECT * FROM SHIPMENT_T where last_row = (select max(last_row) from shipment_t)";
  
        try {
            Connection connection = DBConnect.connect();
            Statement s = connection.prepareStatement(sql);
            ResultSet rs = s.executeQuery(sql);
            if(rs.next()){
                
                String shipment_number = rs.getString (1);
                String shipmeny_date = rs.getString (2);
                String deliverydate = rs.getString (3);
                
                SNo.setText(shipment_number);
                SDate.setText(shipmeny_date);
                DDate.setText(deliverydate);
           
                
      }
        }
            catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Connection Failed!");
    ex.printStackTrace();
    return;
        }}
    
   
    public double displayQuantity(){
        
         String sql = "select orderquantity, gameid from customer_orderline_t where last_row = (select max(last_row) from customer_orderline_t)";
  
        try {
            Connection connection = DBConnect.connect();
            Statement s = connection.prepareStatement(sql);
            ResultSet rs = s.executeQuery(sql);
            if(rs.next()){
                
                String quanti = rs.getString (1);
               
               int gid =rs.getInt(2);
                quantitytext.setText(quanti);
                System.out.println("wippie");
 
                int f = Integer.parseInt(quanti);
              
                double g= f* 198 ;
                
                String h=Double.toString(g);
                SRate.setText('$'+h);
                totalcost(g,gid,f);
                 return g;
                
      }
        }
            catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Connection Failed!");
    ex.printStackTrace();
   
        }
        return 0;
      
    }
    
  
    public  void totalcost(double g, int gid,int f){
        
                
     String sql = "SELECT * FROM VIDEOGAME_T where gameid ='" + gid + "'";
  
        try {
            Connection connection = DBConnect.connect();
            Statement s = connection.prepareStatement(sql);
            ResultSet rs = s.executeQuery(sql);
            if(rs.next()){
                String game_price = rs.getString (5);
                pp.setText('$'+game_price);
                int res = Integer.parseInt(game_price);
                int quantity_and_price = res *f;
                double ans = quantity_and_price + g;
                 String sr=Double.toString(ans);
                totalp.setText('$'+sr);
              
                 }  
        }
            catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Connection Failed!");
    ex.printStackTrace();
    return;
        }}
    
    public  int order_game_id(){
        
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
     
     public int order_cust_id(){
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
     
    
    public int shipping_cust_id(){
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
    
    public int shipping_order_id(){
         String sql = "SELECT * FROM customer_order_t where last_row = (select max(last_row) from customer_order_t)";
  
        try {
            Connection connection = DBConnect.connect();
            Statement s = connection.prepareStatement(sql);
            ResultSet rs = s.executeQuery(sql);
            if(rs.next()){
                int order_id = rs.getInt (1);
             return order_id;
              
             
                 }  
        }
            catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Connection Failed!");
    ex.printStackTrace();
   
        } return 0;}
    
    
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
            java.util.logging.Logger.getLogger(GameDistributor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameDistributor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameDistributor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameDistributor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
            new ShippingDetails().setVisible(true);
        }
        });
    
        
    
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DDate;
    private javax.swing.JLabel SDate;
    private javax.swing.JLabel SNo;
    private javax.swing.JTextField SRate;
    private javax.swing.JComboBox<String> SType;
    private javax.swing.JTextField Stextfield;
    private javax.swing.JLabel TNo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton placeorder;
    private javax.swing.JTextField pp;
    private javax.swing.JTextField quantitytext;
    private javax.swing.JTextField totalp;
    // End of variables declaration//GEN-END:variables

    private int RAND(int i) {
         Random num = new Random();
       int X=num.nextInt(i) + 6;
       return X;
    
}
     private String date_ship() {
   
DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
Calendar c = Calendar.getInstance();
c.add(Calendar.DATE, 2);
String datestr= dateFormat.format(c.getTime());
return datestr;

     }
     private String date_deliver() {
   
DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
Calendar c = Calendar.getInstance();
c.add(Calendar.DATE, 5);
String datestr= dateFormat.format(c.getTime());
return datestr;

     }
 
}