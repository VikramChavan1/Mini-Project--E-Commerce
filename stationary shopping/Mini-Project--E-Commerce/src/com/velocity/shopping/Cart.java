package com.velocity.shopping;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cart {

	public void addToCart() throws NumberFormatException, IOException, ClassNotFoundException, SQLException {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Add Products To cart : ");
		System.out.println("Enter Product ID : ");
		String ID = scanner.next();

		ConnectionTest connectionTest = new ConnectionTest();
		Connection con = connectionTest.getConnection();
		// create query
		String s = "select ProductId,ProductName,ProductPrice from product where ProductId=?";
		// prepared statement
		PreparedStatement preparedStatement = con.prepareStatement(s);
		preparedStatement.setString(1, ID);
		ResultSet r = preparedStatement.executeQuery();

		ArrayList<String> cart = new ArrayList<>();
		{
			while (r.next()) {
				System.out.println("Products in Cart..");
				cart.add("ID : " + r.getString(1));
				cart.add("Name : " + r.getString(2));
				cart.add("Price : " + r.getString(3));
				System.out.println(cart);
				System.out.println("Total Amount : " + cart.get(2));

			}
			con.close();
		}
	}
}
