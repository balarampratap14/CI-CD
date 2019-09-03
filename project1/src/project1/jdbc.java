
package project1;
import java.sql.*;
import java.util.Scanner;

public class jdbc {
	public static void main (String args[]) throws Exception
	{

	String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";  
	 String DB_URL = "jdbc:mysql://localhost:3307/university";
	 String USER = "root";
	 String PASS = "qazwsxedc"; 
	String query = "select * from client_master14 where NAME like '%s'";

	Class.forName(JDBC_DRIVER);
	  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/university", "root", "qazwsxedc");
	  	
	Statement st = con.createStatement();
	ResultSet rs = st.executeQuery(query);
	rs.next();
	int price = rs.getInt("BALDUE");
	System.out.println(price);
	 st.close();
	    con.close();

	}
}
