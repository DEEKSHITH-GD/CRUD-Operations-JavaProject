package com.destionation.CIUD_app.Input;
//this has query to get 1-10 place holders w.r.t to user input for no of attributes
public class QueryPlaceHolder extends Input {
	public static String queryPlaceHolder() {
		if(noAttr == 1) {
			String query = "Insert into "+table_name+" value(?)";
			return query;
		}
		else if(noAttr == 2) {
			String query = "Insert into "+table_name+" value(?,?)";
			return query;
		}
		else if(noAttr == 3) {
			String query = "Insert into "+table_name+" value(?,?,?)";
			return query;
		}
		else if(noAttr == 4) {
			String query = "Insert into "+table_name+" value(?,?,?,?)";
			return query;
		}
		else if(noAttr == 5) {
			String query = "Insert into "+table_name+" value(?,?,?,?,?)";
			return query;
		}
		else if(noAttr == 6) {
			String query = "Insert into "+table_name+" value(?,?,?,?,?,?)";
			return query;
		}
		else if(noAttr == 7) {
			String query = "Insert into "+table_name+" value(?,?,?,?,?,?,?)";
			return query;
		}
		else if(noAttr == 8) {
			String query = "Insert into "+table_name+" value(?,?,?,?,?,?,?,?)";
			return query;
		}
		else if(noAttr == 9) {
			String query = "Insert into "+table_name+" value(?,?,?,?,?,?,?,?,?)";
			return query;
		}
		else {
			String query = "Insert into "+table_name+" value(?,?,?,?,?,?,?,?,?,?)";
			return query;
		}
		
	}

}
