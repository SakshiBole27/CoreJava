package com.designpattern;

import java.util.ArrayList;

class User{

String name,city;

public User(String name, String city) {
	super();
	this.name = name;
	this.city = city;
}

@Override
public String toString() {
	return "User [name=" + name + ", city=" + city + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
			+ ", toString()=" + super.toString() + "]";
}
}

class UserService{
	ArrayList al;
	public UserService() {
		al = new ArrayList<>();
		al.add(new User("Sakshi","siddhi"));
		al.add(new User("Vanashree","Teju"));
		al.add(new User("Payal","Monika"));
	}
		public ArrayList getUser() {
			return al;
		
	}
}

class UserDetails implements Cloneable{
	private ArrayList alist;
	
	public UserDetails(ArrayList alist) {
		super();
		this.alist = alist;
	}
	public UserDetails() {
		super();
		this.alist= new ArrayList<>();
	}
	public void getUser() {
		UserService us = new UserService();
		alist = us.getUser();
	}
	public ArrayList getUserList() {
		return alist;
		
	}
}
public class PrototypeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
