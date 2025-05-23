package ch10_2_3; /*배열, for문 사용 연습필요.
				  사용자 투입금액에 따른 거스름돈 증감값 계산은
				  금액이 조금씩 추가되어도 수식이 연동 가능하도록 하는것이 필요.
				  
				  추가 투입 금액이 적을때 부분 미구현*/

				  /*투입금액 구현 부분 코드는 행렬 {100,500,1000,5000,10000} 과
				    투입 갯수 행렬을 곱해서 모두 합산한 값을 주문금액과 비교하는 형식으로
				    변경예정. (주문 < 합산) , (주문 = 합산), else (주문 < 합산) 
				   */

import java.util.Scanner;

public class VendingMachineExam {

	public static void main(String[] args) {
		// 자판기 프로그램 작성
		// main method, LoginMethod 2개 사용
			
		Scanner input = new Scanner(System.in); //정수 입력 스캐너
		boolean run = true;
		
		while (run==true) {
			
		System.out.println("구매하실 상품을 입력하세요.");
		System.out.println("1. 콜라 (1,500원)");
		System.out.println("2. 사이다 (1,500원)");
		System.out.println("3. 우유 (1,000원)");
		System.out.println("4. 생수 (500원)");
		System.out.print(">>>>");
		int order = input.nextInt();
		
		if (order == 999) { //관리자 메뉴 진입 code 설정
			System.out.println("==관리자메뉴 진입==");
			Admin();
			run = false; // 관리자 메뉴 진입시 상품 구매 화면 X
			
			
		} // if 관리자메뉴 진입 종료
	
		
		switch(order) { // 자판기 메뉴 선택
		
		case 1 :
			System.out.println("구매 수량을 입력해주세요.");
			System.out.print(">>>");
			int order1 = input.nextInt();
			
			System.out.println("구매하실 물품은 콜라"+order1+"캔 입니다.");
			System.out.println("( 1. 구매 진행 / 2. 취소 )");
			System.out.print(">>>");
			int orderC1 = input.nextInt();
			
			if (orderC1 == 1) {
				System.out.println(order1*1500+"원 현금을 넣어주세요.");
				System.out.print(">>>");
				int C1Cash = input.nextInt();
				
				if (C1Cash > order1*1500) { // 거스름돈 발생 상황 if 시작
					System.out.println(C1Cash+"받았습니다.");
					System.out.println("거스름돈"+(C1Cash-order1*1500)+"원을 받아주세요.");
					System.out.println("구매가 완료되었습니다. 감사합니다.");
				}// 거스름돈 발생 상황 if 종료
				
				else if (C1Cash == order1*1500) { // 입금, 구매 금액 동일
					System.out.println(C1Cash+"받았습니다.");
					System.out.println("구매가 완료되었습니다. 안녕히가세요.");
				} // 입금, 구매 금액 동일 종료
				
				else { // 금액 부족
					System.out.println("금액이 부족합니다. 추가 금액을 넣어주세요.");
					System.out.println("구매를 취소하시려면 2번을 눌러주세요.");
					System.out.print(">>>>");
					int C1AddCash = input.nextInt();
					
					if (C1AddCash == 2) {
						System.out.println("구매를 취소합니다.");
						System.out.println("상품선택 화면으로 돌아갑니다.");
					} //구매 취소 종료
					
					else if (C1AddCash + C1Cash > order1*1500) {
						System.out.println((C1AddCash+C1Cash)+"받았습니다.");
						System.out.println("거스름돈"+((C1AddCash + C1Cash)-order1*1500)+"원을 받아주세요.");
						System.out.println("구매가 완료되었습니다. 감사합니다.");
					}// 추가금액 넣은게 구매 금액 over
						else if (C1AddCash + C1Cash == order1*1500) {
							System.out.println("구매가 완료되었습니다. 감사합니다.");
						
					} // 추가 금액 투입 종료
				}// 금액 부족 종료
			}// if문 orderC1 종료
			break;
			
		case 2 :
			System.out.println("구매 수량을 입력해주세요.");
			System.out.print(">>>");
			int order2 = input.nextInt();
			
			System.out.println("구매하실 물품은 사이다"+order2+"캔 입니다.");
			System.out.println("( 1. 구매 진행 / 2. 취소 )");
			System.out.print(">>>");
			int orderC2 = input.nextInt();
			
			if (orderC2 == 1) {
				System.out.println(order2*1500+"원 현금을 넣어주세요.");
				System.out.print(">>>");
				int C2Cash = input.nextInt();
				
				if (C2Cash > order2*1500) { // 거스름돈 발생 상황 if 시작
					System.out.println(C2Cash+"받았습니다.");
					System.out.println("거스름돈"+(C2Cash-order2*1500)+"원을 받아주세요.");
					System.out.println("구매가 완료되었습니다. 감사합니다.");
				}// 거스름돈 발생 상황 if 종료
				
				else if (C2Cash == order2*1500) { // 입금, 구매 금액 동일
					System.out.println(C2Cash+"받았습니다.");
					System.out.println("구매가 완료되었습니다. 안녕히가세요.");
				} // 입금, 구매 금액 동일 종료
				
				else { // 금액 부족
					System.out.println("금액이 부족합니다. 추가 금액을 넣어주세요.");
					System.out.println("구매를 취소하시려면 2번을 눌러주세요.");
					System.out.print(">>>>");
					int C2AddCash = input.nextInt();
					
					if (C2AddCash == 2) {
						System.out.println("구매를 취소합니다.");
						System.out.println("상품선택 화면으로 돌아갑니다.");
					} //구매 취소 종료
					
					else if (C2AddCash + C2Cash > order2*1500) {
						System.out.println((C2AddCash+C2Cash)+"받았습니다.");
						System.out.println("거스름돈"+((C2AddCash + C2Cash)-order2*1500)+"원을 받아주세요.");
						System.out.println("구매가 완료되었습니다. 감사합니다.");
					} // 추가 금액 투입 종료
					else if (C2AddCash + C2Cash == order2*1500) {
						System.out.println((C2AddCash+C2Cash)+"받았습니다.");
						System.out.println("구매가 완료되었습니다. 감사합니다.");
				}// else if 종료
			}// 금액 부족 종료
			}// if문 orderC2 종료
			
			break;
			
		case 3 :
			System.out.println("구매 수량을 입력해주세요.");
			System.out.print(">>>");
			int order3 = input.nextInt();
			
			System.out.println("구매하실 물품은 우유"+order3+"병 입니다.");
			System.out.println("( 1. 구매 진행 / 2. 취소 )");
			System.out.print(">>>");
			int orderC3 = input.nextInt();
			
			if (orderC3 == 1) {
				System.out.println(order3*1000+"원 현금을 넣어주세요.");
				System.out.print(">>>");
				int C3Cash = input.nextInt();
				
				if (C3Cash > order3*1000) { // 거스름돈 발생 상황 if 시작
					System.out.println(C3Cash+"받았습니다.");
					System.out.println("거스름돈"+(C3Cash-order3*1000)+"원을 받아주세요.");
					System.out.println("구매가 완료되었습니다. 감사합니다.");
				}// 거스름돈 발생 상황 if 종료
				
				else if (C3Cash == order3*1000) { // 입금, 구매 금액 동일
					System.out.println(C3Cash+"받았습니다.");
					System.out.println("구매가 완료되었습니다. 안녕히가세요.");
				} // 입금, 구매 금액 동일 종료
				
				else { // 금액 부족
					System.out.println("금액이 부족합니다. 추가 금액을 넣어주세요.");
					System.out.println("구매를 취소하시려면 2번을 눌러주세요.");
					System.out.print(">>>>");
					int C3AddCash = input.nextInt();
					
					if (C3AddCash == 2) {
						System.out.println("구매를 취소합니다.");
						System.out.println("상품선택 화면으로 돌아갑니다.");
					} //구매 취소 종료
					
					else if (C3AddCash + C3Cash > order3*1000) {
						System.out.println((C3AddCash+C3Cash)+"받았습니다.");
						System.out.println("거스름돈"+((C3AddCash + C3Cash)-order3*1000)+"원을 받아주세요.");
						System.out.println("구매가 완료되었습니다. 감사합니다.");
					} // 추가 금액 투입 종료
				}// 금액 부족 종료
			}// if문 orderC3 종료
			
			
			break;
			
		case 4 :
			System.out.println("구매 수량을 입력해주세요.");
			System.out.print(">>>");
			int order4 = input.nextInt();
			
			System.out.println("구매하실 물품은 생수"+order4+"병 입니다.");
			System.out.println("( 1. 구매 진행 / 2. 취소 )");
			System.out.print(">>>");
			int orderC4 = input.nextInt();
			
			if (orderC4 == 1) {
				System.out.println(order4*500+"원 현금을 넣어주세요.");
				System.out.print(">>>");
				
				int C4Cash = input.nextInt();
				
				if (C4Cash > order4*500) { // 거스름돈 발생 상황 if 시작
					System.out.println(C4Cash+"받았습니다.");
					System.out.println("거스름돈"+(C4Cash-order4*500)+"원을 받아주세요.");
					System.out.println("구매가 완료되었습니다. 감사합니다.");
				}// 거스름돈 발생 상황 if 종료
				
				else if (C4Cash == order4*500) { // 입금, 구매 금액 동일
					System.out.println(C4Cash+"받았습니다.");
					System.out.println("구매가 완료되었습니다. 안녕히가세요.");
				} // 입금, 구매 금액 동일 종료
				
				else { // 금액 부족
					System.out.println("금액이 부족합니다. 추가 금액을 넣어주세요.");
					System.out.println("구매를 취소하시려면 2번을 눌러주세요.");
					System.out.print(">>>>");
					
					int C4AddCash = input.nextInt();
					
					if (C4AddCash == 2) {
						System.out.println("구매를 취소합니다.");
						System.out.println("상품선택 화면으로 돌아갑니다.");
					} //구매 취소 종료
					
					else if (C4AddCash + C4Cash > order4*500) {
						System.out.println((C4AddCash+C4Cash)+"받았습니다.");
						System.out.println("거스름돈"+((C4AddCash + C4Cash)-order4*500)+"원을 받아주세요.");
						System.out.println("구매가 완료되었습니다. 감사합니다.");
					} // 추가 금액 투입 종료
				}// 금액 부족 종료
			}// if문 orderC4 종료
			break;
			
		}//switch 종료
		}//while run 종료
		}//main method 종료
		

	private static void Admin() {
		// 관리자 메뉴 구현
		// 로그인 실패시 다시 로그인 창 팝업까지 구현.
		Scanner InputId = new Scanner(System.in); // 아이디 스캐너
		Scanner InputPw = new Scanner(System.in); // 비밀번호 스캐너
		Scanner AdminMenu = new Scanner(System.in); // 관리자 메뉴 선택 스캐너
		Scanner Item = new Scanner(System.in); // 물품 등록 스캐너
		
		boolean LoginOk = true; // 로그인 화면 관리 boolean
		
		String AdminId = "yjs";
		String AdminPw = "1234";
		
		while(LoginOk == true) {
		System.out.println("아이디, 패스워드를 입력하세요.");
		System.out.print("ID : ");
		String AdminIdInput = InputId.next(); //ID String scanner
		System.out.print("PW : ");
		String AdminPwInput = InputPw.next(); // PW String scanner
		
		if (AdminIdInput.equals(AdminId) && AdminPwInput.equals(AdminPw)) {
			LoginOk=false;  //로그인 화면 진입 정지
			
			boolean LogOn = true; // 로그인 성공 이후 관리자메뉴 boolean
			 
			System.out.println("로그인 성공");
			System.out.println();
			
			while (LogOn==true) { // 로그인 성공 동안 반복문 메뉴 팝업 반복
				
			
			System.out.println("1.상품 등록");
			System.out.println("2.상품 재고 목록");
			System.out.println("3.상품 수정");
			System.out.println("4.상품 삭제");
			System.out.println("9.자판기 종료");
			System.out.print(">>>>");
			
			int AdminSelect = AdminMenu.nextInt();
			
			
				switch(AdminSelect) {
				// 새 상품 등록 시 case2에서 추가되게 변경 필요.
				// 단, switch에서 case2로 바로 넘어갔을때도 영향이 없도록 설정이 필요함.
				
				
				case 1:
					System.out.println("등록하실 상품명과 금액을 입력해주세요.[ 상품명/(금액) ]");
					System.out.print(">>>>");
					String NewItem = Item.next();
					
				case 2:
					System.out.println("상품 재고 목록입니다."); 
					System.out.println("1.콜라");
					System.out.println("2.사이다");
					System.out.println("3.우유");
					System.out.println("4.생수");
					break;
					
				case 3:
					System.out.println("수정하실 상품을 선택해주세요.");
					break;
					
				case 4:
					System.out.println("삭제하실 상품을 선택해주세요.");
					break;
					
				case 9:
					System.out.println("자판기를 종료합니다.");
					LogOn = false;
					break;
					
			}// switch 관리자 메뉴 종료
			}// if 로그인 성공 종료
		}// while 로그인 성공 종료
		
		else {
			System.out.println("로그인 실패.");
			System.out.println("로그인 화면으로 돌아갑니다.");	
			LoginOk = true;
		}// else 종료, 로그인 실패시 id,pw 입력창으로 돌아감.
	
		
	}// if 종료
	
	}// main method 종료
}// class 종료

