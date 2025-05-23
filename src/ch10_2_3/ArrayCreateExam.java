package ch10_2_3;

public class ArrayCreateExam {

	public static void main(String[] args) {
		// 배열을 이용한 총점과 평균 계산
		
		int[] scores = {83, 90, 87} ;
		
		System.out.println("scores[0] : "+ scores[0]);
		System.out.println("scores[1] : "+ scores[1]);
		System.out.println("scores[2] : "+ scores[2]);
		
		int sum = 0;
		for(int i = 0 ; i < 3 ; i++) {
			sum += scores[i];
			// System.out.println(sum); 총점 구하는 법
		}
		
		System.out.println("총점 : " + sum);
		double avg = (double) sum / 3 ;
		System.out.println("평균 : " + avg);
		
		// 일반적인 int 값 지정 방식과 같이
		//int a; a=10 로 변수타입지정 후 값 설정 XX
		//int a = 10 과 같이 타입과 값 한번에 지정해야함.
		//eg.)  int[] mystery = {1번 정수 값, 2번 정수 값, ...} ; 
		
		
		
		
	}//main method 종료

}//class 종료
