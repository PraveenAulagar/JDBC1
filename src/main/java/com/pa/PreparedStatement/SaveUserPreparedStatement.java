package com.pa.PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class SaveUserPreparedStatement {
	
	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost/jdbc11","root","root");
		PreparedStatement preparedStatement=connection.prepareStatement("insert into User values(?,?,?)");
		
		System.out.println("enter id");
		int id = sc.nextInt();
		System.out.println("enter name");
		String name=sc.next();
		System.out.println("enter address");
		String address=sc.next();
		
		preparedStatement.setInt(1, id);
		preparedStatement.setString(2, name);
		preparedStatement.setString(3, address);
		
		preparedStatement.execute();
		connection.close();
		System.out.println("user saved using ps");
		
	}

}
