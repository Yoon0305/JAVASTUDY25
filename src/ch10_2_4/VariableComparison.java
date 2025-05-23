package ch10_2_4;

public class VariableComparison {

	public static void main(String[] args) {
	Car car1 = new Car ();
	System.out.println("car1변수가 Car객체를 참조합니다.");
	
	Car car2 = new Car();
	System.out.println("car2변수가 Car객체를 참조합니다.");
	
	System.out.println("car1,car2비교 : "+(car1==car2));
	// car1과  car2가 설령 값이 같을지라도 서로 다른 객체에서 오는 것이므로
	}//결과가 false처리된다.

}
