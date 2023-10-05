package LogicalProgram1;

public class PostfixAndPrefix {

	public static void main(String[] args) {


		int k = 2;
		
System.out.println((k++) - (++k) + (k--) - (k++) + (++k) - (k--) + 
		
		            (--k) + (k) + (k--) - (k) + (--k) + (k++));

	}

}
//2-4+4-3+5-5+3+3+3-2+1+1=22-14=8