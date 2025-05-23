package ch10_2_3;

public class ArrayLengthExam2 {

	public static void main(String[] args) {
		// method 활용한 length 처리.
		int[]scores = new int[] {70,80,90};
		int sum = add(scores);
		
		System.out.println("총합 : " + sum + "입니다.");
		double avg = avg(sum, scores);
		System.out.println("평균 : " + avg);
	
	}// main method 종료

	private static double avg(int sum, int[] scores) {
		// avg method 시작
		return 0;
	}

	static int add(int[] scores) {
		// add method 시작
		int sum = 0;
		System.out.println("현재 인원은 : " + scores.length);
		for(int i=0; i<scores.length ; i++) {
			sum += scores[i];
		}//for문 종료
		return sum;
	}// add method 종료
	

}//class 종료
