package JavaPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLDemo1 {

	public static void main(String[] args) throws Exception {
		
		//1.create connection
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/employees","root","Reallife@619");

		//2.create statement query
		Statement stmt= con.createStatement();
		
		//String s ="Insert Into student values (104,'Rajesh')";
		String s = "update student set name='VIRAT' WHERE StudentID =104 ";
		
		//3.execute statement query		
		stmt.execute(s);
		
		//4.close connection
		con.close();
		
		System.out.println("Query Executed");
		
		
	}

}
