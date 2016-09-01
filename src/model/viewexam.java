package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import DAO.databaseconnection;

public class viewexam {
	public ArrayList<String[]> save(){
		Connection connect;
		databaseconnection con = new databaseconnection();
		connect = con.getConnect();
		ArrayList<String[]> nm = new ArrayList<String[]>();
		try{
			Statement s = connect.createStatement();
			ResultSet sr = s.executeQuery("select id,nameofexam,dateofexam,optionallinks from result");
		
		while(sr.next()){
			String[] n = new String[4];
			n[0] = sr.getString("id");
			n[1] = sr.getString("nameofexam");
			n[2] = sr.getString("dateofexam");
			n[3] = sr.getString("optionallinks");
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

