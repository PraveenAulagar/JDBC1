package com.pa.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SaveUser {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc11","root","root");
		Statement statement = connection.createStatement();
		statement.execute("insert into user values(3,'naveen','mumbai')");
		statement.close();
		System.out.println("user saved succesfully");
		
		
		
		
	}

}
