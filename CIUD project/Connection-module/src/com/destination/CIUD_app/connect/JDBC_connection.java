package com.destination.CIUD_app.connect;
import java.sql.*;

import com.destination.CIUD_app.dbName.Get_DB_name;

public class JDBC_connection extends Get_DB_name {
	static String url;
	static final String user = "root";
	static final String pwd = "ROOT"; //change pwd
	@SuppressWarnings("exports")
	public static Connection connect() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		if(choice == 1) {
			url = "jdbc:mysql://localhost:3306"; //for establishing connection when creating a new database w/o assigning any database name 
		}
		else {
			url = "jdbc:mysql://localhost:3306/"+db_name; //establishing connection with the user input database
		}
		Connection con = DriverManager.getConnection(url, user, pwd);
		if(con != null) {
			System.out.println("Connection Established");
		}
		else {
			System.out.println("Failed to Connect");
		}
		return con; //method returns connection to other modules requiring connection
	}
}
