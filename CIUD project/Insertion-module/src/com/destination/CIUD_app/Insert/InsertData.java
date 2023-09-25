package com.destination.CIUD_app.Insert;

import java.sql.*;
import java.util.Scanner;

import com.destination.CIUD_app.connect.JDBC_connection;
import com.destionation.CIUD_app.Input.Input;
import com.destionation.CIUD_app.Input.QueryPlaceHolder;

public class InsertData extends Input {
	public InsertData() {
		try {
			Scanner value = new Scanner(System.in);
			Input.getTablenameAndAttributes();
			System.out.println("How many records would you like to insert into "+table_name+" table ? "); 
			byte val = value.nextByte(); 
			for(byte v=0; v<val; v++) {   //loop for inserting more rows into table
			String sql =  QueryPlaceHolder.queryPlaceHolder(); //query is taken from queryPlaceHolder() - Input modules
			PreparedStatement pst = JDBC_connection.connect().prepareStatement(sql);
			for(byte i=0; i<noAttr; i++) { //loop to get input for all the attributes
			System.out.println("Enter the Value of "+attribute.get(i));
			if(attr_type.get(i) == "int" || attr_type.get(i) == "int primary key" || attr_type.get(i) == "int unique" 
					|| attr_type.get(i) == "int primary key unique" || attr_type.get(i) == "INT" || attr_type.get(i) == "INT PRIMARY KEY"
					|| attr_type.get(i) == "INT UNIQUE" || attr_type.get(i) == "INT PRIMARY KEY UNIQUE") {
				pst.setInt(i+1, value.nextInt()); // scanning the user input
			}
			else {
				pst.setString(i+1, value.next());
			}
			}
			int y = pst.executeUpdate();
			if(y>0) {
				System.out.println("Data Inserted");
			}
			else {
				System.out.println("Data Insertion Failed");
			}
			pst.close();
			}
		}
		catch(Exception e) {
			System.out.println("Exception in insert");
			e.printStackTrace();
		}
	}
}
