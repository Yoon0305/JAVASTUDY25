package ch10_2_2; //review 필요

import java.util.Scanner;

public class SwitchExam2 {

	public static void main(String[] args) {
		// 람다식 적용 연습
		Scanner inputStr1 = new Scanner(System.in);
		Scanner inputStr = new Scanner(System.in);
		boolean run = true;
		while(run) {
			System.out.println("파악하고 싶은 동물 이름을 입력하세요");
			System.out.print(">>>>");
			String animal = inputStr.next();
		
			
			
			whoIsIt(animal);
			
		}//while문 종료
		
	}//main method 종료
	
	static void whoIsIt(String animal) {
		
		String kind = null;
		switch(animal) {
		case "강아지","고양이","사자","호랑이"-> kind = "포유류";
		case "독수리","참새","비둘기","까마귀"-> kind = "조류";
		case "고등어","삼치","연어","갈치" -> kind = "어류";
		default -> kind = "알수없는 객체입니다.";
		} // switch animal 종료
		
		System.out.println(animal+"는"+kind+"로 판단됨.");
		System.out.println("프로그램 종료를 원하시면 숫자를 입력하세요");
		System.out.println("(1. 예 / 2. 아니오)");
		
	

	}// whoIsIt method 종료

	

}//class 종료
