package ch10_2_2;

public class For2to9Exam {

	public static void main(String[] args) {
		// 2~9단 까지 구구단 프로그램
		
		for (int m=2 ; m<=9 ; m++) {
			System.out.println("*****"+m+"단******");
			for(int n=1 ; n<=9 ; n++) {
				System.out.println(m+"X"+n+"="+(m*n));
			}//안쪽 for문 종료
		
		}//for문 종료
		
	}//main 종료

}//class 종료
