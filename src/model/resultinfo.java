package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import DAO.databaseconnection;

public class resultinfo {
String resultid,nameofexam,studentresult,studentid,result,noe,identity,newresult,stdid;

public String getNewresult() {
	return newresult;
}

public void setNewresult(String newresult) {
	this.newresult = newresult;
}

public String getStid() {
	return stdid;
}

public void setStid(String stid) {
	this.stdid = stid;
}

public String getIdentity() {
	return identity;
}

public void setIdentity(String identity) {
	this.identity = identity;
}

public String getNoe() {
	return noe;
}

public void setNoe(String noe) {
	this.noe = noe;
}

public String getStudentid() {
	return studentid;
}

public void setStudentid(String studentid) {
	this.studentid = studentid;
}

public String getResult() {
	return result;
}

public void setResult(String result) {
	this.result = result;
}

public String getResultid() {
	return resultid;
}

public void setResultid(String resultid) {
	this.resultid = resultid;
}

public String getNameofexam() {
	return nameofexam;
}

public void setNameofexam(String nameofexam) {
	this.nameofexam = nameofexam;
}

public String getStudentresult() {
	return studentresult;
}

public void setStudentresult(String studentresult) {
	this.studentresult = studentresult;
}
public int save() throws SQLException{
	Connection connect;
	databaseconnection con = new databaseconnection();
	connect = con.getConnect();
	ResultSet rs;
	int verify=0;
	try {
		    PreparedStatement res = connect.prepareStatement("select nameofexam from result where nameofexam='"+nameofexam+"'");
		    rs = res.executeQuery();
		    if(rs==null){
		    	verify=0;
		    	
		    }
		    else{
			PreparedStatement insert = connect.prepareStatement("insert into result values(?,?) ");
			insert.setString(1,null);
			insert.setString(2,nameofexam);
			
			//insert.setString(4,syllabus);
			
			verify = insert.executeUpdate();
			
		}}
		

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
		ResultSet sr = s.executeQuery("select * from result");
	
	while(sr.next()){
		String[] n = new String[2];
		n[0] = sr.getString("id");
		n[1] = sr.getString("nameofexam");
		
		
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
	int id = 0;
	try {
		
		
		PreparedStatement s = connect.prepareStatement("insert into resultinfo values(?,?,?,?)");
		s.setString(1,studentid);
		s.setString(2,result);
		s.setString(3,noe);
		s.setString(4,netid);
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
public ArrayList<String[]> save3(){
	Connection connect;
	databaseconnection con = new databaseconnection();
	connect = con.getConnect();
	ArrayList<String[]> nm = new ArrayList<String[]>();
	try{
		Statement s = connect.createStatement();
		ResultSet sr = s.executeQuery("select * from resultinfo ");
	
	while(sr.next()){
		String[] n = new String[4];
		n[0] = sr.getString("studentid");
		n[1] = sr.getString("result");
		n[2] = sr.getString("id");
		n[3] = sr.getString("netid");
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

public int delete(){
	Connection connect;
	databaseconnection con = new databaseconnection();
	connect = con.getConnect();
	int verify =0;
	try {
		
		PreparedStatement update = connect.prepareStatement("DELETE FROM resultinfo WHERE studentid='"+ identity +"'");
		 verify = update.executeUpdate();
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return verify;
}
public int update(){
	Connection connect;
	databaseconnection con = new databaseconnection();
	connect = con.getConnect();
	int verify =0;
	try {
	
		PreparedStatement update = connect.prepareStatement("UPDATE resultinfo SET result='"+newresult+"' WHERE studentid='"+ stdid +"'");
		 verify = update.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return verify;
}
}


