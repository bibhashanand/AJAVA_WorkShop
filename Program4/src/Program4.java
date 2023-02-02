//Program 4 > Write a JDBC program to insert a record in the 
//employee table using PreparedStatement interface.


import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.PreparedStatement; 
import java.sql.SQLException; 
public class Program4 { 
public static void main(String[] args) throws ClassNotFoundException{ 
System.out.println("Connecting to a selected database..."); 
try { 
Class.forName("com.mysql.cj.jdbc.Driver"); 
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javaWorkshop","bibhash","password"); 
if(con!=null) { 
System.out.println("Connected to the database"); 
} 
    //inserting values using prepared statement 
    PreparedStatement smt=con.prepareStatement("insert into EMPLOYEE values(?,?,?,?,?,?)");   
    smt.setInt(1,105);   
    smt.setString(2,"Anand"); 
    smt.setInt(3,90245); 
    smt.setString(4,"Delhi"); 
    smt.setString(5, "IT"); 
    smt.setInt(6,67000);   
     
    smt.executeUpdate(); 
    con.close(); 

    System.out.println("Successfully inserted data into the table");
} 

catch(SQLException e) { 
e.printStackTrace(); 
} 
} 
} 
 