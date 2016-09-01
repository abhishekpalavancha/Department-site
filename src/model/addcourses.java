package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import DAO.databaseconnection;

public class addcourses {
	private String courseid,coursename;

	public String getCourseid() {
		return courseid;
	}

	public void setCourseid(String courseid) {
		this.courseid = courseid;
	}

	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public int save(String netid){
		Connection connect;
		databaseconnection con = new databaseconnection();
		connect = con.getConnect();
		int verify =0;
		try {
			
			PreparedStatement s = connect.prepareStatement("insert into course values(?,?,?)");
			s.setString(1,courseid);
			s.setString(2,coursename);
			s.setString(3,"");
		
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