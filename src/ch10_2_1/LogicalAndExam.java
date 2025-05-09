package ch10_2_1;

import java.util.Scanner;

public class LogicalAndExam {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("정수를 입력하시면 대소문자나 숫자를 판단해 드릴게요");
		System.out.println("유니코드표 기반 프로그램입니다");
		System.out.print("숫자 입력 >>>");
		int charCode = input.nextInt();
		
		if ((charCode)>=65 & (charCode<=90)) {
			System.out.println("현재 입력된 숫자는 대문자입니다.:"+(char)charCode);
		}
		
		else if((charCode>=97) && (charCode<=122)) {
			System.out.println("현재 입력된 숫자는 소문자입니다:"+(char)charCode);
			}
		else if(!(charCode<48)&&!(charCode>57)) {
			System.out.println("현재 입력된 숫자는 유니코드의 문자형숫자 입니다:" +(char)charCode);
		}
		
		else
			
		System.out.println("대문자, 소문자, 숫자의 유니코드 표에 없는 숫자입니다");
		System.out.println("프로그램을 다시 실행해 주세요");
		
		
	}

}
