package com.velocity.shopping;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.Scanner;

public class Test {
	 
	public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {

		System.out.println("Welcome To  Stationary Store..");
		
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.println("-------------------------");
			System.out.println("Press 1 to Register : ");
			System.out.println("Press 2 to Login : ");
			System.out.println("Press 3 to Login as Admin : ");
			System.out.println("Press 4 to Exit : ");
			System.out.println("-------------------------");
			int a = Integer.parseInt(bufferedReader.readLine());

			if (a == 1) {
				// add user
				System.out.println("Registration Page....");
				System.out.println("Enter Name : ");
				String name = bufferedReader.readLine();
				System.out.println("Enter UserName : ");
				String username = bufferedReader.readLine();
				System.out.println("Enter Password : ");
				String pass = bufferedReader.readLine();

				// Create RegisterUSer object to store the object

				RegisterUser registerUser = new RegisterUser(name,username, pass);
				boolean ans = InsertUser.Insertuser(registerUser);
				if (ans) {
					System.out.println("User Registered Successfully....");

				} else {
					System.out.println("Something Went Wrong.... ");
				}

			}
			if (a == 2) {
				// Login Page
				System.out.println("Login Page");
				System.out.println("---------------------");
				System.out.println("Enter Username : ");
				String Uname = bufferedReader.readLine();
				System.out.println("Enter Password : ");
				String Password = bufferedReader.readLine();
				// Calling Login Class method to Validate username and password
				Login login = new Login();
				login.validateLogin(Uname, Password);

			}
			if (a == 3) {

				//Admin Login Page

				System.out.println("Admin Login..");
				System.out.println("-------------------------");
				System.out.println("Enter Username : ");
				String uid = bufferedReader.readLine();
				System.out.println("Enter Password : ");
				String pas = bufferedReader.readLine();
				if(uid.equals("Admin") && pas.equals("Admin")) {
					System.out.println("Login Successfull...");
					System.out.println("Welcome Admin!!");
				}
				else {
					System.out.println("Invalid Username or Password..");
					break;
				}
				Admin admin = new Admin();
				admin.adminMenu();
				admin.getUserDetails();
			}
			
			if (a == 4) {
				
				// exit
				break;
			} 
			else {
				
			}
			ProductList list = new ProductList();
			list.getProductList();
			
			Login login = new Login();
			login.validateLogin("Username","Password");
			
		        Scanner scanner = new Scanner(System.in);

		        for (int i = 1; i <= 3; i++) {
		            System.out.println("Name");
		            String name = scanner.next();
		            System.out.println("Username");
		            String username = scanner.next();
		            System.out.println("Password");
		            String password = scanner.next();
		           
		        
		    
			InsertUser insertUser = new InsertUser();
			insertUser.Insertuser(null);
		    
			Product product = new Product();
			product.productInfo();
			product.getQuantity();
			
			Cart cart = new Cart();
			cart.addToCart();
			
			CheckOut checkOut = new CheckOut();
			checkOut.CheckOutDetails();
			
			OrderHistory orderHistory = new OrderHistory();
			orderHistory.previousOrderHistory();
		}
		System.out.println("Thank You For Visiting Us....");

	}
		
 }
}
