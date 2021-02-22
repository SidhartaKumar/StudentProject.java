package studentInfo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class SearchStudent 
{


	public static void search(Connection con, Scanner sc) throws Exception 
	{
		System.out.println("Search Based on:");
		System.out.println("1.id\n2.First Name\n3.Last Name\n4.Phone Number\n5.Address\n6.Marks\n7.Gender\n8.DOB\n9.Branch");
		int s= sc.nextInt();
		SearchStudent.display(con, s);
		
	}

	private static void display(Connection con, int s) throws Exception 
	{
		Scanner sc = new Scanner(System.in);
		switch(s)
		{
		case 1: displayID(sc,con);
				break;
		case 2: displayFname(sc,con);
				break;
		
		}
		
		
	}

	
	
	

	

	
	

	private static void displayFname(Scanner sc, Connection con) throws Exception
	{
		System.out.println("Enter First name");
		String fname=sc.next();
		String q="SELECT * FROM STUDENT WHERE FNAME=?";
		PreparedStatement stmt=con.prepareStatement(q);
		stmt.setString(1, fname);
		ResultSet r= stmt.executeQuery();
		DisplayStudents.displaySearch(r, con);
		
		
		
	}

	private static void displayID(Scanner sc, Connection con) throws Exception 
	{
		System.out.print("Enter ID: ");
		int id = sc.nextInt();
		String q = "SELECT * FROM STUDENT WHERE ID = ?";
		
		PreparedStatement stmt = con.prepareStatement(q);
		stmt.setInt(1,id);
		ResultSet r = stmt.executeQuery();
		
		DisplayStudents.displaySearch(r, con);
		
	}


}
