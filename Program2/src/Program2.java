//Program 2 > Write a JDBC program to create a table employee (empid, ename, contactno,
//city,  department, salary) by using JDBC with empid as primary key & not null 
//constraint on ename.

import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.SQLException; 
import java.sql.Statement; 
public class Program2 { 
public static void main(String[] args) throws ClassNotFoundException{ 
System.out.println("Connecting to a selected database..."); 
try { 
Class.forName("com.mysql.cj.jdbc.Driver"); 
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javaWorkshop","bibhash","password"); 
if(con!=null) { 
System.out.println("Connected to the database"); 
} 
//creating Employee table 
Statement stmt = con.createStatement(); 
String sql = "CREATE TABLE EMPLOYEE " + 
                   "(empid INTEGER not NULL, " + 
                   " ename VARCHAR(255), " +  
                   " contactno INTEGER, " +  
                   " city VARCHAR(255), " +  
                   " department VARCHAR(255), "+ 
                   " salary INTEGER, "+ 
                   " PRIMARY KEY ( empid ))";  
  
         stmt.executeUpdate(sql); 
    System.out.println("Successfully created the table"); 
    con.close(); 
} 
catch(SQLException e) { 
e.printStackTrace(); 
} 
} 
} 
 