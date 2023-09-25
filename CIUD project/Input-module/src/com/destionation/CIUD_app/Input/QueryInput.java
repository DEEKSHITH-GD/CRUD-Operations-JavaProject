package com.destionation.CIUD_app.Input;
//this has query to get 1-10 attributes w.r.t to user input for no of attributes
public class QueryInput extends Input {
	public static String queryAttributes() {
		if(noAttr == 1) {
			String query = "create table "+table_name+"("+attribute.get(0)+" "+attr_type.get(0)+")";
			return query;
		}
		else if(noAttr == 2) {
			String query = "create table "+table_name+"("+attribute.get(0)+" "+attr_type.get(0)+","+attribute.get(1)+" "+attr_type.get(1)+")";
			return query;
		}
		else if(noAttr == 3) {
			String query = "create table "+table_name+"("+attribute.get(0)+" "+attr_type.get(0)+","+attribute.get(1)+" "+attr_type.get(1)+","+attribute.get(2)+" "+attr_type.get(2)+")";
			return query;
		}
		else if(noAttr == 4) {
			String query = "create table "+table_name+"("+attribute.get(0)+" "+attr_type.get(0)+","+attribute.get(1)+" "+attr_type.get(1)+","+attribute.get(2)+" "+attr_type.get(2)+","+attribute.get(3)+" "+attr_type.get(3)+")";
			return query;
		}
		else if(noAttr == 5) {
			String query = "create table "+table_name+"("+attribute.get(0)+" "+attr_type.get(0)+","+attribute.get(1)+" "+attr_type.get(1)+","+attribute.get(2)+" "+attr_type.get(2)+","+attribute.get(3)+" "+attr_type.get(3)+","+attribute.get(4)+" "+attr_type.get(4)+")";
			return query;
		}
		else if(noAttr == 6) {
			String query = "create table "+table_name+"("+attribute.get(0)+" "+attr_type.get(0)+","+attribute.get(1)+" "+attr_type.get(1)+","+attribute.get(2)+" "+attr_type.get(2)+","+attribute.get(3)+" "+attr_type.get(3)+","+attribute.get(4)+" "+attr_type.get(4)+","+attribute.get(5)+" "+attr_type.get(5)+")";
			return query;
		}
		else if(noAttr == 7) {
			String query = "create table "+table_name+"("+attribute.get(0)+" "+attr_type.get(0)+","+attribute.get(1)+" "+attr_type.get(1)+","+attribute.get(2)+" "+attr_type.get(2)+","+attribute.get(3)+" "+attr_type.get(3)+","+attribute.get(4)+" "+attr_type.get(4)+","+attribute.get(5)+" "+attr_type.get(5)+","+attribute.get(6)+" "+attr_type.get(6)+")";
			return query;
		}
		else if(noAttr == 8) {
			String query = "create table "+table_name+"("+attribute.get(0)+" "+attr_type.get(0)+","+attribute.get(1)+" "+attr_type.get(1)+","+attribute.get(2)+" "+attr_type.get(2)+","+attribute.get(3)+" "+attr_type.get(3)+","+attribute.get(4)+" "+attr_type.get(4)+","+attribute.get(5)+" "+attr_type.get(5)+","+attribute.get(6)+" "+attr_type.get(6)+","+attribute.get(7)+" "+attr_type.get(7)+")";
			return query;
		}
		else if(noAttr == 9) {
			String query = "create table "+table_name+"("+attribute.get(0)+" "+attr_type.get(0)+","+attribute.get(1)+" "+attr_type.get(1)+","+attribute.get(2)+" "+attr_type.get(2)+","+attribute.get(3)+" "+attr_type.get(3)+","+attribute.get(4)+" "+attr_type.get(4)+","+attribute.get(5)+" "+attr_type.get(5)+","+attribute.get(6)+" "+attr_type.get(6)+","+attribute.get(7)+" "+attr_type.get(7)+","+attribute.get(8)+" "+attr_type.get(8)+")";
			return query;
		}
		else {
			String query = "create table "+table_name+"("+attribute.get(0)+" "+attr_type.get(0)+","+attribute.get(1)+" "+attr_type.get(1)+","+attribute.get(2)+" "+attr_type.get(2)+","+attribute.get(3)+" "+attr_type.get(3)+","+attribute.get(4)+" "+attr_type.get(4)+","+attribute.get(5)+" "+attr_type.get(5)+","+attribute.get(6)+" "+attr_type.get(6)+","+attribute.get(7)+" "+attr_type.get(7)+","+attribute.get(8)+" "+attr_type.get(8)+","+attribute.get(9)+" "+attr_type.get(9)+")";
			return query;
		}
		
	}

}
