package ch10_2_2;

import java.util.Scanner;

public class VariousIfPhraseExam2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("�̸��� �Է��ϼ���");
		System.out.print(">>>");
 String name = input.nextLine();
 System.out.println("������ �Է��ϼ���");
 System.out.print("���� :");
 int kor = input.nextInt();
 if (kor<0 || kor>100) {
	 System.out.println("�߸��� ���Դϴ�.(����)");
	}

 System.out.print("���� :");
 int mat = input.nextInt();
 if (mat<0 || mat>100) {
	 System.out.println("�߸��� ���Դϴ�.(����)");
 }
    
 
 System.out.print("���� :");
 int eng = input.nextInt();
 if(eng<0||eng>100) {
	 System.out.println("�߸��� ���Դϴ�.(����)");
 }
 
 int total = kor + mat + eng;
 double avg = (double)total/3;
 System.out.println("��������� ����Ͻðڽ��ϱ�? (��/�ƴϿ�)");
 String answer = input.next();
 if (answer.equalsIgnoreCase("��")) {
	 System.out.println("���:"+avg);	 
 }
 else {System.out.println("�����մϴ�. ���α׷��� ����˴ϴ�.");
 }
 
	}//Main Method ����

}//Class ����
