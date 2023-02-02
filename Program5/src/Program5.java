//5.Write a JDBC program to display the details (empid, ename, contactno) 
//of all the employees whose department is IT in the employee table.

import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException; 
import java.sql.Statement; 
public class Program5 { 
public static void main(String[] args) throws ClassNotFoundException{ 
System.out.println("Connecting to a selected database..."); 
try { 
Class.forName("com.mysql.jdbc.Driver"); 
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javaWorkshop","bibhash","password"); 
if(con!=null) { 
System.out.println("Connected to the database"); 
} 
Statement stmt = con.createStatement();
ResultSet rs = stmt.executeQuery("SELECT empid, ename, contactno, department FROM employee WHERE department='IT' ");
{		      
while(rs.next()){
   //Display values
   System.out.print("EMP ID: " + rs.getInt("empid"));
   System.out.print(", Employee Name: " + rs.getString("ename"));
   System.out.println(", Contact no.: " + rs.getInt("contactno"));
 
   
}
}
}
catch(SQLException e) { 
e.printStackTrace(); 
} 
}
}
