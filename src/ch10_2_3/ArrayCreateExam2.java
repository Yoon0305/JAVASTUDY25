package ch10_2_3;

public class ArrayCreateExam2 {

	public static void main(String[] args) {
		
	int sum = add(new int[] {70,80,90});
	System.out.println("총합 : "+sum);

	}// main method 종료

	static int add(int[] scores) {
		
		int sum = 0;
		
		for(int i=0 ; i<3 ; i++)
			sum += scores[i];
		
		return sum;
	}// add method 종료
	
}// class 종료