package com.velocity.shopping;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Inserting product list using Statement
public class ProductList {

	//public static void main(String[] args) throws ClassNotFoundException, SQLException {

		public void getProductList()throws ClassNotFoundException, SQLException {
		try {
			
			String sql1 = "insert into user(productID,productName,productDetails,price,quantity)"
					+ "values(111,'book','maths book',200,100)";
			String sql2 = "insert into user(productID,productName,productDetails,price,quantity)"
					+ "values(102,'notebook','single ruled book',120,100)";
			String sql3 = "insert into user(productID,productName,productDetails,price,quantity)"
					+ "values(103,'pen','gel pen',20,100)";
			String sql4 = "insert into user(productID,productName,productDetails,price,quantity)"
					+ "values(104,'pencil','apsara HB pencil',15,100)";
			String sql5 = "insert into user(productID,productName,productDetails,price,quantity)"
					+ "values(105,'ruler','natraj 150cm ruler',25,100)";
			String sql6 = "insert into user(productID,productName,productDetails,price,quantity)"
					+ "values(106,'eraser ','natraj eraser',5,100)";
			String sql7 = "insert into user(productID,productName,productDetails,price,quantity)"
					+ "values(107,'sharpner','metal sharpner',30,100)";
			String sql8 = "insert into user(productID,productName,productDetails,price,quantity)"
					+ "values(108,'drawing book','A4 size drawing book',80,100)";
			String sql9 = "insert into user(productID,productName,productDetails,price,quantity)"
					+ "values(109,'sketch pen','red color pen',10,100)";
			String sql10 = "insert into user(productID,productName,productDetails,price,quantity)"
					+ "values(110,'notebook','single ruled book',120,100)";
			// Load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// establish the connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/stationary", "root","Root");
			// create the sql statements
			java.sql.Statement stmt = con.createStatement();
			// submit the sql statements to database..
			stmt.execute(sql1);
			stmt.execute(sql2);
			stmt.execute(sql3);
			stmt.execute(sql4);
			stmt.execute(sql5);
			stmt.execute(sql6);
			stmt.execute(sql7);
			stmt.execute(sql8);
			stmt.execute(sql9);
			stmt.execute(sql10);

			System.out.println("Insertion successfully...");
			// close the resources.
			con.close();
			stmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
