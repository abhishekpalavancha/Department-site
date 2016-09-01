package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import DAO.databaseconnection;

public class alumniinfo {
String alumniid,name,description;

public String getAlumniid() {
	return alumniid;
}

public void setAlumniid(String alumniid) {
	this.alumniid = alumniid;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}
public int save(){
	Connection connect;
	databaseconnection con = new databaseconnection();
	connect = con.getConnect();
	int verify =0;
	try {
		  PreparedStatement s = connect.prepareStatement("select *from alumni where id='"+alumniid+"'");
		//PreparedStatement s = connect.prepareStatement("insert into phdinfo values(?,?,?)");
		  //System.out.println("select *from courseinfo where courseid='"+courseid+"'");
		  ResultSet check = s.executeQuery();
		if(!check.next()){
			PreparedStatement insert = connect.prepareStatement("insert into alumni values(?,?,?)");
			insert.setString(1,alumniid);
			insert.setString(2,name);
			insert.setString(3,description);
			//insert.setString(4,syllabus);
			
			verify = insert.executeUpdate();
			
		}
		else{
			/*PreparedStatement update = connect.prepareStatement("insert into phdinfo values(?,?,?)");*/
			System.out.println("UPDATE alumni SET name='"+name+"',description='"+description+"' WHERE id='"+ alumniid +"'");
			PreparedStatement update = connect.prepareStatement("UPDATE alumni SET name='"+name+"',description='"+description+"' WHERE id='"+ alumniid +"'");
			
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
		
		PreparedStatement s = connect.prepareStatement("insert into alumni values(?,?,?)");
		
		s.setString(1,alumniid);
		s.setString(2,name);
		s.setString(3,description);
		
		
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
*/
public int save1(){
	Connection connect;
	databaseconnection con = new databaseconnection();
	connect = con.getConnect();
	int verify =0;
	try {
		  
	
			PreparedStatement insert = connect.prepareStatement("insert into alumni values(?,?,?)");
			insert.setString(1,null);
			insert.setString(2,name);
			insert.setString(3,description);
			//insert.setString(4,syllabus);
			
			verify = insert.executeUpdate();
			
		
		
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
