package LogicalProgram1;
public class EqualAndUnequalNumbers 
{
	public static void main(String[] args) 
	{
		 int side1=10;
		 int side2=11;
		 int side3=11;
		 
		 if (side1==side2 && side2==side3 && side3==side1) 
		 {
		 System.out.println("Equilateral");
		 }
		 else if (side1==side2 || side2==side3 || side3==side1)
		 {
		 System.out.println("Isosceles");
		 }
		 else             
		 {
		 System.out.println("Scalene");
		 }
     }	
}
