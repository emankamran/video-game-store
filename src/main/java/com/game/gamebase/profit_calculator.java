

package com.game.gamebase;

import java.sql.*;


public class profit_calculator {
public static void main(String args[]) throws SQLException
{
int ret_code;
Connection conn = null;
 try {
  DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());


    conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl", "system", "emankamran");
    try (CallableStatement pstmt = conn.prepareCall("{call sp_profit_calc")) {
        pstmt.executeUpdate();
     System.out.println("SP successful");
     
    conn.close();}
     } catch (SQLException e) {ret_code = e.getErrorCode(); 
      System.err.println(ret_code + e.getMessage());
     }
    }
}
