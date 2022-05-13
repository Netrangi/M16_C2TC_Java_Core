package in.cg.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;

public class CrudDb {

	public static void main(String[] args)
	{
		String dbURL="jdbc:mysql://127.0.0.1:3306/CG1";
        String username="root";
        String password="Netra@2403";
        try
        {
           Connection con=DriverManager.getConnection(dbURL, username, password);
           String sql="INSERT INTO Employee22(user_name,password,email)values(?,?,?)";
           PreparedStatement s=con.prepareStatement(sql);
           
           s.setString(1, "Netrangi j12");
           s.setString(2, "Pass@123");
           s.setString(3, "netra@gmail.com");
           
           int rows=s.executeUpdate();
           
           if(rows>0)
           {
        	   System.out.println("A new user information entered successfully");
           }
           con.close();
        }
        catch(SQLException e)
        {
        	System.out.println("Exception occoured "+e);
        	
        }
	}
}


