package Methods;
public class Method4
{ 		//with return type no argument

		public int sub()
		{
		    int num1=62;
		    int num2=32;
		    int result=num1-num2;
		    return(result);
		}
		
		public static void main (String [] args)
		{
		    Method4 obj1=new Method4();
		    System.out.println(obj1.sub());
		}

}
