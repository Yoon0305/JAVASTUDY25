package ch10_2_2;

public class ForWhileComparison {//class 시작

	public static void main(String[] args) {//main method 시작
		// for, while, do-while 비교

		int sum=0;
		sum = sum + 1; // 0=0+1
		sum = sum + 2; // 1=1+2
		sum = sum + 3; // 3=3+3
		sum = sum + 4; // 6=6+4
		sum = sum + 5; // 10=10+5
					   // sun->15
		System.out.println("1~5까지의 합:"+sum);
		// for 없이 구현한 일반 실행문
		
		int sum1=0;
		for(int i=1 ; i<=100 ; i=i+1)
		{sum1 = sum1 + i;}
		System.out.println("1~100까지의 합:"+sum1);
		
		
		
	}//main method 종료

}//class 종료
