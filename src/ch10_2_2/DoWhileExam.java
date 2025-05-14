package ch10_2_2;

import java.util.Scanner;

public class DoWhileExam {

	public static void main(String[] args) {
		System.out.println("메시지를 입력하세요");
		System.out.println("프로그램을 종료하려면 ㅂㅂ를 입력하세요 :");
		
		Scanner in = new Scanner(System.in);
		String inputString;
		
		do {
			System.out.print(">>>");
			inputString = in.nextLine();
			System.out.println("사용자 : "+ inputString);
			
		} while (!inputString.equals("ㅂㅂ"));
		System.out.println("프로그램을 종료합니다.");
		// inputString이 ㅂㅂ와 equals 하면
		// 프로그램을 종료합니다 문구 발생
		// for, while 이 아닌 do 로 동작을 짠 프로그램
		// while 구문의 조건이 False 로 넘어가는 순간 프로그램 종료된 것.
		
		
		
		
		
		
		

	}//main 종료

}//class 종료
