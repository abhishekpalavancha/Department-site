package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import DAO.databaseconnection;

public class deletedis {
	String identity;

	public String getIdentity() {
		return identity;
	}

	public void setIdentity(String identity) {
		this.identity = identity;
	}
	public int delete(){
		Connection connect;
		databaseconnection con = new databaseconnection();
		connect = con.getConnect();
		int verify =0;
		try {
			
			PreparedStatement update = connect.prepareStatement("DELETE FROM discussionfeed WHERE parentFeedID='"+ identity +"'");
			 verify = update.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return verify;
	}
	
}

