package upCasting;

public class Son extends Father {
	
	public void bike() 
	{
		System.out.println("bike: FZ V3");
	}

	public void car()                       //override
	{
		System.out.println("Car: Nano");
	}

	public void money()                     //override
	{
		System.out.println("money: 2L");
	}
}
