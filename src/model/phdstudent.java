package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import DAO.databaseconnection;

public class phdstudent {
	public ArrayList<String[]> save(){
		Connection connect;
		databaseconnection con = new databaseconnection();
		connect = con.getConnect();
		ArrayList<String[]> nm = new ArrayList<String[]>();
		try{
			Statement s = connect.createStatement();
			ResultSet sr = s.executeQuery("select * from phd");
		
		while(sr.next()){
			String[] n = new String[2];
			n[0] = sr.getString("id");
			n[1] = sr.getString("name");
			
			nm.add(n);
		}
		System.out.println(nm);
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				connect.close();
			}catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
}return nm;}}

