
package com.game.gamebase;

import java.sql.*;


public class discount_Procedure {
public static void stored_proc() throws SQLException
{
int ret_code;
Connection conn = null;
 try {

  DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());


    conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl", "system", "emankamran");
    try (CallableStatement pstmt = conn.prepareCall("{call SetDiscount()}")) {
        pstmt.executeUpdate();
     System.out.println("SP successful");
     
    conn.close();}
     } catch (SQLException e) {ret_code = e.getErrorCode(); 
      System.err.println(ret_code + e.getMessage());
     }
    }
}
