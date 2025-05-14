package ch10_2_1;

public class VarExam {

	public static void main(String[] args) {
		// 변수 선언 테스트

		int x = 1 ; // 정수타입 x 변수에 1 값을 넣는다.
		
		char y = 65 ; // char는 문자 타입이지만 숫자로 변환되기도 함.
					 // 컴퓨터는 문자를 유니코드로 변환해서 처리를 함.
					 // 유니코드 표에 65는 A를 의미한다.
		
		char z = 'A' ; // char 타입의 z 변수에 문자 A를 넣음

		System.out.println("int x = " + x);
		System.out.println("char y =" + y);
		System.out.println("char z =" + z);
		
		// char z1 = 'b' ; // 문자로 쓸건지 문자열로 쓸건지 결정이 필요
		
		// 변수의 선언
		
		int x1 ;  // 초기화 안된 변수
		x1 = 10;  // 변수에 초기값을 10으로 넣음
		System.out.println(x1);
	
		// 다중 변수 선언
		int kor, mat, eng, total, avg ;
		
		kor = 90 ;
		mat = 80 ;
		eng = 70 ;
		total = kor + mat + eng ; // 총점
		avg = total / 3 ; // 평균
		
		System.out.println("총점 :" + total);
		System.out.println("평균 :" + avg);
		// 코드상의 문제는 아니지만 평균값의 소수점이 사라짐.
		// 석차를 구현하는 코딩에서 문제가 생길 수 있다.
		
		// 변수 작성 규칙
		// 변수는 첫 글자가 영문이어야 하며 $, _ 을 사용할 수 있다.
		
	}
}