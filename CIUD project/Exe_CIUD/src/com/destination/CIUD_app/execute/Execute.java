package com.destination.CIUD_app.execute;

import com.destination.CIUD_app.Insert.InsertData;
import com.destination.CIUD_app.Update.UpdateTable;
import com.destination.CIUD_app.create.CreateDB;
import com.destination.CIUD_app.createTable.CreateTable;
import com.destination.CIUD_app.dbName.Get_DB_name;
import com.destionation.CIUD_app.Delete.Delete;
import com.destination.CIUD_app.OutputScreen.*;
import com.destionation.CIUD_app.Input.*;

public class Execute {
	public static void main(String[] args) {
		try {
			while(true) {
				OutputScreen.outputScreen(); //Prints Choice list - OutputScreen-module
				byte choice = Get_DB_name.choice(); // user input of choice - Get_DB_name module
				switch(choice) {
				case 1: Get_DB_name.getName(); //ask for database name - Get_DB_name module
				        CreateDB c = new CreateDB(); //database creation - DBCreation - module
					    c.create();
					    break;
				case 2: Get_DB_name.getName();
				        CreateTable ct = new CreateTable(); //Table creation - TableCreation module 
					    ct.createTable();
					    break;
				case 3: Get_DB_name.getName();
						QueryAllTables.showTables(); //prints all tables of the given (user input) database - Input module(QueryAllTables)
					    InsertData id = new InsertData(); // insert records - Insertion module
					    break;
				case 4: Get_DB_name.getName();
						QueryAllTables.showTables();
					    UpdateTable ut = new UpdateTable(); //Updation-module 
					    break;
				case 5: Get_DB_name.getName();
						QueryAllTables.showTables();
					    Delete d = new Delete(); //Deletion-module
					    break;
				case 6: Get_DB_name.getName();
						QueryAllTables.showTables();
			    		Input.getTablenameAndAttributes(); // print the table contents - Input module (GetAttributesAndDatatypes class)
			    		break;
				case 7: System.out.println("----------------Exited !!!----------------");
				        System.exit(0);
				        break;
				default: System.out.println("Invalid");
				         break;
				}
			}
		}
		catch(Exception e) {
			System.out.println("Exception caught in main");
			e.printStackTrace();
		}
	}
}
