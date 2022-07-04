package com;
import java.sql.*;
public class JDBC {

	public static void main(String[] args) {
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Password123");
		Statement st=con.createStatement();
		st.execute("insert into Emp values(100,'charita',25,80000,'Developer');");
		st.close();
		System.out.println("data saved successfully...");
	}
	catch(Exception e) {
		System.out.println(e);
	}
	}

	}


