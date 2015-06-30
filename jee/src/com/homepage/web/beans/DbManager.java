package com.homepage.web.beans;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbManager {
	public static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn=DriverManager.getConnection(url, "system", "oracle");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("DBmanager에게서 에러가 났음.");
		}
		return conn;
	}


	
}
