package com.destination.CIUD_app.Update;

import java.sql.PreparedStatement;
import java.util.Scanner;

import com.destination.CIUD_app.connect.JDBC_connection;
import com.destionation.CIUD_app.Input.Input;

public class UpdateTable extends Input {
	public UpdateTable() {
		Scanner value = new Scanner(System.in);
		try {
			Input.getNameAndAttribute(); // this method takes input from the user - Input module
			String sql =  "Update "+table_name+" set "+attribute_name+"=? where "+primary_key+"=?"; //MySQL query
			PreparedStatement pst = JDBC_connection.connect().prepareStatement(sql);
			System.out.println("Enter the new value, it will be updated in the column '"+attribute_name+"' : ");
			pst.setString(1, value.next()); //takes input for the new value
			System.out.println("Enter the value of "+primary_key+" of the "+table_name+" table : ");
			pst.setString(2, value.next()); //takes input of the primary key i.e for example: ID
			int i = pst.executeUpdate();
			if(i>0) {
				System.out.println("Updation Successful");
			}
			else {
				System.out.println("Updation Failed");
			}
			pst.close();
		}
		catch(Exception e) {
			System.out.println("Exception in update");
			e.printStackTrace();
		}
	}
}
