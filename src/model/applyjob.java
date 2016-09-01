package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import DAO.databaseconnection;

public class applyjob {
	String student;

	public String getStudent() {
		return student;
	}

	public void setStudent(String student) {
		this.student = student;
	}
	public int apply(String net){
		Connection connect;
		databaseconnection con = new databaseconnection();
		connect = con.getConnect();
		int verify =0;
		try {
			
			PreparedStatement s = connect.prepareStatement("insert into apply values(?,?)");
			
			s.setString(1,student);
			s.setString(2,net);
		
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

