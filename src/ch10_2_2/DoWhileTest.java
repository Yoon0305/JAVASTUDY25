package ch10_2_2; // 질문있음

import java.util.Scanner;

public class DoWhileTest {

	public static void main(String[] args) {
		
int input = 0 , answer = 0;
// input, answer 초기값 설정

answer = (int)(Math.random()*31) +1;
Scanner num = new Scanner(System.in);
//answer는 1~31 정수 값
//스캐너 숫자를 받아서 랜덤하게 도출하겠다.

do {
	System.out.println("1과 31사이의 정수를 입력하세요.");
	input = num.nextInt();
	
	if(input > answer) {
		System.out.println("down");
		}//if 종료
	else if (input<answer) {
		System.out.println("up");
	}//else if 종료
	
}//do 종료
while(input!=answer);
System.out.println("정답입니다."+answer);
// input과 answer의 값이 동일하지 않은게 true니
// 다시 올라가서 연산을 시작해야하는것.
// input과 answer가 같아, while 조건이 false가 되면
// print 문 출력으로 이동. 
// 만약 sysout 뒤에 연산이 더 있다면 break; 추가해야하는가?
		
		
		
	}//main method 

}// class
