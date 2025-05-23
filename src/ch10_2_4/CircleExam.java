package ch10_2_4;

public class CircleExam { // class 호출의 개념이 헷갈릴 때 다시보기.

	public static void main(String[] args) {
		//Circle 클래스를 객체로 받아서 동작하는 메인 메서드

		Circle circle = new Circle(); // 기본생성자를 통해 객체를 생성
		// 객체는 circle이라는 변수와 연결한다.
		
		circle.name = "김기원";
		circle.radius = 20;
		
		double result = circle.getArea(); //Circle 객체의 getArea()메서드 실행
														 //getArea()method에서 실행한 결과를 return 통해 받은 후, result에 저장
		
		System.out.println("반지름이"+circle.radius +"인 원의 넓이 : " + result);
		System.out.println("작성자 : "+circle.name);
		
	}//main method 종료

}//class 종료
