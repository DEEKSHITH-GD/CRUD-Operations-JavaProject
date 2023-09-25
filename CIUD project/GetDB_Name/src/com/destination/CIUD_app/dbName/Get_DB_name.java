package com.destination.CIUD_app.dbName;

import java.util.Scanner;

public class Get_DB_name {
	protected static String db_name;
	protected static byte choice;
	static Scanner sc = new Scanner(System.in);
	public static byte choice() {
		try {
			System.out.println("Enter your Choice: ");
			choice = sc.nextByte();
		}
		catch(Exception e) {
			System.out.println("Exception in choice()");
			e.printStackTrace();
		}
		return choice;
	}
	public static String getName() {
		System.out.println("Enter the Database name: "); //user input for database name
		db_name = sc.next();
		return db_name;
	}
}
