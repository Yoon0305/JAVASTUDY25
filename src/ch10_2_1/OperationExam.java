package ch10_2_1;

public class OperationExam {

	public static void main(String[] args) {
		
		int x = 10;
		x++;	
	
	System.out.println("10에 ++ 단항연산한 결과 :" + x);
		
		x--;
	System.out.println("10에 -- 단항연산한 결과:"+x);
		
		int y = 20;
		int result = x+y;
	System.out.println("x+y=" + result);
		
		boolean result1 = (result>10) ? true : false;
		
	System.out.println("result>10 결과 : " + result1);
		
		String result2 = (result<50) ? "작다" : "크다" ;
		System.out.println("result<50 결과 : " +result2);
		
		
		int x1 = 10 * 15;
		System.out.println("10 x 15 =" + x1);
		double x2 = 10/4D ;
		System.out.println("10/4 =" +x2);
		double x3 = 34 % 3D;
		System.out.println("34를 3으로 나눈 나머지:" + x3);
		
		int odd1 = 29;
		int div = odd1 %2;
		String resultOdd = (div == 1) ? "홀수" : "짝수";
		System.out.println("29는 홀수인가 짝수인가?:"+ resultOdd);
		
		int multi5 = 28;
		int div5 = multi5 % 5 ;
		String resultDiv5 = (div5 == 0) ? "5의배수" : "5의 배수아님";
		System.out.println("28은 5의 배수인가? : " + resultDiv5);
		
		int k = 12;
		k++;
		++k;
		System.out.println("k++, ++k 결과는? : "+k);
		
		int m = 18;
		m--;
		--m;
		System.out.println("m-, --m 결과는? : "+m);
		
		int g;
		g= ++k;
		System.out.println("k의 결과값 : " +k);
		System.out.println("g의 결과값 : " +g);
		
		
		
		
		
		
	
		
	}

}
