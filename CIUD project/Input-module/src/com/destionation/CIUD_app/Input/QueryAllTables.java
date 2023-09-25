package com.destionation.CIUD_app.Input;

import java.sql.*;

import com.destination.CIUD_app.connect.JDBC_connection;

public class QueryAllTables {
	public static void showTables() {
		try {
			Statement stmt = JDBC_connection.connect().createStatement();
			ResultSet rs = stmt.executeQuery("show tables");
			System.out.println("Tables present in this database: ");
			while(rs.next()) {
				System.out.println(rs.getString(1));
			}
			System.out.println();
		}
		catch(Exception e) {
			System.out.println("Exception in query");
			e.printStackTrace();
		}
	}
}
