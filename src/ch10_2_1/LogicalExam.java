package ch10_2_1; // Review 필요

import java.util.Scanner;

public class LogicalExam {

	public static void main(String[] args) {
		// 논리적인 연산자는 크게 5가지 유형이 있다.
		// & : 논리 곱 -> ~이고 (2가지 변수가 모두 참일 경우, 참)
		// | : 논리 합 -> ~이거나 (2가지 중 한개라도 참이면 참)
		// ! : 논리 부정 -> 참과 거짓을 반전 함
		// ^ : 배타적 논리 합 -> 논리합의 마지막인 1+1=0 으로 결론이 남
		
		String loginid = "kkw";
		String loginpw = "1234";
		
		Scanner input = new Scanner(System.in);
		// 콘솔에 키보드로 값을 밀어 넣을 객체 생성함
		
		System.out.print("로그인할 id를 입력하세요 :");
		String id = input.nextLine();
		System.out.println("입력하신 id는 :" + id + " 입니다.");
	
		System.out.print("로그인할 암호를 입력하세요 : ");
		String pw = input.nextLine();
		System.out.println("==검증중입니다==");
		
		if((loginid.equals(id)) && loginpw.equals(pw)) {
		// 가지고있던 id와 키보드로 입력한 id가 같은지
		// 이거나 or
		// 가지고 있던 pw와 키보드로 입력한 pw가 같은지
			System.out.println("id나 pw가 일치합니다.");
			System.out.println("로그인성공!");
		} else { //if 문 false처리용
			System.out.println("id나 pw가 다릅니다.");
			System.out.println("로그인실패!"); }
		 //if 문 종료
	
	}
}
		
	