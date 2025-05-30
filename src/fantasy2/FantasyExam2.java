package fantasy2;

import java.util.Scanner;

import fantasy2.DTO.AccountDTO;

public class FantasyExam2 {

	public static Scanner inputStr = new Scanner(System.in);
	public static Scanner inputInt = new Scanner(System.in);

	public static AccountDTO[] accounts = new AccountDTO[10];

	public static AccountDTO session = null;

	static {
		AccountDTO accountDTO0 = new AccountDTO("yjs","1234");
	}

	public static void main(String[] args) {

		/*
		 * DTO : (Account, Character, Item, Ride, Moster)
		 * 
		 * : Account = id, pw, memData (name,ssn,email) : Character =
		 * charClass(race),charData(hp,mp,sex,damage) : Item = itemName : Pet = petName
		 * : Monster = monName,monDate(hp,damage)
		 * 
		 * function : (InitialService, CharSelectService, InGameService)
		 * 
		 * : InitialService = loginIn met. , CreateAccount met. : CharSelectService =
		 * charList met., charCreate met. : InGameService = Status met., combat
		 * met.(using item, pet buff, guardDodge)
		 * 
		 * 
		 * service : (
		 */

		boolean run = true;
		while (run) {
			System.out.println("=======================");
			System.out.println("Fantasy2에 오신것을 환영합니다.");
			System.out.println("=======================");
			System.out.println("1.로그인");
			System.out.println("2.회원가입");
			System.out.println("3.게임종료");
			System.out.print(">>>>");
			String select = inputStr.next();
			
			switch(select) {
			case"1" :
				System.out.println("로그인 화면으로 이동합니다.");
				InitialPhaseService.login
				break;
				
			case"2" :
				System.out.println("회원가입 화면으로 이동합니다.");
				break;
				
			case"3" :
				System.out.println("게임을 종료합니다.");
				run=false;
				break;
				
				default :
					System.out.println("(1~3)을 입력해주세요.");
				
			}
			
				
		}
		
		
		
		
	}// main method 종료

}// class 종료
