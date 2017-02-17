package com.orilore.daos;
import java.sql.*;
public class DBUtil{
	public Connection getConnection(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/cart","root","olcp");
			return conn;
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return null;
	}
}