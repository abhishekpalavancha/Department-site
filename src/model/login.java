package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import DAO.databaseconnection;

public class login {
	private String netid,password,role;

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
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
	public String save(){
		String ps=" ";
		Connection connect;
		databaseconnection con = new databaseconnection();
		connect = con.getConnect();
		int verify =0;
		try {
			
			Statement s = connect.createStatement();
			ResultSet sr = s.executeQuery("select password from register where netid='"+netid+"'");
		    
			while(sr.next()){
				ps = sr.getString("password");
				System.out.println(ps);
			}
			if(ps.equals(password)){
				ResultSet r = s.executeQuery("select role from register where netid='"+netid+"'");
				r.next();
				System.out.println(ps);
				System.out.println(ps);
				System.out.println(r.getString("role"));
				System.out.println(r.getString("role"));
					return r.getString("role");
				
				
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
		return "not";
	
	}

	}

