package ch10_2_1; // Review �ʿ�

import java.util.Scanner;

public class LogicalExam {

	public static void main(String[] args) {
		
		String loginid = "YJS";
		String loginpw = "0305";
		
		Scanner input = new Scanner(System.in);

		System.out.print("�α��� id�� �Է��ϼ��� :");
		String id = input.nextLine();
		System.out.println("�Է��Ͻ�id�� :"+ id + "�Դϴ�.");
		
		System.out.print("��й�ȣ�� �Է��ϼ��� :");
		String pw = input.nextLine();
		System.out.println("�������Դϴ�.");
		
		if((loginid.equals(id)) & loginpw.equals(pw)) {
			System.out.println("�α��μ���");
		}
		else {
			System.out.println("�α��ν���");
		}
		
			
		}
		
		
	}
