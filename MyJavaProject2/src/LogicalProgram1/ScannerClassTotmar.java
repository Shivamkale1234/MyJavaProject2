package LogicalProgram1;

import java.util.Scanner;

// enter subject name and mark
public class ScannerClassTotmar{
	public static void main (String [] args) 
	{
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("enter marks");
		 
		 int java = sc.nextInt();
		 int python = sc.nextInt();
		 int javascript = sc.nextInt();
		 int html = sc.nextInt();
		 int cpp = sc.nextInt();
		 
		 System.out.println("enter java marks : " + java);
		 System.out.println("enter python marks : " + python);
		 System.out.println("enter javascript marks : " + javascript);
		 System.out.println("enter html marks : " + html);
		 System.out.println("enter cpp marks : " + cpp);
		 
		 int total = (java+python+javascript+html+cpp);
		 System.out.println("total marks : "+total);
		 
		 sc.close();
	
	}
}
