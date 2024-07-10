package JavaPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLDemo2 {
	public static void main(String[] args) throws Exception {
		// 1.Create connection
		Connection con1 = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/employees","root","Reallife@619");
		//Connection con = DriverManager
			//	.getConnection("jdbc:mysql://localhost:3306/employees", "root", "Reallife@619");
		
		// 2.create statement query
		Statement stmt = con1.createStatement();

		String s ="Select StudentID, name from student";

		// 3.&.4 execute statement query & Store in data in ResultSet
		ResultSet rs=stmt.executeQuery(s);
		while (rs.next()) {
			
			int sid = rs.getInt("StudentID");
			String name = rs.getString("Name");
			System.out.println(sid+" "+name+" ");	
		}
		// 5.close connection
		con1.close();

		System.out.println("Query Executed");

	}

}
