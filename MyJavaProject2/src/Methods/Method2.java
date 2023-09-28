package Methods;
public class Method2
{ 	
	// method with return type & arguments 

		public int sum(int num1,int num2)
		{
			return num1+num2;
		}

		public int sub(int num1,int num2)
		{
			return num1-num2;
		}

		public int mul(int num1,int num2)
		{
			return num1*num2;
		}

		public int div(int num1,int num2)
		{
			return num1/num2;
		}
		
		public static void main (String [] args)
		{
			Method2 ob=new Method2 ();
		    
			System.out.println(ob.sum(23,24));
			
			System.out.println(ob.sub(23,24));
		
			System.out.println(ob.mul(23,24));

			System.out.println(ob.div(23,24));
		}

}
