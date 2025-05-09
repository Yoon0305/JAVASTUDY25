package ch10_2_1;

public class AccurarcyExam1 {

	public static void main(String[] args) {
		
		
		int apple = 10;
		double pieceUnit = 1;
		int number = 10;
		
		double result = apple - number * pieceUnit;
		
		System.out.println("사과 9조각을 뺀 수치 : " +result );
		System.out.println("사과 9 조각의 값 : " + pieceUnit*number);
	}

}
