package ch10_2_2; //Review �ʿ�

import java.util.Scanner;

public class VariousIfPhraseExam {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("�й��� �Է��� �ּ���");
		System.out.print(">>>");
		int studyid =input.nextInt();
		
		System.out.println("������ �Է��� �ּ���");
		System.out.print(">>>"); 
			
		int score = input.nextInt();
		
		if (score>0 && score <=100) {
			if (score>=90 && score<=100) {
				System.out.println("����� ������" + score + "������ ��� : (A)�Դϴ�");
			}
			if (score>=80 && score<90) {
				System.out.println("����� ������" + score + "������ ��� : (B)�Դϴ�");
			}
			if (score>=70 && score<80) {
				System.out.println("����� ������" + score + "������ ��� : (C)�Դϴ�");
			}
			if (score>=60 && score<70) {
				System.out.println("����� ������" + score + "������ ��� : (D)�Դϴ�");
			}
			if (score>=0 && score<60) {
				System.out.println("F����, ������Դϴ�.");
			}
		}
			if (score<0 || score>100) {
				System.out.println("�߸����Է��Դϴ�.");
			}
			System.out.println("���α׷��� �����մϴ�.");
		}
	}


