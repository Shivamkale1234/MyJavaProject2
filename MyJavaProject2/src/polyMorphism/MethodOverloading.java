package polyMorphism;

class MethodOverloading 
{
	
		void multiply(int a, int b)
		{
			System.out.println(a * b);
		}
		
		void multiply(int a, int b, int c)
		{
			System.out.println(a * b * c);
		}
		
		void multiply(int a, int b, int c, int d)
		{
			System.out.println(a * b * c * d);
		}
		
        public static void main(String [] args)
        {
        	MethodOverloading ob = new MethodOverloading();
        	ob.multiply(10, 20);
        	ob.multiply(10, 20, 30);
        	ob.multiply(10, 20, 30, 40);
        }
        
   }
