package com.ye.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo1_Jdbc {

	public static void main(String[] args) throws SQLException {
		DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb1", "123", "123");
	     Statement stm =conn.createStatement();
	   ResultSet rst =    stm.executeQuery("select name from amp");
	               while(rst.next()){
	            	   System.out.println(rst.getObject(1));
	               }
	               rst.close();
	               stm.close();
	               conn.close();
	
	}

}
