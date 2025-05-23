package ch10_2_4; /*코드 추가 작성 필요.
									3. 주행-> 주행메뉴 중, case3456 	/ 전체 case 중 4번(주행종료) 수정 -> ex) 배열 이용한 멀티미디어 등			*/

import java.util.Scanner;

public class Car {

	// 필드 (객체가 가지고 있어야 하는 값) -> 글로벌변수(Global_Variable)
	// 고유 데이터
	public String company; // 제작회사(현대,기아,KGM,쉐보레,아우디)
	public String model; // 아반테, 그렌져, 쏘나타
	public String color; // 빨강, 은색, 검정색, 흰색
	public int maxSpeed = 300; // 최고속도
	public int minSpeed = 0; // 최저속도
	public String oilType; // 경유, 휘발유

	// 상태값(변동가능)
	public int speed;
	public int rpm;
	public int oil;

	// 부품 -> 다른 클래스를 생성하여 연결한다.
	// public Body body;
	// public Engine engine;
	// public Tire tire ;

	// 부품에 필드 사용법
	// Car myCar = new Car(); -> 객체 생성(인스턴스)
	// myCar.maxSpeed = 300 ; -> 객체 있는 maxSpeed에 300 정수를 넣는다.
	// ----------------------------------------------------------

	// 기본생성자:생략가능 (객체가 생성할 때 사용되는 메서드 : 클래스명과 같은 이름)
	public Car() {
		speed = 0;
		rpm = 650;
		oil = 100;
	} // 객체가 생성되면서 변수에 값이 저장됨.
		// 기본생성자 public Car()종료

	// 사용자지정 생성자-> 개발자가 응용하는 기법
	// 사용자 지정 생성자가 만들어 지만 기본생성자는 자동으로 생성되지 않는다.
	public Car(String company, String model, String color) {
		this.company = company;
		this.model = model;
		this.color = color;
	} // Car myCar = new Car("벤츠","이클레스","빨강") ;
		// 사용자 지정 생성자1 Car() 종료

	// 메서드 (객체가 수행해야 되는 동작)
	// c(시동시작) r(차량상태, 주행상태) u(가속, 감속, 주차) d(시동종료)
	public void engineStart() { // case2
		System.out.println(this.model + "가(이) 주행을 시작합니다. ");

	}// engineStart 종료

	public void drive() { // case3
		boolean run = true;
		Scanner in = new Scanner(System.in);

		while (run) {

			System.out.println("현재 속도 : " + this.speed);
			System.out.println("현재 rpm : " + this.rpm);
			System.out.println("현재 주유량 : " + this.oil);
			System.out.println("1.가속 || 2.감속 || 3.후진");
			System.out.println("4.주차 || 5.현재 주유량 || 6.주행 종료");
			System.out.println(">>>>");
			int driveInput = in.nextInt();

			switch (driveInput) {

			case 1:  //가속
				if (minSpeed <= speed && speed < maxSpeed) {
					speed += 10;
					rpm += 70;
				} // if 가속 종료
				else if (this.speed == maxSpeed) {
					System.out.println("[최고속도입니다.]");
				} // else if 가속 종료
				break;

			case 2:  //감속

				if (minSpeed < speed && speed <= maxSpeed) {
					speed -= 10;
					rpm -= 70;
				} // if 감속 종료
				else if (speed == minSpeed) {
					System.out.println("[차량 정지상태 입니다.]");
				} // else if 감속 종료
				break;

			case 3: // 후진
				boolean run3=true;
				while (run3) {
					if (minSpeed == speed) {
						System.out.println("[후진합니다.]");
						System.out.println("[Surround View를 실행합니다.]");
						System.out.println("(w,a,s,d)로 화면을 전환해주세요.");
						String select = in.next();

						switch (select) {
						case "w":
							System.out.println("[전방 카메라 화면]");
							break;
						case "s":
							System.out.println("[후방 카메라 화면]");
							break;
						case "a":
							System.out.println("[좌측 카메라 화면]");
							break;
						case "d":
							System.out.println("[우측 카메라 화면]");
							break;
						} // Surround View switch 종료
					} // if 후진 가능 종료
					else
						System.out.println("[차량이 정지한 후에 변속해주세요.]");
						run3 = false;
					// else 후진 불가 종료
				}// while 후진 세션 종료
			case 4: // 주차
			case 5:
			case 6:

			}// driveInput switch 종료

		} // driveInput while 종료
	}// drive 종료

}// car class 종료
