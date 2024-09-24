
package com.game.gamebase;


import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class sales_report extends javax.swing.JFrame {

    public sales_report() {
        initComponents();
        generatereport();
        displaysales();
        display_record();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        gamessold = new javax.swing.JLabel();
        orders = new javax.swing.JLabel();
        tprice = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        maxp = new javax.swing.JLabel();
        minp = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jTable1.setFont(new java.awt.Font("Source Code Pro", 0, 12)); // NOI18N
        jTable1.setForeground(new java.awt.Color(51, 51, 51));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Game ID", "Game Title", "Price", "Order ID"
            }
        ));
        jTable1.setGridColor(new java.awt.Color(51, 51, 51));
        jTable1.setOpaque(false);
        jTable1.setRowHeight(30);
        jTable1.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jTable1.setShowGrid(true);
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Games Sold : ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Orders Placed :");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Total Price : ");

        gamessold.setForeground(new java.awt.Color(255, 255, 255));
        gamessold.setText("jLabel4");

        orders.setForeground(new java.awt.Color(255, 255, 255));
        orders.setText("jLabel5");

        tprice.setForeground(new java.awt.Color(255, 255, 255));
        tprice.setText("0");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Sale price range: ");

        maxp.setForeground(new java.awt.Color(255, 255, 255));
        maxp.setText("max");

        minp.setForeground(new java.awt.Color(255, 255, 255));
        minp.setText("min");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("to");

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setText("Back");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(orders, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tprice, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(18, 18, 18)
                                    .addComponent(gamessold, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(minp, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(maxp, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(192, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jButton1)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(gamessold))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(orders))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(minp)
                    .addComponent(jLabel5)
                    .addComponent(maxp))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tprice))
                .addContainerGap(148, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
       new sellermenu().setVisible(true);
                     this.setVisible(false); 
    }//GEN-LAST:event_jButton1MouseClicked

    public void displaysales(){
        String sql = "select * from sales_rep_vu";
        try {
            Connection connection = DBConnect.connect();
            Statement s = connection.createStatement();
         
            ResultSet rs = s.executeQuery(sql);
            ResultSetMetaData rsmd = rs.getMetaData();
             DefaultTableModel tb1Model = ( DefaultTableModel)jTable1.getModel();
            int cols=rsmd.getColumnCount();
        
            String[] colName = new String [cols];
            for (int i =0; i<cols ;i++)
                colName[i]=rsmd.getColumnName(i+1);
            
            tb1Model.setColumnIdentifiers(colName);
           String gid,gametitle,gameprice,oid;
            while(rs.next()){
                
               gid = rs.getString (1);
               gametitle = rs.getString (2);
               gameprice = rs.getString (3);
               oid = rs.getString (4);
            
                
               String data[]={gid,gametitle,gameprice,oid};
            
               tb1Model.addRow(data);
                   
               }
            s.close();
 
      }
        
            catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Connection Failed!");
    ex.printStackTrace();
    return;
        }
    }
    
    public void generatereport(){
        
        try {
              Connection conn = DBConnect.connect();
    
    try (CallableStatement pstmt = conn.prepareCall("{call generate_sales_sp}")) {
        pstmt.executeUpdate();
    }
    }
    catch (SQLException e) {
             JOptionPane.showMessageDialog(this, "Connection Failed!");
    e.printStackTrace();
    return;
}}
    
    public void display_record(){
         String sql = "select count (gameid) from  (select videogame_t.gameid,gametitle,price,customer_order_t.orderid from videogame_T join customer_order_t on videogame_t.gameid = customer_order_t.gameid)";
          String sql1 = "select count (orderid) from  (select videogame_t.gameid,gametitle,price,customer_order_t.orderid from videogame_T join customer_order_t on videogame_t.gameid = customer_order_t.gameid)";
        String sql2 = "select sum(price) from  (select videogame_t.gameid,gametitle,price,customer_order_t.orderid from videogame_T join customer_order_t on videogame_t.gameid = customer_order_t.gameid)";
           String sql3 = " select price from sales_report s1 where price  >= all (select price from sales_report s2 where s1.gameid !=s2.gameid)";
            String sql4 = " select price from sales_report s1 where price  <= all (select price from sales_report s2 where s1.gameid !=s2.gameid)";
        try {
            Connection connection = DBConnect.connect();
            Statement s = connection.prepareStatement(sql);
            ResultSet rs = s.executeQuery(sql);
            Statement s1 = connection.prepareStatement(sql1);
            ResultSet rs1 = s1.executeQuery(sql1);
            Statement s2 = connection.prepareStatement(sql2);
            ResultSet rs2 = s2.executeQuery(sql2);
             Statement s3 = connection.prepareStatement(sql3);
            ResultSet rs3 = s3.executeQuery(sql3);
            Statement s4 = connection.prepareStatement(sql4);
            ResultSet rs4 = s4.executeQuery(sql4);
            
            
            while(rs.next()){
                String games_sold = rs.getString (1);
                gamessold.setText(games_sold);
                
              }  
            while(rs1.next()){
                String orderplaced = rs1.getString (1);
               
                orders.setText(orderplaced);
                
              }  
            while(rs2.next()){
                String totalprice = rs2.getString (1);
               
                tprice.setText(totalprice);
                
              }  
            while(rs3.next()){
                String totalorders = rs3.getString (1);
               
                maxp.setText("$" +totalorders);
                
              } 
            while(rs4.next()){
                String totalorders = rs4.getString (1);
               
                minp.setText("$" +totalorders);
                
              } 
        
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Connection Failed!");
    ex.printStackTrace();
    return;
        
}
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
            java.util.logging.Logger.getLogger(sales_report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sales_report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sales_report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sales_report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sales_report().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel gamessold;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel maxp;
    private javax.swing.JLabel minp;
    private javax.swing.JLabel orders;
    private javax.swing.JLabel tprice;
    // End of variables declaration//GEN-END:variables
}
