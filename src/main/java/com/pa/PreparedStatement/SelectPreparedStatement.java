package com.pa.PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SelectPreparedStatement {
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc11","root","root");
		PreparedStatement preparedStatement=connection.prepareStatement("select * from user where id=?");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the id");
		int id = sc.nextInt();
		
		preparedStatement.setInt(1, id);
		
		ResultSet resultSet=preparedStatement.executeQuery();
		if(resultSet.next());
		{
			System.out.println(resultSet.getInt(1));
			System.out.println(resultSet.getString(2));
			System.out.println(resultSet.getString(3));
			
		}
		
		connection.close();
		
		
	}
	

}
