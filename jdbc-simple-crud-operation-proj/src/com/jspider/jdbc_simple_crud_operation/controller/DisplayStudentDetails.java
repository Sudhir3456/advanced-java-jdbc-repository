package com.jspider.jdbc_simple_crud_operation.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DisplayStudentDetails {

	private static final String url = "jdbc:mysql://localhost:3306/jdbc-m12";
	private static final String username = "root";
	private static final String password = "Sudhir@0108";

	static Connection connection = null;

	public static void main(String[] args) {

		try {
			// Step1- load or register driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// step2- create connection
			// Connection connection =
			// DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc-m12",
			// "root","Sudhir@0108");

			connection = DriverManager.getConnection(url, username, password);

			System.out.println(connection);

			// Step3- Create Statement
			Statement statement = connection.createStatement();

			// Step4- Execute Query
			String displaystudentDetailsQuery = " select * from Student.Person";

			ResultSet set = statement.executeQuery(displaystudentDetailsQuery);

			while (set.next()) {                      //here we take if block if column contain uniqe element 

				int id = set.getInt("PersonID");

				String studentName = set.getString("FirstName");

				System.out.println(id);
				System.out.println(studentName);

			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		finally {
			try {
				connection.close();

				System.out.println("Closed Connections");
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}
}
