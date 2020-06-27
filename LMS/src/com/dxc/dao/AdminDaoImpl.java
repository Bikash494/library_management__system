package com.dxc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.dxc.pojos.UserList;

public class AdminDaoImpl implements IAdminDao

{	
	private static Connection conn;
	
	Scanner sc = new Scanner(System.in);

	public void adminConnect()
	{
		try                 
		  {
		  Class.forName("oracle.jdbc.driver.OracleDriver");
		  System.out.println("Driver loaded...");
		  
		  conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","qwerty");
		  System.out.println("Connected to database...");
		  }
		  catch(Exception e)
			{
			  e.printStackTrace();
			}		
	}
	
				public boolean authenticate(String name, String password)
				{
					try
					{

						 Statement stmt = conn.createStatement();
						 ResultSet rset = stmt.executeQuery("select name,password from admin");
						
						 while(rset.next())
						 {
							 if(rset.getString(1).equals(name) && rset.getString(2).equals(password))
							 {
								 return true;
							 }
							 break;
						 }
					}
					catch (Exception e) 
					{
						System.out.println("Authentication Error Occured!!!");
						e.printStackTrace();
					}
					return false;
				}
				
		   public void addBook(int i, String n, String a, int q)
			{			 
				 try
				 {
					 PreparedStatement pstmt = conn.prepareStatement("insert into booklist values(?,?,?,?)");	

					  pstmt.setInt(1,i); 
					  pstmt.setString(2,n); 
					  pstmt.setString(3,a);
					  pstmt.setInt(4,q);
					  
					  pstmt.execute(); 
					  
					  System.out.println("Added book record successfully!! ");
				 }
				 catch (Exception e) 
				 {
					e.printStackTrace();
				}
			}
		   
			public void removeBook(int i)
			{
				try
				{
					
					PreparedStatement pstmt = conn.prepareStatement("delete from booklist where bookid=?");
					pstmt.setInt(1,i);
					pstmt.execute();	
					System.out.println("Book record removed successfully!!");
					
				}
				catch(Exception e)
				{
				  e.printStackTrace();
				}
			}
			
			public List<UserList> getListOfBooks(String s) 
			{
				List<UserList> list = new ArrayList<>();
							
				try
				{
					Statement stmt = conn.createStatement();
					PreparedStatement pstmt = conn.prepareStatement("select name,bookissued from userset where name=?");
					pstmt.setString(1, s);
					ResultSet rset = pstmt.executeQuery();
					System.out.println("Username\tBookIssued");
					
					 
					  while(rset.next())
					  {					  
						 list.add(new UserList(rset.getString(1),rset.getString(2))); 
					  }
					 
				}
				catch(SQLException e)
				{
				  e.printStackTrace();
				}
			
				return list;
			}
			
			public List<UserList> getBalance(String s)
			{
				List<UserList> list = new ArrayList<>();
				try
				 {
					Statement stmt = conn.createStatement();
					PreparedStatement pstmt = conn.prepareStatement("select name,balance from userset where name=?");
					pstmt.setString(1, s);
					ResultSet rset = pstmt.executeQuery();
					System.out.println("Username\tUserBalanace");
					System.out.println("---------------------------");
					 
					  while(rset.next())
					  {					  
						 list.add(new UserList(rset.getString(1),rset.getInt(2))); 
					  }
					 
					
				 }
				 catch (Exception e) 
				 {
					e.printStackTrace();
				}
				
			return list;
			}
			
			public void deleteAcc(int i)
			{
				try
				 {
					 PreparedStatement pstmt = conn.prepareStatement("delete from userset where id=?");	

					  pstmt.setInt(1,i);
					  
					  pstmt.execute() ;
					  
					  System.out.println("Removed user details successfully!!");
				 }
				 catch (Exception e) 
				 {
					e.printStackTrace();
				}
			}
			
			public void closeConnection()
			{
				try
				{
					conn.close();
				}
				catch(Exception e)
				{
				  e.printStackTrace();
				}
			}
}