
package com.game.gamebase;

import java.sql.*;

     

public class trigger_dbms_output{
public static void main(String args[]){
    int ret_code;
Connection conn = null;
 try {

  DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());


    conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl", "system", "emankamran");
    
            TbAfterUpdateTriggerUse(conn);
            conn.close();
    }
    catch (SQLException e) {ret_code = e.getErrorCode(); 
      System.err.println(ret_code + e.getMessage());
     }    
    
  }


public static void TbAfterUpdateTriggerUse(Connection conn) throws SQLException{

     
      try (CallableStatement call = conn.prepareCall("CREATE OR REPLACE TRIGGER  tr_stock_check "
                   +"  AFTER UPDATE " 
                   +"  ON videogame_t " 
                   +"  FOR EACH ROW " 
                   +" when (new.stock <1 )"
                   +"  BEGIN" 
                   +"  insert into low_stock(description) values ('Out of stock!');"
                   +"  END;")){

          call.execute();
           System.out.println("trigger successful");

 }
catch (SQLException ex){
    ex.printStackTrace();
    return;
        }
}

}
     
      