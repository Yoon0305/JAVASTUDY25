package ch10_2_1;

import java.util.Scanner;

public class LogicalAndExam {

	public static void main(String[] args) { //main method 시작
		// 논리곱 테스트용
		// & 연산은 대부분 조건이 2개 이상일 경우 판단하는 용도로 사용한다.
		// 예를 들어서, id와 pw가 둘 다 맞아야 로그인이 성공하는 경우.
		// 가지고있던id == 키보드로 입력한 id) (& 가지고있던pw == 키보드로 입력한pw)
		//               false                          false            = false
		//                true                           true            = false
		//               false                           true            = false
		//                true                           true            = true
		
		Scanner input = new Scanner(System.in); // 키보드로 입력할 수 있는 객체 생성
		
		System.out.println("정수를 입력하시면 대소문자나 숫자를 판단해 드릴게요");
		System.out.println("유니코드표를 참고하여 프로그램을 제작하였습니다");
		
		System.out.print("숫자 입력 >>>");
		int charCode = input.nextInt(); // 키보드로 정수값이 입력됨. 변수에 들어감.
		
	//if(비교판단문){비교판단문이 true값일때 수행되는 문 }
	//else { 비교판단문이 false일때 수행되는 문 }
		if((charCode) >= 65 & (charCode <=90 )) { //if 65~90 시작
			// 입력된 숫자 값이 65이상이고 90이하이면 대문자
			
		System.out.println("현재 입력된 숫자는 대문자 입니다. : "+(char)charCode);
		} // if 65~90 종료
		
		else if( (charCode>=97) && (charCode<=122) ) {//else if 조건 설정 이후 프린트값 입력
			//위에서 실행된 if값이 false일 경우 또 비교를 하게 됨.
			// NAND 개념이다. 드모르간의 법칙을 파악하면 NOR
			//입력된 숫자 값이 97이상이고 122 이하이면 소문자.
			//&&를 사용하면 빠른 처리를 한다.(코드튜닝)
			System.out.println("현재 입력된 숫자는 소문자 입니다. :"+(char)charCode);
			} // else if 프린트값 종료
		 else if( !(charCode< 48) && !(charCode >57) )
		 { //else if2 조건 설정 후 프린트값 입력
	  // NAND 개념이다.
		// 48보다 작지 않고 57보다 크지 않은 비교문
	System.out.println("현재 입력된 숫자는 유니코드의 문자형숫자 입니다. :"+(char)charCode);
		 } // else if2 종료
	
	else
		 
	System.out.println("대문자, 소문자, 숫자의 유니코드 표 없는 숫자입니다.");
	System.out.println("프로그램을 다시 실행해 주세요"); 
	
	} // main method 종료
	
} // class 종료
	

	

