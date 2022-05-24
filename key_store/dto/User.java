package com.ty.key_store.dto;

public class User 
{
	private int uid;
	private String name;
	private String email;
	private String password;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		System.out.println("User Id: "+uid);
		System.out.println("User Name: "+name);
		System.out.println("User Email: "+email);
		System.out.println("User Password: "+password);
		System.out.println("---------------------------");
		return "";
	}	
}

