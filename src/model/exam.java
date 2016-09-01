package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import DAO.databaseconnection;

public class exam {
String nameofexam,dateofexam,optionallinks;

public String getNameofexam() {
	return nameofexam;
}

public void setNameofexam(String nameofexam) {
	this.nameofexam = nameofexam;
}

public String getDateofexam() {
	return dateofexam;
}

public void setDateofexam(String dateofexam) {
	this.dateofexam = dateofexam;
}

public String getOptionallinks() {
	return optionallinks;
}

public void setOptionallinks(String optionallinks) {
	this.optionallinks = optionallinks;
}
public int save(String netid){
	Connection connect;
	databaseconnection con = new databaseconnection();
	connect = con.getConnect();
	int verify =0;
	try {
		
		PreparedStatement s = connect.prepareStatement("insert into result values(?,?,?,?,?)");
		s.setString(1,null);
		s.setString(2,nameofexam);
		s.setString(3,dateofexam);
		s.setString(4,optionallinks);
		s.setString(5,netid);
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
}
