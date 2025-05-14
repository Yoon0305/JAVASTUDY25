package ch10_2_2; //Review 필요

import java.util.Scanner;

public class VariousIfPhraseExam {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("학번을 입력해 주세요");
		System.out.print(">>>");
		int studyid =input.nextInt();
		
		System.out.println("점수를 입력해 주세요");
		System.out.print(">>>"); 
			
		int score = input.nextInt();
		
		if (score>0 && score <=100) {
			if (score>=90 && score<=100) {
				System.out.println("당신의 점수는" + score + "점으로 등급 : (A)입니다");
			}
			if (score>=80 && score<90) {
				System.out.println("당신의 점수는" + score + "점으로 등급 : (B)입니다");
			}
			if (score>=70 && score<80) {
				System.out.println("당신의 점수는" + score + "점으로 등급 : (C)입니다");
			}
			if (score>=60 && score<70) {
				System.out.println("당신의 점수는" + score + "점으로 등급 : (D)입니다");
			}
			if (score>=0 && score<60) {
				System.out.println("F학점, 재수강입니다.");
			}
		}
			if (score<0 || score>100) {
				System.out.println("잘못된입력입니다.");
			}
			System.out.println("프로그램을 종료합니다.");
		}
	}


