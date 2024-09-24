
package com.game.gamebase;

import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class ManageEmployees extends javax.swing.JFrame {

    public ManageEmployees() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        EmpID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        EmpName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        EmpAdd = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        EmpDH = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        EmpWH = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        addEmp = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        assignedjob = new javax.swing.JLabel();
        jdesc = new javax.swing.JLabel();
        empsal = new javax.swing.JLabel();
        EmpPayR = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Employee ID");

        EmpID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("EMPLOYEE DATA");
        jLabel2.setOpaque(true);

        jLabel3.setText("Name");

        EmpName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        EmpName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpNameActionPerformed(evt);
            }
        });

        jLabel4.setText("Address");

        EmpAdd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setText("Date Hired");

        EmpDH.setForeground(new java.awt.Color(153, 153, 153));
        EmpDH.setText("Enter date in the format: dd-Mon-yyyy");
        EmpDH.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        EmpDH.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                EmpDHFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                EmpDHFocusLost(evt);
            }
        });

        jLabel6.setText("Working Hours");

        EmpWH.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        EmpWH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpWHActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Pay raise:");

        addEmp.setBackground(new java.awt.Color(102, 102, 255));
        addEmp.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addEmp.setForeground(new java.awt.Color(255, 255, 255));
        addEmp.setText("Add Employee Data");
        addEmp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addEmpMouseClicked(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(51, 51, 51));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("EMPLOYEE POSITION");
        jLabel8.setOpaque(true);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Assigned Job:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Job Description:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("Calculated Salary:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(addEmp)
                .addGap(361, 361, 361))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(127, 127, 127)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(assignedjob)
                    .addComponent(EmpPayR)
                    .addComponent(jdesc)
                    .addComponent(empsal))
                .addGap(300, 300, 300))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(EmpWH, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6))
                                    .addComponent(EmpID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(70, 70, 70)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EmpName, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                    .addComponent(EmpAdd)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(EmpDH, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(118, 118, 118))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(362, 362, 362)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(271, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(EmpID, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(EmpName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EmpAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EmpWH, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(12, 12, 12)
                .addComponent(EmpDH, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(addEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(EmpPayR))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(assignedjob))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jdesc))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(empsal))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EmpNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmpNameActionPerformed

    private void EmpWHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpWHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmpWHActionPerformed

    private void EmpPayRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpPayRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmpPayRActionPerformed

    private void addEmpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addEmpMouseClicked
        emprecord();
    
    }//GEN-LAST:event_addEmpMouseClicked

    private void jdescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jdescActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jdescActionPerformed

    private void EmpDHFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EmpDHFocusGained
       if (EmpDH.getText().equals("Enter date in the format: dd-Mon-yyyy")){
           EmpDH.setText("");
           EmpDH.setForeground(new Color(0,0,0));
       }
    }//GEN-LAST:event_EmpDHFocusGained

    private void EmpDHFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EmpDHFocusLost
       if (EmpDH.getText().equals("")){
           EmpDH.setText("Enter date in the format: dd-Mon-yyyy");
           EmpDH.setForeground(new Color(153,153,153));
    }//GEN-LAST:event_EmpDHFocusLost
     }
    public void emprecord(){
        try {
              Connection connection = DBConnect.connect();
            if(EmpID.getText().isEmpty()|| EmpName.getText().isEmpty() || EmpAdd.getText().isEmpty() || EmpDH.getText().isEmpty() || EmpWH.getText().isEmpty() )
       {
             JOptionPane.showMessageDialog(null, "Incomplete Information!",
      "error", JOptionPane.ERROR_MESSAGE);
            }
            else {
                try {
            
               PreparedStatement Add = connection.prepareStatement("insert into EMPLOYEE_T(EmployeeID, EmployeeName,EmployeeAddress,DateHired,WorkingHours,PayRaise) values (?,?,?,?,?,?)");
               
                System.out.println("succesful");
                  int eid=Integer.parseInt(EmpID.getText());
               Add.setInt(1,  eid);
               Add.setString(2,EmpName.getText());
               Add.setString(3,EmpAdd.getText());
               Add.setString(4,EmpDH.getText());
               int workingHours = Integer.parseInt(EmpWH.getText());
               Add.setInt(5, workingHours );
               
               
               int pay = 200;
               int payRaise;
               if(workingHours==2){
                    JOptionPane.showMessageDialog(null, "Working Hours must be greater than 2!",
      "error", JOptionPane.ERROR_MESSAGE);
               }
              else if (workingHours >2 && workingHours<= 5){
                   payRaise = pay;
                   Add.setInt(6, (payRaise));
               }
               else if(workingHours > 5 && workingHours <= 7) {
                   payRaise = pay+50;
                   Add.setInt(6, (payRaise));
               }
               else if (workingHours > 7){
                   payRaise = pay+200;
                   Add.setInt(6, (payRaise));
               }

               
               int row = Add.executeUpdate();
               
               JOptionPane.showMessageDialog(this, "Employee Record Entered");
                displaypayraise(eid);
                employeeposition(eid,pay);
               
            }catch(HeadlessException | NumberFormatException | SQLException e){
                JOptionPane.showMessageDialog(null, "Datatype Mismatch or Constraints violation!",
      "error", JOptionPane.ERROR_MESSAGE);
            }
        } 
        }catch (SQLException e) {
             JOptionPane.showMessageDialog(this, "Connection Failed!");
    e.printStackTrace();
    return;
    }   
        
    }
    
    public void displaypayraise(int eid){
        
       String sql = "select * from EMPLOYEE_T where EmployeeID = '" + eid + "'";
        try {
            Connection connection = DBConnect.connect();
            Statement s = connection.createStatement();
         
            ResultSet rs = s.executeQuery(sql);
            if(rs.next()){
                
                String payraise = rs.getString (6);
                EmpPayR.setText(payraise);
 
      }
        }
            catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Connection Failed!");
    ex.printStackTrace();
    return;
        }
    }
    
    public void employeeposition(int eid, int pay){
       try {
              Connection connection = DBConnect.connect();
                try {
            
               PreparedStatement Add = connection.prepareStatement("insert into EMPLOYEE_POSITION_T(PositionName,EmployeeID,Description,Salary) values (?,?,?,?)");
               
                System.out.println("succesful");
                 if (eid <1000){
                    String empposition= "PPC Expert";
                    System.out.println("inserted position");
                    int salary = 500;
                    
                    String desc_emp ="Setting up and Managing ad campaigns.";
                     Add.setString(1,empposition);
                      Add.setInt(2,  eid);
                      Add.setString(3,desc_emp);
                      Add.setInt(4,salary);
                     
                     
                 }
                 else if(eid>1000 && eid <5000){
                     
                      String empposition= "SEO Expert";
                      String desc_emp =" Indexes site on google search engine";
                      int salary = 550;
                     Add.setString(1,empposition);
                      Add.setInt(2,  eid);
                      Add.setString(3,desc_emp);
                       Add.setInt(4,salary);
                 }
                 else if(eid>5000 && eid <8000){
                      String empposition= "Site Maintenance Dept";
                      String desc_emp ="Troubleshoots issues to determine necessary repairs.";
                       int salary = 250;
                     Add.setString(1,empposition);
                      Add.setInt(2,  eid);
                      Add.setString(3,desc_emp);
                       Add.setInt(4,salary);
                  
                 }
                 else if(eid>8000 && eid <9000){
                      String empposition= "Shipment Staff";
                      String desc_emp ="Ships product from warehouse to the customer. ";
                       int salary = 400;
                     Add.setString(1,empposition);
                      Add.setInt(2,  eid);
                      Add.setString(3,desc_emp);
                       Add.setInt(4,salary);
                   
                 }
                 else{
                     String empposition= "Manager";
                     String desc_emp ="Manages overall game store, stocks and distributor dealings. ";
                      int salary = 600;
                     Add.setString(1,empposition);
                      Add.setInt(2,  eid);
                      Add.setString(3,desc_emp);
                      Add.setInt(4,salary);

                 }
                 
           int row = Add.executeUpdate();
               
               JOptionPane.showMessageDialog(this, "Employee Position Record Entered");
               jointables(eid);
               
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
       
    public void jointables(int eid){
        
        String sql = "select payraise, positionname, salary from employee_t e inner join employee_position_t p on e.employeeid = p.employeeid and p.employeeid = '" + eid + "'";
      try {
            Connection connection = DBConnect.connect();
            Statement s = connection.createStatement();
         
            ResultSet rs = s.executeQuery(sql);
          
            if(rs.next())
      {
             
               int pr= rs.getInt(1);
                String pn= rs.getString(2);
               int sal= rs.getInt(3);
               System.out.println(pr + pn +sal);
               
              int sal_e = sal + pr;
              System.out.println(sal_e);
                updatesalary(sal_e,eid);
            
      }
        }
            catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Connection Failed!");
    ex.printStackTrace();
    return;
        }
    }
    
       public void updatesalary(int sal_e,int eid){
           String sql= "UPDATE employee_position_t SET salary = '" + sal_e + "' WHERE employeeid = '" + eid + "'";
        try {
            Connection connection = DBConnect.connect();
            Statement s = connection.createStatement();
         
            ResultSet rs = s.executeQuery(sql);
            
            displaysalary(eid);
            
      }
        
            catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Connection Failed!");
    ex.printStackTrace();
    return;
        }
    }
              public void displaysalary(int eid){
                  
              String sql = "SELECT * FROM EMPLOYEE_POSITION_T where employeeid =  '" + eid + "'";
  
        try {
            Connection connection = DBConnect.connect();
            Statement s = connection.prepareStatement(sql);
            ResultSet rs = s.executeQuery(sql);
           
                
               
                  if(rs.next()){
                      String pos = rs.getString(1);
                      assignedjob.setText(pos);
                String jobdesc = rs.getString(3);
                      jdesc.setText(jobdesc);
             int salary = rs.getInt (4);
             System.out.println(salary);
             String salemp = Integer.toString(salary);
                empsal.setText(salemp);
                
                  
              }            
      
        }
            catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Connection Failed!");
    ex.printStackTrace();
   
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
            java.util.logging.Logger.getLogger(ManageEmployees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageEmployees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageEmployees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageEmployees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageEmployees().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EmpAdd;
    private javax.swing.JTextField EmpDH;
    private javax.swing.JTextField EmpID;
    private javax.swing.JTextField EmpName;
    private javax.swing.JLabel EmpPayR;
    private javax.swing.JTextField EmpWH;
    private javax.swing.JButton addEmp;
    private javax.swing.JLabel assignedjob;
    private javax.swing.JLabel empsal;
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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jdesc;
    // End of variables declaration//GEN-END:variables
}
