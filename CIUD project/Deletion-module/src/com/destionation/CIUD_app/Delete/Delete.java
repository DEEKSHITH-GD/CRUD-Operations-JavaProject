package com.destionation.CIUD_app.Delete;

import java.sql.PreparedStatement;
import java.util.Scanner;

import com.destination.CIUD_app.connect.JDBC_connection;
import com.destionation.CIUD_app.Input.Input;

public class Delete extends Input { //getting table_name and primary_key from Input class
	public Delete() {
		Scanner value = new Scanner(System.in);
		try {
			Input.getTableNameAndPrimaryKey();
			String sql =  "Delete from "+table_name+" where "+primary_key+"=?"; //MySQL query for delete
			PreparedStatement pst = JDBC_connection.connect().prepareStatement(sql);
			System.out.println("Enter the value of "+primary_key+" of the "+table_name+" table : "); 
			pst.setString(1, value.next()); //Input from user for primary key of the table
			int i = pst.executeUpdate();
			if(i>0) {
				System.out.println("Deletion Successful");
			}
			else {
				System.out.println("Deletion Failed");
			}
			pst.close();
		}
		catch(Exception e) {
			System.out.println("Exception in Delete");
			e.printStackTrace();
		}
	}
}
