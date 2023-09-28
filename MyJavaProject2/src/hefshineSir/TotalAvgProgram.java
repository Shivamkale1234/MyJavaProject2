package hefshineSir;

public class TotalAvgProgram {

	public static void main(String[] args) {
		 
		int mar = 75;
		int hin = 65;
		int eng = 71;
		int math = 77;
		int his = 65;
		
		double total = (mar+hin+eng+math+his);
		System.out.println(total);
		
		double avg = total/5;
		System.out.println(avg);
		
		double per = (total/500)*100;
		System.out.println(per);

	}
}
