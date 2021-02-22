package studentInfo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;



public class StudentMain 
{
	public static void main(String[] args) throws Exception 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Driver");
		String dbr=sc.nextLine();
		Class.forName(dbr);
		String db="jdbc:mysql://localhost:3306/student_info?user=root&password=root";
		Connection con= DriverManager.getConnection(db);
		System.out.println(con);
		while(true)
		{
			System.out.println("Select an Option from Below");
			System.out.println("1.Insert a new Student\n2.Display Student Details\n3.Delete Student\n4.UpDate Student Details\n5.SearchStudent");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1: AddStudent.insert(con,sc);
					break;
			case 2: DisplayStudents.display(con);
					break;
			case 3: RemainingStudent.delete(con,sc);
					break;
			case 4: UpdateStudent.update(con,sc);
					break;
			case 5: SearchStudent.search(con,sc);
					break;
			}
		}
	}

}
