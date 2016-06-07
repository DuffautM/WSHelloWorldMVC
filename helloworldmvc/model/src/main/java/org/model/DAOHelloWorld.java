package org.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DAOHelloWorld {
	
	private static DAOHelloWorld INSTANCE;
	private static String LOGIN = "root";
	private static String PASSWORD = "";
	private static String URL = "jdbc:mysql://localhost/ws7?autoReconnect=true&useSSL=false";
	private Connection connection;
	private Statement statement;
	
	private DAOHelloWorld (){
		
	}
	
	public static DAOHelloWorld getInstance(){
		
		if (INSTANCE == null){
			INSTANCE = new DAOHelloWorld();
		}
		return INSTANCE;
		
	}
	
	public String getQuerySelectFirstHelloWorld(){
		
		return  "SELECT `exo` FROM `ws7`.`ws` WHERE `id` = 1;";

	}
	
	protected void close(){
		
	}
	
	protected ResultSet executeQuery(String query){
		
		ResultSet rs = null;
		try {
			 rs = statement.executeQuery(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	
	}
	
	protected boolean open(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			this.connection = DriverManager.getConnection(DAOHelloWorld.URL, DAOHelloWorld.LOGIN, DAOHelloWorld.PASSWORD);
			this.statement = this.connection.createStatement();
		} catch (final ClassNotFoundException e) {
			e.printStackTrace();
			return false;
		} catch (final SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
		
	}

}
