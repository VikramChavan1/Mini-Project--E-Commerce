package com.velocity.shopping;

public class UserRegistration {
	
	public String name;
	public String Username;
	public String Password;
	
	//Create Constructor to store Username and Password
	
	public UserRegistration(String name,String Username,String Password) {
		super();
		this.name = name;
		this.Username = Username;
		this.Password = Password;	
}

	@Override
	public String toString() {
		return "UserRegistration [name=" + name + ", Username=" + Username + ", Password=" + Password + "]";
	}

	//getter and setter methd for name,Username and Password
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}
}
	
	
	