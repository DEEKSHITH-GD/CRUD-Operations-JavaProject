package com.destionation.CIUD_app.Input;

import java.util.ArrayList;
import java.util.Scanner;

public class Input {
	protected static String primary_key;
	protected static String attribute_name;
	protected static String table_name;
	protected static byte noAttr=0;
	protected static ArrayList<String> attribute = new ArrayList<String>();
	protected static ArrayList<String> attr_type = new ArrayList<String>();
	static Scanner in = new Scanner(System.in);
	static Scanner scan = new Scanner(System.in);
	public static void input() {
		try {
			System.out.println("Provide name for the table: "); //for table name
			table_name = in.next();
			System.out.println("Specify the number of attributes or columns [max:10]: "); //for no of attributes/column
			noAttr = in.nextByte();
			System.out.println("\nNOTE: Please add PIMARY KEY, FOREIGN KEY REFERENCES Constraints, if any.\n"
					+ "      Add constraints while entering the last attribute's datatype separate it with ','(comma)\n"
					+ "for example: Enter the datatype '[int or varchar(size)]' of Employee_name :\n"
					+ "\t     varchar(20) not null, primay key (ID)\n");
			for(byte i=0; i<noAttr; i++) {
				System.out.println("Provide the name of Attribute "+(i+1)+" :");
				attribute.add(i,in.next());
				System.out.println("Enter the datatype '[int or varchar(size)]' of "+attribute.get(i)+ " :");
				String name = "";
		        name += scan.nextLine();
		        attr_type.add(i,name);
				//System.out.println("the datatype and constraint is :" + name);
				//attr_type.add(i, in.next());
			}
			System.out.println(attribute);
			System.out.println(attr_type);
			//scan.close();
		}
		catch(Exception e) {
			System.out.println("Exception caught in Input");
			e.printStackTrace();
		}
	}
	public static void getTablenameAndAttributes() {
		System.out.println("Enter the table name: ");
		table_name = in.next();
		GetAttributesAndDatatypes.queryTable();
	}
	public static void getNameAndAttribute(){
		System.out.println("Enter the table name: ");
		table_name = in.next();
		GetAttributesAndDatatypes.queryTable();
		System.out.println("Enter the attribute or column name to be updated: ");
		attribute_name = in.next();
		System.out.println("Enter the attribute or column name of primary key in the table: ");
		primary_key = in.next();	
	}
	public static void getTableNameAndPrimaryKey(){
		System.out.println("Enter the table name: ");
		table_name = in.next();
		GetAttributesAndDatatypes.queryTable();
		System.out.println("Enter the attribute or column name of primary key: ");
		primary_key = in.next();
	}
}
