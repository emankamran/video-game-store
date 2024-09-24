
package com.game.gamebase;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.*;
import java.util.Random;
import javax.swing.JOptionPane;
public class GameDistributor extends javax.swing.JFrame {

  public GameDistributor() {
        initComponents();
    }
  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        gamePrice = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        gameTitle = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        gamePlatform = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        gameDesc = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        gamePublisher = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        gameWholesalePrice = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        gameStock = new javax.swing.JSpinner();
        inventoryBtn = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        DiAdd = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        DiPH = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        DiAccNo = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        distBtn = new javax.swing.JButton();

        jLabel9.setText("Publisher");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GAME INVENTORY");
        jLabel1.setOpaque(true);

        jLabel2.setText("Game Title");

        gamePrice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        gamePrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gamePriceActionPerformed(evt);
            }
        });

        gameTitle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        gameTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gameTitleActionPerformed(evt);
            }
        });

        jLabel4.setText("Price");

        jLabel5.setText("Platform");

        gamePlatform.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        gamePlatform.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gamePlatformActionPerformed(evt);
            }
        });

        jLabel6.setText("Description");

        gameDesc.setColumns(20);
        gameDesc.setRows(5);
        gameDesc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(gameDesc);

        jLabel8.setText("Publisher");

        gamePublisher.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel10.setText("Wholesale Price");

        gameWholesalePrice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel11.setText("Stock");

        gameStock.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        gameStock.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        gameStock.setRequestFocusEnabled(false);

        inventoryBtn.setBackground(new java.awt.Color(102, 102, 255));
        inventoryBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        inventoryBtn.setForeground(new java.awt.Color(255, 255, 255));
        inventoryBtn.setText("Add game record");
        inventoryBtn.setBorder(null);
        inventoryBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inventoryBtnMouseClicked(evt);
            }
        });

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("DISTRIBUTOR DETAILS");
        jLabel13.setOpaque(true);

        jLabel15.setText("Distributor Address");

        DiAdd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel16.setText("Phone Number");

        DiPH.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel17.setText("Account Number");

        DiAccNo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        distBtn.setBackground(new java.awt.Color(102, 102, 255));
        distBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        distBtn.setForeground(new java.awt.Color(255, 255, 255));
        distBtn.setText("Add distributor record");
        distBtn.setBorder(null);
        distBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                distBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 791, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(39, 39, 39))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel16)
                                    .addComponent(DiAdd)
                                    .addComponent(DiPH)
                                    .addComponent(jLabel17)
                                    .addComponent(DiAccNo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10))
                            .addComponent(distBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGap(32, 32, 32)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(75, 75, 75))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(gameTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(gamePlatform, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(53, 53, 53))
                                            .addComponent(jLabel10))
                                        .addComponent(gameWholesalePrice, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(gamePrice, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(14, 14, 14)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(gamePublisher, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel8)
                                                .addComponent(gameStock, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabel11)))))
                            .addComponent(jLabel6)
                            .addComponent(inventoryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(165, 165, 165))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(265, 265, 265)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inventoryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(distBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(140, 140, 140))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(gamePlatform, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(gameTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(7, 7, 7)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(gamePrice, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(gamePublisher, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(gameWholesalePrice, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(gameStock, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel15)
                                .addGap(18, 18, 18)
                                .addComponent(DiAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(DiPH, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(DiAccNo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jScrollPane3.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 812, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gameTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gameTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gameTitleActionPerformed

    private void gamePlatformActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gamePlatformActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gamePlatformActionPerformed
  
    
    
    private void inventoryBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventoryBtnMouseClicked
                try {
              Connection connection = DBConnect.connect();
if( gameTitle.getText().isEmpty() || gamePrice.getText().isEmpty() || gameStock.getValue().toString().isEmpty() || gameWholesalePrice.getText().isEmpty() || gamePlatform.getText().isEmpty() || gamePublisher.getText().isEmpty() || gameDesc.getText().isEmpty())
       {
            JOptionPane.showMessageDialog(null, "Incomplete Record",
      "error", JOptionPane.ERROR_MESSAGE);
        }
        else {
            try {
                String sql = "INSERT INTO videogame_t (GameID,GameTitle,GameDescription,Platform,Price,Publisher,Stock,WholeSalePrice,Distributorid) VALUES (?,?,?,?,?,?,?,?,?)";
            
               PreparedStatement Add = connection.prepareStatement(sql);
               
                System.out.println("succesful");
               Add.setInt(1,   RAND(662));
               Add.setString(2,gameTitle.getText());
               Add.setString(3,gameDesc.getText());
               Add.setString(4,gamePlatform.getText());
               
                int price = Integer.parseInt(gamePrice.getText());
                
              
                Add.setInt(5, price);
               Add.setString(6,gamePublisher.getText());
               Object s= gameStock.getValue();
                          String res =s.toString();
                          int x= Integer.parseInt(res);
               Add.setInt(7,x);
               
               String whole_sale_price = gameWholesalePrice.getText();
               int wsp = Integer.parseInt(whole_sale_price );
           
               noprofit_display.main(null);
               Add.setInt(8,Integer.parseInt(gameWholesalePrice.getText()));
              int dist_id = get_distid();
               Add.setInt(9,dist_id);
               int row = Add.executeUpdate();
               
               JOptionPane.showMessageDialog(this, "Game Record Entered");
                    if (price>wsp){
                   profit_calculator.main(null);
                    display_profit();
                    }
                    
                  else if (price<=wsp){
                   display_msg();}
                     new sellermenu().setVisible(true);
                     this.setVisible(false); 

                   
            }catch(HeadlessException | NumberFormatException | SQLException e){
              JOptionPane.showMessageDialog(null, "Constraints Violation!",
      "error", JOptionPane.ERROR_MESSAGE);
            }
        } 
        }catch (SQLException e) {
             JOptionPane.showMessageDialog(this, "Connection Failed");
    e.printStackTrace();
    return;
}
          
    }//GEN-LAST:event_inventoryBtnMouseClicked

    private void gamePriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gamePriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gamePriceActionPerformed

    private void distBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_distBtnMouseClicked
            try {
              Connection connection = DBConnect.connect();
            if( DiAdd.getText().isEmpty() || DiPH.getText().isEmpty() || DiAccNo.getText().isEmpty() )
       {
           JOptionPane.showMessageDialog(null, "Incomplete Information!",
      "error", JOptionPane.ERROR_MESSAGE);
            }
            else {
                try {
            
               PreparedStatement Add = connection.prepareStatement("insert into DISTRIBUTOR_T(Distributorid,Distaddress,phoneNumber,AccountNumber) values (?,?,?,?)");
               
                System.out.println("succesful");

               Add.setInt(1,RAND(6692));
               Add.setString(2,DiAdd.getText());
               
                
              String ph_no= DiPH.getText();
              if (ph_no.length()<11 || ph_no.length()>11){
                  JOptionPane.showMessageDialog(null, "Invalid Phone Number!",
      "error", JOptionPane.ERROR_MESSAGE);
              } else {
                  
                  Add.setLong(3,  Long.parseLong(DiPH.getText()));
                }
                String bank_acc_no= DiAccNo.getText();
              if (bank_acc_no.length()<12 || bank_acc_no.length()>12){
                  JOptionPane.showMessageDialog(null, "Invalid Bank Account Number!",
      "error", JOptionPane.ERROR_MESSAGE);
              } else {
               
              
             
               Add.setString(4,  DiAccNo.getText());}
               
               int row = Add.executeUpdate();
               
               JOptionPane.showMessageDialog(this, "Distributor Record Entered");
               
            }catch(HeadlessException | NumberFormatException | SQLException e){
         JOptionPane.showMessageDialog(null, "Constraints Violation!",
      "error", JOptionPane.ERROR_MESSAGE);
            }
        } 
        }catch (SQLException e) {
             JOptionPane.showMessageDialog(this, "Connection Failed!");
    e.printStackTrace();
    return;
    }//GEN-LAST:event_distBtnMouseClicked
    }
    public void display_msg(){
         String sql = "SELECT * FROM profit_calc where last_row = (select max(last_row) from profit_calc)";
  
        try {
            Connection connection = DBConnect.connect();
            Statement s = connection.prepareStatement(sql);
            ResultSet rs = s.executeQuery(sql);
            if(rs.next()){
                String msg = rs.getString (2);
                JOptionPane.showMessageDialog(null, msg,
      "error", JOptionPane.ERROR_MESSAGE);
              }  
        
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Connection Failed!");
    ex.printStackTrace();
    return;
        }
      
    }
    public void display_profit(){ String sql = "SELECT * FROM profit_calc where last_row = (select max(last_row) from profit_calc)";
  
        try {
            Connection connection = DBConnect.connect();
            Statement s = connection.prepareStatement(sql);
            ResultSet rs = s.executeQuery(sql);
            if(rs.next()){
                int profit = rs.getInt (1);
                 JOptionPane.showMessageDialog(this, "Profit made: $" + profit );
              }  
        
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Connection Failed!");
    ex.printStackTrace();
    return;
        }
      
    
        
    }
    public int get_distid(){
         String sql = "SELECT * FROM distributor_t where last_row = (select max(last_row) from distributor_t)";
  
        try {
            Connection connection = DBConnect.connect();
            Statement s = connection.prepareStatement(sql);
            ResultSet rs = s.executeQuery(sql);
            if(rs.next()){
                int dist_id = rs.getInt (1);
             return dist_id;
              
             
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
            java.util.logging.Logger.getLogger(GameDistributor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameDistributor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameDistributor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameDistributor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
            new GameDistributor().setVisible(true);
        }
        });
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DiAccNo;
    private javax.swing.JTextField DiAdd;
    private javax.swing.JTextField DiPH;
    private javax.swing.JButton distBtn;
    private javax.swing.JTextArea gameDesc;
    private javax.swing.JTextField gamePlatform;
    private javax.swing.JTextField gamePrice;
    private javax.swing.JTextField gamePublisher;
    private javax.swing.JSpinner gameStock;
    private javax.swing.JTextField gameTitle;
    private javax.swing.JTextField gameWholesalePrice;
    private javax.swing.JButton inventoryBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
private int RAND(int i) {
         Random num = new Random();
       int X=num.nextInt(i) + 6;
       return X;
    
}
}
