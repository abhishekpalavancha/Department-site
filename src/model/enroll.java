package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import DAO.databaseconnection;

public class enroll {
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
		
		PreparedStatement s = connect.prepareStatement("insert into enroll values(?,?)");
		s.setString(1,identity);
		s.setString(2,net);
		verify = s.executeUpdate();
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
public ArrayList<String[]> save1(){
	Connection connect;
	databaseconnection con = new databaseconnection();
	connect = con.getConnect();
	ArrayList<String[]> nm = new ArrayList<String[]>();
	try{
		Statement s = connect.createStatement();
		ResultSet sr = s.executeQuery("select * from enroll");
	
	while(sr.next()){
		String[] n = new String[2];
		n[0] = sr.getString("identity");
		n[1] = sr.getString("net");
	
		
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

