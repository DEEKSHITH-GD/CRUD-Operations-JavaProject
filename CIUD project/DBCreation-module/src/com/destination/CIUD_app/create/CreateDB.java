package com.destination.CIUD_app.create;

import java.sql.*;
import com.destination.CIUD_app.connect.*;
import com.destination.CIUD_app.dbName.Get_DB_name;

public class CreateDB extends Get_DB_name { //getting the database name from Get_DB_name class
	
	public void create() {
		try {
			Statement stmt = JDBC_connection.connect().createStatement(); //establishing connection
			int x = stmt.executeUpdate("create database "+db_name);
			if(x>0) {
				System.out.println("New Database "+db_name+" created");
			}
			else {
				System.out.println("Database creation failed");
			}
			stmt.close();
		}
		catch(Exception e){
			System.out.println("Excepton caught in create");
		}
	}
}
