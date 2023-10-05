package LogicalProgram1;

public class TotalAvgProgram {

	public static void main(String[] args) {
		 
		int mar = 75;
		int hindi = 65;
		int eng = 71;
		int math = 77;
		int chem = 65;
		int subcnt=5;
		
		double total = (mar+hindi+eng+math+chem);
		System.out.println(total);
		
		double avg = total/subcnt;
		System.out.println(avg);
		
		double per = (total/500)*100;
		System.out.println(per);

	}
}
