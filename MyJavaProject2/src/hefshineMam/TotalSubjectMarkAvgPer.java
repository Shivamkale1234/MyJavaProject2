package hefshineMam;

public class TotalSubjectMarkAvgPer {

	public static void main(String[] args) {


		int mar = 35;
		int eng = 34;
		int hin = 35;
		int chem = 36;
		int phy = 61;
		
	    double max = 500;
		
		int total = (mar+eng+hin+chem+phy);
		System.out.println("Total marks is : "+total);
		
		double avg = total/5;
		System.out.println(avg);
		
		double per = (total/max)*100;
		System.out.println(per);
		
		if(per>90)
		{
			System.out.println('A'+" Grade");
		}
		else if((per<90) && (per>80))
		{
			System.out.println('B'+" Grade");
		}
		else if((per<80) && (per>70)) 
		{
			System.out.println('C'+" Grade");
		}
		else if((per<70) && (per>60))
		{
			System.out.println('D'+" Grade");
		}
		else if((per<60) && (per>40))
		{
			System.out.println('E'+" Grade");
		}
		else 
		{
			System.out.println("Fail");
		}

	}

}
