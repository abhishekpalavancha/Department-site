package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import DAO.databaseconnection;

public class infocourse {
String courseid,officehours,tainfo,syllabus;

public String getCourseid() {
	return courseid;
}

public void setCourseid(String courseid) {
	this.courseid = courseid;
}

public String getOfficehours() {
	return officehours;
}

public void setOfficehours(String officehours) {
	this.officehours = officehours;
}

public String getTainfo() {
	return tainfo;
}

public void setTainfo(String tainfo) {
	this.tainfo = tainfo;
}

public String getSyllabus() {
	return syllabus;
}

public void setSyllabus(String syllabus) {
	this.syllabus = syllabus;
}
public int save(){
	Connection connect;
	databaseconnection con = new databaseconnection();
	connect = con.getConnect();
	int verify =0;
	try {
		  PreparedStatement s = connect.prepareStatement("select *from courseinfo where courseid='"+courseid+"'");
		//PreparedStatement s = connect.prepareStatement("insert into phdinfo values(?,?,?)");
		  System.out.println("select *from courseinfo where courseid='"+courseid+"'");
		  ResultSet check = s.executeQuery();
		if(!check.next()){
			PreparedStatement insert = connect.prepareStatement("insert into courseinfo values(?,?,?,?)");
			insert.setString(1,courseid);
			insert.setString(2,officehours);
			insert.setString(3,tainfo);
			insert.setString(4,syllabus);
			
			verify = insert.executeUpdate();
			
		}
		else{
			/*PreparedStatement update = connect.prepareStatement("insert into phdinfo values(?,?,?)");*/
			System.out.println("UPDATE courseinfo SET officehours='"+ officehours + "',tainfo='"+tainfo+"',syllabus='"+syllabus+"' WHERE courseid='"+ courseid +"'");
			PreparedStatement update = connect.prepareStatement("UPDATE courseinfo SET officehours='"+ officehours + "',tainfo='"+tainfo+"',syllabus='"+syllabus+"' WHERE courseid='"+ courseid +"'");
			
			verify=update.executeUpdate();
			
		}
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

	
	/*try {
		
		
		PreparedStatement s = connect.prepareStatement("insert into courseinfo values(?,?,?,?)");
		
		s.setString(1,courseid);
		s.setString(2,officehours);
		s.setString(3,tainfo);
		s.setString(4,syllabus);
		
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
}*/
public ArrayList<String[]> save1(String id){
	Connection connect;
	databaseconnection con = new databaseconnection();
	connect = con.getConnect();
	ArrayList<String[]> nm = new ArrayList<String[]>();
	try{
		Statement s = connect.createStatement();
		ResultSet sr = s.executeQuery("select *  from courseinfo where courseid='"+id+"'");
	
	while(sr.next()){
		String[] n = new String[3];
		n[0] = sr.getString("officehours");
		n[1] = sr.getString("tainfo");
		n[2] = sr.getString("syllabus");
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







