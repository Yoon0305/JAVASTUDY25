package ch10_2_1;

import java.util.Scanner;

public class LogicalOrExam {

	public static void main(String[] args) { //main method 시작
		// 논리합 테스트용
		// | 연산은 대부분 조건이 2개 이상일 경우 판단하는 용도로 사용한다.
		// 예를 들어서, id와 pw가 둘중 하나라도 맞아야 id찾기나 비번찾기로 가는 경우.
		// (가지고있던id == 키보드로 입력한 id) (가지고있던pw == 키보드로 입력한pw)
		//               false          +               false           = false
		//               true           +               true            = false
		//               false          +               true            = false
		//               true           +               true            = true

		//키보드로 입력 받은 숫자가 2의 배수이거나 3의 배수인 것을 처리해보자.
		Scanner input = new Scanner(System.in); // 키보드로 입력받는 객체용
		
		System.out.println("2의 배수나 3의 배수인 것을 확인해볼까요??");
		System.out.print("숫자입력 >>>>");
		
		int value = input.nextInt(); // 정수를 입력받아 변수에 넣음
		
		// -------------- 사전 작업 ----------------------------
		
		if((value%2==0) || (value%3==0 )) { // if 조건 설정 이후 프린트값 적용 시작
			System.out.println("2의 배수 또는 3의 배수 입니다.");}
			
		 //if 조건 설정 이후 프린트값 적용 종료
		// 입력값을 2로 나눈 나머지가 0이면 true
		// 입력값을 3으로 나눈 나머지가 0이면 true 
		if ((value%2!=0) || (value%3!=0)) {
		System.out.println("2의 배수 또는 3의 배수가 아닙니다");
		}
	
	}
	
}
	