package ch10_2_3;   /*관리자 메뉴 미구현, 관리자 메뉴-사용자 메뉴 연동 미구현 */
					//
import java.util.Scanner;

public class VendingMachine2 { 
	
	

	public static void main(String[] args) {
		 
		Scanner inputStr = new Scanner(System.in);
		
		String[] drinks = {"콜라","사이다", "우유", "생수"};
		int[] prices = {1500, 1400, 1200, 800};
		int[] stocks = {3, 5, 2, 0};
		
		boolean run = true;
		
		
while(run) {
	System.out.println("==== 자판기 메뉴 ====");
	
for (int i=0 ; i<drinks.length ; i++) {
String stockStat = (stocks[i]>0) ? ("재고 : "+stocks[i]) : "품절";
//String a = (조건) ? (T:F)

	System.out.println((i+1)+"."+drinks[i]+":"+prices[i]+"("+ stocks[i]+ ")");

}//for문 종료
	System.out.println("0.종료");

Scanner inputInt = new Scanner(System.in);
	System.out.println("음료 번호를 선택하세요 (1~" + drinks.length + " >>>)");
int select = inputInt.nextInt();

if (select ==0) {
	System.out.println("자판기를 종료합니다.");
run = false;
}//if 종료

else if(select < -1 || select > drinks.length) {
	System.out.println("잘못된 입력입니다.");
}//else if 종료

else if (select == -1 ) {
	System.out.println("==관리자메뉴 진입==");
	admin();
	run = false;
}

else {
String selectedDrink = drinks[select -1];
int selectedPrice = prices[select-1];
	
if(stocks[select-1]==0) {
		System.out.println("품절입니다.");
}//if문 종료
	
else {
		System.out.println("선택한 음료 :" + selectedDrink + ":"+ selectedPrice);
		System.out.println("돈을 넣어주세요.");
int money = inputInt.nextInt();
		
if(money < selectedPrice) {
	System.out.println("금액이 부족합니다.");
	System.out.println("현재 금액 :"+money);			
}//if 종료
else {
int change = money - selectedPrice;
stocks[select - 1]--;
System.out.println("거스름돈 : "+ change);
}// else종료

}//else 종료
	
	
}//else문 종료

}//while문 종료
			 	
}//main 종료

	private static void admin() {

Scanner scanner = new Scanner(System.in);
		
boolean LoginOk = true; // 로그인 화면 관리 boolean
		
String AdminId = "yjs";
String AdminPw = "1234";
		
while(LoginOk == true) {
	System.out.println("아이디, 패스워드를 입력하세요.");
	System.out.print("ID : ");
	String AdminIdInput = scanner.next(); //ID String scanner
	System.out.print("PW : ");
	String AdminPwInput = scanner.next(); // PW String scanner
		
		if (AdminIdInput.equals(AdminId) && AdminPwInput.equals(AdminPw)) {
			LoginOk = false;  //로그인 화면 진입 정지
	System.out.println("로그인 성공.");
	adminMenu();
		}// if 종료
		else {
			LoginOk = true;
			System.out.println("로그인실패, 초기화면으로 돌아갑니다.");}
			
}// while 종료
		
}//admin, 로그인 method 종료

	private static void adminMenu() {// 관리자 메뉴
		// 
		boolean run = true;
		
		while (run) {
			Scanner scanner = new Scanner(System.in);
			String[] menuSelect = { "상품 등록", "상품 목록", "가격 수정", "재고 수정", "상품 삭제" };
			for (int i = 0; i < 5; i++)
				System.out.println((i + 1) + "." + menuSelect[i]);
			int selection = scanner.nextInt();
			if (selection < 0 || selection > 4) {
				System.out.println("잘못된 입력입니다.");
				
			} else {
				run = false;
				switch (selection-1) {
				
				case 0: // 상품 등록
					
				case 1: // 상품 목록
				case 2: // 가격 수정
				case 3: // 재고 수정
				case 4: // 상품 삭제
					
				}//switch 종료
			} //else 종료
		}//while 종료
		
		
		
		
	} // 관리자 메뉴 method 종료
}//class
	
