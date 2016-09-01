package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import DAO.databaseconnection;

public class Event {
String event,description,eventid,identity;

public String getIdentity() {
	return identity;
}

public void setIdentity(String identity) {
	this.identity = identity;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public String getEventid() {
	return eventid;
}

public void setEventid(String eventid) {
	this.eventid = eventid;
}

public String getEvent() {
	return event;
}

public void setEvent(String event) {
	this.event = event;
}
public int save(String netid){
	Connection connect;
	databaseconnection con = new databaseconnection();
	connect = con.getConnect();
	int verify =0;
	int id = 0;
	try {
		PreparedStatement a = connect.prepareStatement("select *from event where id='"+eventid+"'");
		ResultSet check = a.executeQuery();
		if(!check.next()){
		PreparedStatement s = connect.prepareStatement("insert into event values(?,?,?)");
		s.setInt(1,id);
		s.setString(2,netid);
		s.setString(3,event);
		verify = s.executeUpdate();
		}
		else{
			PreparedStatement s = connect.prepareStatement("insert into announcement values(?,?)");
			
			s.setString(2,netid);
			s.setString(3,event);
			verify = s.executeUpdate();
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
}public int save1(){
	Connection connect;
	databaseconnection con = new databaseconnection();
	connect = con.getConnect();
	int verify =0;
	try {
		
		PreparedStatement update = connect.prepareStatement("UPDATE event SET event='"+description+"' WHERE id='"+ eventid +"'");
		 verify = update.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return verify;
}
public int delete(){
	Connection connect;
	databaseconnection con = new databaseconnection();
	connect = con.getConnect();
	int verify =0;
	try {
		
		PreparedStatement delete = connect.prepareStatement("DELETE FROM event WHERE id='"+ identity +"'");
		
		verify = delete.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return verify;
}
}

