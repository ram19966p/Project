package com.mycompany.parabitnbbms;

/**
 *
 * @author ramla
 */
import java.sql .Connection ;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet; 

public class ParabitDB {
   Connection con ;
   Statement stm;
   ResultSet  rs;
    ResultSet rss, rs1;
    
      public ParabitDB()
      {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/parabitnbbms","root","");
            stm=con.createStatement();
        }
        catch(Exception e)
        {
             System.out.println(e);
        }
      
      }

  
}

