package ch10_2_4;

public class Circle {

	//필드 (Circle클래스에서 사용될 변수)
	public int radius;  //main method에서 Circle.radius = 20 // Circle class 필드에서 radius int선언 이미 해두어서 바로가능.
	public String name; //Circle.name = "김기원"                  // String선언 동일.
	
	//생성자 (Circle클래스를 호출할 때 new 연산자를 사용함)
	public Circle() { // 생성자는 클래스명과 같은 메서드, 이 형태는 기본생성자
							// 기본생성자는 생략이 가능하나, 지정생성자를 만들려면 기본을 만들고 넘어가야함 -> 그렇지 않으면 지정이 기본생성자가 되기 때문.
		
	}
	
	
	//메서드(동작부분)
	public double getArea() { //원의 면적 계산하는 동작 
										   // 3.14*r*r 을 할 것이므로 double 타입으로 메서드 지정
										   // 계산한 값을 다시 main method 상의 result에 값을 return해야 하기 때문에 method에서 void빠짐
		return 3.14*radius*radius ;
	}// getArea method 종료
	
	}//Circle class 종료
	
	
	
	
	
	

