package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import DAO.databaseconnection;

public class Teach {
String identity,net;

public String getIdentity() {
	return identity;
}

public void setIdentity(String identity) {
	this.identity = identity;
}

public String getNet() {
	return net;
}

public void setNet(String net) {
	this.net = net;
}
public int save(){
	Connection connect;
	databaseconnection con = new databaseconnection();
	connect = con.getConnect();
	int verify =0;
	try {
		
		PreparedStatement update = connect.prepareStatement("UPDATE course SET netid='"+net+"' where courseid='"+identity+"'");
		verify=update.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally{
		try {
			connect.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	return verify;
}

}
