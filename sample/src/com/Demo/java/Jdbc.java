package com.Demo.java;


import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.ResultSet;

import java.sql.SQLException;
import java.sql.Statement;

import java.util.Arrays;


public class Jdbc {


	 private final static String userName="SA";
	
         private final static String password="";
	
         private final static String dbUrl="jdbc:hsqldb:hsql://localhost/";
	
	



public static void main(String[] args) {
Student st = new Student("John","Pune",1,28);
		
		//System.out.println();
		//Load the db specific drivers
		
		/*CREATE TABLE MyStudentTable (
				   id INT NOT NULL,
				   StudName VARCHAR(50) NOT NULL,
				   StudAddr VARCHAR(20) NOT NULL,
				   StudAge INT,
				   PRIMARY KEY (id) 
				);
		*/
//INSERT INTO MYSTUDENTTABLE VALUES (1,"John", "San Mateo", 28);
		
		try {
			Class.forName("org.hsqldb.jdbc.JDBCDriver");
			Connection conn = DriverManager.getConnection(dbUrl, userName, password);
			Statement stmt = conn.createStatement();
			
			/*stmt.executeUpdate(
					"CREATE TABLE MyStudentTable ("
					+ " id INT NOT NULL,"
					+ " StudName VARCHAR(50) NOT NULL,"
					+ " StudAddr VARCHAR(20) NOT NULL,"
					+ " StudAge INT,"
					+ " PRIMARY KEY (id))"
					);
*/
			//stmt.executeUpdate("INSERT INTO MYSTUDENTTABLE VALUES(3,'ABC', 'San Mateo2',20),(4,'XYZ', 'San Mateo3',22)");
			//stmt.executeUpdate("INSERT INTO MYSTUDENTTABLE VALUES(2,'John1', 'San Mateo1', 281)");
			
			stmt.executeUpdate("DELETE FROM MYSTUDENTTABLE where ID=1");
			stmt.executeUpdate("UPDATE MYSTUDENTTABLE set STUDNAME='MAYURI' where ID=2");

//			System.out.println("INSERT INTO MyStudentTable VALUES "
//					+ "("+st.getRollNo()+","+st.getName()+","+st.getAddress()+","+st.getAge()+")");
			
			
			ResultSet resultSt = stmt.executeQuery("select * from MyStudentTable");
			Student[] listofStud = new Student[10];
			Student st1 =null;
			int count=0;
			while(resultSt.next())
			{
				st1= new Student();
//				System.out.print(resultSt.getInt("id") +"  ");
//				System.out.print(resultSt.getString("StudName") +"  ");
//				System.out.print(resultSt.getString("StudAddr") +"  ");
//				System.out.print(resultSt.getInt("StudAge") +"  ");
//				System.out.println();
				st1.setRollNo(resultSt.getInt("id"));
				st1.setName(resultSt.getString("StudName"));
				st1.setAddress(resultSt.getString("StudAddr"));
				st1.setAge(resultSt.getInt("StudAge"));
				listofStud[count]=st1;
				count++;
			}
			
			System.out.println(Arrays.toString(listofStud));
			
	} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
