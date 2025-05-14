package ch10_2_2;

public class ForSumExam {

	public static void main(String[] args) {
		// 앞의 1~100까지 합과 같으나 변수가 2개이다.
		// int a 라는 값만 사용해서 증감하는 형태와
		// 합을 누적하는 변수, 1씩 증가되는 변수 분리된 형태

		int sum = 0; //누적 합계를 담당할 변수
		
		for(int i=1 ; i<=10 ; i++) {//증가값조건 설정
		sum = sum+i ;
		}//for문 종료

		System.out.println("1~10까지 합 :"+sum);
		
		
	} //main 끝

} //class 끝
