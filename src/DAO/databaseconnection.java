package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class databaseconnection {
	Connection con;
	public Connection getConnect()
	{
		try {
		String driver = "com.mysql.jdbc.Driver";
		String userName = "root";
		String password = "abhi";
		String url = "jdbc:mysql://localhost:3306/termproject";
		Class.forName(driver);
con = DriverManager.getConnection(url,userName,password);
} catch (Exception e) {
	e.printStackTrace();
}
return con;
	}

}
