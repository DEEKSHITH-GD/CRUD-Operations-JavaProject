package com.destination.CIUD_app.createTable;

import java.sql.Statement;

import com.destination.CIUD_app.connect.JDBC_connection;
import com.destionation.CIUD_app.Input.Input;
import com.destionation.CIUD_app.Input.QueryInput;

public class CreateTable extends Input {
	public void createTable() {
		Input.input(); //this methods takes input from the user -Input module
		try {
			Statement stmt = JDBC_connection.connect().createStatement();
			int x = stmt.executeUpdate(QueryInput.queryAttributes()); //gets query from queryAttributes()-Input modules
			if(x==0) {
				System.out.println("table created");
			}
			else {
				System.out.println("table creation failed");
			}
			stmt.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	/*public static void main(String[] args) {
		CreateTable ct = new CreateTable();
		ct.createTable();*/
}


