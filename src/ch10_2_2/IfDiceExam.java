package ch10_2_2;

public class IfDiceExam {

public static void main(String[] args) {
// main method 시작
 int num=(int)(Math.random()*6) + 1;
 
 if(num==1) {//1 조건 시작
	 System.out.println("1번이 나왔습니다.");
 }//1조건 종료
 else if (num==2) {//2 조건 시작
	 System.out.println("2번이 나왔습니다.");
	 }//2조건 종료
 else if (num==3) {//3 조건 시작
	 System.out.println("3번이 나왔습니다.");
	 }//3조건 종료
 else if (num==4) {//4 조건 시작
	 System.out.println("4번이 나왔습니다.");
	 }//4조건 종료
 else if (num==5) {//5 조건 시작
	 System.out.println("5번이 나왔습니다.");
	 }//5조건 종료
 else if (num==6) {//6 조건 시작
	 System.out.println("6번이 나왔습니다.");
	 }//6조건 종료
 else { // 오류 처리 시작
	 System.out.println("오류발생");
 }// 오류 처리 종료
 
 
 
 
	} // main method 종료

} // class 종료
