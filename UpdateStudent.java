package studentInfo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateStudent 
{

	public static void update(Connection con, Scanner sc) throws Exception 
	{
		System.out.println("Enter the Student of the Student to be updated ");
		int id=sc.nextInt();
		modify(con,id);
		
	}

	private static void modify(Connection con, int id) throws Exception 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("What do you want to update?");
		System.out.println("Update\n1.First Name\n2.Last Name\n3.Phone Number\n4.Address\n5.Marks\n6.Gender\n7.DOB\n8.Branch");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1: fnameUpdate(con,sc,id);
				break;
		case 2: lnameUpdate(con, sc, id);
				break;
		case 3: phnoUpdate(con, sc, id);
				break;
		case 4: addressUpdate(con, sc, id);
				break;
		case 5: marksUpdate(con, sc, id);
				break;
		case 6: genderUpdate(con, sc, id);
				break;
		case 7: dateUpdate(con, sc, id);
				break;
		case 8: branchUpdate(con, sc, id);
				break;	
						
				}
				
		
	}

	private static void branchUpdate(Connection con, Scanner sc, int id) throws Exception 
	{
		System.out.println("Enter Branch Name");
		String branch=sc.next();
		String q="UPDATE STUDENT SET BRANCH=? WHERE ID=?";
		PreparedStatement stmt=con.prepareStatement(q);
		stmt.setString(1, branch);
		stmt.setInt(2, id);
		
		int r= stmt.executeUpdate();
		System.out.println(r+" Rows Updated");
	
		
	}

	private static void dateUpdate(Connection con, Scanner sc, int id) throws Exception 
	{
		System.out.println("Enter Date of Birth ");
		String date=sc.next();
		String q="UPDATE STUDENT SET DOB=? WHERE ID=?";
		PreparedStatement stmt=con.prepareStatement(q);
		stmt.setString(1,date);
		stmt.setInt(2,id);
		
		int r=stmt.executeUpdate();
		System.out.println(r+" Rows upadted");
		
		
		
	}

	private static void genderUpdate(Connection con, Scanner sc, int id) throws Exception 
	{
		System.out.println("Upadte Gender");
		String gender=sc.next();
		String q="UPDATE STUDENT SET GENDER=? WHERE ID=?";
		PreparedStatement stmt=con.prepareStatement(q);
		stmt.setString(1, gender);
		stmt.setInt(2, id);
		
		int r=stmt.executeUpdate();
		System.out.println(r+" Rows updated");
		
		
	}

	private static void marksUpdate(Connection con, Scanner sc, int id) throws Exception 
	{
		System.out.println("Enter the Marks ");
		double marks=sc.nextDouble();
		String q="UPDATE STUDENT SET MARKS=? WHERE ID=?";
		PreparedStatement stmt=con.prepareStatement(q);
		stmt.setDouble(1, marks);
		stmt.setInt(2, id);
		
		int r=stmt.executeUpdate();
		System.out.println(r+" Rows updated");
		
		
		
	}

	private static void addressUpdate(Connection con, Scanner sc, int id) throws Exception 
	{
		System.out.println("Enter the Updated Address");
		String address=sc.next();
		String q="UPDATE STUDENT  SET ADDRESS=? WHERE ID=?";
		PreparedStatement stmt=con.prepareStatement(q);
		stmt.setString(1, address);
		stmt.setInt(2,id);
		
		int r=stmt.executeUpdate();
		System.out.println(r+" Rows Updated");
				
		
	}

	private static void phnoUpdate(Connection con, Scanner sc, int id) throws Exception 
	{
		System.out.println("Enter the new Phone Number ");
		int phno=sc.nextInt();
		String q="UPDATE STUDENT PHNO=? WHERE ID=?";
		PreparedStatement stmt=con.prepareStatement(q);
		stmt.setInt(1, phno);
		stmt.setInt(2, id);
		
		int r=stmt.executeUpdate();
		System.out.println(r+" Rows Updated");
		
		
	}

	private static void lnameUpdate(Connection con, Scanner sc, int id) throws Exception 
	{
		System.out.println("Enter the new Last name");
		String lname=sc.next();
		String q="UPDATE STUDENT SET LNAME=? WHERE ID=?";
		PreparedStatement stmt=con.prepareStatement(q);
		stmt.setString(1,lname);
		stmt.setInt(2, id);
		int r=stmt.executeUpdate();
		System.out.println(r+" Rows Updated");
		
		
		
	}

	private static void fnameUpdate(Connection con, Scanner sc, int id) throws Exception 
	{
		System.out.println("Enter the new First name ");
		String fname=sc.next();
		String q="UPDATE STUDENT SET FNAME=? WHERE ID=?;";
		
			PreparedStatement stmt=con.prepareStatement(q);
			stmt.setString(1, fname);
			stmt.setInt(2, id);
			int r=stmt.executeUpdate();
			System.out.println(r+" Rows Updated");
		
		
	}
	
	
	
	

}
