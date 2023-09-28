package hefshineSir;
public class If_Else_If_equalUnequal {

	public static void main(String[] args) 
	{
		 int side1=10;
		 int side2=11;
		 int side3=11;
		 
		 if (side1==side2 && side2==side3 && side3==side1) // T && T && T = T
		 {
		 System.out.println("equilateral");
		 }
		 else if (side1==side2 || side2==side3 || side3==side1) // F || T || F = T 
		 {
		 System.out.println("isosceles");
		 }
		 else  // F            
		 {
		 System.out.println("scalene");
		 }

	
	}}
