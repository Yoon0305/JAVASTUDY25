package ch10_2_1;

import java.util.Scanner;

public class LogicalAndExam {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("������ �Է��Ͻø� ��ҹ��ڳ� ���ڸ� �Ǵ��� �帱�Կ�");
		System.out.println("�����ڵ�ǥ ��� ���α׷��Դϴ�");
		System.out.print("���� �Է� >>>");
		int charCode = input.nextInt();
		
		if ((charCode)>=65 & (charCode<=90)) {
			System.out.println("���� �Էµ� ���ڴ� �빮���Դϴ�.:"+(char)charCode);
		}
		
		else if((charCode>=97) && (charCode<=122)) {
			System.out.println("���� �Էµ� ���ڴ� �ҹ����Դϴ�:"+(char)charCode);
			}
		else if(!(charCode<48)&&!(charCode>57)) {
			System.out.println("���� �Էµ� ���ڴ� �����ڵ��� ���������� �Դϴ�:" +(char)charCode);
		}
		
		else
			
		System.out.println("�빮��, �ҹ���, ������ �����ڵ� ǥ�� ���� �����Դϴ�");
		System.out.println("���α׷��� �ٽ� ������ �ּ���");
		
		
	}

}
