package ch10_2_2;

import java.util.Scanner;

public class SsnExam { // class ����

	public static void main(String[] args) { // main method ����
		
	System.out.println("�ֹε�Ϲ�ȣ�� �Է��ϼ���(-����) :");
	Scanner in = new Scanner(System.in);
	
	String ssn = in.next();
	
	char ssn2 = ssn.charAt(6); // ���� Ȯ�� ����, 7��° ���� Ȯ��
	int num = Character.getNumericValue(ssn2);

	if(num % 2 == 0) { // if, 7��° ���� ���� ����1
		System.out.println("����");
		}// if, 7��° ���� ���� ����1
	else if(num%2==1) { // else if, 7��° ���� ���� ����2
		System.out.println("����");
	    }// else if, 7��° ���� ���� ����2
	else { // ����ó�� ����
		System.out.println("�ٽ� �ۼ����ּ���.");
	}// ����ó�� ��
	
	int year = Integer.parseInt(ssn.substring(0,2)); //�¾ �⵵ ����
	
	if(num==1||num==2||num==5||num==6) {//if, �¾ �⵵ ���� ����1
		System.out.println("���̴�" + (2025-(1900+year)+1)+ "�Դϴ�.");
	} //if, �¾ �⵵ ���� ����1 ����
	else if(num==3||num==4||num==7||num==8) { //else if, �¾ �⵵ ����2 ����
		System.out.println("���̴�" + (2025-(2000+year)+1)+ "�Դϴ�.");
	}//else if,�¾ �⵵ ����2 ����
	else {//else, ����ó�� ����
		System.out.println("�ٽ� �ۼ����ּ���.");
	}//else, ����ó�� ����
	
	int month = Integer.parseInt(ssn.substring(2,4));
	
	if(month<=0 || month>=13) {//if, �� ���� ���� ����
		System.out.println("�ٽ� �ۼ����ּ���");
	}//if, �� ���� ���� ����
	else if(month >= 3 && month <=5) { //else if,�� ���� ���� ����
		System.out.println("���� �¾���ϴ�.");
	} //else if, �� ���� ���� ����
	else if(month>=6 && month <=8) {//else if, ���� ���� ���� ����
		System.out.println("������ �¾���ϴ�.");	
	} //else if, ���� ���� ���� ����
	else if(month>=9 && month <=11) {//else if, ���� ���� ���� ����
		System.out.println("������ �¾���ϴ�.");
	}//else if, ���� ���� ���� ����
	else {//�ܿ� ���� ���� ����
		System.out.println("�ܿ￡ �¾���ϴ�.");
	}//�ܿ� ���� ���� ����
	
	
	}// main method ����
}// class ����