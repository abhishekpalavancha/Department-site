package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import DAO.databaseconnection;

public class officehours {
	String p;
	
	public String getP() {
		return p;
	}

	public void setP(String p) {
		this.p = p;
	}

	public ArrayList<String[]> save(String netid){
		//String message = (String)request.getAttribute("error");
	
	Connection connect;
	databaseconnection con = new databaseconnection();
	connect = con.getConnect();
	ArrayList<String[]> nm = new ArrayList<String[]>();
	try{
		Statement s = connect.createStatement();
		ResultSet sr = s.executeQuery("select * from course where netid='"+netid+"'");
	
	while(sr.next()){
		String[] n = new String[3];
		
		n[0] = sr.getString("courseid");
		n[1] = sr.getString("coursename");
		n[2] = sr.getString("netid");
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
		
}return nm;}
public ArrayList<String[]> student(){
	//String message = (String)request.getAttribute("error");

Connection connect;
databaseconnection con = new databaseconnection();
connect = con.getConnect();
ArrayList<String[]> m = new ArrayList<String[]>();
try{
	Statement s = connect.createStatement();
	ResultSet sr = s.executeQuery("select * from course");

while(sr.next()){
	String[] n = new String[3];
	
	n[0] = sr.getString("courseid");
	n[1] = sr.getString("coursename");
	n[2] = sr.getString("netid");
	m.add(n);
}
System.out.println(m);
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
	
}return m;}}


