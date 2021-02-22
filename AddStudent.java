package studentInfo;

import java.sql.Connection;
import java.sql.PreparedStatement;

import java.util.Scanner;

public class AddStudent {
	String id,Fname,Lname,Address,Gender,Branch,Date;
	int PhNo;
    double Marks;
    Scanner sc=new Scanner(System.in);
	
	public static void add(Connection con,String id,String Fname,String Lname,int PhNo,String Address,double Marks,String Gender,String Date,String Branch) throws Exception 
	{
		
		String q="INSERT INTO STUDENT VALUES (?,?,?,?,?,?,?,?,?)";
		
		PreparedStatement stmt=con.prepareStatement(q);
		stmt.setString(1,id);
		stmt.setString(2, Fname);
		stmt.setString(3, Lname);
		stmt.setInt(4, PhNo);
		stmt.setString(5, Address);
		stmt.setDouble(6, Marks);
		stmt.setString(7, Gender);
		stmt.setString(8, Date);
		stmt.setString(9, Branch);
		int row=stmt.executeUpdate();
		if(row>0)
		{
			System.out.println("A new Student has been Added");
		}
		
		
	
	}
	public static void insert(Connection con, Scanner sc) 
	{
		System.out.println("Enter the Student Details ");
		System.out.println();
		System.out.println("Enter the id ");
		String id=sc.next();
		System.out.println("Enter the First Name");
		String Fname=sc.next();
		System.out.println("Enter the Last Name ");
		String Lname=sc.next();
		System.out.println("Enter the Phone Number ");
		int PhNo=sc.nextInt();
		System.out.println("Enter the Address");
		String Address=sc.next();
		System.out.println("Enter the Marks");
		double Marks=sc.nextDouble();
		System.out.println("Enter the Gender ");
		String Gender=sc.next();
		System.out.println("Enter the Date of Birth");
		String Date=sc.next();
		System.out.println("Enter the Branch");
		String Branch=sc.next();
		
		
		
		try {
			add(con,id,Fname,Lname,PhNo,Address,Marks,Gender,Date,Branch);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

}
