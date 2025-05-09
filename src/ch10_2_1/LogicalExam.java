package ch10_2_1; // Review 필요

import java.util.Scanner;

public class LogicalExam {

	public static void main(String[] args) {
		
		String loginid = "YJS";
		String loginpw = "0305";
		
		Scanner input = new Scanner(System.in);

		System.out.print("로그인 id를 입력하세요 :");
		String id = input.nextLine();
		System.out.println("입력하신id는 :"+ id + "입니다.");
		
		System.out.print("비밀번호를 입력하세요 :");
		String pw = input.nextLine();
		System.out.println("검증중입니다.");
		
		if((loginid.equals(id)) & loginpw.equals(pw)) {
			System.out.println("로그인성공");
		}
		else {
			System.out.println("로그인실패");
		}
		
			
		}
		
		
	}
