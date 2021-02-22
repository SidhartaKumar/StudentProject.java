package studentInfo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class RemainingStudent 

{
	
	
	private static void remaining(Connection con, int id) throws Exception 
	{
		String q = String.format("DELETE FROM STUDENT WHERE id = ?");

		PreparedStatement stmt = con.prepareStatement(q);
		stmt.setInt(1, id);

		int r  = stmt.executeUpdate();
		System.out.println(r+" Row Deleted");
		
		
	}

	public static void delete(Connection con, Scanner sc) 
	{
		System.out.println("Enter Student Id to Delete  ");
		int id=sc.nextInt();
		try {
			remaining(con,id);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
	}

	

}
