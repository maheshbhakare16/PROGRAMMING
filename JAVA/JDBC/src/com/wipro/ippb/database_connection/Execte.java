package com.wipro.ippb.database_connection;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Scanner;
class Execte
{
	public static void main(String args[]) throws Exception
	{
//      com.mysql.cj.jdbc.Driver obj = new com.mysql.cj.jdbc.Driver();
//      Class.forName("com.mysql.cj.jdbc.Driver");
// 		DriverManager.registerDriver(obj);


//  ----------------------------------- CONNECTION ESTABLISH -------------------------------
		Connection con = null;
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","mahesh12@");
		Scanner sc = new Scanner(System.in);
		if(con == null)
		{
			System.out.println("Not Established");
			
		}
		else
		{

            Statement st =null;
            st = con.createStatement();
// 			-------------------------- INSERT -------------------------------------
			if(st == null)
			{
                System.out.println("Null Pointer st");
			}
			
            System.out.print("Enter roll no of student: ");
			int roll = sc.nextInt();
			System.out.print("Enter name of student: ");
			String name = sc.next();
			System.out.print("Enter age of student: ");
			int age = sc.nextInt();
			System.out.print("Enter marks of student: ");
			float marks = sc.nextFloat();
            String query1 =  "insert into student.studinfo values ("+roll+",'"+name+"',"+age+","+marks+")";
 			boolean result = st.execute(query1);
 			if (result == true)
 			{
                ResultSet rs = st.getResultSet();
                if(rs.next() != false)
                {
                    System.out.println(rs.getInt(1)+" | "+rs.getString(2));
                }
                else
                {
                    System.out.println("No data Feached....");
                }
 			}
 			else
 			{
                System.out.println("DDL or DML Query Executed....");
 			}
 			
//  			------------------------- SEARCH THE RECORD --------------------------
 			
 			System.out.print("Enter name of student to search: ");
			String s1 = sc.next();
			String query = "select * from student.studinfo where name = '"+s1+"'";
			result = st.execute(query);
 			if (result == true)
 			{
                ResultSet rs = st.getResultSet();
                if(rs.next() != false)
                {
                    System.out.println(rs.getInt(1)+" | "+rs.getString(2));
                }
                else
                {
                    System.out.println("No data Feached....");
                }
 			}
 			else
 			{
                System.out.println("DDL or DML Query Executed....");
 			}
        }	
	}
}
