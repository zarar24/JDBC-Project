package jdbc;

import java.util.*;
import java.sql.*;

public class Demo {

//	String username;
//	String password;

	public static void main(String[] args) throws Exception {
		try {

			
			//Insert Values
			
			
//			System.out.println("Insert values");
//			Scanner sc = new Scanner(System.in);
//			String username = sc.nextLine();
//			String password = sc.nextLine();
//			Class.forName("com.mysql.jdbc.Driver");
//			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root", "root");
//
//			String sql = "insert into user Values(?,?)";
//
//			PreparedStatement st = conn.prepareStatement(sql);
//			st.setString(1, username);
//			st.setString(2, password);
//
//			int count = st.executeUpdate();
//			System.out.println(count + " row affected");
//

			
			
			
			
			//Update Query
			
			String username="dines";
			String password="zarar12345";
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root", "root");

			String sql = "UPDATE user SET username=? where password=?";

			PreparedStatement st = conn.prepareStatement(sql);
			st.setString(1, username);
			st.setString(2, password);

			int count = st.executeUpdate();
			System.out.println(count + " row affected");

			
			
			
			
			
			
			
			
			
			// Select Query
//			Class.forName("com.mysql.jdbc.Driver");
//			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root", "root");

			
//			String sql = "Select * from user";
//			PreparedStatement st = conn.prepareStatement(sql); 
//			ResultSet rs= st.executeQuery();
//			while (rs.next()) {
//			String foo = rs.getString(1) + " " + rs.getString(2);
//			System.out.println(foo);
//		}

			
			
			
			
			
			
			
			
			
			// Delete Query
//			Class.forName("com.mysql.jdbc.Driver");
//			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root", "root");
//			String sql = "delete from user where	";	
//			String username = "";
//			String password = "";

		} catch (

		SQLException ex) {
			ex.printStackTrace();
		}
	}

}
