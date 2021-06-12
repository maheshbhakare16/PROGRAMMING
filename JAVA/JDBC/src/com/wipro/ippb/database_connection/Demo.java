package com.wipro.ippb.database_connection;
import java.sql.DriverManager;
import java.sql.Connection;
 
class Demo
{  
    public static void main(String args[]) throws Exception
    {
    
com.mysql.cj.jdbc.Driver obj = new com.mysql.cj.jdbc.Driver();
DriverManager.registerDriver(obj); 
Connection con=null;
con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","mahesh12@"); 
if(con==null)
{
    System.out.println("Not established");
}
else
{
    System.out.println("Established");
}
}
}
