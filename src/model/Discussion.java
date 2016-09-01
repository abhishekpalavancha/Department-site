package model;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.sql.Statement;

public class Discussion { 

 public int storehash(String discussion){
	 int v = 0;
	 try {
		//to connect to database connect.java 
	 Connect input = new Connect();
	 Connection data = input.getConnect();
	 String query = "insert into discussion values(?,?)";
	 PreparedStatement ps = data.prepareStatement(query);
	 ps.setString(1,discussion); //given name of hashtag
	 Date systemtime = new Date();
	 //generate date and time
	 DateFormat change = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//date format
	 String time = change.format(systemtime);
	 ps.setString(2,time);// gives date & time 
	 v =  ps.executeUpdate();
}catch (Exception e) {
	return 0;
} return v;}
 
public int verify(String name){//to verify whether value in db
	int u = 0;
	try {
	 Connect input = new Connect();
	 Connection data = input.getConnect();
	 //conect model
  
   Statement rep = data.createStatement(); 
   // to run a query 
   ResultSet mn = rep.executeQuery("select Name from discussion");
   boolean b = mn.next();
   
   if(b){
	   
	   return 1;
   }
	}catch (Exception e) {
		return 0;
		}
	return u;
	
}
}
