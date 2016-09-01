package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import DAO.databaseconnection;

public class studentresult {
	public ArrayList<String[]> save3(String netid){
		Connection connect;
		databaseconnection con = new databaseconnection();
		connect = con.getConnect();
		ArrayList<String[]> nm = new ArrayList<String[]>();
		try{
			Statement s = connect.createStatement();
			ResultSet sr = s.executeQuery("select examid,id from sign where netid='"+netid+"'");
		
		while(sr.next()){
			
			String[] d = new String[2];
			d[0] = sr.getString("examid");
			d[1] = sr.getString("id");
			nm.add(d);
			
			
			
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
			
}return nm;}
	
	/*public ArrayList<String> save4(){
		Connection connect;
		databaseconnection con = new databaseconnection();
		connect = con.getConnect();
		ArrayList<String> nm = new ArrayList<String>();
		try{
			Statement s = connect.createStatement();
			ResultSet sr = s.executeQuery("select id from sign where netid=='"+netid+"'");
		
		while(sr.next()){
			
			
			nm.add(sr.getString("id"));
			
			
			
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
			
}return nm;}
}*/
}



