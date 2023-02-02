//Program 1 > Program to illustrate JDBC connectivity.

import java.sql.*; 
public class Program1 { 
public static void main(String[] args) throws ClassNotFoundException{ 
System.out.println("Connecting to a selected database..."); 
try { 
Class.forName("com.mysql.jdbc.Driver"); 
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javaWorkshop","bibhash","password"); 
if(con!=null) { 
System.out.println("Connected to the database"); 
con.close();
} 
} 
catch(SQLException e) { 
e.printStackTrace(); 
} 
} 
} 
