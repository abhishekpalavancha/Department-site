package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import DAO.databaseconnection;

public class signup {
	
	String id,examid;
	
	public String getExamid() {
		return examid;
	}

	public void setExamid(String examid) {
		this.examid = examid;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int sign(String netid){
		Connection connect;
		databaseconnection con = new databaseconnection();
		connect = con.getConnect();
		int verify =0;
		
		try {
			
			PreparedStatement s = connect.prepareStatement("insert into sign values(?,?,?)");
			s.setString(1,netid);
			s.setString(2,id);
			s.setString(3,examid);
		
			verify = s.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			verify=0;
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
