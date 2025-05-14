package ch10_2_2;

public class CruiseControlExam {

	public static void main(String[] args) throws Exception {
boolean run = true;
int speed = 100;
int keyCode = 0;

while (run) {
	if (keyCode != 13 && keyCode !=10) {//잘못 엔터 누르는것을 방지
	System.out.println("-------------");
	System.out.println("1. 엑셀 | 2. 브레이크 | 3.크루즈 중지");
	System.out.println("-------------");
	System.out.print("선택 : ");
	}//if 종료
	
	keyCode=System.in.read();
	// System.out.print(keyCode);
	
	if (keyCode == 49) { // 엑셀값 입력
		speed +=5;
		System.out.println("현재 속도 :" +speed);
		}//if 종료
	else if (keyCode == 50) {//else if 시작, 브레이크 값 입력
	speed -= 5;
	System.out.println("현재속도 : " +speed);
	}//else if 종료
	
	else if (keyCode==51) {//else if 시작, 크루즈 중지 값 입력
	run = false;
	System.out.println("크루즈 기능이 종료됩니다.");
	System.out.println("현재 속도 : "+speed);
	System.out.println("안전운전 하세요.");
	}//else if 종료
	
}//while종료

System.out.println("프로그램 종료");
	}//main 종료
	

	
}//class 종료
