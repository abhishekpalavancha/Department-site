package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import DAO.databaseconnection;

public class news {
	String news,description,identity,newsid;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getIdentity() {
		return identity;
	}

	public void setIdentity(String identity) {
		this.identity = identity;
	}

	public String getNewsid() {
		return newsid;
	}

	public void setNewsid(String newsid) {
		this.newsid = newsid;
	}

	public String getNews() {
		return news;
	}

	public void setNews(String news) {
		this.news = news;
	}


public int save(String netid){
	Connection connect;
	databaseconnection con = new databaseconnection();
	connect = con.getConnect();
	int verify =0;
	int id = 0;
	try {
		PreparedStatement a = connect.prepareStatement("select *from news where id='"+id+"'");
		ResultSet check = a.executeQuery();
		if(!check.next()){
		PreparedStatement s = connect.prepareStatement("insert into news values(?,?,?)");
		s.setInt(1,id);
		s.setString(2,netid);
		s.setString(3,news);
		verify = s.executeUpdate();
		}
		else{
			PreparedStatement s = connect.prepareStatement("insert into announcement values(?,?)");
			
			s.setString(2,netid);
			s.setString(3,news);
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
}
public int save1(){
	Connection connect;
	databaseconnection con = new databaseconnection();
	connect = con.getConnect();
	int verify =0;
	try {
		
		PreparedStatement update = connect.prepareStatement("UPDATE news SET news='"+description+"' WHERE id='"+ newsid +"'");
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
		
		PreparedStatement update = connect.prepareStatement("DELETE FROM news WHERE id='"+ identity +"'");
		 verify = update.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return verify;
}
}


