package com.pa.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateUser {
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost/jdbc11","root","root");
		Statement statement=connection.createStatement();
		statement.execute("update user set name='praveeen' where id =1");
		statement.close();
		System.out.println("user updated successfully");
		
		
	}

}
