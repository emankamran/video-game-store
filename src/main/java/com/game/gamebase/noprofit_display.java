
package com.game.gamebase;

import java.sql.*;

     

public class noprofit_display{
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

     
      try (CallableStatement call = conn.prepareCall("create or replace trigger tr_profit_check "
                                                      + "after insert "
                                                      + "on videogame_t "
                                                      + "for each row "
                                                      + "when (new.price < = new.wholesaleprice) "
                                                      +"begin "
                                                      +"insert into profit_calc(description) values ('no profit!'); "
                                                      +"end;")){


          call.execute();
           System.out.println("trigger successful");

 }
catch (SQLException ex){
    ex.printStackTrace();
    return;
        }
}

}
    
      