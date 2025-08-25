package com.pa.PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateUserPreparedStatement {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection  connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc11","root","root");
		PreparedStatement preparedStatement=connection.prepareStatement("update user set name=?, address=? where id=?");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter id");
		int id = sc.nextInt();
		System.out.println("enter name");
		String name = sc.next();
		System.out.println("enter address");
		String address=sc.next();
		
		preparedStatement.setInt(3, id);
		preparedStatement.setString(1, name);
		preparedStatement.setString(2, address);
	
		
		preparedStatement.execute();
		
		connection.close();
		
		System.out.println("updated using PS");
		
		
		
	}

}
