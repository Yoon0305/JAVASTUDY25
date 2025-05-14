package ch10_2_1; // Review �ʿ�

public class CheckOverflowExam {//public class����

	public static void main(String[] args) { // main method 시작
		// 우리가 숫자타입을 키보드로 입력 받아 처리하는 것이 원칙
		// 입력값을 제어할 필요가 있다.(사전체크)
		// main method 이외에 또 다른 함수(method)를 추가하여 사용

		int result = safeAdd(70, 80);
		System.out.println(result);

	} // main method 종료

	public static int safeAdd(int left, int right) { //safeAdd 시작
		if (right > 0) { // if right시작 -> true 일때, 오른쪽값이 0보다커야함
			if (left > (Integer.MAX_VALUE - right)) { //if left 시작
				// Integer.MAX_VALUE int 타입의 최대값(약21억)
				// int 타입의 최대값에서 오른쪽 값을 뺀 것이 왼쪽 값보다 작아야함
				throw new ArithmeticException("오버플로우발생");
				// 예외처리 오류 발생용 코드
			} // if left 종료
			} // if right 종료
		else { // else시작 -> false일때
			if (left < (Integer.MIN_VALUE - right)) { //if right2 시작
				// Integer.MIN_VALUE int 타입의 최소값(약 -21억)
				throw new ArithmeticException("오버플로우발생");
			} // if right2 종료
		} // else 종료

		return left + right;

	} // safeAdd method 종료

} // class 종료
