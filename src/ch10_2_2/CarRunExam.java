package ch10_2_2;

import java.util.Scanner;

public class CarRunExam {

	public static void main(String[] args) {
		// 자동차 주행 프로그램.
		// c - 시동 / r - 계기판 정보 출력 / u - 주행 / d - 시동 끄기
		
	Scanner input= new Scanner(System.in);
	
	boolean run = true;
	
	int speed = 0;
	
	final int MAXSPEED = 300;
	
	final int MINSPEED = 0;
	
	System.out.println("시동을 켭니다.");
	
	System.out.println("현재 속도 : " +speed + "km/h");
	
	while(run) {
		System.out.println("============");
		System.out.println("0. 시동 종료");
		System.out.println("1. 엑셀");
		System.out.println("2. 브레이크");
		System.out.println("3. 멀티미디어");
		System.out.println("4. 주유하기");
		System.out.println("============");
		System.out.print("(0~4숫자)입력>>>>");

		int select = input.nextInt();
		
		switch(select) {
		
		case 0 :
			System.out.println("시동 종료");
			
			run = false;
			break;
			
		case 1 :
			System.out.println("가속합니다.");
			
			speed += 30 ;
			
			if(speed>=MAXSPEED) {
				speed = MAXSPEED;
			}//안쪽 if문 종료
		
			System.out.println("현재속도 :" + speed + "km/h");
			break;
		
		case 2 :
			
			System.out.println("감속합니다.");
			speed-=10;
			if(speed<=MINSPEED) {
				speed=MINSPEED;
			}//안쪽 if문 종료
			System.out.println("현재 속도 :"+speed +"km/h");
			break;
		
		case 3 :
			System.out.println("멀티미디어 실행");
			break;
			
		case 4 :
			System.out.println("주유하기");
			break;
		
		}//switch 종료
		
	}//while 종료
		System.out.println("시동이 꺼집니다.");
	} //main 종료

}//class 종료
