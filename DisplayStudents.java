package studentInfo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class DisplayStudents 
{

	public static void display(Connection con) throws Exception 
	{
		Statement stmt=con.createStatement();
		ResultSet r=stmt.executeQuery("SELECT * FROM STUDENT");
		System.out.println("\n\nId\tFname\tLname\tPhNo\tAddress\tMarks\tGender\tDate\tBranch\n");
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println();
		while(r.next())
		{
			 System.out.println(r.getInt(1));
			 System.out.print("\t"+r.getString(2));
			 System.out.print("\t"+r.getString(3));
			 System.out.print("\t"+r.getInt(4));
			 System.out.print("\t"+r.getString(5));
			 System.out.print("\t"+r.getDouble(6));
			 System.out.print("\t"+r.getString(7));
			 System.out.print("\t"+r.getString(8));
			 System.out.print("\t"+r.getString(9));
			 System.out.println();
		}
	
		
		
		
		
	}

	public static void displaySearch(ResultSet r, Connection con) throws Exception 
	{
		System.out.println("\n\nId\tFname\tLname\tPhNo\tAddress\tMarks\tGender\tDate\tBranch\n");
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println();
		while(r.next())
		{
			 System.out.println(r.getInt(1));
			 System.out.print("\t"+r.getString(2));
			 System.out.print("\t"+r.getString(3));
			 System.out.print("\t"+r.getInt(4));
			 System.out.print("\t"+r.getString(5));
			 System.out.print("\t"+r.getDouble(6));
			 System.out.print("\t"+r.getString(7));
			 System.out.print("\t"+r.getString(8));
			 System.out.print("\t"+r.getString(9));
			 System.out.println();
		}
		
	}

	
}
