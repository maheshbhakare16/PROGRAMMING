package com.wipro.ippb.database_connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.File;
import java.util.Scanner;


class DatabaseCFileInsert
{
    public static void main(String args[]) throws Exception
    {
        Connection con = null;
        Scanner sc = null;
        ResultSet rs = null;
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","mahesh12@");
        if(con == null)
        {
            System.out.println("Not Established....");
        }
        else
        {
            String query = "insert into studinfo values(?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(query);
            sc = new Scanner(System.in);
            System.out.print("Enter Roll No.: ");
            int roll = sc.nextInt();
            System.out.print("Enter Name: ");
            String name = sc.next();
            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            System.out.print("Enter Address: ");
            String address = sc.next();
            System.out.print("Enter Image URL: ");
            String image = sc.next();
            System.out.print("Enter Resume URL: ");
            String resume = sc.next();
            
            InputStream is = new FileInputStream(image);
            FileReader fr = new FileReader(resume);
            
            ps.setInt(1,roll);
            ps.setString(2,name);
            ps.setInt(3,age);
            ps.setString(4,address);
            ps.setBinaryStream(5,is);
            ps.setCharacterStream(6,fr);
            
            int count = 0;
            count = ps.executeUpdate();
            System.out.println(count+" rows affected......");
            
        }
    }
}
