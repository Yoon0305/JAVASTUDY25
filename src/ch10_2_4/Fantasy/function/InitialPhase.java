package ch10_2_4.Fantasy.function;

import java.util.ArrayList;
import java.util.Scanner;

public class InitialPhase {
	Scanner input = new Scanner(System.in);
	ArrayList<String> idLists = new ArrayList<>();
	ArrayList<String> pwLists = new ArrayList<>();
	ArrayList<String> nicknameLists = new ArrayList<>();
	
	public String initialSelect() {
		
		boolean run = true;
		
		while (run) {
		
			System.out.println("1.로그인");
			System.out.println("2.회원가입");
			System.out.print(">>>>");
			String initialSelect = input.next();
			
			switch(initialSelect) {
			
			case "1" :// case2에서 입력한 회원정보가 MemberDTO에 동적 배열로 들어가고 (db 역할)
						   // scanner로 입력한 값이 DTO배열에 저장된 값 중 id , pw 값과 동일 시 로그인 성공을 구현해야함..
						   // + 프로그램 종료로 가지 않은 이상 초기 화면에서 다시 회원가입 진행 시, 해당 정보도 DTO내의 회원정보 배열에 추가 되어야 함.
				
				
				
				run = false; // 로그인 완료되면 CharSelectionPhase로 넘어가야함.
				break;
				
			case "2" :
				System.out.println("회원가입할 아이디를 입력하세요.");
				String userId = input.next();
				
				System.out.println("비밀번호를 입력해 주세요.");
				String userPw = input.next();
				
				System.out.println("닉네임을 입력하세요");
				String userNickname = input.next();
			
				System.out.println(userNickname+"님 회원가입을 축하드립니다.");
				break;
				
				default : 
					System.out.println("(1~2)중에 선택해주세요.");
					break;
			
			
			}//initialSelect switch 종료
			
			
		}// initial select while 종료
		
		
		return null;
		
	} //loginSelect method 종료

}// InitialPhase class종료
