//6.Write a JDBC Program to Update the salary of empid 101 to 120000.

import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException; 
import java.sql.Statement; 
public class Program6 { 
public static void main(String[] args) throws ClassNotFoundException{ 
System.out.println("Connecting to a selected database..."); 
try { 
Class.forName("com.mysql.jdbc.Driver"); 
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javaWorkshop","bibhash","password"); 
if(con!=null) { 
System.out.println("Connected to the database"); 
} 
Statement stmt = con.createStatement();
stmt.executeUpdate("UPDATE Employee " + " SET salary = 120000 WHERE empid = 101 ");
ResultSet rs = stmt.executeQuery("SELECT empid, ename, contactno, city, department, salary FROM employee");
{		      
while(rs.next()){
   //Display values
   System.out.print("EMP ID: " + rs.getInt("empid"));
   System.out.print(", Employee Name: " + rs.getString("ename"));
   System.out.print(", Contact no.: " + rs.getInt("contactno"));
   System.out.print(", City: " + rs.getString("city"));
   System.out.print(", Department: " + rs.getString("department"));
   System.out.println(", Salary: " + rs.getInt("salary"));
   
   
}
}
}
catch(SQLException e) { 
e.printStackTrace(); 
} 
}
}
