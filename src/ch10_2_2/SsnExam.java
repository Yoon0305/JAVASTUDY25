package ch10_2_2;

import java.util.Scanner;

public class SsnExam { // class 시작

	public static void main(String[] args) { // main method 시작
		
	System.out.println("주민등록번호를 입력하세요(-생략) :");
	Scanner in = new Scanner(System.in);
	
	String ssn = in.next();
	
	char ssn2 = ssn.charAt(6); // 성별 확인 추출, 7번째 숫자 확인
	int num = Character.getNumericValue(ssn2);

	if(num % 2 == 0) { // if, 7번째 숫자 구분 시작1
		System.out.println("여자");
		}// if, 7번째 숫자 구분 종료1
	else if(num%2==1) { // else if, 7번째 숫자 구분 시작2
		System.out.println("남자");
	    }// else if, 7번째 숫자 구분 종료2
	else { // 오류처리 시작
		System.out.println("다시 작성해주세요.");
	}// 오류처리 끝
	
	int year = Integer.parseInt(ssn.substring(0,2)); //태어난 년도 추출
	
	if(num==1||num==2||num==5||num==6) {//if, 태어난 년도 추출 시작1
		System.out.println("나이는" + (2025-(1900+year)+1)+ "입니다.");
	} //if, 태어난 년도 추출 시작1 종료
	else if(num==3||num==4||num==7||num==8) { //else if, 태어난 년도 추출2 시작
		System.out.println("나이는" + (2025-(2000+year)+1)+ "입니다.");
	}//else if,태어난 년도 추출2 종료
	else {//else, 오류처리 시작
		System.out.println("다시 작성해주세요.");
	}//else, 오류처리 종료
	
	int month = Integer.parseInt(ssn.substring(2,4));
	
	if(month<=0 || month>=13) {//if, 월 범위 지정 시작
		System.out.println("다시 작성해주세요");
	}//if, 월 범위 지정 종료
	else if(month >= 3 && month <=5) { //else if,봄 범위 지정 시작
		System.out.println("봄에 태어났습니다.");
	} //else if, 봄 범위 지정 종료
	else if(month>=6 && month <=8) {//else if, 여름 범위 지정 시작
		System.out.println("여름에 태어났습니다.");	
	} //else if, 여름 범위 지정 종료
	else if(month>=9 && month <=11) {//else if, 가을 범위 지정 시작
		System.out.println("가을에 태어났습니다.");
	}//else if, 가을 범위 지정 종료
	else {//겨울 범위 지정 시작
		System.out.println("겨울에 태어났습니다.");
	}//겨울 범위 지정 종료
	
	
	}// main method 종료
}// class 종료