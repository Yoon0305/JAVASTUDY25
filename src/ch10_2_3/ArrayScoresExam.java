package ch10_2_3;// review 필요, 미완성 (124p~)

import java.util.Scanner;

public class ArrayScoresExam {

	public static void main(String[] args) {
		// 배열을 이용한 성적표 ver.1
		// 학생수
		// 점수 - 총점, 평균
Scanner input = new Scanner(System.in);

System.out.println("==== 성적표 ====");

System.out.print("학생수를 입력하세요 : ");
int NumOfStudent = input.nextInt();

int [] scores = new int[NumOfStudent];

System.out.println("배열의 길이 : " + scores.length);

for(int i=0 ; i<scores.length ; i++) {
	
	System.out.println((i+1)+"번째 학생의 점수를 입력하세요.");
scores[i] =input.nextInt();

}//for문 종료

		System.out.println("====입력된 점수 확인====");
		
		for(int i=0 ; i<scores.length ; i++) {
			System.out.println(scores[i]+"점");
		}// for문 종료
		
		System.out.println();
		System.out.println("=========");
		
		
	}// main method 종료

}//class 종료
