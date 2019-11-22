package testbank.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletContextListener;

public class CloudConnector implements ServletContextListener{
	
	
	private static final String DB_NAME = "testbank_db";
	private static final String DB_USER = "root";
	private static final String DB_PASS = "root";

	public CloudConnector() {

		Connection connection  = null;
		try {
			Class.forName("com.mysql.jdbc.Driver"); 
			connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/testbank_db", DB_USER, DB_PASS);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try (Statement statement = connection.createStatement()) {
		  ResultSet resultSet = statement.executeQuery("SHOW TABLES");
		  while (resultSet.next()) {
		    System.out.println(resultSet.getString(1));
		  }
		}catch(Exception e){
		  e.printStackTrace();
		  
		}
	}

}
