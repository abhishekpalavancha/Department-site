package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import DAO.databaseconnection;

public class result {
String nameofexam,net;

public String getNameofexam() {
	return nameofexam;
}

public void setNameofexam(String nameofexam) {
	this.nameofexam = nameofexam;
}

public String getNet() {
	return net;
}

public void setNet(String net) {
	this.net = net;
}
public int save(String netid){
	Connection connect;
	databaseconnection con = new databaseconnection();
	connect = con.getConnect();
	int verify =0;
	int id = 0;
	try {
		PreparedStatement a = connect.prepareStatement("select *from announcement where id='"+id+"'");
		ResultSet check = a.executeQuery();
		if(!check.next()){
		PreparedStatement s = connect.prepareStatement("insert into announcement values(?,?,?)");
		s.setInt(1,id);
		s.setString(2,netid);
		s.setString(3,nameofexam);
		verify = s.executeUpdate();
		}
		else{
			PreparedStatement s = connect.prepareStatement("insert into announcement values(?,?)");
			
			s.setString(2,netid);
			s.setString(3,nameofexam);
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

}
