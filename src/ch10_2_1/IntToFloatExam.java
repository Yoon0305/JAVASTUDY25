package ch10_2_1;

public class IntToFloatExam {
 
	public static void main(String[] args) {
		// float은 32bit으로 되어있는 부동 소수점 연산에 사용됨.
		// 정수타입을 실수 타입으로 변환할 때, 손실이 발생한다.
		// int(32bit) = float(32bit)
		
		int num1 = 123456780;
		int num2 = 123456780;
		
		float num3 = num2; // int타입 값을 float에 넣음
		num2 = (int) num3; // 위에서 선언한 변수에 값을 다시 넣음.
		
		System.out.println("num1 :"+num1);
		System.out.println("num2 :"+num2); // num2 : 123456784
		System.out.println("num3 :"+num3); // num3 : 1.23456784E8
		// num3 의 경우 지수형식으로 E위에 숫자를 부동 소숫점 처리
		// 즉, E뒤의 숫자가 바뀌면 같은 값의 표기를 달리 할 수 있다.
		// 1234567.84E2 
		
		int result = num1 - num2;
		System.out.println("float으로 다녀온 후에 num2 값 변경됨.");
		System.out.println("num1 - num2 :" + result);
	}

}
