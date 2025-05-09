package ch10_2_1;

public class AccuracyExam2 {

	public static void main(String[] args) {
		
		int apple =1;
		int totalPieces = apple * 10;
		int number = 7;
		int temp = totalPieces - number;
		
		double result = temp / 10D;
		System.out.println("사과 남은 조각 수 : " +result);
		
	}

}
