package ch10_2_2;

import java.util.Scanner;

public class IfElseExam {
		//class ����

	public static void main(String[] args) {
		// main method ���� 
		Scanner in = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ��� :");
		int number = in.nextInt();
		
		if(number%2 ==0)
			System.out.println("¦��");
		else
			System.out.println("Ȧ��");
		System.out.println("����");
		
		
		
	} //main method ����

}// class ����
