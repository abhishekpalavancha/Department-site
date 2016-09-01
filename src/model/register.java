package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import DAO.databaseconnection;

public class register {
private String netid,password,firstname,lastname,role,year,program,email;

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getNetid() {
	return netid;
}

public void setNetid(String netid) {
	this.netid = netid;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getFirstname() {
	return firstname;
}

public void setFirstname(String firstname) {
	this.firstname = firstname;
}

public String getLastname() {
	return lastname;
}

public void setLastname(String lastname) {
	this.lastname = lastname;
}

public String getRole() {
	return role;
}

public void setRole(String role) {
	this.role = role;
}

public String getYear() {
	return year;
}

public void setYear(String year) {
	this.year = year;
}

public String getProgram() {
	return program;
}

public void setProgram(String program) {
	this.program = program;
}
public int save(){
	Connection connect;
	databaseconnection con = new databaseconnection();
	connect = con.getConnect();
	int verify =0;
	try {
		
		PreparedStatement s = connect.prepareStatement("insert into register values(?,?,?,?,?,?,?,?)");
		s.setString(1,netid);
		
		s.setString(2,password);
		s.setString(3,firstname);
		s.setString(4,lastname);
		s.setString(5,role);
		s.setString(6,year);
		s.setString(7,program);
		s.setString(8,email);
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
public ArrayList<String[]> save1(String id){
	Connection connect;
	databaseconnection con = new databaseconnection();
	connect = con.getConnect();
	ArrayList<String[]> nm = new ArrayList<String[]>();
	try{
		Statement s = connect.createStatement();
		ResultSet sr = s.executeQuery("select * from register where netid='"+id+"'");
	
	while(sr.next()){
		String[] n = new String[7];
		n[0] = sr.getString("netid");
		n[1] = sr.getString("password");
		n[2] = sr.getString("firstname");
		n[3] = sr.getString("lastname");
		n[4] = sr.getString("role");
		n[5] = sr.getString("yearofjoining");
		n[6] = sr.getString("program");
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
public int save2(String netid){
	Connection connect;
	databaseconnection con = new databaseconnection();
	connect = con.getConnect();
	int verify =0;
	
	try {
		  if(password==null ){
			  PreparedStatement update = connect.prepareStatement("UPDATE register SET firstname='"+firstname+"',lastname='"+lastname+"',yearofjoining='"+year+"' WHERE netid='"+ netid +"'");
			  verify=update.executeUpdate();
		  }else
			  if(firstname==null){
			
			PreparedStatement update = connect.prepareStatement("UPDATE register SET password='"+ password + "',lastname='"+lastname+"',yearofjoining='"+year+"' WHERE netid='"+ netid +"'");
			  	
			verify=update.executeUpdate();}
			  else
				  if(lastname==null){
					  PreparedStatement update = connect.prepareStatement("UPDATE register SET password='"+ password + "',firstname='"+firstname+"',yearofjoining='"+year+"' WHERE netid='"+ netid +"'");
					  	
						verify=update.executeUpdate();  
				  }
				  
					  else
						  if(year==null){
							  PreparedStatement update = connect.prepareStatement("UPDATE register SET password='"+ password + "',firstname='"+firstname+"',lastname='"+lastname+"' WHERE netid='"+ netid +"'");
							  	
								verify=update.executeUpdate();  
						  }
						  else
						  {
							  PreparedStatement update = connect.prepareStatement("UPDATE register SET password='"+ password + "',firstname='"+firstname+"',lastname='"+lastname+"',yearofjoining='"+year+"' WHERE netid='"+netid+"'");
							  	
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

}

