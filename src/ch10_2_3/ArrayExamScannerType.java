package ch10_2_3;

import java.util.Scanner;

public class ArrayExamScannerType {

	public static void main(String[] args) {
		// 
		Scanner input = new Scanner(System.in);
		int scores[] = new int[5];
		int sum = 0;
		System.out.println("숫자 5개를 입력하세요.");
		System.out.print(">>>>");
		
		for(int i=0 ; i<scores.length ; i++) {
			scores[i] = input.nextInt();
			
		
		}//for문 종료
		
		for(int i=0 ; i<scores.length ; i++) {
			sum += scores[i];
		}
		
		
		System.out.println("총점은 : "+sum);
		System.out.println("평균은 : "+sum/(double)scores.length);
		
		
		
	}// main method 종료

}// class 종료
