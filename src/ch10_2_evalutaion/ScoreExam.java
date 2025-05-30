package ch10_2_evalutaion;

import java.util.Scanner;

import ch10_2_evalutaion.Service.EngService;
import ch10_2_evalutaion.Service.KorService;
import ch10_2_evalutaion.Service.MatService;
import ch10_2_evalutaion.dto.AccountDTO;

public class ScoreExam {
	
	public static  Scanner inputInt = new Scanner(System.in);
	public static  Scanner inputStr = new Scanner(System.in);

	public static AccountDTO[] korMaj = new AccountDTO[10];
	public static AccountDTO[] matMaj = new AccountDTO[10];
	public static AccountDTO[] engMaj = new AccountDTO[10];
	
	//public static AcccountDTO session = null;
	
	static {
		
		//AccountDTO accountDTO0 = new AccountDTO("0000","김기원",0,0,0,"국문과");
		//korMaj[0] = accountDTO0;
		
		//AccountDTO accountDTO1 = new AccountDTO("0001","조은아",0,0,0,"수학과");
		//matMaj[0] = accountDTO1;
		
		
		//AccountDTO accountDTO2 = new AccountDTO("0002","윤제석",0,0,0,"영문과");
		//engMaj[0] = accountDTO2;
	}
	
	
	public static void main(String[] args) {
		
		boolean run = true;
		while (run) {
			System.out.println("=================================");
			System.out.println("성적 관리 프로그램에 오신걸 환영합니다.");
			System.out.println("=================================");
			System.out.println("1. 국어국문과");
			System.out.println("2. 수학과");
			System.out.println("3. 영어영문과");
			System.out.println("4. 프로그램 종료");
			System.out.print("(1~4)을 눌러주세요 >>>>");
			String select = inputStr.next();
			
			switch(select) {
			case "1" :
				System.out.println();
				System.out.println("<<국어국문과 성적관리창으로 진입합니다.>>");
				KorService korService = new KorService();
				korService.menu(inputInt, inputInt, korMaj);
				break;
				
			case"2" :
				System.out.println();
				System.out.println("<<수학과 성적관리창으로 진입합니다.>>");
				MatService matService = new MatService();
				matService.menu(inputInt, inputInt, matMaj);
				break;
				
			case"3" :
				System.out.println();
				System.out.println("<<영어영문과 성적관리창으로 진입합니다.>>");
				EngService engService = new EngService();
				engService.menu(inputInt, inputInt, engMaj);
				break;
				
			case"4" :
				System.out.println("프로그램을 종료합니다.");
				run = false;
				
				
				
			
			
			
			
			}//주메뉴 switch 종료
			
			
		}//주메뉴 while 종료
		
		
		
		
	}//main method 종료

}//class 종료
