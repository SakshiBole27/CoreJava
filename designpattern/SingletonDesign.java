package com.designpattern;

class Database{
	private static Database dbObject;
	private Database() {
		
	}
	public static Database getInstance() {
		if(dbObject == null) {
			dbObject = new Database();
		}
		return dbObject;
	}
	public void getConnection() {
		System.out.println("you are now connected to database");
	}
}

public class SingletonDesign {

	public static void main(String[] args) {
		Database db1;
		db1 = Database.getInstance();
		db1.getConnection();

	}

}
