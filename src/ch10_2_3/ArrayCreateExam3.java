package ch10_2_3;

public class ArrayCreateExam3 {

	public static void main(String[] args) {

		int total1 = add(new int[] {70,80,90});
		int total2 = add(new int[] {60,50,90});
		int total3 = add(new int[] {80,80,60});
		
		System.out.println("1반 총합 : " +total1);
		System.out.println("2반 총합 : " +total2);
		System.out.println("3반 총합 : " +total3);
		
		
		
		
		
		


	}//main method 종료

	static int add(int[] grades) {
		// 
		int sum = 0;
		for(int i=0 ; i<3 ; i++) {
		sum += grades[i];
	}//for 종료
return sum;
	}// add method 종료
}//class 종료
