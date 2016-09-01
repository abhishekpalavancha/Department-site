package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import DAO.databaseconnection;

public class resource {
String nameofresource,typeofresource,otherdetails,tfr,date,nos,timeslot,dt,myresource,identity;

public String getIdentity() {
	return identity;
}

public void setIdentity(String identity) {
	this.identity = identity;
}

public String getDt() {
	return dt;
}

public void setDt(String dt) {
	this.dt = dt;
}

public String getTimeslot() {
	return timeslot;
}

public void setTimeslot(String timeslot) {
	this.timeslot = timeslot;
}

public String getNos() {
	return nos;
}

public void setNos(String nos) {
	this.nos = nos;
}

public String getDate() {
	return date;
}

public void setDate(String date) {
	this.date = date;
}

public String getTfr() {
	return tfr;
}

public void setTfr(String tfr) {
	this.tfr = tfr;
}

public String getNameofresource() {
	return nameofresource;
}

public void setNameofresource(String nameofresource) {
	this.nameofresource = nameofresource;
}

public String getTypeofresource() {
	return typeofresource;
}

public void setTypeofresource(String typeofresource) {
	this.typeofresource = typeofresource;
}

public String getOtherdetails() {
	return otherdetails;
}

public void setOtherdetails(String otherdetails) {
	this.otherdetails = otherdetails;
}
public int save(){
	Connection connect;
	databaseconnection con = new databaseconnection();
	connect = con.getConnect();
	int verify =0;
	try {
		
		PreparedStatement s = connect.prepareStatement("insert into resource values(?,?,?,?)");
		
		s.setString(1,nameofresource);
		s.setString(2,typeofresource);
		s.setString(3,otherdetails);
		s.setString(4,null);
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
		ResultSet sr = s.executeQuery("select * from resource");
	
	while(sr.next()){
		String[] n = new String[4];
		
		n[0] = sr.getString("nameofresource");
		n[1] = sr.getString("typeofresource");
		n[2] = sr.getString("details");
		n[3] = sr.getString("id");
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
public ArrayList<String> save3(){
	Connection connect;
	databaseconnection con = new databaseconnection();
	connect = con.getConnect();
	ArrayList<String[]> nm = new ArrayList<String[]>();
	ArrayList<String> t = new ArrayList<String>();
	try{
		Statement s = connect.createStatement();
		int time = 8;
		
		for(int i=1;i<8;i++){
			
			   String slotsava = time+"to"+ ++time;
				t.add(slotsava);
			}
		ResultSet sr = s.executeQuery("select time from resourcedate where date ='"+date+"' AND nameofresource='"+nos+"'");
		
		while(sr.next()){
			
		 t.remove(sr.getString("time"));	
		
	}
		
	
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
		
}return t;}
public int save4(String net){
	Connection connect;
	databaseconnection con = new databaseconnection();
	connect = con.getConnect();
	int verify =0;
	try {
		
		PreparedStatement s = connect.prepareStatement("insert into resourcedate values(?,?,?,?,?)");
		
		s.setString(1,nos);
		s.setString(2,dt);
		s.setString(3,timeslot);
		s.setString(4,null);
		s.setString(5,net);
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


	public ArrayList<String[]> resource(String net){
		Connection connect;
		databaseconnection con = new databaseconnection();
		connect = con.getConnect();
		ArrayList<String[]> nm = new ArrayList<String[]>();
		try{
			Statement s = connect.createStatement();
			ResultSet sr = s.executeQuery("select * from resourcedate where id='"+net+"'");
		
		while(sr.next()){
			String[] n = new String[5];
			n[0] = sr.getString("nameofresource");
			n[1] = sr.getString("date");
			n[2] = sr.getString("time");
			n[3] = sr.getString("name");
			n[4] = sr.getString("id");
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
public ArrayList<String[]> resource1(String net){
	Connection connect;
	databaseconnection con = new databaseconnection();
	connect = con.getConnect();
	ArrayList<String[]> nm = new ArrayList<String[]>();
	try{
		Statement s = connect.createStatement();
		ResultSet sr = s.executeQuery("select role from resourcedate where id='"+net+"'");
	
	while(sr.next()){
		String[] n = new String[1];
		n[0] = sr.getString("role");
		
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
public int delete(String date,String slot){
	Connection connect;
	databaseconnection con = new databaseconnection();
	connect = con.getConnect();
	int verify =0;
	try {
		
		PreparedStatement update = connect.prepareStatement("DELETE FROM resourcedate WHERE nameofresource='"+ identity +"' and  date='"+ date +"' and  time='"+ slot +"'");
		 verify = update.executeUpdate();
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return verify;

	}}
	





