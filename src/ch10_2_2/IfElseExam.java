package ch10_2_2;

import java.util.Scanner;

public class IfElseExam {
		//class 시작

	public static void main(String[] args) {
		// main method 시작 
		Scanner in = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 :");
		int number = in.nextInt();
		
		if(number%2 ==0)
			System.out.println("짝수");
		else
			System.out.println("홀수");
		System.out.println("종료");
		
		
		
	} //main method 종료

}// class 종료
