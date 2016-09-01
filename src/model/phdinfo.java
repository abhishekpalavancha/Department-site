package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import DAO.databaseconnection;

public class phdinfo {
String phdid,semester,otherinformation;

public String getPhdid() {
	return phdid;
}

public void setPhdid(String phdid) {
	this.phdid = phdid;
}

public String getSemester() {
	return semester;
}

public void setSemester(String semester) {
	this.semester = semester;
}

public String getOtherinformation() {
	return otherinformation;
}

public void setOtherinformation(String otherinformation) {
	this.otherinformation = otherinformation;
}
public int save(){
	Connection connect;
	databaseconnection con = new databaseconnection();
	connect = con.getConnect();
	int verify =0;
	try {
		  PreparedStatement s = connect.prepareStatement("select *from phdinfo where phdid='"+phdid+"'");
		//PreparedStatement s = connect.prepareStatement("insert into phdinfo values(?,?,?)");
		  System.out.println("select *from phdinfo where phdid='"+phdid+"'");
		  ResultSet check = s.executeQuery();
		if(!check.next()){
			PreparedStatement insert = connect.prepareStatement("insert into phdinfo values(?,?,?)");
			insert.setString(1,phdid);
			insert.setString(2,semester);
			insert.setString(3,otherinformation);
			
			
			verify = insert.executeUpdate();
			
		}
		else{
			/*PreparedStatement update = connect.prepareStatement("insert into phdinfo values(?,?,?)");*/
			System.out.println("UPDATE phdinfo SET semester='"+ semester + "',otherinformation='"+otherinformation+"' WHERE phdid='"+ phdid +"'");
			PreparedStatement update = connect.prepareStatement("UPDATE phdinfo SET semester='"+ semester + "',otherinformation='"+otherinformation+"' WHERE phdid='"+ phdid +"'");
			
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

public ArrayList<String[]> save1(String id){
	Connection connect;
	databaseconnection con = new databaseconnection();
	connect = con.getConnect();
	ArrayList<String[]> nm = new ArrayList<String[]>();
	try{
		Statement s = connect.createStatement();
		ResultSet sr = s.executeQuery("select *  from phdinfo where phdid='"+id+"'");
	
	while(sr.next()){
		String[] n = new String[2];
		n[0] = sr.getString("semester");
		n[1] = sr.getString("otherinformation");
		
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


