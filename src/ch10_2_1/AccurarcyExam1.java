package ch10_2_1;

public class AccurarcyExam1 {

	public static void main(String[] args) {
		//사과 1개를 10조각으로 쪼개면 1조각이 0.1로 1개가 됨
		
		int apple = 1; // 사과 1개
		double pieceUnit = 0.1; // 조각 단위 0.1
		int number = 7; // 7개의 조각
		
		double result = apple - number *pieceUnit;
		
		System.out.println("사과 7조각을 뺀 수치 :" + result);
		
		System.out.println("7조각의 값 : "+ number * pieceUnit);

		
		// 결론 - 정확한 계산을 위해서는 실수타입을 사용하지 않는 것이 좋다.
	}

}
