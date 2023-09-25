package com.destionation.CIUD_app.Input;

import java.sql.*;

import com.destination.CIUD_app.connect.JDBC_connection;

public class GetAttributesAndDatatypes extends Input {
	public static void queryTable() {
		try {
			Statement stmt = JDBC_connection.connect().createStatement(); //establish connection
			ResultSet rs = stmt.executeQuery("select * from "+table_name); //MySQL query
			ResultSetMetaData rsmd = rs.getMetaData(); //gets metadata (info of the tables)
			noAttr = (byte) rsmd.getColumnCount(); //gets no of columns in the table i.e attributes of the table
			for(byte i=0; i<noAttr; i++) {
				attr_type.add(i,rsmd.getColumnTypeName(i+1)); //fetching column name
				attribute.add(i,rsmd.getColumnName(i+1));	  //fetching column datatype
			}
			for(byte i=0; i<noAttr; i++) {
			System.out.print(attribute.get(i)+"\t\t"); // now we get table attributes without user input, directly from MySQL
			}
			System.out.println();
			while(rs.next() != false) {
				for(byte i=0; i<noAttr; i++) {  //loop for getting each value of each attribute in the table
					if(attr_type.get(i) == "int") { //if attribute is of INT
						System.out.print(rs.getInt(i+1)); //gets the values 
						System.out.print("\t\t"); //two tab spaces
					}
					else {  // if attribute is of VARCHAR
						System.out.print(rs.getString(i+1));
						System.out.print("\t\t");
					}
				}
				System.out.println();
			}
		}
		catch(Exception e) {
			System.out.println("Exception in query");
			e.printStackTrace();
		}
	}
}
