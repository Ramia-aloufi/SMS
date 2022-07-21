package TheElite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class connection {
	
	
	public static Connection MyConnection() {
        Connection con = null;

          try
		
		{
			//Load Driver
			Class.forName("com.mysql.cj.jdbc.Driver");  
			
			//Establish Connection
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentDB","root","raam7711"); 
			 return con;
		
		}

		catch(Exception e){ System.out.println(e);
		return null;}  
	}


}
