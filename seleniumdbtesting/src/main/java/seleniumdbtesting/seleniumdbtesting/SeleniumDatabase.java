package seleniumdbtesting.seleniumdbtesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SeleniumDatabase {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","system"); 

				System.out.println("Hello");
				//step3 create the statement object  
				Statement stmt=con.createStatement();  
				
				//step4 execute query  
				ResultSet rs=stmt.executeQuery("select * from persons");  
				//System.out.println(rs.first());  
				rs.next();
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
				if(rs.next())
				{
					rs.beforeFirst();
					//System.out.println(rs.first());
					System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
				
				}
				//step5 close the connection object  
				con.close();  
	}

}
