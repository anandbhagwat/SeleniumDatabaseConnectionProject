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
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","abcd12345ABCD12345"); 

				System.out.println("Hello");
				//step3 create the statement object  
				Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);  
				
				//step4 execute query  
				ResultSet rs=stmt.executeQuery("select * from student");  
				//rs.beforeFirst();  
				rs.getFetchSize();
				if (rs.next() == false) {
			        System.out.println("ResultSet in empty in Java");
			      } else {

			        do {
			        	System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4)+"  "+rs.getString(5));  
			        } while (rs.next());
			      }


			
//				rs.beforeFirst();
//				rs.next();
//					String myName = rs.getString(1);								        
//                    String myAge = rs.getString(2);					                               
//                    System. out.println(myName+"  "+myAge);	
//					System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4)+"  "+rs.getString(5));  
				
				 
				//step5 close the connection object  
				con.close();  
	}

}
