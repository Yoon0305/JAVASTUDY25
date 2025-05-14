package ch10_2_1;

public class OperationExam {

	public static void main(String[] args) {
		// 연산자는 프로그램에서 데이터를 처리하여 결과를 산출함.
		// 연산자는 +, -, *, /, % (4칙연산자 + 나머지계산)
		// 피연산자는 변수, 값을 말함.
		
		//단항 연산 (변수가 1개인것)
		
		int x = 10;
		x++ ; // x = x + 1
	
		System.out.println("10에 ++ 단항연산한 결과 :" + x);
		
		x--; // x = x - 1
		System.out.println("x에 -- 단항연산한 결과:" + x);
		
		
		//이항 연산 (변수가 2개인 것)
		
	int y = 20;
	
	int result = x + y ;
	
	// 10 + y = 30 -> result
	
	System.out.println("x + y = " + result);

	// 삼항 연산 (항이 3개인 것)
	
	boolean result1 = (result>10) ? true : false ;

	System.out.println("result>10 결과 : " + result1);
	
	String result2 = (result>50) ? "크다" : "작다" ;
	System.out.println("result>50 결과 :" + result2);
	
	
	int x1 = 10 * 10 ; // 곱셈
	System.out.println("10 x 10 =" + x1);
    int x2 = 10 / 3 ; //나누기
	System.out.println("10 / 3 =" + x2);
	int x3 = 10 % 3 ; // 나머지 계산
	System.out.println("10을 3으로 나눈 나머지 = " +x3);
	
	// 실습 결과물1
	int y1 = 2;
	int y2 = 4;
	int y3 = 4;
	int result0 = (y1 * y2) + y3;
	char even = '짝';
	char odd = '홀';
	if (result0%2==0)
		System.out.println("3항 연산 결과값 =" + even);
	if (result0%2>=1)
		System.out.println("3항 연산 결과값 =" + odd);
	
	// 실습 예제
	int odd1 = 14;
	int div = odd1 %2; // 15를 2로 나누었을 때 나머지를 div에 넣음
	String resultOdd = (div == 1) ? "홀수" : "짝수";
	System.out.println("14의 홀짝 계산 결과 : " + resultOdd);
	
	// 실습 결과물2
	int F1 = 14;
	int div1 = F1 % 4;
	String resultF1 = (div1 >=1 && div1 <=3) ? "4의 배수 아님" : "4의 배수임";
	System.out.println("14은 4의배수인가? : "+  resultF1);
	
	// 실습 예제2
	int multi4 = 24;
	int div4 = multi4 % 4; // 4로 나눈 나머지를 div4에 넣는다
	String resultDiv4 = (div4 == 0) ? "4의배수입니다" : "아닙니다";
	System.out.println("4의 배수 판단 결과 :" + resultDiv4);
	
	// 증감 연산자 테스트
	System.out.println("---------- 증감연산자 위치에 따른 결과 -------------");
	int a = 10;
	a++; // a = a+1 -> 11
	++a; // 11+1 -> a = 12
	System.out.println("10-> a++ -> ++a 의 결과 :" + a);
	
	int b = 10;
	b--;
	--b;
	System.out.println("10-> b-- -> --b 의 결과 : " +b);

	int c;
	c = a++; // c= a -> a = a + 1 해버려서 순서로 인해 다른 결과값 도출
	System.out.println("a의 결과값 : " + a);
	System.out.println("c의 결과값 : " + c);
	System.out.println("================");
	
	c = ++a; // c = a = a + 1
	System.out.println("a의 결과값 : " + a);
	System.out.println("c의 결과값 : " + c);
	
	c = ++a + ++b ;
	System.out.println("a의 결과값 : " + a);
	System.out.println("b의 결과값 : " + b);
	System.out.println("c의 결과값 : " + c);
	// a 의 마지막 결과값 14
	// b 의 마지막 결과값 8
	// ++a + b++ 은 14(a)+1(++) + 8(b) = c 이후 b++로 인한 b 값 변동
	
	
	}

}
