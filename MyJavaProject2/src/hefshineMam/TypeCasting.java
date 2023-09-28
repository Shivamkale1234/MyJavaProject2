package hefshineMam;

public class TypeCasting {

	public static void main(String[] args) {
		 
		 float x = 10.20f;
		 
		 System.out.println("x : "+ x);
		 
		 double y = x;       //implicit casting
		 System.out.println("y : "+ y);
		 
		 float z = (float) y; //implicit casting
		 System.out.println("z : "+ z);
		 
	}
}
