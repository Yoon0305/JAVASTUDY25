package ch10_2_2;

import java.util.Scanner;

public class VariousIfPhraseExam2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요");
		System.out.print(">>>");
 String name = input.nextLine();
 System.out.println("성적을 입력하세요");
 System.out.print("국어 :");
 int kor = input.nextInt();
 if (kor<0 || kor>100) {
	 System.out.println("잘못된 값입니다.(국어)");
	}

 System.out.print("수학 :");
 int mat = input.nextInt();
 if (mat<0 || mat>100) {
	 System.out.println("잘못된 값입니다.(수학)");
 }
    
 
 System.out.print("영어 :");
 int eng = input.nextInt();
 if(eng<0||eng>100) {
	 System.out.println("잘못된 값입니다.(영어)");
 }
 
 int total = kor + mat + eng;
 double avg = (double)total/3;
 System.out.println("평균점수를 계산하시겠습니까? (예/아니오)");
 String answer = input.next();
 if (answer.equalsIgnoreCase("예")) {
	 System.out.println("평균:"+avg);	 
 }
 else {System.out.println("감사합니다. 프로그램이 종료됩니다.");
 }
 
	}//Main Method 종료

}//Class 종료
