package ch10_2_1;

import java.util.Scanner;

public class LogicalOrExam {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("2�� ����� 3�� ����� ���� Ȯ���غ����??");
		System.out.print("�����Է� >>>>");
		
		int value = input.nextInt();
		
		if ((value%2==0) || (value%3==0)) {
			System.out.println("2�� ��� �Ǵ� 3�� ����Դϴ�.");
		}
		else
			System.out.println("2�� ��� �Ǵ� 3�� ����� �ƴմϴ�");
		}
		
		
		
	}

