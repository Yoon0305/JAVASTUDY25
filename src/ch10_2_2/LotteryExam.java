package ch10_2_2; //REVIEW �ʿ�, 45�ʰ� 1�̸� ���ڿ� ���� ���� �ο� �ʿ�

import java.util.Scanner;

public class LotteryExam {

	public static void main(String[] args) {
		// �ζ� ��÷ ���α׷�
		// ���������� 1~45�� ���ڸ� ���߼���.
		
		Scanner in = new Scanner(System.in);
		System.out.println("�ζ� 1���� 45������ ��ȣ �� 6���� �������ּ���");
		
		int myNum1 = in.nextInt();
		System.out.println("ù��° ��ȣ"+myNum1);
		int myNum2 = in.nextInt();
		System.out.println("�ι�° ��ȣ"+myNum2);
		int myNum3 = in.nextInt();
		System.out.println("����° ��ȣ"+myNum3);
		int myNum4 = in.nextInt();
		System.out.println("�׹�° ��ȣ"+myNum4);
		int myNum5 = in.nextInt();
		System.out.println("�ټ���° ��ȣ"+myNum5);
		int myNum6 = in.nextInt();
		System.out.println("������° ��ȣ"+myNum6);
		
		 int num1 = (int)(Math.random()*45) + 1;
		 int num2 = (int)(Math.random()*45) + 1;
		 int num3 = (int)(Math.random()*45) + 1;
		 int num4 = (int)(Math.random()*45) + 1;
		 int num5 = (int)(Math.random()*45) + 1;
		 int num6 = (int)(Math.random()*45) + 1;
		 
		 int x = 0;
		 
		 if(myNum1 == num1 || myNum1 == num2 || myNum1 == num3 || myNum1 == num4 || myNum1 == num5 || myNum1 == num6) {
		++x;}
		 if(myNum2 == num1 || myNum2 == num2 || myNum2 == num3 || myNum2 == num4 || myNum2 == num5 || myNum2 == num6) {
				++x;}
		 if(myNum3 == num1 || myNum3 == num2 || myNum3 == num3 || myNum3 == num4 || myNum3 == num5 || myNum3 == num6) {
				++x;}
		 if(myNum4 == num1 || myNum4 == num2 || myNum4 == num3 || myNum4 == num4 || myNum4 == num5 || myNum4 == num6) {
				++x;}
		 if(myNum5 == num1 || myNum5 == num2 || myNum5 == num3 || myNum5 == num4 || myNum5 == num5 || myNum5 == num6) {
				++x;}
		 if(myNum6 == num1 || myNum6 == num2 || myNum6 == num3 || myNum6 == num4 || myNum6 == num5 || myNum6 == num6) {
				++x;}
		 
		 if (x==0) {System.out.println("��ȣ�� �ϳ��� �����ʾҽ��ϴ�");
		 if (x==1) {System.out.println("�����մϴ�. ��ȣ��1���¾ҽ��ϴ�");
		 if (x==2) {System.out.println("�����մϴ�. ��ȣ��2���¾ҽ��ϴ�");
		 if (x==3) {System.out.println("�����մϴ�. ��ȣ��3���¾ҽ��ϴ�");
		 if (x==4) {System.out.println("�����մϴ�. ��ȣ��4���¾ҽ��ϴ�");
		 if (x==5) {System.out.println("�����մϴ�. ��ȣ��5���¾ҽ��ϴ�");
		 if (x==6) {System.out.println("�����մϴ�. ��ȣ��6���¾ҽ��ϴ�");
		 }
		 }
		 }
		 }
		 }
		 }
		 }
		 else { System.out.println("�ý��ۿ���");
	}

	}
}

  
