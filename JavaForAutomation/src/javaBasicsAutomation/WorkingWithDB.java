package javaBasicsAutomation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class WorkingWithDB {

	//Creating public void main method
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	//Mentioning the type of DB, to be used	
		Class.forName("com.mysql.cj.jdbc.Driver");
		
	//Creating connection to DB
		Connection connectDB = DriverManager.getConnection("jdbc:mysql://root@localhost/javaselenium_database");
		
		//Creating Statement to write SQL query
		Statement querySQL = connectDB.createStatement();
		
		//Executing SQL query and storing the reuslt in ResultSet
		ResultSet executeSQL = 	querySQL.executeQuery("select * from loginpage");
		
	
		//Using While loop printing the results from ResultSet
		 while(executeSQL.next()) {
		 System.out.println("ID: "+executeSQL.getInt(1)+" UserName: "+executeSQL.
		  getString("User_Name")+" Pwd: "+executeSQL.getString(3)); 
		 }
		 

	}

}
