package com.velocity.shopping;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class InsertUser {
	
public static boolean Insertuser (RegisterUser registerUser) { 
		
		boolean f = false;
		

		try {
			
			// Create Connection
			ConnectionTest connectionTest = new ConnectionTest();
			Connection con = connectionTest.getConnection();
			// SQL Query
			String s = "insert into user1(NAME,USERNAME,PASSWORD) values(?,?,?)";
			// Prepared Statement
			PreparedStatement preparedStatement = con.prepareStatement(s);
			// set values of parameter
			preparedStatement.setString(1, registerUser.getName());
			preparedStatement.setString(2, registerUser.getUsername());
			preparedStatement.setString(3, registerUser.getPassword());
			// execute
			preparedStatement.executeUpdate();
			f = true;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
		
		
	}

}
